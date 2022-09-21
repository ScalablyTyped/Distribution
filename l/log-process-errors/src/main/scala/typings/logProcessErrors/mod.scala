package typings.logProcessErrors

import typings.logProcessErrors.anon.errorNameinErrorNamedefau
import typings.logProcessErrors.logProcessErrorsStrings.MultipleResolves
import typings.logProcessErrors.logProcessErrorsStrings.RejectionHandled
import typings.logProcessErrors.logProcessErrorsStrings.UncaughtException
import typings.logProcessErrors.logProcessErrorsStrings.UnhandledRejection
import typings.logProcessErrors.logProcessErrorsStrings.Warning
import typings.logProcessErrors.logProcessErrorsStrings.ava
import typings.logProcessErrors.logProcessErrorsStrings.jasmine
import typings.logProcessErrors.logProcessErrorsStrings.mocha
import typings.logProcessErrors.logProcessErrorsStrings.node_tap
import typings.logProcessErrors.logProcessErrorsStrings.rejectionHandled_
import typings.logProcessErrors.logProcessErrorsStrings.tape
import typings.logProcessErrors.logProcessErrorsStrings.uncaughtException_
import typings.logProcessErrors.logProcessErrorsStrings.unhandledRejection_
import typings.logProcessErrors.logProcessErrorsStrings.warning_
import typings.std.Error
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
    - typings.logProcessErrors.logProcessErrorsStrings.uncaughtException_
    - typings.logProcessErrors.logProcessErrorsStrings.warning_
    - typings.logProcessErrors.logProcessErrorsStrings.unhandledRejection_
    - typings.logProcessErrors.logProcessErrorsStrings.rejectionHandled_
  */
  trait ErrorName extends StObject
  object ErrorName {
    
    inline def rejectionHandled: rejectionHandled_ = "rejectionHandled".asInstanceOf[rejectionHandled_]
    
    inline def uncaughtException: uncaughtException_ = "uncaughtException".asInstanceOf[uncaughtException_]
    
    inline def unhandledRejection: unhandledRejection_ = "unhandledRejection".asInstanceOf[unhandledRejection_]
    
    inline def warning: warning_ = "warning".asInstanceOf[warning_]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.logProcessErrors.logProcessErrorsStrings.debug
    - typings.logProcessErrors.logProcessErrorsStrings.info
    - typings.logProcessErrors.logProcessErrorsStrings.warn
    - typings.logProcessErrors.logProcessErrorsStrings.error
  */
  trait Level extends StObject
  object Level {
    
    inline def debug: typings.logProcessErrors.logProcessErrorsStrings.debug = "debug".asInstanceOf[typings.logProcessErrors.logProcessErrorsStrings.debug]
    
    inline def error: typings.logProcessErrors.logProcessErrorsStrings.error = "error".asInstanceOf[typings.logProcessErrors.logProcessErrorsStrings.error]
    
    inline def info: typings.logProcessErrors.logProcessErrorsStrings.info = "info".asInstanceOf[typings.logProcessErrors.logProcessErrorsStrings.info]
    
    inline def warn: typings.logProcessErrors.logProcessErrorsStrings.warn = "warn".asInstanceOf[typings.logProcessErrors.logProcessErrorsStrings.warn]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.logProcessErrors.logProcessErrorsStrings.default
    - typings.logProcessErrors.logProcessErrorsStrings.silent
    - typings.logProcessErrors.logProcessErrorsStrings.debug
    - typings.logProcessErrors.logProcessErrorsStrings.info
    - typings.logProcessErrors.logProcessErrorsStrings.warn
    - typings.logProcessErrors.logProcessErrorsStrings.error
  */
  trait LevelOption extends StObject
  object LevelOption {
    
    inline def default: typings.logProcessErrors.logProcessErrorsStrings.default = "default".asInstanceOf[typings.logProcessErrors.logProcessErrorsStrings.default]
    
    inline def debug: typings.logProcessErrors.logProcessErrorsStrings.debug = "debug".asInstanceOf[typings.logProcessErrors.logProcessErrorsStrings.debug]
    
    inline def error: typings.logProcessErrors.logProcessErrorsStrings.error = "error".asInstanceOf[typings.logProcessErrors.logProcessErrorsStrings.error]
    
    inline def info: typings.logProcessErrors.logProcessErrorsStrings.info = "info".asInstanceOf[typings.logProcessErrors.logProcessErrorsStrings.info]
    
    inline def silent: typings.logProcessErrors.logProcessErrorsStrings.silent = "silent".asInstanceOf[typings.logProcessErrors.logProcessErrorsStrings.silent]
    
    inline def warn: typings.logProcessErrors.logProcessErrorsStrings.warn = "warn".asInstanceOf[typings.logProcessErrors.logProcessErrorsStrings.warn]
  }
  
  /* Inlined std.Partial<{log (error : log-process-errors.log-process-errors.ProcessError, level : log-process-errors.log-process-errors.Level, originalError : std.Error): std.Promise<void> | void,   level :{[ errorName in log-process-errors.log-process-errors.ErrorName | 'default' ]:? log-process-errors.log-process-errors.LevelOption | (error : log-process-errors.log-process-errors.ProcessError): log-process-errors.log-process-errors.LevelOption},   exitOn :std.Array<log-process-errors.log-process-errors.Level>,   testing :'ava' | 'mocha' | 'jasmine' | 'tape' | 'node_tap',   colors :boolean}> */
  trait Options extends StObject {
    
    var colors: js.UndefOr[Boolean] = js.undefined
    
    var exitOn: js.UndefOr[js.Array[Level]] = js.undefined
    
    var level: js.UndefOr[errorNameinErrorNamedefau] = js.undefined
    
    var log: js.UndefOr[
        js.Function3[
          /* error */ ProcessError, 
          /* level */ Level, 
          /* originalError */ js.Error, 
          js.Promise[Unit] | Unit
        ]
      ] = js.undefined
    
    var testing: js.UndefOr[ava | mocha | jasmine | tape | node_tap] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setColors(value: Boolean): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
      
      inline def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
      
      inline def setExitOn(value: js.Array[Level]): Self = StObject.set(x, "exitOn", value.asInstanceOf[js.Any])
      
      inline def setExitOnUndefined: Self = StObject.set(x, "exitOn", js.undefined)
      
      inline def setExitOnVarargs(value: Level*): Self = StObject.set(x, "exitOn", js.Array(value*))
      
      inline def setLevel(value: errorNameinErrorNamedefau): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      inline def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
      
      inline def setLog(
        value: (/* error */ ProcessError, /* level */ Level, /* originalError */ js.Error) => js.Promise[Unit] | Unit
      ): Self = StObject.set(x, "log", js.Any.fromFunction3(value))
      
      inline def setLogUndefined: Self = StObject.set(x, "log", js.undefined)
      
      inline def setTesting(value: ava | mocha | jasmine | tape | node_tap): Self = StObject.set(x, "testing", value.asInstanceOf[js.Any])
      
      inline def setTestingUndefined: Self = StObject.set(x, "testing", js.undefined)
    }
  }
  
  trait ProcessError
    extends StObject
       with Error {
    
    @JSName("name")
    var name_ProcessError: UncaughtException | UnhandledRejection | RejectionHandled | MultipleResolves | Warning
  }
  object ProcessError {
    
    inline def apply(
      message: String,
      name: UncaughtException | UnhandledRejection | RejectionHandled | MultipleResolves | Warning
    ): ProcessError = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProcessError]
    }
    
    extension [Self <: ProcessError](x: Self) {
      
      inline def setName(value: UncaughtException | UnhandledRejection | RejectionHandled | MultipleResolves | Warning): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  type Undo = js.Function0[Unit]
}
