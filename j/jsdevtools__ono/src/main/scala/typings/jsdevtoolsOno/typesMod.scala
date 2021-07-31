package typings.jsdevtoolsOno

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.jsdevtoolsOno.jsdevtoolsOnoBooleans.`false`
import typings.std.Error
import typings.std.EvalError
import typings.std.RangeError
import typings.std.ReferenceError
import typings.std.SyntaxError
import typings.std.TypeError
import typings.std.URIError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  type ErrorLike = Error | ErrorPOJO
  
  /* Rewritten from type alias, can be one of: 
    - typings.jsdevtoolsOno.typesMod.ErrorLikeConstructorFunction[T]
    - typings.jsdevtoolsOno.typesMod.ErrorLikeConstructorClass[T]
  */
  trait ErrorLikeConstructor[T /* <: ErrorLike */] extends StObject
  
  @js.native
  trait ErrorLikeConstructorClass[T /* <: ErrorLike */]
    extends StObject
       with Instantiable1[/* args (repeated) */ js.Any, T]
       with ErrorLikeConstructor[T]
  
  @js.native
  trait ErrorLikeConstructorFunction[T /* <: ErrorLike */]
    extends StObject
       with ErrorLikeConstructor[T] {
    
    def apply(): T = js.native
  }
  
  trait ErrorPOJO extends StObject {
    
    var message: js.UndefOr[String] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var stack: js.UndefOr[String] = js.undefined
  }
  object ErrorPOJO {
    
    @scala.inline
    def apply(): ErrorPOJO = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ErrorPOJO]
    }
    
    @scala.inline
    implicit class ErrorPOJOMutableBuilder[Self <: ErrorPOJO] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setStack(value: String): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStackUndefined: Self = StObject.set(x, "stack", js.undefined)
    }
  }
  
  @js.native
  trait MessageFormatter extends StObject {
    
    def apply(message: String, args: js.Any*): String = js.native
  }
  
  @js.native
  trait Ono[T /* <: ErrorLike */] extends StObject {
    
    def apply(error: ErrorPOJO): T & ErrorPOJO & (OnoError[T & ErrorPOJO]) = js.native
    def apply(error: ErrorPOJO, message: String, params: js.Any*): T & ErrorPOJO & (OnoError[T & ErrorPOJO]) = js.native
    /**
      * Creates a new error with the message, stack trace, and properties of another error.
      *
      * @param error - The original error
      */
    def apply(error: Error): T & Error & (OnoError[T & Error]) = js.native
    /**
      * Creates a new error with a formatted message and the stack trace and properties of another error.
      *
      * @param error - The original error
      * @param message - The new error message, possibly including argument placeholders
      * @param params - Optional arguments to replace the corresponding placeholders in the message
      */
    def apply(error: Error, message: String, params: js.Any*): T & Error & (OnoError[T & Error]) = js.native
    /**
      * Creates an error with a formatted message.
      *
      * @param message - The new error message, possibly including argument placeholders
      * @param params - Optional arguments to replace the corresponding placeholders in the message
      */
    def apply(message: String, params: js.Any*): T & OnoError[T] = js.native
    def apply[P /* <: js.Object */](error: ErrorPOJO, props: P): T & ErrorPOJO & P & (OnoError[T & ErrorPOJO & P]) = js.native
    def apply[P /* <: js.Object */](error: ErrorPOJO, props: P, message: String, params: js.Any*): T & ErrorPOJO & P & (OnoError[T & ErrorPOJO & P]) = js.native
    /**
      * Creates a new error with the message, stack trace, and properties of another error,
      * as well as aditional properties.
      *
      * @param error - The original error
      * @param props - An object whose properties will be added to the returned error
      */
    def apply[P /* <: js.Object */](error: Error, props: P): T & Error & P & (OnoError[T & Error & P]) = js.native
    /**
      * Creates a new error with a formatted message and the stack trace and properties of another error,
      * as well as additional properties.
      *
      * @param error - The original error
      * @param props - An object whose properties will be added to the returned error
      * @param message - The new error message, possibly including argument placeholders
      * @param params - Optional arguments to replace the corresponding placeholders in the message
      */
    def apply[P /* <: js.Object */](error: Error, props: P, message: String, params: js.Any*): T & Error & P & (OnoError[T & Error & P]) = js.native
    /**
      * Creates an error with additional properties.
      *
      * @param props - An object whose properties will be added to the returned error
      */
    def apply[P /* <: js.Object */](props: P): T & P & (OnoError[T & P]) = js.native
    /**
      * Creates an error with a formatted message and additional properties.
      *
      * @param props - An object whose properties will be added to the returned error
      * @param message - The new error message, possibly including argument placeholders
      * @param params - Optional arguments to replace the corresponding placeholders in the message
      */
    def apply[P /* <: js.Object */](props: P, message: String, params: js.Any*): T & P & (OnoError[T & P]) = js.native
    
    /**
      * The type of Error that this `Ono` function produces.
      */
    @JSName(js.Symbol.species)
    val species: ErrorLikeConstructor[T] = js.native
  }
  
  @js.native
  trait OnoConstructor
    extends StObject
       with Instantiable1[/* constructor */ ErrorLikeConstructor[ErrorLike], Ono[ErrorLike]]
       with Instantiable2[
          /* constructor */ ErrorLikeConstructor[ErrorLike], 
          /* options */ OnoOptions, 
          Ono[ErrorLike]
        ] {
    
    def apply[T /* <: ErrorLike */](constructor: ErrorLikeConstructor[T]): Ono[T] = js.native
    def apply[T /* <: ErrorLike */](constructor: ErrorLikeConstructor[T], options: OnoOptions): Ono[T] = js.native
    
    def extend(error: ErrorPOJO): ErrorPOJO & OnoError[ErrorPOJO] = js.native
    /**
      * Extends the given Error object with enhanced Ono functionality, such as improved support for
      * `JSON.stringify()`.
      *
      * @param error - The error object to extend. This object instance will be modified and returned.
      */
    def extend(error: Error): Error & OnoError[Error] = js.native
    def extend[E /* <: ErrorLike */](error: ErrorPOJO, originalError: E): ErrorPOJO & E & (OnoError[ErrorPOJO & E]) = js.native
    def extend[E /* <: ErrorLike */](error: Error, originalError: E): Error & E & (OnoError[Error & E]) = js.native
    def extend[E /* <: ErrorLike */, P /* <: js.Object */](error: ErrorPOJO, originalError: E, props: P): ErrorPOJO & E & P & (OnoError[ErrorPOJO & E & P]) = js.native
    def extend[E /* <: ErrorLike */, P /* <: js.Object */](error: ErrorPOJO, originalError: Unit, props: P): ErrorPOJO & E & P & (OnoError[ErrorPOJO & E & P]) = js.native
    def extend[E /* <: ErrorLike */, P /* <: js.Object */](error: Error, originalError: E, props: P): Error & E & P & (OnoError[Error & E & P]) = js.native
    def extend[E /* <: ErrorLike */, P /* <: js.Object */](error: Error, originalError: Unit, props: P): Error & E & P & (OnoError[Error & E & P]) = js.native
    @JSName("extend")
    def extend_E_ErrorLike[E /* <: ErrorLike */](error: ErrorPOJO): ErrorPOJO & E & (OnoError[ErrorPOJO & E]) = js.native
    /**
      * Extends the given Error object with enhanced Ono functionality, such as nested stack traces
      * and improved support for `JSON.stringify()`.
      *
      * @param error - The error object to extend. This object instance will be modified and returned.
      * @param originalError - The original error. This error's stack trace will be added to the error's stack trace.
      */
    @JSName("extend")
    def extend_E_ErrorLike[E /* <: ErrorLike */](error: Error): Error & E & (OnoError[Error & E]) = js.native
    @JSName("extend")
    def extend_E_ErrorLikeP_Object[E /* <: ErrorLike */, P /* <: js.Object */](error: ErrorPOJO): ErrorPOJO & E & P & (OnoError[ErrorPOJO & E & P]) = js.native
    @JSName("extend")
    def extend_E_ErrorLikeP_Object[E /* <: ErrorLike */, P /* <: js.Object */](error: ErrorPOJO, originalError: E): ErrorPOJO & E & P & (OnoError[ErrorPOJO & E & P]) = js.native
    /**
      * Extends the given Error object with enhanced Ono functionality, such as nested stack traces,
      * additional properties, and improved support for `JSON.stringify()`.
      *
      * @param error - The error object to extend. This object instance will be modified and returned.
      * @param originalError - The original error. This error's stack trace will be added to the error's stack trace.
      * @param props - An object whose properties will be added to the error
      */
    @JSName("extend")
    def extend_E_ErrorLikeP_Object[E /* <: ErrorLike */, P /* <: js.Object */](error: Error): Error & E & P & (OnoError[Error & E & P]) = js.native
    @JSName("extend")
    def extend_E_ErrorLikeP_Object[E /* <: ErrorLike */, P /* <: js.Object */](error: Error, originalError: E): Error & E & P & (OnoError[Error & E & P]) = js.native
    @JSName("extend")
    def extend_P_Object[P /* <: js.Object */](error: ErrorPOJO): ErrorPOJO & P & (OnoError[ErrorPOJO & P]) = js.native
    @JSName("extend")
    def extend_P_Object[P /* <: js.Object */](error: ErrorPOJO, props: P): ErrorPOJO & P & (OnoError[ErrorPOJO & P]) = js.native
    /**
      * Extends the given Error object with enhanced Ono functionality, such as additional properties
      * and improved support for `JSON.stringify()`.
      *
      * @param error - The error object to extend. This object instance will be modified and returned.
      * @param props - An object whose properties will be added to the error
      */
    @JSName("extend")
    def extend_P_Object[P /* <: js.Object */](error: Error): Error & P & (OnoError[Error & P]) = js.native
    @JSName("extend")
    def extend_P_Object[P /* <: js.Object */](error: Error, props: P): Error & P & (OnoError[Error & P]) = js.native
    
    def toJSON(error: ErrorPOJO): ErrorPOJO = js.native
    /**
      * Returns an object containing all properties of the given Error object,
      * which can be used with `JSON.stringify()`.
      */
    def toJSON(error: Error): ErrorPOJO & Error = js.native
  }
  
  @js.native
  trait OnoError[T]
    extends StObject
       with ErrorPOJO {
    
    /**
      * Returns a JSON representation of the error, including all built-in error properties,
      * as well as properties that were dynamically added.
      */
    def toJSON(): ErrorPOJO & T = js.native
  }
  
  trait OnoOptions extends StObject {
    
    /**
      * When `Ono` is used to wrap an error, this setting determines whether the inner error's message
      * is appended to the new error message.
      *
      * Defaults to `true`.
      */
    var concatMessages: js.UndefOr[Boolean] = js.undefined
    
    /**
      * A function that replaces placeholders like "%s" or "%d" in error messages with values.
      * If set to `false`, then error messages will be treated as literals and no placeholder replacement will occur.
      *
      * Defaults to `utils.inspect()` in Node.js.  Defaults to `Array.join()` in browsers.
      */
    var format: js.UndefOr[MessageFormatter | `false`] = js.undefined
  }
  object OnoOptions {
    
    @scala.inline
    def apply(): OnoOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OnoOptions]
    }
    
    @scala.inline
    implicit class OnoOptionsMutableBuilder[Self <: OnoOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConcatMessages(value: Boolean): Self = StObject.set(x, "concatMessages", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConcatMessagesUndefined: Self = StObject.set(x, "concatMessages", js.undefined)
      
      @scala.inline
      def setFormat(value: MessageFormatter | `false`): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    }
  }
  
  @js.native
  trait OnoSingleton
    extends StObject
       with Ono[Error] {
    
    def error(error: ErrorPOJO): Error & ErrorPOJO & (OnoError[Error & ErrorPOJO]) = js.native
    def error(error: ErrorPOJO, message: String, params: js.Any*): Error & ErrorPOJO & (OnoError[Error & ErrorPOJO]) = js.native
    /**
      * Creates a new error with the message, stack trace, and properties of another error.
      *
      * @param error - The original error
      */
    def error(error: Error): Error & OnoError[Error] = js.native
    /**
      * Creates a new error with a formatted message and the stack trace and properties of another error.
      *
      * @param error - The original error
      * @param message - The new error message, possibly including argument placeholders
      * @param params - Optional arguments to replace the corresponding placeholders in the message
      */
    def error(error: Error, message: String, params: js.Any*): Error & OnoError[Error] = js.native
    /**
      * Creates an error with a formatted message.
      *
      * @param message - The new error message, possibly including argument placeholders
      * @param params - Optional arguments to replace the corresponding placeholders in the message
      */
    def error(message: String, params: js.Any*): Error & OnoError[Error] = js.native
    def error[P /* <: js.Object */](error: ErrorPOJO, props: P): Error & ErrorPOJO & P & (OnoError[Error & ErrorPOJO & P]) = js.native
    def error[P /* <: js.Object */](error: ErrorPOJO, props: P, message: String, params: js.Any*): Error & ErrorPOJO & P & (OnoError[Error & ErrorPOJO & P]) = js.native
    /**
      * Creates a new error with the message, stack trace, and properties of another error,
      * as well as aditional properties.
      *
      * @param error - The original error
      * @param props - An object whose properties will be added to the returned error
      */
    def error[P /* <: js.Object */](error: Error, props: P): Error & P & (OnoError[Error & P]) = js.native
    /**
      * Creates a new error with a formatted message and the stack trace and properties of another error,
      * as well as additional properties.
      *
      * @param error - The original error
      * @param props - An object whose properties will be added to the returned error
      * @param message - The new error message, possibly including argument placeholders
      * @param params - Optional arguments to replace the corresponding placeholders in the message
      */
    def error[P /* <: js.Object */](error: Error, props: P, message: String, params: js.Any*): Error & P & (OnoError[Error & P]) = js.native
    /**
      * Creates an error with additional properties.
      *
      * @param props - An object whose properties will be added to the returned error
      */
    def error[P /* <: js.Object */](props: P): Error & P & (OnoError[Error & P]) = js.native
    /**
      * Creates an error with a formatted message and additional properties.
      *
      * @param props - An object whose properties will be added to the returned error
      * @param message - The new error message, possibly including argument placeholders
      * @param params - Optional arguments to replace the corresponding placeholders in the message
      */
    def error[P /* <: js.Object */](props: P, message: String, params: js.Any*): Error & P & (OnoError[Error & P]) = js.native
    @JSName("error")
    var error_Original: Ono[Error] = js.native
    
    def eval(error: ErrorPOJO): EvalError & ErrorPOJO & (OnoError[EvalError & ErrorPOJO]) = js.native
    def eval(error: ErrorPOJO, message: String, params: js.Any*): EvalError & ErrorPOJO & (OnoError[EvalError & ErrorPOJO]) = js.native
    /**
      * Creates a new error with the message, stack trace, and properties of another error.
      *
      * @param error - The original error
      */
    def eval(error: Error): EvalError & Error & (OnoError[EvalError & Error]) = js.native
    /**
      * Creates a new error with a formatted message and the stack trace and properties of another error.
      *
      * @param error - The original error
      * @param message - The new error message, possibly including argument placeholders
      * @param params - Optional arguments to replace the corresponding placeholders in the message
      */
    def eval(error: Error, message: String, params: js.Any*): EvalError & Error & (OnoError[EvalError & Error]) = js.native
    /**
      * Creates an error with a formatted message.
      *
      * @param message - The new error message, possibly including argument placeholders
      * @param params - Optional arguments to replace the corresponding placeholders in the message
      */
    def eval(message: String, params: js.Any*): EvalError & OnoError[EvalError] = js.native
    def eval[P /* <: js.Object */](error: ErrorPOJO, props: P): EvalError & ErrorPOJO & P & (OnoError[EvalError & ErrorPOJO & P]) = js.native
    def eval[P /* <: js.Object */](error: ErrorPOJO, props: P, message: String, params: js.Any*): EvalError & ErrorPOJO & P & (OnoError[EvalError & ErrorPOJO & P]) = js.native
    /**
      * Creates a new error with the message, stack trace, and properties of another error,
      * as well as aditional properties.
      *
      * @param error - The original error
      * @param props - An object whose properties will be added to the returned error
      */
    def eval[P /* <: js.Object */](error: Error, props: P): EvalError & Error & P & (OnoError[EvalError & Error & P]) = js.native
    /**
      * Creates a new error with a formatted message and the stack trace and properties of another error,
      * as well as additional properties.
      *
      * @param error - The original error
      * @param props - An object whose properties will be added to the returned error
      * @param message - The new error message, possibly including argument placeholders
      * @param params - Optional arguments to replace the corresponding placeholders in the message
      */
    def eval[P /* <: js.Object */](error: Error, props: P, message: String, params: js.Any*): EvalError & Error & P & (OnoError[EvalError & Error & P]) = js.native
    /**
      * Creates an error with additional properties.
      *
      * @param props - An object whose properties will be added to the returned error
      */
    def eval[P /* <: js.Object */](props: P): EvalError & P & (OnoError[EvalError & P]) = js.native
    /**
      * Creates an error with a formatted message and additional properties.
      *
      * @param props - An object whose properties will be added to the returned error
      * @param message - The new error message, possibly including argument placeholders
      * @param params - Optional arguments to replace the corresponding placeholders in the message
      */
    def eval[P /* <: js.Object */](props: P, message: String, params: js.Any*): EvalError & P & (OnoError[EvalError & P]) = js.native
    @JSName("eval")
    var eval_Original: Ono[EvalError] = js.native
    
    def range(error: ErrorPOJO): RangeError & ErrorPOJO & (OnoError[RangeError & ErrorPOJO]) = js.native
    def range(error: ErrorPOJO, message: String, params: js.Any*): RangeError & ErrorPOJO & (OnoError[RangeError & ErrorPOJO]) = js.native
    /**
      * Creates a new error with the message, stack trace, and properties of another error.
      *
      * @param error - The original error
      */
    def range(error: Error): RangeError & Error & (OnoError[RangeError & Error]) = js.native
    /**
      * Creates a new error with a formatted message and the stack trace and properties of another error.
      *
      * @param error - The original error
      * @param message - The new error message, possibly including argument placeholders
      * @param params - Optional arguments to replace the corresponding placeholders in the message
      */
    def range(error: Error, message: String, params: js.Any*): RangeError & Error & (OnoError[RangeError & Error]) = js.native
    /**
      * Creates an error with a formatted message.
      *
      * @param message - The new error message, possibly including argument placeholders
      * @param params - Optional arguments to replace the corresponding placeholders in the message
      */
    def range(message: String, params: js.Any*): RangeError & OnoError[RangeError] = js.native
    def range[P /* <: js.Object */](error: ErrorPOJO, props: P): RangeError & ErrorPOJO & P & (OnoError[RangeError & ErrorPOJO & P]) = js.native
    def range[P /* <: js.Object */](error: ErrorPOJO, props: P, message: String, params: js.Any*): RangeError & ErrorPOJO & P & (OnoError[RangeError & ErrorPOJO & P]) = js.native
    /**
      * Creates a new error with the message, stack trace, and properties of another error,
      * as well as aditional properties.
      *
      * @param error - The original error
      * @param props - An object whose properties will be added to the returned error
      */
    def range[P /* <: js.Object */](error: Error, props: P): RangeError & Error & P & (OnoError[RangeError & Error & P]) = js.native
    /**
      * Creates a new error with a formatted message and the stack trace and properties of another error,
      * as well as additional properties.
      *
      * @param error - The original error
      * @param props - An object whose properties will be added to the returned error
      * @param message - The new error message, possibly including argument placeholders
      * @param params - Optional arguments to replace the corresponding placeholders in the message
      */
    def range[P /* <: js.Object */](error: Error, props: P, message: String, params: js.Any*): RangeError & Error & P & (OnoError[RangeError & Error & P]) = js.native
    /**
      * Creates an error with additional properties.
      *
      * @param props - An object whose properties will be added to the returned error
      */
    def range[P /* <: js.Object */](props: P): RangeError & P & (OnoError[RangeError & P]) = js.native
    /**
      * Creates an error with a formatted message and additional properties.
      *
      * @param props - An object whose properties will be added to the returned error
      * @param message - The new error message, possibly including argument placeholders
      * @param params - Optional arguments to replace the corresponding placeholders in the message
      */
    def range[P /* <: js.Object */](props: P, message: String, params: js.Any*): RangeError & P & (OnoError[RangeError & P]) = js.native
    @JSName("range")
    var range_Original: Ono[RangeError] = js.native
    
    def reference(error: ErrorPOJO): ReferenceError & ErrorPOJO & (OnoError[ReferenceError & ErrorPOJO]) = js.native
    def reference(error: ErrorPOJO, message: String, params: js.Any*): ReferenceError & ErrorPOJO & (OnoError[ReferenceError & ErrorPOJO]) = js.native
    /**
      * Creates a new error with the message, stack trace, and properties of another error.
      *
      * @param error - The original error
      */
    def reference(error: Error): ReferenceError & Error & (OnoError[ReferenceError & Error]) = js.native
    /**
      * Creates a new error with a formatted message and the stack trace and properties of another error.
      *
      * @param error - The original error
      * @param message - The new error message, possibly including argument placeholders
      * @param params - Optional arguments to replace the corresponding placeholders in the message
      */
    def reference(error: Error, message: String, params: js.Any*): ReferenceError & Error & (OnoError[ReferenceError & Error]) = js.native
    /**
      * Creates an error with a formatted message.
      *
      * @param message - The new error message, possibly including argument placeholders
      * @param params - Optional arguments to replace the corresponding placeholders in the message
      */
    def reference(message: String, params: js.Any*): ReferenceError & OnoError[ReferenceError] = js.native
    def reference[P /* <: js.Object */](error: ErrorPOJO, props: P): ReferenceError & ErrorPOJO & P & (OnoError[ReferenceError & ErrorPOJO & P]) = js.native
    def reference[P /* <: js.Object */](error: ErrorPOJO, props: P, message: String, params: js.Any*): ReferenceError & ErrorPOJO & P & (OnoError[ReferenceError & ErrorPOJO & P]) = js.native
    /**
      * Creates a new error with the message, stack trace, and properties of another error,
      * as well as aditional properties.
      *
      * @param error - The original error
      * @param props - An object whose properties will be added to the returned error
      */
    def reference[P /* <: js.Object */](error: Error, props: P): ReferenceError & Error & P & (OnoError[ReferenceError & Error & P]) = js.native
    /**
      * Creates a new error with a formatted message and the stack trace and properties of another error,
      * as well as additional properties.
      *
      * @param error - The original error
      * @param props - An object whose properties will be added to the returned error
      * @param message - The new error message, possibly including argument placeholders
      * @param params - Optional arguments to replace the corresponding placeholders in the message
      */
    def reference[P /* <: js.Object */](error: Error, props: P, message: String, params: js.Any*): ReferenceError & Error & P & (OnoError[ReferenceError & Error & P]) = js.native
    /**
      * Creates an error with additional properties.
      *
      * @param props - An object whose properties will be added to the returned error
      */
    def reference[P /* <: js.Object */](props: P): ReferenceError & P & (OnoError[ReferenceError & P]) = js.native
    /**
      * Creates an error with a formatted message and additional properties.
      *
      * @param props - An object whose properties will be added to the returned error
      * @param message - The new error message, possibly including argument placeholders
      * @param params - Optional arguments to replace the corresponding placeholders in the message
      */
    def reference[P /* <: js.Object */](props: P, message: String, params: js.Any*): ReferenceError & P & (OnoError[ReferenceError & P]) = js.native
    @JSName("reference")
    var reference_Original: Ono[ReferenceError] = js.native
    
    def syntax(error: ErrorPOJO): SyntaxError & ErrorPOJO & (OnoError[SyntaxError & ErrorPOJO]) = js.native
    def syntax(error: ErrorPOJO, message: String, params: js.Any*): SyntaxError & ErrorPOJO & (OnoError[SyntaxError & ErrorPOJO]) = js.native
    /**
      * Creates a new error with the message, stack trace, and properties of another error.
      *
      * @param error - The original error
      */
    def syntax(error: Error): SyntaxError & Error & (OnoError[SyntaxError & Error]) = js.native
    /**
      * Creates a new error with a formatted message and the stack trace and properties of another error.
      *
      * @param error - The original error
      * @param message - The new error message, possibly including argument placeholders
      * @param params - Optional arguments to replace the corresponding placeholders in the message
      */
    def syntax(error: Error, message: String, params: js.Any*): SyntaxError & Error & (OnoError[SyntaxError & Error]) = js.native
    /**
      * Creates an error with a formatted message.
      *
      * @param message - The new error message, possibly including argument placeholders
      * @param params - Optional arguments to replace the corresponding placeholders in the message
      */
    def syntax(message: String, params: js.Any*): SyntaxError & OnoError[SyntaxError] = js.native
    def syntax[P /* <: js.Object */](error: ErrorPOJO, props: P): SyntaxError & ErrorPOJO & P & (OnoError[SyntaxError & ErrorPOJO & P]) = js.native
    def syntax[P /* <: js.Object */](error: ErrorPOJO, props: P, message: String, params: js.Any*): SyntaxError & ErrorPOJO & P & (OnoError[SyntaxError & ErrorPOJO & P]) = js.native
    /**
      * Creates a new error with the message, stack trace, and properties of another error,
      * as well as aditional properties.
      *
      * @param error - The original error
      * @param props - An object whose properties will be added to the returned error
      */
    def syntax[P /* <: js.Object */](error: Error, props: P): SyntaxError & Error & P & (OnoError[SyntaxError & Error & P]) = js.native
    /**
      * Creates a new error with a formatted message and the stack trace and properties of another error,
      * as well as additional properties.
      *
      * @param error - The original error
      * @param props - An object whose properties will be added to the returned error
      * @param message - The new error message, possibly including argument placeholders
      * @param params - Optional arguments to replace the corresponding placeholders in the message
      */
    def syntax[P /* <: js.Object */](error: Error, props: P, message: String, params: js.Any*): SyntaxError & Error & P & (OnoError[SyntaxError & Error & P]) = js.native
    /**
      * Creates an error with additional properties.
      *
      * @param props - An object whose properties will be added to the returned error
      */
    def syntax[P /* <: js.Object */](props: P): SyntaxError & P & (OnoError[SyntaxError & P]) = js.native
    /**
      * Creates an error with a formatted message and additional properties.
      *
      * @param props - An object whose properties will be added to the returned error
      * @param message - The new error message, possibly including argument placeholders
      * @param params - Optional arguments to replace the corresponding placeholders in the message
      */
    def syntax[P /* <: js.Object */](props: P, message: String, params: js.Any*): SyntaxError & P & (OnoError[SyntaxError & P]) = js.native
    @JSName("syntax")
    var syntax_Original: Ono[SyntaxError] = js.native
    
    def `type`(error: ErrorPOJO): TypeError & ErrorPOJO & (OnoError[TypeError & ErrorPOJO]) = js.native
    def `type`(error: ErrorPOJO, message: String, params: js.Any*): TypeError & ErrorPOJO & (OnoError[TypeError & ErrorPOJO]) = js.native
    /**
      * Creates a new error with the message, stack trace, and properties of another error.
      *
      * @param error - The original error
      */
    def `type`(error: Error): TypeError & Error & (OnoError[TypeError & Error]) = js.native
    /**
      * Creates a new error with a formatted message and the stack trace and properties of another error.
      *
      * @param error - The original error
      * @param message - The new error message, possibly including argument placeholders
      * @param params - Optional arguments to replace the corresponding placeholders in the message
      */
    def `type`(error: Error, message: String, params: js.Any*): TypeError & Error & (OnoError[TypeError & Error]) = js.native
    /**
      * Creates an error with a formatted message.
      *
      * @param message - The new error message, possibly including argument placeholders
      * @param params - Optional arguments to replace the corresponding placeholders in the message
      */
    def `type`(message: String, params: js.Any*): TypeError & OnoError[TypeError] = js.native
    def `type`[P /* <: js.Object */](error: ErrorPOJO, props: P): TypeError & ErrorPOJO & P & (OnoError[TypeError & ErrorPOJO & P]) = js.native
    def `type`[P /* <: js.Object */](error: ErrorPOJO, props: P, message: String, params: js.Any*): TypeError & ErrorPOJO & P & (OnoError[TypeError & ErrorPOJO & P]) = js.native
    /**
      * Creates a new error with the message, stack trace, and properties of another error,
      * as well as aditional properties.
      *
      * @param error - The original error
      * @param props - An object whose properties will be added to the returned error
      */
    def `type`[P /* <: js.Object */](error: Error, props: P): TypeError & Error & P & (OnoError[TypeError & Error & P]) = js.native
    /**
      * Creates a new error with a formatted message and the stack trace and properties of another error,
      * as well as additional properties.
      *
      * @param error - The original error
      * @param props - An object whose properties will be added to the returned error
      * @param message - The new error message, possibly including argument placeholders
      * @param params - Optional arguments to replace the corresponding placeholders in the message
      */
    def `type`[P /* <: js.Object */](error: Error, props: P, message: String, params: js.Any*): TypeError & Error & P & (OnoError[TypeError & Error & P]) = js.native
    /**
      * Creates an error with additional properties.
      *
      * @param props - An object whose properties will be added to the returned error
      */
    def `type`[P /* <: js.Object */](props: P): TypeError & P & (OnoError[TypeError & P]) = js.native
    /**
      * Creates an error with a formatted message and additional properties.
      *
      * @param props - An object whose properties will be added to the returned error
      * @param message - The new error message, possibly including argument placeholders
      * @param params - Optional arguments to replace the corresponding placeholders in the message
      */
    def `type`[P /* <: js.Object */](props: P, message: String, params: js.Any*): TypeError & P & (OnoError[TypeError & P]) = js.native
    @JSName("type")
    var type_Original: Ono[TypeError] = js.native
    
    def uri(error: ErrorPOJO): URIError & ErrorPOJO & (OnoError[URIError & ErrorPOJO]) = js.native
    def uri(error: ErrorPOJO, message: String, params: js.Any*): URIError & ErrorPOJO & (OnoError[URIError & ErrorPOJO]) = js.native
    /**
      * Creates a new error with the message, stack trace, and properties of another error.
      *
      * @param error - The original error
      */
    def uri(error: Error): URIError & Error & (OnoError[URIError & Error]) = js.native
    /**
      * Creates a new error with a formatted message and the stack trace and properties of another error.
      *
      * @param error - The original error
      * @param message - The new error message, possibly including argument placeholders
      * @param params - Optional arguments to replace the corresponding placeholders in the message
      */
    def uri(error: Error, message: String, params: js.Any*): URIError & Error & (OnoError[URIError & Error]) = js.native
    /**
      * Creates an error with a formatted message.
      *
      * @param message - The new error message, possibly including argument placeholders
      * @param params - Optional arguments to replace the corresponding placeholders in the message
      */
    def uri(message: String, params: js.Any*): URIError & OnoError[URIError] = js.native
    def uri[P /* <: js.Object */](error: ErrorPOJO, props: P): URIError & ErrorPOJO & P & (OnoError[URIError & ErrorPOJO & P]) = js.native
    def uri[P /* <: js.Object */](error: ErrorPOJO, props: P, message: String, params: js.Any*): URIError & ErrorPOJO & P & (OnoError[URIError & ErrorPOJO & P]) = js.native
    /**
      * Creates a new error with the message, stack trace, and properties of another error,
      * as well as aditional properties.
      *
      * @param error - The original error
      * @param props - An object whose properties will be added to the returned error
      */
    def uri[P /* <: js.Object */](error: Error, props: P): URIError & Error & P & (OnoError[URIError & Error & P]) = js.native
    /**
      * Creates a new error with a formatted message and the stack trace and properties of another error,
      * as well as additional properties.
      *
      * @param error - The original error
      * @param props - An object whose properties will be added to the returned error
      * @param message - The new error message, possibly including argument placeholders
      * @param params - Optional arguments to replace the corresponding placeholders in the message
      */
    def uri[P /* <: js.Object */](error: Error, props: P, message: String, params: js.Any*): URIError & Error & P & (OnoError[URIError & Error & P]) = js.native
    /**
      * Creates an error with additional properties.
      *
      * @param props - An object whose properties will be added to the returned error
      */
    def uri[P /* <: js.Object */](props: P): URIError & P & (OnoError[URIError & P]) = js.native
    /**
      * Creates an error with a formatted message and additional properties.
      *
      * @param props - An object whose properties will be added to the returned error
      * @param message - The new error message, possibly including argument placeholders
      * @param params - Optional arguments to replace the corresponding placeholders in the message
      */
    def uri[P /* <: js.Object */](props: P, message: String, params: js.Any*): URIError & P & (OnoError[URIError & P]) = js.native
    @JSName("uri")
    var uri_Original: Ono[URIError] = js.native
  }
}
