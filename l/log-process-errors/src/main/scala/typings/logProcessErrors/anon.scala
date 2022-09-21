package typings.logProcessErrors

import typings.logProcessErrors.mod.LevelOption
import typings.logProcessErrors.mod.ProcessError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined {[ errorName in log-process-errors.log-process-errors.ErrorName | 'default' ]:? log-process-errors.log-process-errors.LevelOption | (error : log-process-errors.log-process-errors.ProcessError): log-process-errors.log-process-errors.LevelOption} */
  trait errorNameinErrorNamedefau extends StObject {
    
    var default: js.UndefOr[LevelOption | (js.Function1[/* error */ ProcessError, LevelOption])] = js.undefined
    
    var rejectionHandled: js.UndefOr[LevelOption | (js.Function1[/* error */ ProcessError, LevelOption])] = js.undefined
    
    var uncaughtException: js.UndefOr[LevelOption | (js.Function1[/* error */ ProcessError, LevelOption])] = js.undefined
    
    var unhandledRejection: js.UndefOr[LevelOption | (js.Function1[/* error */ ProcessError, LevelOption])] = js.undefined
    
    var warning: js.UndefOr[LevelOption | (js.Function1[/* error */ ProcessError, LevelOption])] = js.undefined
  }
  object errorNameinErrorNamedefau {
    
    inline def apply(): errorNameinErrorNamedefau = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[errorNameinErrorNamedefau]
    }
    
    extension [Self <: errorNameinErrorNamedefau](x: Self) {
      
      inline def setDefault(value: LevelOption | (js.Function1[/* error */ ProcessError, LevelOption])): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      inline def setDefaultFunction1(value: /* error */ ProcessError => LevelOption): Self = StObject.set(x, "default", js.Any.fromFunction1(value))
      
      inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
      
      inline def setRejectionHandled(value: LevelOption | (js.Function1[/* error */ ProcessError, LevelOption])): Self = StObject.set(x, "rejectionHandled", value.asInstanceOf[js.Any])
      
      inline def setRejectionHandledFunction1(value: /* error */ ProcessError => LevelOption): Self = StObject.set(x, "rejectionHandled", js.Any.fromFunction1(value))
      
      inline def setRejectionHandledUndefined: Self = StObject.set(x, "rejectionHandled", js.undefined)
      
      inline def setUncaughtException(value: LevelOption | (js.Function1[/* error */ ProcessError, LevelOption])): Self = StObject.set(x, "uncaughtException", value.asInstanceOf[js.Any])
      
      inline def setUncaughtExceptionFunction1(value: /* error */ ProcessError => LevelOption): Self = StObject.set(x, "uncaughtException", js.Any.fromFunction1(value))
      
      inline def setUncaughtExceptionUndefined: Self = StObject.set(x, "uncaughtException", js.undefined)
      
      inline def setUnhandledRejection(value: LevelOption | (js.Function1[/* error */ ProcessError, LevelOption])): Self = StObject.set(x, "unhandledRejection", value.asInstanceOf[js.Any])
      
      inline def setUnhandledRejectionFunction1(value: /* error */ ProcessError => LevelOption): Self = StObject.set(x, "unhandledRejection", js.Any.fromFunction1(value))
      
      inline def setUnhandledRejectionUndefined: Self = StObject.set(x, "unhandledRejection", js.undefined)
      
      inline def setWarning(value: LevelOption | (js.Function1[/* error */ ProcessError, LevelOption])): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
      
      inline def setWarningFunction1(value: /* error */ ProcessError => LevelOption): Self = StObject.set(x, "warning", js.Any.fromFunction1(value))
      
      inline def setWarningUndefined: Self = StObject.set(x, "warning", js.undefined)
    }
  }
}
