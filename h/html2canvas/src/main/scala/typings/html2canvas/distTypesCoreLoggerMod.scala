package typings.html2canvas

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesCoreLoggerMod {
  
  @JSImport("html2canvas/dist/types/core/logger", "Logger")
  @js.native
  open class Logger protected () extends StObject {
    def this(param0: LoggerOptions) = this()
    
    def debug(args: Any*): Unit = js.native
    
    /* private */ val enabled: Any = js.native
    
    def error(args: Any*): Unit = js.native
    
    def getTime(): Double = js.native
    
    /* private */ val id: Any = js.native
    
    def info(args: Any*): Unit = js.native
    
    /* private */ val start: Any = js.native
    
    def warn(args: Any*): Unit = js.native
  }
  /* static members */
  object Logger {
    
    @JSImport("html2canvas/dist/types/core/logger", "Logger")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("html2canvas/dist/types/core/logger", "Logger.instances")
    @js.native
    def instances: StringDictionary[Logger] = js.native
    inline def instances_=(x: StringDictionary[Logger]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("instances")(x.asInstanceOf[js.Any])
  }
  
  trait LoggerOptions extends StObject {
    
    var enabled: Boolean
    
    var id: String
  }
  object LoggerOptions {
    
    inline def apply(enabled: Boolean, id: String): LoggerOptions = {
      val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[LoggerOptions]
    }
    
    extension [Self <: LoggerOptions](x: Self) {
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
}
