package typings.ityped

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ityped", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def init(element: String, config: Configuration): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("init")(element.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait Configuration extends StObject {
    
    var loop: js.UndefOr[Boolean] = js.undefined
    
    var pause: js.UndefOr[Double] = js.undefined
    
    var strings: js.UndefOr[js.Array[String]] = js.undefined
    
    var typeSpeed: js.UndefOr[Double] = js.undefined
  }
  object Configuration {
    
    inline def apply(): Configuration = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Configuration]
    }
    
    extension [Self <: Configuration](x: Self) {
      
      inline def setLoop(value: Boolean): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
      
      inline def setLoopUndefined: Self = StObject.set(x, "loop", js.undefined)
      
      inline def setPause(value: Double): Self = StObject.set(x, "pause", value.asInstanceOf[js.Any])
      
      inline def setPauseUndefined: Self = StObject.set(x, "pause", js.undefined)
      
      inline def setStrings(value: js.Array[String]): Self = StObject.set(x, "strings", value.asInstanceOf[js.Any])
      
      inline def setStringsUndefined: Self = StObject.set(x, "strings", js.undefined)
      
      inline def setStringsVarargs(value: String*): Self = StObject.set(x, "strings", js.Array(value :_*))
      
      inline def setTypeSpeed(value: Double): Self = StObject.set(x, "typeSpeed", value.asInstanceOf[js.Any])
      
      inline def setTypeSpeedUndefined: Self = StObject.set(x, "typeSpeed", js.undefined)
    }
  }
}
