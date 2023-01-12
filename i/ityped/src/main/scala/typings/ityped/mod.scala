package typings.ityped

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ityped", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def init(element: String, config: Configuration): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("init")(element.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def init(element: Element, config: Configuration): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("init")(element.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait Configuration extends StObject {
    
    var backDelay: js.UndefOr[Double] = js.undefined
    
    var backSpeed: js.UndefOr[Double] = js.undefined
    
    var cursorChar: js.UndefOr[String] = js.undefined
    
    var disableBackTyping: js.UndefOr[Boolean] = js.undefined
    
    var loop: js.UndefOr[Boolean] = js.undefined
    
    var onFinished: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var placeholder: js.UndefOr[Boolean] = js.undefined
    
    var showCursor: js.UndefOr[Boolean] = js.undefined
    
    var startDelay: js.UndefOr[Double] = js.undefined
    
    var strings: js.UndefOr[js.Array[String]] = js.undefined
    
    var typeSpeed: js.UndefOr[Double] = js.undefined
  }
  object Configuration {
    
    inline def apply(): Configuration = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Configuration]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Configuration] (val x: Self) extends AnyVal {
      
      inline def setBackDelay(value: Double): Self = StObject.set(x, "backDelay", value.asInstanceOf[js.Any])
      
      inline def setBackDelayUndefined: Self = StObject.set(x, "backDelay", js.undefined)
      
      inline def setBackSpeed(value: Double): Self = StObject.set(x, "backSpeed", value.asInstanceOf[js.Any])
      
      inline def setBackSpeedUndefined: Self = StObject.set(x, "backSpeed", js.undefined)
      
      inline def setCursorChar(value: String): Self = StObject.set(x, "cursorChar", value.asInstanceOf[js.Any])
      
      inline def setCursorCharUndefined: Self = StObject.set(x, "cursorChar", js.undefined)
      
      inline def setDisableBackTyping(value: Boolean): Self = StObject.set(x, "disableBackTyping", value.asInstanceOf[js.Any])
      
      inline def setDisableBackTypingUndefined: Self = StObject.set(x, "disableBackTyping", js.undefined)
      
      inline def setLoop(value: Boolean): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
      
      inline def setLoopUndefined: Self = StObject.set(x, "loop", js.undefined)
      
      inline def setOnFinished(value: () => Unit): Self = StObject.set(x, "onFinished", js.Any.fromFunction0(value))
      
      inline def setOnFinishedUndefined: Self = StObject.set(x, "onFinished", js.undefined)
      
      inline def setPlaceholder(value: Boolean): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      inline def setShowCursor(value: Boolean): Self = StObject.set(x, "showCursor", value.asInstanceOf[js.Any])
      
      inline def setShowCursorUndefined: Self = StObject.set(x, "showCursor", js.undefined)
      
      inline def setStartDelay(value: Double): Self = StObject.set(x, "startDelay", value.asInstanceOf[js.Any])
      
      inline def setStartDelayUndefined: Self = StObject.set(x, "startDelay", js.undefined)
      
      inline def setStrings(value: js.Array[String]): Self = StObject.set(x, "strings", value.asInstanceOf[js.Any])
      
      inline def setStringsUndefined: Self = StObject.set(x, "strings", js.undefined)
      
      inline def setStringsVarargs(value: String*): Self = StObject.set(x, "strings", js.Array(value*))
      
      inline def setTypeSpeed(value: Double): Self = StObject.set(x, "typeSpeed", value.asInstanceOf[js.Any])
      
      inline def setTypeSpeedUndefined: Self = StObject.set(x, "typeSpeed", js.undefined)
    }
  }
}
