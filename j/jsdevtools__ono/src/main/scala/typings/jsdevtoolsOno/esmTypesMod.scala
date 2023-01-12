package typings.jsdevtoolsOno

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.jsdevtoolsOno.jsdevtoolsOnoBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmTypesMod {
  
  type ErrorLike = js.Error | ErrorPOJO
  
  type ErrorLikeConstructor[T /* <: ErrorLike */] = ErrorLikeConstructorFunction[T] | ErrorLikeConstructorClass[T]
  
  @js.native
  trait ErrorLikeConstructorClass[T /* <: ErrorLike */]
    extends StObject
       with Instantiable1[/* args (repeated) */ Any, T]
  
  type ErrorLikeConstructorFunction[T /* <: ErrorLike */] = js.Function0[T]
  
  trait ErrorPOJO extends StObject {
    
    var message: js.UndefOr[String] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var stack: js.UndefOr[String] = js.undefined
  }
  object ErrorPOJO {
    
    inline def apply(): ErrorPOJO = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ErrorPOJO]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ErrorPOJO] (val x: Self) extends AnyVal {
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setStack(value: String): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
      
      inline def setStackUndefined: Self = StObject.set(x, "stack", js.undefined)
    }
  }
  
  @js.native
  trait MessageFormatter extends StObject {
    
    def apply(message: String, args: Any*): String = js.native
  }
  
  @js.native
  trait Ono[T /* <: ErrorLike */] extends StObject {
    
    /**
      * Creates a new error with the message, stack trace, and properties of another error.
      *
      * @param error - The original error
      */
    def apply(error: js.Error): T & js.Error & (OnoError[T & js.Error]) = js.native
    /**
      * Creates a new error with a formatted message and the stack trace and properties of another error.
      *
      * @param error - The original error
      * @param message - The new error message, possibly including argument placeholders
      * @param params - Optional arguments to replace the corresponding placeholders in the message
      */
    def apply(error: js.Error, message: String, params: Any*): T & js.Error & (OnoError[T & js.Error]) = js.native
    def apply(error: ErrorPOJO): T & ErrorPOJO & (OnoError[T & ErrorPOJO]) = js.native
    def apply(error: ErrorPOJO, message: String, params: Any*): T & ErrorPOJO & (OnoError[T & ErrorPOJO]) = js.native
    /**
      * Creates an error with a formatted message.
      *
      * @param message - The new error message, possibly including argument placeholders
      * @param params - Optional arguments to replace the corresponding placeholders in the message
      */
    def apply(message: String, params: Any*): T & OnoError[T] = js.native
    /**
      * Creates a new error with the message, stack trace, and properties of another error,
      * as well as aditional properties.
      *
      * @param error - The original error
      * @param props - An object whose properties will be added to the returned error
      */
    def apply[P /* <: js.Object */](error: js.Error, props: P): T & js.Error & P & (OnoError[T & js.Error & P]) = js.native
    /**
      * Creates a new error with a formatted message and the stack trace and properties of another error,
      * as well as additional properties.
      *
      * @param error - The original error
      * @param props - An object whose properties will be added to the returned error
      * @param message - The new error message, possibly including argument placeholders
      * @param params - Optional arguments to replace the corresponding placeholders in the message
      */
    def apply[P /* <: js.Object */](error: js.Error, props: P, message: String, params: Any*): T & js.Error & P & (OnoError[T & js.Error & P]) = js.native
    def apply[P /* <: js.Object */](error: ErrorPOJO, props: P): T & ErrorPOJO & P & (OnoError[T & ErrorPOJO & P]) = js.native
    def apply[P /* <: js.Object */](error: ErrorPOJO, props: P, message: String, params: Any*): T & ErrorPOJO & P & (OnoError[T & ErrorPOJO & P]) = js.native
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
    def apply[P /* <: js.Object */](props: P, message: String, params: Any*): T & P & (OnoError[T & P]) = js.native
    
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
    
    /**
      * Extends the given Error object with enhanced Ono functionality, such as improved support for
      * `JSON.stringify()`.
      *
      * @param error - The error object to extend. This object instance will be modified and returned.
      */
    def extend(error: js.Error): js.Error & OnoError[js.Error] = js.native
    def extend(error: ErrorPOJO): ErrorPOJO & OnoError[ErrorPOJO] = js.native
    def extend[E /* <: ErrorLike */](error: js.Error, originalError: E): js.Error & E & (OnoError[js.Error & E]) = js.native
    def extend[E /* <: ErrorLike */](error: ErrorPOJO, originalError: E): ErrorPOJO & E & (OnoError[ErrorPOJO & E]) = js.native
    def extend[E /* <: ErrorLike */, P /* <: js.Object */](error: js.Error, originalError: E, props: P): js.Error & E & P & (OnoError[js.Error & E & P]) = js.native
    def extend[E /* <: ErrorLike */, P /* <: js.Object */](error: js.Error, originalError: Unit, props: P): js.Error & E & P & (OnoError[js.Error & E & P]) = js.native
    def extend[E /* <: ErrorLike */, P /* <: js.Object */](error: ErrorPOJO, originalError: E, props: P): ErrorPOJO & E & P & (OnoError[ErrorPOJO & E & P]) = js.native
    def extend[E /* <: ErrorLike */, P /* <: js.Object */](error: ErrorPOJO, originalError: Unit, props: P): ErrorPOJO & E & P & (OnoError[ErrorPOJO & E & P]) = js.native
    /**
      * Extends the given Error object with enhanced Ono functionality, such as nested stack traces
      * and improved support for `JSON.stringify()`.
      *
      * @param error - The error object to extend. This object instance will be modified and returned.
      * @param originalError - The original error. This error's stack trace will be added to the error's stack trace.
      */
    @JSName("extend")
    def extend_E[E /* <: ErrorLike */](error: js.Error): js.Error & E & (OnoError[js.Error & E]) = js.native
    @JSName("extend")
    def extend_E[E /* <: ErrorLike */](error: ErrorPOJO): ErrorPOJO & E & (OnoError[ErrorPOJO & E]) = js.native
    /**
      * Extends the given Error object with enhanced Ono functionality, such as nested stack traces,
      * additional properties, and improved support for `JSON.stringify()`.
      *
      * @param error - The error object to extend. This object instance will be modified and returned.
      * @param originalError - The original error. This error's stack trace will be added to the error's stack trace.
      * @param props - An object whose properties will be added to the error
      */
    @JSName("extend")
    def extend_EP[E /* <: ErrorLike */, P /* <: js.Object */](error: js.Error): js.Error & E & P & (OnoError[js.Error & E & P]) = js.native
    @JSName("extend")
    def extend_EP[E /* <: ErrorLike */, P /* <: js.Object */](error: js.Error, originalError: E): js.Error & E & P & (OnoError[js.Error & E & P]) = js.native
    @JSName("extend")
    def extend_EP[E /* <: ErrorLike */, P /* <: js.Object */](error: ErrorPOJO): ErrorPOJO & E & P & (OnoError[ErrorPOJO & E & P]) = js.native
    @JSName("extend")
    def extend_EP[E /* <: ErrorLike */, P /* <: js.Object */](error: ErrorPOJO, originalError: E): ErrorPOJO & E & P & (OnoError[ErrorPOJO & E & P]) = js.native
    /**
      * Extends the given Error object with enhanced Ono functionality, such as additional properties
      * and improved support for `JSON.stringify()`.
      *
      * @param error - The error object to extend. This object instance will be modified and returned.
      * @param props - An object whose properties will be added to the error
      */
    @JSName("extend")
    def extend_P[P /* <: js.Object */](error: js.Error): js.Error & P & (OnoError[js.Error & P]) = js.native
    @JSName("extend")
    def extend_P[P /* <: js.Object */](error: js.Error, props: P): js.Error & P & (OnoError[js.Error & P]) = js.native
    @JSName("extend")
    def extend_P[P /* <: js.Object */](error: ErrorPOJO): ErrorPOJO & P & (OnoError[ErrorPOJO & P]) = js.native
    @JSName("extend")
    def extend_P[P /* <: js.Object */](error: ErrorPOJO, props: P): ErrorPOJO & P & (OnoError[ErrorPOJO & P]) = js.native
    
    /**
      * Returns an object containing all properties of the given Error object,
      * which can be used with `JSON.stringify()`.
      */
    def toJSON(error: js.Error): ErrorPOJO & js.Error = js.native
    def toJSON(error: ErrorPOJO): ErrorPOJO = js.native
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
    
    inline def apply(): OnoOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OnoOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OnoOptions] (val x: Self) extends AnyVal {
      
      inline def setConcatMessages(value: Boolean): Self = StObject.set(x, "concatMessages", value.asInstanceOf[js.Any])
      
      inline def setConcatMessagesUndefined: Self = StObject.set(x, "concatMessages", js.undefined)
      
      inline def setFormat(value: MessageFormatter | `false`): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    }
  }
  
  @js.native
  trait OnoSingleton
    extends StObject
       with Ono[js.Error] {
    
    /**
      * Creates a new error with the message, stack trace, and properties of another error.
      *
      * @param error - The original error
      */
    def error(error: js.Error): js.Error & OnoError[js.Error] = js.native
    /**
      * Creates a new error with a formatted message and the stack trace and properties of another error.
      *
      * @param error - The original error
      * @param message - The new error message, possibly including argument placeholders
      * @param params - Optional arguments to replace the corresponding placeholders in the message
      */
    def error(error: js.Error, message: String, params: Any*): js.Error & OnoError[js.Error] = js.native
    def error(error: ErrorPOJO): js.Error & ErrorPOJO & (OnoError[js.Error & ErrorPOJO]) = js.native
    def error(error: ErrorPOJO, message: String, params: Any*): js.Error & ErrorPOJO & (OnoError[js.Error & ErrorPOJO]) = js.native
    /**
      * Creates an error with a formatted message.
      *
      * @param message - The new error message, possibly including argument placeholders
      * @param params - Optional arguments to replace the corresponding placeholders in the message
      */
    def error(message: String, params: Any*): js.Error & OnoError[js.Error] = js.native
    /**
      * Creates a new error with the message, stack trace, and properties of another error,
      * as well as aditional properties.
      *
      * @param error - The original error
      * @param props - An object whose properties will be added to the returned error
      */
    def error[P /* <: js.Object */](error: js.Error, props: P): js.Error & P & (OnoError[js.Error & P]) = js.native
    /**
      * Creates a new error with a formatted message and the stack trace and properties of another error,
      * as well as additional properties.
      *
      * @param error - The original error
      * @param props - An object whose properties will be added to the returned error
      * @param message - The new error message, possibly including argument placeholders
      * @param params - Optional arguments to replace the corresponding placeholders in the message
      */
    def error[P /* <: js.Object */](error: js.Error, props: P, message: String, params: Any*): js.Error & P & (OnoError[js.Error & P]) = js.native
    def error[P /* <: js.Object */](error: ErrorPOJO, props: P): js.Error & ErrorPOJO & P & (OnoError[js.Error & ErrorPOJO & P]) = js.native
    def error[P /* <: js.Object */](error: ErrorPOJO, props: P, message: String, params: Any*): js.Error & ErrorPOJO & P & (OnoError[js.Error & ErrorPOJO & P]) = js.native
    /**
      * Creates an error with additional properties.
      *
      * @param props - An object whose properties will be added to the returned error
      */
    def error[P /* <: js.Object */](props: P): js.Error & P & (OnoError[js.Error & P]) = js.native
    /**
      * Creates an error with a formatted message and additional properties.
      *
      * @param props - An object whose properties will be added to the returned error
      * @param message - The new error message, possibly including argument placeholders
      * @param params - Optional arguments to replace the corresponding placeholders in the message
      */
    def error[P /* <: js.Object */](props: P, message: String, params: Any*): js.Error & P & (OnoError[js.Error & P]) = js.native
    @JSName("error")
    var error_Original: Ono[js.Error] = js.native
    
    /**
      * Creates a new error with the message, stack trace, and properties of another error.
      *
      * @param error - The original error
      */
    def eval(error: js.Error): js.EvalError & js.Error & (OnoError[js.EvalError & js.Error]) = js.native
    /**
      * Creates a new error with a formatted message and the stack trace and properties of another error.
      *
      * @param error - The original error
      * @param message - The new error message, possibly including argument placeholders
      * @param params - Optional arguments to replace the corresponding placeholders in the message
      */
    def eval(error: js.Error, message: String, params: Any*): js.EvalError & js.Error & (OnoError[js.EvalError & js.Error]) = js.native
    def eval(error: ErrorPOJO): js.EvalError & ErrorPOJO & (OnoError[js.EvalError & ErrorPOJO]) = js.native
    def eval(error: ErrorPOJO, message: String, params: Any*): js.EvalError & ErrorPOJO & (OnoError[js.EvalError & ErrorPOJO]) = js.native
    /**
      * Creates an error with a formatted message.
      *
      * @param message - The new error message, possibly including argument placeholders
      * @param params - Optional arguments to replace the corresponding placeholders in the message
      */
    def eval(message: String, params: Any*): js.EvalError & OnoError[js.EvalError] = js.native
    /**
      * Creates a new error with the message, stack trace, and properties of another error,
      * as well as aditional properties.
      *
      * @param error - The original error
      * @param props - An object whose properties will be added to the returned error
      */
    def eval[P /* <: js.Object */](error: js.Error, props: P): js.EvalError & js.Error & P & (OnoError[js.EvalError & js.Error & P]) = js.native
    /**
      * Creates a new error with a formatted message and the stack trace and properties of another error,
      * as well as additional properties.
      *
      * @param error - The original error
      * @param props - An object whose properties will be added to the returned error
      * @param message - The new error message, possibly including argument placeholders
      * @param params - Optional arguments to replace the corresponding placeholders in the message
      */
    def eval[P /* <: js.Object */](error: js.Error, props: P, message: String, params: Any*): js.EvalError & js.Error & P & (OnoError[js.EvalError & js.Error & P]) = js.native
    def eval[P /* <: js.Object */](error: ErrorPOJO, props: P): js.EvalError & ErrorPOJO & P & (OnoError[js.EvalError & ErrorPOJO & P]) = js.native
    def eval[P /* <: js.Object */](error: ErrorPOJO, props: P, message: String, params: Any*): js.EvalError & ErrorPOJO & P & (OnoError[js.EvalError & ErrorPOJO & P]) = js.native
    /**
      * Creates an error with additional properties.
      *
      * @param props - An object whose properties will be added to the returned error
      */
    def eval[P /* <: js.Object */](props: P): js.EvalError & P & (OnoError[js.EvalError & P]) = js.native
    /**
      * Creates an error with a formatted message and additional properties.
      *
      * @param props - An object whose properties will be added to the returned error
      * @param message - The new error message, possibly including argument placeholders
      * @param params - Optional arguments to replace the corresponding placeholders in the message
      */
    def eval[P /* <: js.Object */](props: P, message: String, params: Any*): js.EvalError & P & (OnoError[js.EvalError & P]) = js.native
    @JSName("eval")
    var eval_Original: Ono[js.EvalError] = js.native
    
    /**
      * Creates a new error with the message, stack trace, and properties of another error.
      *
      * @param error - The original error
      */
    def range(error: js.Error): js.RangeError & js.Error & (OnoError[js.RangeError & js.Error]) = js.native
    /**
      * Creates a new error with a formatted message and the stack trace and properties of another error.
      *
      * @param error - The original error
      * @param message - The new error message, possibly including argument placeholders
      * @param params - Optional arguments to replace the corresponding placeholders in the message
      */
    def range(error: js.Error, message: String, params: Any*): js.RangeError & js.Error & (OnoError[js.RangeError & js.Error]) = js.native
    def range(error: ErrorPOJO): js.RangeError & ErrorPOJO & (OnoError[js.RangeError & ErrorPOJO]) = js.native
    def range(error: ErrorPOJO, message: String, params: Any*): js.RangeError & ErrorPOJO & (OnoError[js.RangeError & ErrorPOJO]) = js.native
    /**
      * Creates an error with a formatted message.
      *
      * @param message - The new error message, possibly including argument placeholders
      * @param params - Optional arguments to replace the corresponding placeholders in the message
      */
    def range(message: String, params: Any*): js.RangeError & OnoError[js.RangeError] = js.native
    /**
      * Creates a new error with the message, stack trace, and properties of another error,
      * as well as aditional properties.
      *
      * @param error - The original error
      * @param props - An object whose properties will be added to the returned error
      */
    def range[P /* <: js.Object */](error: js.Error, props: P): js.RangeError & js.Error & P & (OnoError[js.RangeError & js.Error & P]) = js.native
    /**
      * Creates a new error with a formatted message and the stack trace and properties of another error,
      * as well as additional properties.
      *
      * @param error - The original error
      * @param props - An object whose properties will be added to the returned error
      * @param message - The new error message, possibly including argument placeholders
      * @param params - Optional arguments to replace the corresponding placeholders in the message
      */
    def range[P /* <: js.Object */](error: js.Error, props: P, message: String, params: Any*): js.RangeError & js.Error & P & (OnoError[js.RangeError & js.Error & P]) = js.native
    def range[P /* <: js.Object */](error: ErrorPOJO, props: P): js.RangeError & ErrorPOJO & P & (OnoError[js.RangeError & ErrorPOJO & P]) = js.native
    def range[P /* <: js.Object */](error: ErrorPOJO, props: P, message: String, params: Any*): js.RangeError & ErrorPOJO & P & (OnoError[js.RangeError & ErrorPOJO & P]) = js.native
    /**
      * Creates an error with additional properties.
      *
      * @param props - An object whose properties will be added to the returned error
      */
    def range[P /* <: js.Object */](props: P): js.RangeError & P & (OnoError[js.RangeError & P]) = js.native
    /**
      * Creates an error with a formatted message and additional properties.
      *
      * @param props - An object whose properties will be added to the returned error
      * @param message - The new error message, possibly including argument placeholders
      * @param params - Optional arguments to replace the corresponding placeholders in the message
      */
    def range[P /* <: js.Object */](props: P, message: String, params: Any*): js.RangeError & P & (OnoError[js.RangeError & P]) = js.native
    @JSName("range")
    var range_Original: Ono[js.RangeError] = js.native
    
    /**
      * Creates a new error with the message, stack trace, and properties of another error.
      *
      * @param error - The original error
      */
    def reference(error: js.Error): js.ReferenceError & js.Error & (OnoError[js.ReferenceError & js.Error]) = js.native
    /**
      * Creates a new error with a formatted message and the stack trace and properties of another error.
      *
      * @param error - The original error
      * @param message - The new error message, possibly including argument placeholders
      * @param params - Optional arguments to replace the corresponding placeholders in the message
      */
    def reference(error: js.Error, message: String, params: Any*): js.ReferenceError & js.Error & (OnoError[js.ReferenceError & js.Error]) = js.native
    def reference(error: ErrorPOJO): js.ReferenceError & ErrorPOJO & (OnoError[js.ReferenceError & ErrorPOJO]) = js.native
    def reference(error: ErrorPOJO, message: String, params: Any*): js.ReferenceError & ErrorPOJO & (OnoError[js.ReferenceError & ErrorPOJO]) = js.native
    /**
      * Creates an error with a formatted message.
      *
      * @param message - The new error message, possibly including argument placeholders
      * @param params - Optional arguments to replace the corresponding placeholders in the message
      */
    def reference(message: String, params: Any*): js.ReferenceError & OnoError[js.ReferenceError] = js.native
    /**
      * Creates a new error with the message, stack trace, and properties of another error,
      * as well as aditional properties.
      *
      * @param error - The original error
      * @param props - An object whose properties will be added to the returned error
      */
    def reference[P /* <: js.Object */](error: js.Error, props: P): js.ReferenceError & js.Error & P & (OnoError[js.ReferenceError & js.Error & P]) = js.native
    /**
      * Creates a new error with a formatted message and the stack trace and properties of another error,
      * as well as additional properties.
      *
      * @param error - The original error
      * @param props - An object whose properties will be added to the returned error
      * @param message - The new error message, possibly including argument placeholders
      * @param params - Optional arguments to replace the corresponding placeholders in the message
      */
    def reference[P /* <: js.Object */](error: js.Error, props: P, message: String, params: Any*): js.ReferenceError & js.Error & P & (OnoError[js.ReferenceError & js.Error & P]) = js.native
    def reference[P /* <: js.Object */](error: ErrorPOJO, props: P): js.ReferenceError & ErrorPOJO & P & (OnoError[js.ReferenceError & ErrorPOJO & P]) = js.native
    def reference[P /* <: js.Object */](error: ErrorPOJO, props: P, message: String, params: Any*): js.ReferenceError & ErrorPOJO & P & (OnoError[js.ReferenceError & ErrorPOJO & P]) = js.native
    /**
      * Creates an error with additional properties.
      *
      * @param props - An object whose properties will be added to the returned error
      */
    def reference[P /* <: js.Object */](props: P): js.ReferenceError & P & (OnoError[js.ReferenceError & P]) = js.native
    /**
      * Creates an error with a formatted message and additional properties.
      *
      * @param props - An object whose properties will be added to the returned error
      * @param message - The new error message, possibly including argument placeholders
      * @param params - Optional arguments to replace the corresponding placeholders in the message
      */
    def reference[P /* <: js.Object */](props: P, message: String, params: Any*): js.ReferenceError & P & (OnoError[js.ReferenceError & P]) = js.native
    @JSName("reference")
    var reference_Original: Ono[js.ReferenceError] = js.native
    
    /**
      * Creates a new error with the message, stack trace, and properties of another error.
      *
      * @param error - The original error
      */
    def syntax(error: js.Error): js.SyntaxError & js.Error & (OnoError[js.SyntaxError & js.Error]) = js.native
    /**
      * Creates a new error with a formatted message and the stack trace and properties of another error.
      *
      * @param error - The original error
      * @param message - The new error message, possibly including argument placeholders
      * @param params - Optional arguments to replace the corresponding placeholders in the message
      */
    def syntax(error: js.Error, message: String, params: Any*): js.SyntaxError & js.Error & (OnoError[js.SyntaxError & js.Error]) = js.native
    def syntax(error: ErrorPOJO): js.SyntaxError & ErrorPOJO & (OnoError[js.SyntaxError & ErrorPOJO]) = js.native
    def syntax(error: ErrorPOJO, message: String, params: Any*): js.SyntaxError & ErrorPOJO & (OnoError[js.SyntaxError & ErrorPOJO]) = js.native
    /**
      * Creates an error with a formatted message.
      *
      * @param message - The new error message, possibly including argument placeholders
      * @param params - Optional arguments to replace the corresponding placeholders in the message
      */
    def syntax(message: String, params: Any*): js.SyntaxError & OnoError[js.SyntaxError] = js.native
    /**
      * Creates a new error with the message, stack trace, and properties of another error,
      * as well as aditional properties.
      *
      * @param error - The original error
      * @param props - An object whose properties will be added to the returned error
      */
    def syntax[P /* <: js.Object */](error: js.Error, props: P): js.SyntaxError & js.Error & P & (OnoError[js.SyntaxError & js.Error & P]) = js.native
    /**
      * Creates a new error with a formatted message and the stack trace and properties of another error,
      * as well as additional properties.
      *
      * @param error - The original error
      * @param props - An object whose properties will be added to the returned error
      * @param message - The new error message, possibly including argument placeholders
      * @param params - Optional arguments to replace the corresponding placeholders in the message
      */
    def syntax[P /* <: js.Object */](error: js.Error, props: P, message: String, params: Any*): js.SyntaxError & js.Error & P & (OnoError[js.SyntaxError & js.Error & P]) = js.native
    def syntax[P /* <: js.Object */](error: ErrorPOJO, props: P): js.SyntaxError & ErrorPOJO & P & (OnoError[js.SyntaxError & ErrorPOJO & P]) = js.native
    def syntax[P /* <: js.Object */](error: ErrorPOJO, props: P, message: String, params: Any*): js.SyntaxError & ErrorPOJO & P & (OnoError[js.SyntaxError & ErrorPOJO & P]) = js.native
    /**
      * Creates an error with additional properties.
      *
      * @param props - An object whose properties will be added to the returned error
      */
    def syntax[P /* <: js.Object */](props: P): js.SyntaxError & P & (OnoError[js.SyntaxError & P]) = js.native
    /**
      * Creates an error with a formatted message and additional properties.
      *
      * @param props - An object whose properties will be added to the returned error
      * @param message - The new error message, possibly including argument placeholders
      * @param params - Optional arguments to replace the corresponding placeholders in the message
      */
    def syntax[P /* <: js.Object */](props: P, message: String, params: Any*): js.SyntaxError & P & (OnoError[js.SyntaxError & P]) = js.native
    @JSName("syntax")
    var syntax_Original: Ono[js.SyntaxError] = js.native
    
    /**
      * Creates a new error with the message, stack trace, and properties of another error.
      *
      * @param error - The original error
      */
    def `type`(error: js.Error): js.TypeError & js.Error & (OnoError[js.TypeError & js.Error]) = js.native
    /**
      * Creates a new error with a formatted message and the stack trace and properties of another error.
      *
      * @param error - The original error
      * @param message - The new error message, possibly including argument placeholders
      * @param params - Optional arguments to replace the corresponding placeholders in the message
      */
    def `type`(error: js.Error, message: String, params: Any*): js.TypeError & js.Error & (OnoError[js.TypeError & js.Error]) = js.native
    def `type`(error: ErrorPOJO): js.TypeError & ErrorPOJO & (OnoError[js.TypeError & ErrorPOJO]) = js.native
    def `type`(error: ErrorPOJO, message: String, params: Any*): js.TypeError & ErrorPOJO & (OnoError[js.TypeError & ErrorPOJO]) = js.native
    /**
      * Creates an error with a formatted message.
      *
      * @param message - The new error message, possibly including argument placeholders
      * @param params - Optional arguments to replace the corresponding placeholders in the message
      */
    def `type`(message: String, params: Any*): js.TypeError & OnoError[js.TypeError] = js.native
    /**
      * Creates a new error with the message, stack trace, and properties of another error,
      * as well as aditional properties.
      *
      * @param error - The original error
      * @param props - An object whose properties will be added to the returned error
      */
    def `type`[P /* <: js.Object */](error: js.Error, props: P): js.TypeError & js.Error & P & (OnoError[js.TypeError & js.Error & P]) = js.native
    /**
      * Creates a new error with a formatted message and the stack trace and properties of another error,
      * as well as additional properties.
      *
      * @param error - The original error
      * @param props - An object whose properties will be added to the returned error
      * @param message - The new error message, possibly including argument placeholders
      * @param params - Optional arguments to replace the corresponding placeholders in the message
      */
    def `type`[P /* <: js.Object */](error: js.Error, props: P, message: String, params: Any*): js.TypeError & js.Error & P & (OnoError[js.TypeError & js.Error & P]) = js.native
    def `type`[P /* <: js.Object */](error: ErrorPOJO, props: P): js.TypeError & ErrorPOJO & P & (OnoError[js.TypeError & ErrorPOJO & P]) = js.native
    def `type`[P /* <: js.Object */](error: ErrorPOJO, props: P, message: String, params: Any*): js.TypeError & ErrorPOJO & P & (OnoError[js.TypeError & ErrorPOJO & P]) = js.native
    /**
      * Creates an error with additional properties.
      *
      * @param props - An object whose properties will be added to the returned error
      */
    def `type`[P /* <: js.Object */](props: P): js.TypeError & P & (OnoError[js.TypeError & P]) = js.native
    /**
      * Creates an error with a formatted message and additional properties.
      *
      * @param props - An object whose properties will be added to the returned error
      * @param message - The new error message, possibly including argument placeholders
      * @param params - Optional arguments to replace the corresponding placeholders in the message
      */
    def `type`[P /* <: js.Object */](props: P, message: String, params: Any*): js.TypeError & P & (OnoError[js.TypeError & P]) = js.native
    @JSName("type")
    var type_Original: Ono[js.TypeError] = js.native
    
    /**
      * Creates a new error with the message, stack trace, and properties of another error.
      *
      * @param error - The original error
      */
    def uri(error: js.Error): js.URIError & js.Error & (OnoError[js.URIError & js.Error]) = js.native
    /**
      * Creates a new error with a formatted message and the stack trace and properties of another error.
      *
      * @param error - The original error
      * @param message - The new error message, possibly including argument placeholders
      * @param params - Optional arguments to replace the corresponding placeholders in the message
      */
    def uri(error: js.Error, message: String, params: Any*): js.URIError & js.Error & (OnoError[js.URIError & js.Error]) = js.native
    def uri(error: ErrorPOJO): js.URIError & ErrorPOJO & (OnoError[js.URIError & ErrorPOJO]) = js.native
    def uri(error: ErrorPOJO, message: String, params: Any*): js.URIError & ErrorPOJO & (OnoError[js.URIError & ErrorPOJO]) = js.native
    /**
      * Creates an error with a formatted message.
      *
      * @param message - The new error message, possibly including argument placeholders
      * @param params - Optional arguments to replace the corresponding placeholders in the message
      */
    def uri(message: String, params: Any*): js.URIError & OnoError[js.URIError] = js.native
    /**
      * Creates a new error with the message, stack trace, and properties of another error,
      * as well as aditional properties.
      *
      * @param error - The original error
      * @param props - An object whose properties will be added to the returned error
      */
    def uri[P /* <: js.Object */](error: js.Error, props: P): js.URIError & js.Error & P & (OnoError[js.URIError & js.Error & P]) = js.native
    /**
      * Creates a new error with a formatted message and the stack trace and properties of another error,
      * as well as additional properties.
      *
      * @param error - The original error
      * @param props - An object whose properties will be added to the returned error
      * @param message - The new error message, possibly including argument placeholders
      * @param params - Optional arguments to replace the corresponding placeholders in the message
      */
    def uri[P /* <: js.Object */](error: js.Error, props: P, message: String, params: Any*): js.URIError & js.Error & P & (OnoError[js.URIError & js.Error & P]) = js.native
    def uri[P /* <: js.Object */](error: ErrorPOJO, props: P): js.URIError & ErrorPOJO & P & (OnoError[js.URIError & ErrorPOJO & P]) = js.native
    def uri[P /* <: js.Object */](error: ErrorPOJO, props: P, message: String, params: Any*): js.URIError & ErrorPOJO & P & (OnoError[js.URIError & ErrorPOJO & P]) = js.native
    /**
      * Creates an error with additional properties.
      *
      * @param props - An object whose properties will be added to the returned error
      */
    def uri[P /* <: js.Object */](props: P): js.URIError & P & (OnoError[js.URIError & P]) = js.native
    /**
      * Creates an error with a formatted message and additional properties.
      *
      * @param props - An object whose properties will be added to the returned error
      * @param message - The new error message, possibly including argument placeholders
      * @param params - Optional arguments to replace the corresponding placeholders in the message
      */
    def uri[P /* <: js.Object */](props: P, message: String, params: Any*): js.URIError & P & (OnoError[js.URIError & P]) = js.native
    @JSName("uri")
    var uri_Original: Ono[js.URIError] = js.native
  }
}
