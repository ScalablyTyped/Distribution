package typings.iconGen

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibLoggerMod {
  
  @JSImport("icon-gen/dist/lib/logger", JSImport.Default)
  @js.native
  /**
    * Initialize instance.
    * @param available "true" to display the report, default is "false".
    */
  open class default ()
    extends StObject
       with Logger {
    def this(available: Boolean) = this()
    
    /* private */ /* CompleteClass */
    var _available: Any = js.native
    
    /**
      * Display an error message for the stdout.
      * @param args Message arguments.
      */
    /* CompleteClass */
    override def error(args: Any*): Unit = js.native
    
    /**
      * Display a log message for the stdout.
      * @param args Message arguments.
      */
    /* CompleteClass */
    override def log(args: Any*): Unit = js.native
  }
  
  trait Logger extends StObject {
    
    /* private */ var _available: Any
    
    /**
      * Display an error message for the stdout.
      * @param args Message arguments.
      */
    def error(args: Any*): Unit
    
    /**
      * Display a log message for the stdout.
      * @param args Message arguments.
      */
    def log(args: Any*): Unit
  }
  object Logger {
    
    inline def apply(_available: Any, error: /* repeated */ Any => Unit, log: /* repeated */ Any => Unit): Logger = {
      val __obj = js.Dynamic.literal(_available = _available.asInstanceOf[js.Any], error = js.Any.fromFunction1(error), log = js.Any.fromFunction1(log))
      __obj.asInstanceOf[Logger]
    }
    
    extension [Self <: Logger](x: Self) {
      
      inline def setError(value: /* repeated */ Any => Unit): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
      
      inline def setLog(value: /* repeated */ Any => Unit): Self = StObject.set(x, "log", js.Any.fromFunction1(value))
      
      inline def set_available(value: Any): Self = StObject.set(x, "_available", value.asInstanceOf[js.Any])
    }
  }
}
