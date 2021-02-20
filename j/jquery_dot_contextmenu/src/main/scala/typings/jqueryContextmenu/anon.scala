package typings.jqueryContextmenu

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Duration extends StObject {
    
    var duration: js.UndefOr[Double] = js.native
    
    var hide: js.UndefOr[String] = js.native
    
    var show: js.UndefOr[String] = js.native
  }
  object Duration {
    
    @scala.inline
    def apply(): Duration = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Duration]
    }
    
    @scala.inline
    implicit class DurationMutableBuilder[Self <: Duration] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      @scala.inline
      def setHide(value: String): Self = StObject.set(x, "hide", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHideUndefined: Self = StObject.set(x, "hide", js.undefined)
      
      @scala.inline
      def setShow(value: String): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
    }
  }
  
  @js.native
  trait Hide extends StObject {
    
    var hide: js.UndefOr[js.Function1[/* options */ js.Any, Boolean]] = js.native
    
    var show: js.UndefOr[js.Function1[/* options */ js.Any, Boolean]] = js.native
  }
  object Hide {
    
    @scala.inline
    def apply(): Hide = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Hide]
    }
    
    @scala.inline
    implicit class HideMutableBuilder[Self <: Hide] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHide(value: /* options */ js.Any => Boolean): Self = StObject.set(x, "hide", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHideUndefined: Self = StObject.set(x, "hide", js.undefined)
      
      @scala.inline
      def setShow(value: /* options */ js.Any => Boolean): Self = StObject.set(x, "show", js.Any.fromFunction1(value))
      
      @scala.inline
      def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
    }
  }
}
