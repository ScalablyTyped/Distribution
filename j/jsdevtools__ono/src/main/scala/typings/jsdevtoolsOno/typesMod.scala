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
import scala.scalajs.js.`|`
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
    extends ErrorLikeConstructor[T]
       with Instantiable1[/* args (repeated) */ js.Any, T]
  
  @js.native
  trait ErrorLikeConstructorFunction[T /* <: ErrorLike */] extends ErrorLikeConstructor[T] {
    
    def apply(): T = js.native
  }
  
  @js.native
  trait ErrorPOJO extends StObject {
    
    var message: js.UndefOr[String] = js.native
    
    var name: js.UndefOr[String] = js.native
    
    var stack: js.UndefOr[String] = js.native
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
  
  type MessageFormatter = js.Function2[/* message */ String, /* repeated */ js.Any, String]
  
  @js.native
  trait Ono[T /* <: ErrorLike */] extends StObject {
    
    def apply(error: ErrorPOJO): T with ErrorPOJO with (OnoError[T with ErrorPOJO]) = js.native
    def apply(error: ErrorPOJO, message: String, params: js.Any*): T with ErrorPOJO with (OnoError[T with ErrorPOJO]) = js.native
    /**
      * Creates a new error with the message, stack trace, and properties of another error.
      *
      * @param error - The original error
      */
    def apply(error: Error): T with Error with (OnoError[T with Error]) = js.native
    /**
      * Creates a new error with a formatted message and the stack trace and properties of another error.
      *
      * @param error - The original error
      * @param message - The new error message, possibly including argument placeholders
      * @param params - Optional arguments to replace the corresponding placeholders in the message
      */
    def apply(error: Error, message: String, params: js.Any*): T with Error with (OnoError[T with Error]) = js.native
    /**
      * Creates an error with a formatted message.
      *
      * @param message - The new error message, possibly including argument placeholders
      * @param params - Optional arguments to replace the corresponding placeholders in the message
      */
    def apply(message: String, params: js.Any*): T with OnoError[T] = js.native
    def apply[P /* <: js.Object */](error: ErrorPOJO, props: P): T with ErrorPOJO with P with (OnoError[T with ErrorPOJO with P]) = js.native
    def apply[P /* <: js.Object */](error: ErrorPOJO, props: P, message: String, params: js.Any*): T with ErrorPOJO with P with (OnoError[T with ErrorPOJO with P]) = js.native
    /**
      * Creates a new error with the message, stack trace, and properties of another error,
      * as well as aditional properties.
      *
      * @param error - The original error
      * @param props - An object whose properties will be added to the returned error
      */
    def apply[P /* <: js.Object */](error: Error, props: P): T with Error with P with (OnoError[T with Error with P]) = js.native
    /**
      * Creates a new error with a formatted message and the stack trace and properties of another error,
      * as well as additional properties.
      *
      * @param error - The original error
      * @param props - An object whose properties will be added to the returned error
      * @param message - The new error message, possibly including argument placeholders
      * @param params - Optional arguments to replace the corresponding placeholders in the message
      */
    def apply[P /* <: js.Object */](error: Error, props: P, message: String, params: js.Any*): T with Error with P with (OnoError[T with Error with P]) = js.native
    /**
      * Creates an error with additional properties.
      *
      * @param props - An object whose properties will be added to the returned error
      */
    def apply[P /* <: js.Object */](props: P): T with P with (OnoError[T with P]) = js.native
    /**
      * Creates an error with a formatted message and additional properties.
      *
      * @param props - An object whose properties will be added to the returned error
      * @param message - The new error message, possibly including argument placeholders
      * @param params - Optional arguments to replace the corresponding placeholders in the message
      */
    def apply[P /* <: js.Object */](props: P, message: String, params: js.Any*): T with P with (OnoError[T with P]) = js.native
    
    /**
      * The type of Error that this `Ono` function produces.
      */
    @JSName(js.Symbol.species)
    val species: ErrorLikeConstructor[T] = js.native
  }
  
  @js.native
  trait OnoConstructor
    extends Instantiable1[/* constructor */ ErrorLikeConstructor[ErrorLike], Ono[ErrorLike]]
       with Instantiable2[
          /* constructor */ ErrorLikeConstructor[ErrorLike], 
          /* options */ OnoOptions, 
          Ono[ErrorLike]
        ] {
    
    def apply[T /* <: ErrorLike */](constructor: ErrorLikeConstructor[T]): Ono[T] = js.native
    def apply[T /* <: ErrorLike */](constructor: ErrorLikeConstructor[T], options: OnoOptions): Ono[T] = js.native
    
    def extend(error: ErrorPOJO): ErrorPOJO with OnoError[ErrorPOJO] = js.native
    /**
      * Extends the given Error object with enhanced Ono functionality, such as improved support for
      * `JSON.stringify()`.
      *
      * @param error - The error object to extend. This object instance will be modified and returned.
      */
    def extend(error: Error): Error with OnoError[Error] = js.native
    def extend[E /* <: ErrorLike */](error: ErrorPOJO, originalError: E): ErrorPOJO with E with (OnoError[ErrorPOJO with E]) = js.native
    def extend[E /* <: ErrorLike */](error: Error, originalError: E): Error with E with (OnoError[Error with E]) = js.native
    def extend[E /* <: ErrorLike */, P /* <: js.Object */](error: ErrorPOJO, originalError: E, props: P): ErrorPOJO with E with P with (OnoError[ErrorPOJO with E with P]) = js.native
    def extend[E /* <: ErrorLike */, P /* <: js.Object */](error: ErrorPOJO, originalError: js.UndefOr[scala.Nothing], props: P): ErrorPOJO with E with P with (OnoError[ErrorPOJO with E with P]) = js.native
    def extend[E /* <: ErrorLike */, P /* <: js.Object */](error: Error, originalError: E, props: P): Error with E with P with (OnoError[Error with E with P]) = js.native
    def extend[E /* <: ErrorLike */, P /* <: js.Object */](error: Error, originalError: js.UndefOr[scala.Nothing], props: P): Error with E with P with (OnoError[Error with E with P]) = js.native
    @JSName("extend")
    def extend_E_ErrorLike[E /* <: ErrorLike */](error: ErrorPOJO): ErrorPOJO with E with (OnoError[ErrorPOJO with E]) = js.native
    /**
      * Extends the given Error object with enhanced Ono functionality, such as nested stack traces
      * and improved support for `JSON.stringify()`.
      *
      * @param error - The error object to extend. This object instance will be modified and returned.
      * @param originalError - The original error. This error's stack trace will be added to the error's stack trace.
      */
    @JSName("extend")
    def extend_E_ErrorLike[E /* <: ErrorLike */](error: Error): Error with E with (OnoError[Error with E]) = js.native
    @JSName("extend")
    def extend_E_ErrorLikeP_Object[E /* <: ErrorLike */, P /* <: js.Object */](error: ErrorPOJO): ErrorPOJO with E with P with (OnoError[ErrorPOJO with E with P]) = js.native
    @JSName("extend")
    def extend_E_ErrorLikeP_Object[E /* <: ErrorLike */, P /* <: js.Object */](error: ErrorPOJO, originalError: E): ErrorPOJO with E with P with (OnoError[ErrorPOJO with E with P]) = js.native
    /**
      * Extends the given Error object with enhanced Ono functionality, such as nested stack traces,
      * additional properties, and improved support for `JSON.stringify()`.
      *
      * @param error - The error object to extend. This object instance will be modified and returned.
      * @param originalError - The original error. This error's stack trace will be added to the error's stack trace.
      * @param props - An object whose properties will be added to the error
      */
    @JSName("extend")
    def extend_E_ErrorLikeP_Object[E /* <: ErrorLike */, P /* <: js.Object */](error: Error): Error with E with P with (OnoError[Error with E with P]) = js.native
    @JSName("extend")
    def extend_E_ErrorLikeP_Object[E /* <: ErrorLike */, P /* <: js.Object */](error: Error, originalError: E): Error with E with P with (OnoError[Error with E with P]) = js.native
    @JSName("extend")
    def extend_P_Object[P /* <: js.Object */](error: ErrorPOJO): ErrorPOJO with P with (OnoError[ErrorPOJO with P]) = js.native
    @JSName("extend")
    def extend_P_Object[P /* <: js.Object */](error: ErrorPOJO, props: P): ErrorPOJO with P with (OnoError[ErrorPOJO with P]) = js.native
    /**
      * Extends the given Error object with enhanced Ono functionality, such as additional properties
      * and improved support for `JSON.stringify()`.
      *
      * @param error - The error object to extend. This object instance will be modified and returned.
      * @param props - An object whose properties will be added to the error
      */
    @JSName("extend")
    def extend_P_Object[P /* <: js.Object */](error: Error): Error with P with (OnoError[Error with P]) = js.native
    @JSName("extend")
    def extend_P_Object[P /* <: js.Object */](error: Error, props: P): Error with P with (OnoError[Error with P]) = js.native
    
    def toJSON(error: ErrorPOJO): ErrorPOJO = js.native
    /**
      * Returns an object containing all properties of the given Error object,
      * which can be used with `JSON.stringify()`.
      */
    def toJSON(error: Error): ErrorPOJO with Error = js.native
  }
  
  @js.native
  trait OnoError[T] extends ErrorPOJO {
    
    /**
      * Returns a JSON representation of the error, including all built-in error properties,
      * as well as properties that were dynamically added.
      */
    def toJSON(): ErrorPOJO with T = js.native
  }
  
  @js.native
  trait OnoOptions extends StObject {
    
    /**
      * When `Ono` is used to wrap an error, this setting determines whether the inner error's message
      * is appended to the new error message.
      *
      * Defaults to `true`.
      */
    var concatMessages: js.UndefOr[Boolean] = js.native
    
    /**
      * A function that replaces placeholders like "%s" or "%d" in error messages with values.
      * If set to `false`, then error messages will be treated as literals and no placeholder replacement will occur.
      *
      * Defaults to `utils.inspect()` in Node.js.  Defaults to `Array.join()` in browsers.
      */
    var format: js.UndefOr[MessageFormatter | `false`] = js.native
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
      def setFormatFunction2(value: (/* message */ String, /* repeated */ js.Any) => String): Self = StObject.set(x, "format", js.Any.fromFunction2(value))
      
      @scala.inline
      def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    }
  }
  
  @js.native
  trait OnoSingleton extends Ono[Error] {
    
    def error(error: ErrorPOJO): Error with ErrorPOJO with (OnoError[Error with ErrorPOJO]) = js.native
    def error(error: ErrorPOJO, message: String, params: js.Any*): Error with ErrorPOJO with (OnoError[Error with ErrorPOJO]) = js.native
    /**
      * Creates a new error with the message, stack trace, and properties of another error.
      *
      * @param error - The original error
      */
    def error(error: Error): Error with OnoError[Error] = js.native
    /**
      * Creates a new error with a formatted message and the stack trace and properties of another error.
      *
      * @param error - The original error
      * @param message - The new error message, possibly including argument placeholders
      * @param params - Optional arguments to replace the corresponding placeholders in the message
      */
    def error(error: Error, message: String, params: js.Any*): Error with OnoError[Error] = js.native
    /**
      * Creates an error with a formatted message.
      *
      * @param message - The new error message, possibly including argument placeholders
      * @param params - Optional arguments to replace the corresponding placeholders in the message
      */
    def error(message: String, params: js.Any*): Error with OnoError[Error] = js.native
    def error[P /* <: js.Object */](error: ErrorPOJO, props: P): Error with ErrorPOJO with P with (OnoError[Error with ErrorPOJO with P]) = js.native
    def error[P /* <: js.Object */](error: ErrorPOJO, props: P, message: String, params: js.Any*): Error with ErrorPOJO with P with (OnoError[Error with ErrorPOJO with P]) = js.native
    /**
      * Creates a new error with the message, stack trace, and properties of another error,
      * as well as aditional properties.
      *
      * @param error - The original error
      * @param props - An object whose properties will be added to the returned error
      */
    def error[P /* <: js.Object */](error: Error, props: P): Error with P with (OnoError[Error with P]) = js.native
    /**
      * Creates a new error with a formatted message and the stack trace and properties of another error,
      * as well as additional properties.
      *
      * @param error - The original error
      * @param props - An object whose properties will be added to the returned error
      * @param message - The new error message, possibly including argument placeholders
      * @param params - Optional arguments to replace the corresponding placeholders in the message
      */
    def error[P /* <: js.Object */](error: Error, props: P, message: String, params: js.Any*): Error with P with (OnoError[Error with P]) = js.native
    /**
      * Creates an error with additional properties.
      *
      * @param props - An object whose properties will be added to the returned error
      */
    def error[P /* <: js.Object */](props: P): Error with P with (OnoError[Error with P]) = js.native
    /**
      * Creates an error with a formatted message and additional properties.
      *
      * @param props - An object whose properties will be added to the returned error
      * @param message - The new error message, possibly including argument placeholders
      * @param params - Optional arguments to replace the corresponding placeholders in the message
      */
    def error[P /* <: js.Object */](props: P, message: String, params: js.Any*): Error with P with (OnoError[Error with P]) = js.native
    @JSName("error")
    var error_Original: Ono[Error] = js.native
    
    def eval(error: ErrorPOJO): EvalError with ErrorPOJO with (OnoError[EvalError with ErrorPOJO]) = js.native
    def eval(error: ErrorPOJO, message: String, params: js.Any*): EvalError with ErrorPOJO with (OnoError[EvalError with ErrorPOJO]) = js.native
    /**
      * Creates a new error with the message, stack trace, and properties of another error.
      *
      * @param error - The original error
      */
    def eval(error: Error): EvalError with Error with (OnoError[EvalError with Error]) = js.native
    /**
      * Creates a new error with a formatted message and the stack trace and properties of another error.
      *
      * @param error - The original error
      * @param message - The new error message, possibly including argument placeholders
      * @param params - Optional arguments to replace the corresponding placeholders in the message
      */
    def eval(error: Error, message: String, params: js.Any*): EvalError with Error with (OnoError[EvalError with Error]) = js.native
    /**
      * Creates an error with a formatted message.
      *
      * @param message - The new error message, possibly including argument placeholders
      * @param params - Optional arguments to replace the corresponding placeholders in the message
      */
    def eval(message: String, params: js.Any*): EvalError with OnoError[EvalError] = js.native
    def eval[P /* <: js.Object */](error: ErrorPOJO, props: P): EvalError with ErrorPOJO with P with (OnoError[EvalError with ErrorPOJO with P]) = js.native
    def eval[P /* <: js.Object */](error: ErrorPOJO, props: P, message: String, params: js.Any*): EvalError with ErrorPOJO with P with (OnoError[EvalError with ErrorPOJO with P]) = js.native
    /**
      * Creates a new error with the message, stack trace, and properties of another error,
      * as well as aditional properties.
      *
      * @param error - The original error
      * @param props - An object whose properties will be added to the returned error
      */
    def eval[P /* <: js.Object */](error: Error, props: P): EvalError with Error with P with (OnoError[EvalError with Error with P]) = js.native
    /**
      * Creates a new error with a formatted message and the stack trace and properties of another error,
      * as well as additional properties.
      *
      * @param error - The original error
      * @param props - An object whose properties will be added to the returned error
      * @param message - The new error message, possibly including argument placeholders
      * @param params - Optional arguments to replace the corresponding placeholders in the message
      */
    def eval[P /* <: js.Object */](error: Error, props: P, message: String, params: js.Any*): EvalError with Error with P with (OnoError[EvalError with Error with P]) = js.native
    /**
      * Creates an error with additional properties.
      *
      * @param props - An object whose properties will be added to the returned error
      */
    def eval[P /* <: js.Object */](props: P): EvalError with P with (OnoError[EvalError with P]) = js.native
    /**
      * Creates an error with a formatted message and additional properties.
      *
      * @param props - An object whose properties will be added to the returned error
      * @param message - The new error message, possibly including argument placeholders
      * @param params - Optional arguments to replace the corresponding placeholders in the message
      */
    def eval[P /* <: js.Object */](props: P, message: String, params: js.Any*): EvalError with P with (OnoError[EvalError with P]) = js.native
    @JSName("eval")
    var eval_Original: Ono[EvalError] = js.native
    
    def range(error: ErrorPOJO): RangeError with ErrorPOJO with (OnoError[RangeError with ErrorPOJO]) = js.native
    def range(error: ErrorPOJO, message: String, params: js.Any*): RangeError with ErrorPOJO with (OnoError[RangeError with ErrorPOJO]) = js.native
    /**
      * Creates a new error with the message, stack trace, and properties of another error.
      *
      * @param error - The original error
      */
    def range(error: Error): RangeError with Error with (OnoError[RangeError with Error]) = js.native
    /**
      * Creates a new error with a formatted message and the stack trace and properties of another error.
      *
      * @param error - The original error
      * @param message - The new error message, possibly including argument placeholders
      * @param params - Optional arguments to replace the corresponding placeholders in the message
      */
    def range(error: Error, message: String, params: js.Any*): RangeError with Error with (OnoError[RangeError with Error]) = js.native
    /**
      * Creates an error with a formatted message.
      *
      * @param message - The new error message, possibly including argument placeholders
      * @param params - Optional arguments to replace the corresponding placeholders in the message
      */
    def range(message: String, params: js.Any*): RangeError with OnoError[RangeError] = js.native
    def range[P /* <: js.Object */](error: ErrorPOJO, props: P): RangeError with ErrorPOJO with P with (OnoError[RangeError with ErrorPOJO with P]) = js.native
    def range[P /* <: js.Object */](error: ErrorPOJO, props: P, message: String, params: js.Any*): RangeError with ErrorPOJO with P with (OnoError[RangeError with ErrorPOJO with P]) = js.native
    /**
      * Creates a new error with the message, stack trace, and properties of another error,
      * as well as aditional properties.
      *
      * @param error - The original error
      * @param props - An object whose properties will be added to the returned error
      */
    def range[P /* <: js.Object */](error: Error, props: P): RangeError with Error with P with (OnoError[RangeError with Error with P]) = js.native
    /**
      * Creates a new error with a formatted message and the stack trace and properties of another error,
      * as well as additional properties.
      *
      * @param error - The original error
      * @param props - An object whose properties will be added to the returned error
      * @param message - The new error message, possibly including argument placeholders
      * @param params - Optional arguments to replace the corresponding placeholders in the message
      */
    def range[P /* <: js.Object */](error: Error, props: P, message: String, params: js.Any*): RangeError with Error with P with (OnoError[RangeError with Error with P]) = js.native
    /**
      * Creates an error with additional properties.
      *
      * @param props - An object whose properties will be added to the returned error
      */
    def range[P /* <: js.Object */](props: P): RangeError with P with (OnoError[RangeError with P]) = js.native
    /**
      * Creates an error with a formatted message and additional properties.
      *
      * @param props - An object whose properties will be added to the returned error
      * @param message - The new error message, possibly including argument placeholders
      * @param params - Optional arguments to replace the corresponding placeholders in the message
      */
    def range[P /* <: js.Object */](props: P, message: String, params: js.Any*): RangeError with P with (OnoError[RangeError with P]) = js.native
    @JSName("range")
    var range_Original: Ono[RangeError] = js.native
    
    def reference(error: ErrorPOJO): ReferenceError with ErrorPOJO with (OnoError[ReferenceError with ErrorPOJO]) = js.native
    def reference(error: ErrorPOJO, message: String, params: js.Any*): ReferenceError with ErrorPOJO with (OnoError[ReferenceError with ErrorPOJO]) = js.native
    /**
      * Creates a new error with the message, stack trace, and properties of another error.
      *
      * @param error - The original error
      */
    def reference(error: Error): ReferenceError with Error with (OnoError[ReferenceError with Error]) = js.native
    /**
      * Creates a new error with a formatted message and the stack trace and properties of another error.
      *
      * @param error - The original error
      * @param message - The new error message, possibly including argument placeholders
      * @param params - Optional arguments to replace the corresponding placeholders in the message
      */
    def reference(error: Error, message: String, params: js.Any*): ReferenceError with Error with (OnoError[ReferenceError with Error]) = js.native
    /**
      * Creates an error with a formatted message.
      *
      * @param message - The new error message, possibly including argument placeholders
      * @param params - Optional arguments to replace the corresponding placeholders in the message
      */
    def reference(message: String, params: js.Any*): ReferenceError with OnoError[ReferenceError] = js.native
    def reference[P /* <: js.Object */](error: ErrorPOJO, props: P): ReferenceError with ErrorPOJO with P with (OnoError[ReferenceError with ErrorPOJO with P]) = js.native
    def reference[P /* <: js.Object */](error: ErrorPOJO, props: P, message: String, params: js.Any*): ReferenceError with ErrorPOJO with P with (OnoError[ReferenceError with ErrorPOJO with P]) = js.native
    /**
      * Creates a new error with the message, stack trace, and properties of another error,
      * as well as aditional properties.
      *
      * @param error - The original error
      * @param props - An object whose properties will be added to the returned error
      */
    def reference[P /* <: js.Object */](error: Error, props: P): ReferenceError with Error with P with (OnoError[ReferenceError with Error with P]) = js.native
    /**
      * Creates a new error with a formatted message and the stack trace and properties of another error,
      * as well as additional properties.
      *
      * @param error - The original error
      * @param props - An object whose properties will be added to the returned error
      * @param message - The new error message, possibly including argument placeholders
      * @param params - Optional arguments to replace the corresponding placeholders in the message
      */
    def reference[P /* <: js.Object */](error: Error, props: P, message: String, params: js.Any*): ReferenceError with Error with P with (OnoError[ReferenceError with Error with P]) = js.native
    /**
      * Creates an error with additional properties.
      *
      * @param props - An object whose properties will be added to the returned error
      */
    def reference[P /* <: js.Object */](props: P): ReferenceError with P with (OnoError[ReferenceError with P]) = js.native
    /**
      * Creates an error with a formatted message and additional properties.
      *
      * @param props - An object whose properties will be added to the returned error
      * @param message - The new error message, possibly including argument placeholders
      * @param params - Optional arguments to replace the corresponding placeholders in the message
      */
    def reference[P /* <: js.Object */](props: P, message: String, params: js.Any*): ReferenceError with P with (OnoError[ReferenceError with P]) = js.native
    @JSName("reference")
    var reference_Original: Ono[ReferenceError] = js.native
    
    def syntax(error: ErrorPOJO): SyntaxError with ErrorPOJO with (OnoError[SyntaxError with ErrorPOJO]) = js.native
    def syntax(error: ErrorPOJO, message: String, params: js.Any*): SyntaxError with ErrorPOJO with (OnoError[SyntaxError with ErrorPOJO]) = js.native
    /**
      * Creates a new error with the message, stack trace, and properties of another error.
      *
      * @param error - The original error
      */
    def syntax(error: Error): SyntaxError with Error with (OnoError[SyntaxError with Error]) = js.native
    /**
      * Creates a new error with a formatted message and the stack trace and properties of another error.
      *
      * @param error - The original error
      * @param message - The new error message, possibly including argument placeholders
      * @param params - Optional arguments to replace the corresponding placeholders in the message
      */
    def syntax(error: Error, message: String, params: js.Any*): SyntaxError with Error with (OnoError[SyntaxError with Error]) = js.native
    /**
      * Creates an error with a formatted message.
      *
      * @param message - The new error message, possibly including argument placeholders
      * @param params - Optional arguments to replace the corresponding placeholders in the message
      */
    def syntax(message: String, params: js.Any*): SyntaxError with OnoError[SyntaxError] = js.native
    def syntax[P /* <: js.Object */](error: ErrorPOJO, props: P): SyntaxError with ErrorPOJO with P with (OnoError[SyntaxError with ErrorPOJO with P]) = js.native
    def syntax[P /* <: js.Object */](error: ErrorPOJO, props: P, message: String, params: js.Any*): SyntaxError with ErrorPOJO with P with (OnoError[SyntaxError with ErrorPOJO with P]) = js.native
    /**
      * Creates a new error with the message, stack trace, and properties of another error,
      * as well as aditional properties.
      *
      * @param error - The original error
      * @param props - An object whose properties will be added to the returned error
      */
    def syntax[P /* <: js.Object */](error: Error, props: P): SyntaxError with Error with P with (OnoError[SyntaxError with Error with P]) = js.native
    /**
      * Creates a new error with a formatted message and the stack trace and properties of another error,
      * as well as additional properties.
      *
      * @param error - The original error
      * @param props - An object whose properties will be added to the returned error
      * @param message - The new error message, possibly including argument placeholders
      * @param params - Optional arguments to replace the corresponding placeholders in the message
      */
    def syntax[P /* <: js.Object */](error: Error, props: P, message: String, params: js.Any*): SyntaxError with Error with P with (OnoError[SyntaxError with Error with P]) = js.native
    /**
      * Creates an error with additional properties.
      *
      * @param props - An object whose properties will be added to the returned error
      */
    def syntax[P /* <: js.Object */](props: P): SyntaxError with P with (OnoError[SyntaxError with P]) = js.native
    /**
      * Creates an error with a formatted message and additional properties.
      *
      * @param props - An object whose properties will be added to the returned error
      * @param message - The new error message, possibly including argument placeholders
      * @param params - Optional arguments to replace the corresponding placeholders in the message
      */
    def syntax[P /* <: js.Object */](props: P, message: String, params: js.Any*): SyntaxError with P with (OnoError[SyntaxError with P]) = js.native
    @JSName("syntax")
    var syntax_Original: Ono[SyntaxError] = js.native
    
    def `type`(error: ErrorPOJO): TypeError with ErrorPOJO with (OnoError[TypeError with ErrorPOJO]) = js.native
    def `type`(error: ErrorPOJO, message: String, params: js.Any*): TypeError with ErrorPOJO with (OnoError[TypeError with ErrorPOJO]) = js.native
    /**
      * Creates a new error with the message, stack trace, and properties of another error.
      *
      * @param error - The original error
      */
    def `type`(error: Error): TypeError with Error with (OnoError[TypeError with Error]) = js.native
    /**
      * Creates a new error with a formatted message and the stack trace and properties of another error.
      *
      * @param error - The original error
      * @param message - The new error message, possibly including argument placeholders
      * @param params - Optional arguments to replace the corresponding placeholders in the message
      */
    def `type`(error: Error, message: String, params: js.Any*): TypeError with Error with (OnoError[TypeError with Error]) = js.native
    /**
      * Creates an error with a formatted message.
      *
      * @param message - The new error message, possibly including argument placeholders
      * @param params - Optional arguments to replace the corresponding placeholders in the message
      */
    def `type`(message: String, params: js.Any*): TypeError with OnoError[TypeError] = js.native
    def `type`[P /* <: js.Object */](error: ErrorPOJO, props: P): TypeError with ErrorPOJO with P with (OnoError[TypeError with ErrorPOJO with P]) = js.native
    def `type`[P /* <: js.Object */](error: ErrorPOJO, props: P, message: String, params: js.Any*): TypeError with ErrorPOJO with P with (OnoError[TypeError with ErrorPOJO with P]) = js.native
    /**
      * Creates a new error with the message, stack trace, and properties of another error,
      * as well as aditional properties.
      *
      * @param error - The original error
      * @param props - An object whose properties will be added to the returned error
      */
    def `type`[P /* <: js.Object */](error: Error, props: P): TypeError with Error with P with (OnoError[TypeError with Error with P]) = js.native
    /**
      * Creates a new error with a formatted message and the stack trace and properties of another error,
      * as well as additional properties.
      *
      * @param error - The original error
      * @param props - An object whose properties will be added to the returned error
      * @param message - The new error message, possibly including argument placeholders
      * @param params - Optional arguments to replace the corresponding placeholders in the message
      */
    def `type`[P /* <: js.Object */](error: Error, props: P, message: String, params: js.Any*): TypeError with Error with P with (OnoError[TypeError with Error with P]) = js.native
    /**
      * Creates an error with additional properties.
      *
      * @param props - An object whose properties will be added to the returned error
      */
    def `type`[P /* <: js.Object */](props: P): TypeError with P with (OnoError[TypeError with P]) = js.native
    /**
      * Creates an error with a formatted message and additional properties.
      *
      * @param props - An object whose properties will be added to the returned error
      * @param message - The new error message, possibly including argument placeholders
      * @param params - Optional arguments to replace the corresponding placeholders in the message
      */
    def `type`[P /* <: js.Object */](props: P, message: String, params: js.Any*): TypeError with P with (OnoError[TypeError with P]) = js.native
    @JSName("type")
    var type_Original: Ono[TypeError] = js.native
    
    def uri(error: ErrorPOJO): URIError with ErrorPOJO with (OnoError[URIError with ErrorPOJO]) = js.native
    def uri(error: ErrorPOJO, message: String, params: js.Any*): URIError with ErrorPOJO with (OnoError[URIError with ErrorPOJO]) = js.native
    /**
      * Creates a new error with the message, stack trace, and properties of another error.
      *
      * @param error - The original error
      */
    def uri(error: Error): URIError with Error with (OnoError[URIError with Error]) = js.native
    /**
      * Creates a new error with a formatted message and the stack trace and properties of another error.
      *
      * @param error - The original error
      * @param message - The new error message, possibly including argument placeholders
      * @param params - Optional arguments to replace the corresponding placeholders in the message
      */
    def uri(error: Error, message: String, params: js.Any*): URIError with Error with (OnoError[URIError with Error]) = js.native
    /**
      * Creates an error with a formatted message.
      *
      * @param message - The new error message, possibly including argument placeholders
      * @param params - Optional arguments to replace the corresponding placeholders in the message
      */
    def uri(message: String, params: js.Any*): URIError with OnoError[URIError] = js.native
    def uri[P /* <: js.Object */](error: ErrorPOJO, props: P): URIError with ErrorPOJO with P with (OnoError[URIError with ErrorPOJO with P]) = js.native
    def uri[P /* <: js.Object */](error: ErrorPOJO, props: P, message: String, params: js.Any*): URIError with ErrorPOJO with P with (OnoError[URIError with ErrorPOJO with P]) = js.native
    /**
      * Creates a new error with the message, stack trace, and properties of another error,
      * as well as aditional properties.
      *
      * @param error - The original error
      * @param props - An object whose properties will be added to the returned error
      */
    def uri[P /* <: js.Object */](error: Error, props: P): URIError with Error with P with (OnoError[URIError with Error with P]) = js.native
    /**
      * Creates a new error with a formatted message and the stack trace and properties of another error,
      * as well as additional properties.
      *
      * @param error - The original error
      * @param props - An object whose properties will be added to the returned error
      * @param message - The new error message, possibly including argument placeholders
      * @param params - Optional arguments to replace the corresponding placeholders in the message
      */
    def uri[P /* <: js.Object */](error: Error, props: P, message: String, params: js.Any*): URIError with Error with P with (OnoError[URIError with Error with P]) = js.native
    /**
      * Creates an error with additional properties.
      *
      * @param props - An object whose properties will be added to the returned error
      */
    def uri[P /* <: js.Object */](props: P): URIError with P with (OnoError[URIError with P]) = js.native
    /**
      * Creates an error with a formatted message and additional properties.
      *
      * @param props - An object whose properties will be added to the returned error
      * @param message - The new error message, possibly including argument placeholders
      * @param params - Optional arguments to replace the corresponding placeholders in the message
      */
    def uri[P /* <: js.Object */](props: P, message: String, params: js.Any*): URIError with P with (OnoError[URIError with P]) = js.native
    @JSName("uri")
    var uri_Original: Ono[URIError] = js.native
  }
}
