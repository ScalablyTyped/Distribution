package typings.logat

import org.scalablytyped.runtime.Shortcut
import typings.node.eventsMod.global.NodeJS.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("logat", JSImport.Namespace)
  @js.native
  val ^ : Logger = js.native
  
  trait LogOptionsI extends StObject {
    
    var logFileName: js.UndefOr[String] = js.undefined
    
    var logLevel: js.UndefOr[Double] = js.undefined
    
    var logMethod: js.UndefOr[Double] = js.undefined
  }
  object LogOptionsI {
    
    inline def apply(): LogOptionsI = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LogOptionsI]
    }
    
    extension [Self <: LogOptionsI](x: Self) {
      
      inline def setLogFileName(value: String): Self = StObject.set(x, "logFileName", value.asInstanceOf[js.Any])
      
      inline def setLogFileNameUndefined: Self = StObject.set(x, "logFileName", js.undefined)
      
      inline def setLogLevel(value: Double): Self = StObject.set(x, "logLevel", value.asInstanceOf[js.Any])
      
      inline def setLogLevelUndefined: Self = StObject.set(x, "logLevel", js.undefined)
      
      inline def setLogMethod(value: Double): Self = StObject.set(x, "logMethod", value.asInstanceOf[js.Any])
      
      inline def setLogMethodUndefined: Self = StObject.set(x, "logMethod", js.undefined)
    }
  }
  
  @js.native
  trait Logger
    extends StObject
       with EventEmitter {
    
    def debug(args: js.Any*): Unit = js.native
    
    def error(args: js.Any*): Unit = js.native
    
    def getOptions(): LogOptionsI = js.native
    
    def info(args: js.Any*): Unit = js.native
    
    def setOptions(options: LogOptionsI): Unit = js.native
    
    def warn(args: js.Any*): Unit = js.native
  }
  
  type _To = Logger
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Logger = ^
}
