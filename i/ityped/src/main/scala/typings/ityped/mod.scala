package typings.ityped

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ityped", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def init(element: String, config: Configuration): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("init")(element.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait Configuration extends StObject {
    
    var loop: js.UndefOr[Boolean] = js.undefined
    
    var pause: js.UndefOr[Double] = js.undefined
    
    var strings: js.UndefOr[js.Array[String]] = js.undefined
    
    var typeSpeed: js.UndefOr[Double] = js.undefined
  }
  object Configuration {
    
    @scala.inline
    def apply(): Configuration = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Configuration]
    }
    
    @scala.inline
    implicit class ConfigurationMutableBuilder[Self <: Configuration] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLoop(value: Boolean): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoopUndefined: Self = StObject.set(x, "loop", js.undefined)
      
      @scala.inline
      def setPause(value: Double): Self = StObject.set(x, "pause", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPauseUndefined: Self = StObject.set(x, "pause", js.undefined)
      
      @scala.inline
      def setStrings(value: js.Array[String]): Self = StObject.set(x, "strings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStringsUndefined: Self = StObject.set(x, "strings", js.undefined)
      
      @scala.inline
      def setStringsVarargs(value: String*): Self = StObject.set(x, "strings", js.Array(value :_*))
      
      @scala.inline
      def setTypeSpeed(value: Double): Self = StObject.set(x, "typeSpeed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeSpeedUndefined: Self = StObject.set(x, "typeSpeed", js.undefined)
    }
  }
}
