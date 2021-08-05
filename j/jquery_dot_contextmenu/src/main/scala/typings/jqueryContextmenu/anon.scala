package typings.jqueryContextmenu

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Duration extends StObject {
    
    var duration: js.UndefOr[Double] = js.undefined
    
    var hide: js.UndefOr[String] = js.undefined
    
    var show: js.UndefOr[String] = js.undefined
  }
  object Duration {
    
    inline def apply(): Duration = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Duration]
    }
    
    extension [Self <: Duration](x: Self) {
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      inline def setHide(value: String): Self = StObject.set(x, "hide", value.asInstanceOf[js.Any])
      
      inline def setHideUndefined: Self = StObject.set(x, "hide", js.undefined)
      
      inline def setShow(value: String): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
      
      inline def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
    }
  }
  
  trait Hide extends StObject {
    
    var hide: js.UndefOr[js.Function1[/* options */ js.Any, Boolean]] = js.undefined
    
    var show: js.UndefOr[js.Function1[/* options */ js.Any, Boolean]] = js.undefined
  }
  object Hide {
    
    inline def apply(): Hide = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Hide]
    }
    
    extension [Self <: Hide](x: Self) {
      
      inline def setHide(value: /* options */ js.Any => Boolean): Self = StObject.set(x, "hide", js.Any.fromFunction1(value))
      
      inline def setHideUndefined: Self = StObject.set(x, "hide", js.undefined)
      
      inline def setShow(value: /* options */ js.Any => Boolean): Self = StObject.set(x, "show", js.Any.fromFunction1(value))
      
      inline def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
    }
  }
}
