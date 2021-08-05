package typings.logProcessErrors

import typings.logProcessErrors.anon.PartialRecordExceptionTyp
import typings.logProcessErrors.logProcessErrorsStrings.`node-tap`
import typings.logProcessErrors.logProcessErrorsStrings.ava
import typings.logProcessErrors.logProcessErrorsStrings.jasmine
import typings.logProcessErrors.logProcessErrorsStrings.mocha
import typings.logProcessErrors.logProcessErrorsStrings.tape
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Log Process Errors
    *
    * @link https://github.com/ehmicky/log-process-errors/blob/master/docs/API.md#logprocesserrorsoptions
    */
  inline def apply(): js.Function0[Unit] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[js.Function0[Unit]]
  inline def apply(options: Options): js.Function0[Unit] = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[js.Function0[Unit]]
  
  @JSImport("log-process-errors", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Exception type.
    */
  /* Rewritten from type alias, can be one of: 
    - typings.logProcessErrors.logProcessErrorsStrings.uncaughtException
    - typings.logProcessErrors.logProcessErrorsStrings.unhandledRejection
    - typings.logProcessErrors.logProcessErrorsStrings.rejectionHandled
    - typings.logProcessErrors.logProcessErrorsStrings.multipleResolves
    - typings.logProcessErrors.logProcessErrorsStrings.warning
  */
  trait ExceptionType extends StObject
  object ExceptionType {
    
    inline def multipleResolves: typings.logProcessErrors.logProcessErrorsStrings.multipleResolves = "multipleResolves".asInstanceOf[typings.logProcessErrors.logProcessErrorsStrings.multipleResolves]
    
    inline def rejectionHandled: typings.logProcessErrors.logProcessErrorsStrings.rejectionHandled = "rejectionHandled".asInstanceOf[typings.logProcessErrors.logProcessErrorsStrings.rejectionHandled]
    
    inline def uncaughtException: typings.logProcessErrors.logProcessErrorsStrings.uncaughtException = "uncaughtException".asInstanceOf[typings.logProcessErrors.logProcessErrorsStrings.uncaughtException]
    
    inline def unhandledRejection: typings.logProcessErrors.logProcessErrorsStrings.unhandledRejection = "unhandledRejection".asInstanceOf[typings.logProcessErrors.logProcessErrorsStrings.unhandledRejection]
    
    inline def warning: typings.logProcessErrors.logProcessErrorsStrings.warning = "warning".asInstanceOf[typings.logProcessErrors.logProcessErrorsStrings.warning]
  }
  
  /**
    * Log level
    */
  /* Rewritten from type alias, can be one of: 
    - typings.logProcessErrors.logProcessErrorsStrings.debug
    - typings.logProcessErrors.logProcessErrorsStrings.info
    - typings.logProcessErrors.logProcessErrorsStrings.warn
    - typings.logProcessErrors.logProcessErrorsStrings.error
    - typings.logProcessErrors.logProcessErrorsStrings.silent
    - typings.logProcessErrors.logProcessErrorsStrings.default
  */
  trait LogLevel extends StObject
  object LogLevel {
    
    inline def default: typings.logProcessErrors.logProcessErrorsStrings.default = "default".asInstanceOf[typings.logProcessErrors.logProcessErrorsStrings.default]
    
    inline def debug: typings.logProcessErrors.logProcessErrorsStrings.debug = "debug".asInstanceOf[typings.logProcessErrors.logProcessErrorsStrings.debug]
    
    inline def error: typings.logProcessErrors.logProcessErrorsStrings.error = "error".asInstanceOf[typings.logProcessErrors.logProcessErrorsStrings.error]
    
    inline def info: typings.logProcessErrors.logProcessErrorsStrings.info = "info".asInstanceOf[typings.logProcessErrors.logProcessErrorsStrings.info]
    
    inline def silent: typings.logProcessErrors.logProcessErrorsStrings.silent = "silent".asInstanceOf[typings.logProcessErrors.logProcessErrorsStrings.silent]
    
    inline def warn: typings.logProcessErrors.logProcessErrorsStrings.warn = "warn".asInstanceOf[typings.logProcessErrors.logProcessErrorsStrings.warn]
  }
  
  /**
    * log-process-errors constructor options.
    */
  trait Options extends StObject {
    
    /**
      * Whether or not to colorize messages.
      *
      * @link https://github.com/ehmicky/log-process-errors/blob/master/docs/API.md#colors
      */
    var colors: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Which process should trigger `process.exit(1)`
      *
      * @link https://github.com/ehmicky/log-process-errors/blob/master/docs/API.md#exiton
      */
    var exitOn: js.UndefOr[js.Array[ExceptionType]] = js.undefined
    
    /**
      * Which log level to use for different exceptions.
      *
      * https://github.com/ehmicky/log-process-errors/blob/master/docs/API.md#log
      */
    var level: js.UndefOr[PartialRecordExceptionTyp] = js.undefined
    
    /**
      * Override logger
      *
      * @link https://github.com/ehmicky/log-process-errors/blob/master/docs/API.md#log
      */
    var log: js.UndefOr[js.Function2[/* error */ Error, /* level */ LogLevel, js.Promise[Unit] | Unit]] = js.undefined
    
    /**
      * When running tests, makes them fail if there are any process errors.
      *
      * @link https://github.com/ehmicky/log-process-errors/blob/master/docs/API.md#testing
      */
    var testing: js.UndefOr[ava | mocha | jasmine | tape | `node-tap`] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setColors(value: Boolean): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
      
      inline def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
      
      inline def setExitOn(value: js.Array[ExceptionType]): Self = StObject.set(x, "exitOn", value.asInstanceOf[js.Any])
      
      inline def setExitOnUndefined: Self = StObject.set(x, "exitOn", js.undefined)
      
      inline def setExitOnVarargs(value: ExceptionType*): Self = StObject.set(x, "exitOn", js.Array(value :_*))
      
      inline def setLevel(value: PartialRecordExceptionTyp): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      inline def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
      
      inline def setLog(value: (/* error */ Error, /* level */ LogLevel) => js.Promise[Unit] | Unit): Self = StObject.set(x, "log", js.Any.fromFunction2(value))
      
      inline def setLogUndefined: Self = StObject.set(x, "log", js.undefined)
      
      inline def setTesting(value: ava | mocha | jasmine | tape | `node-tap`): Self = StObject.set(x, "testing", value.asInstanceOf[js.Any])
      
      inline def setTestingUndefined: Self = StObject.set(x, "testing", js.undefined)
    }
  }
}
