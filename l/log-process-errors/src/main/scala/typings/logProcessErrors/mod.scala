package typings.logProcessErrors

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("log-process-errors", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): Undo = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[Undo]
  inline def default(options: Options): Undo = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[Undo]
  
  /* Rewritten from type alias, can be one of: 
    - typings.logProcessErrors.logProcessErrorsStrings.uncaughtException
    - typings.logProcessErrors.logProcessErrorsStrings.warning
    - typings.logProcessErrors.logProcessErrorsStrings.unhandledRejection
    - typings.logProcessErrors.logProcessErrorsStrings.rejectionHandled
  */
  trait Event extends StObject
  object Event {
    
    inline def rejectionHandled: typings.logProcessErrors.logProcessErrorsStrings.rejectionHandled = "rejectionHandled".asInstanceOf[typings.logProcessErrors.logProcessErrorsStrings.rejectionHandled]
    
    inline def uncaughtException: typings.logProcessErrors.logProcessErrorsStrings.uncaughtException = "uncaughtException".asInstanceOf[typings.logProcessErrors.logProcessErrorsStrings.uncaughtException]
    
    inline def unhandledRejection: typings.logProcessErrors.logProcessErrorsStrings.unhandledRejection = "unhandledRejection".asInstanceOf[typings.logProcessErrors.logProcessErrorsStrings.unhandledRejection]
    
    inline def warning: typings.logProcessErrors.logProcessErrorsStrings.warning = "warning".asInstanceOf[typings.logProcessErrors.logProcessErrorsStrings.warning]
  }
  
  trait Options extends StObject {
    
    /**
      * Prevent exiting the process on
      * [uncaught exceptions](https://nodejs.org/api/process.html#process_event_uncaughtexception)
      * or
      * [unhandled promises](https://nodejs.org/api/process.html#process_event_unhandledrejection).
      *
      * @default false
      */
    val exit: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Function called once per process error.
      * Duplicate process errors are ignored.
      *
      * @default console.error(error)
      *
      * @example
      * ```js
      * // Log process errors with Winston instead
      * logProcessErrors({
      *   onError(error, event) {
      *     winstonLogger.error(error.stack)
      *   },
      * })
      * ```
      */
    val onError: js.UndefOr[js.Function2[/* error */ js.Error, /* event */ Event, js.Promise[Unit] | Unit]] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setExit(value: Boolean): Self = StObject.set(x, "exit", value.asInstanceOf[js.Any])
      
      inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
      
      inline def setOnError(value: (/* error */ js.Error, /* event */ Event) => js.Promise[Unit] | Unit): Self = StObject.set(x, "onError", js.Any.fromFunction2(value))
      
      inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
    }
  }
  
  /**
    * Restores Node.js default behavior.
    *
    * @example
    * ```js
    * const restore = logProcessErrors(options)
    * restore()
    * ```
    */
  type Undo = js.Function0[Unit]
}
