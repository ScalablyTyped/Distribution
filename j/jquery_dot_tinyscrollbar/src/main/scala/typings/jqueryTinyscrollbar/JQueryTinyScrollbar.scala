package typings.jqueryTinyscrollbar

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object JQueryTinyScrollbar {
  
  trait JQueryTinyScrollbarOptions extends StObject {
    
    /**
      * Vertical or horizontal scroller? 'x' or 'y'. (default: 'x')
      */
    var axis: js.UndefOr[String] = js.undefined
    
    /**
      * Enable mobile invert style scrolling. (default: false)
      */
    var invertscroll: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Return scrollwheel event to browser if there is no more content. (default: true)
      */
    var lockscroll: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Enable or disable the mousewheel. (default: true)
      */
    var scroll: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Set the size of the scrollbar to auto or a fixed number. (default: 'auto')
      */
    var size: js.UndefOr[js.Any] = js.undefined
    
    /**
      * Set the size of the thumb to auto or a fixed number. (default: 'auto')
      */
    var sizethumb: js.UndefOr[js.Any] = js.undefined
    
    /**
      * How many pixels must the mouswheel scrolls at a time. (default: 40)
      */
    var wheel: js.UndefOr[Double] = js.undefined
  }
  object JQueryTinyScrollbarOptions {
    
    inline def apply(): JQueryTinyScrollbarOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[JQueryTinyScrollbarOptions]
    }
    
    extension [Self <: JQueryTinyScrollbarOptions](x: Self) {
      
      inline def setAxis(value: String): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
      
      inline def setAxisUndefined: Self = StObject.set(x, "axis", js.undefined)
      
      inline def setInvertscroll(value: Boolean): Self = StObject.set(x, "invertscroll", value.asInstanceOf[js.Any])
      
      inline def setInvertscrollUndefined: Self = StObject.set(x, "invertscroll", js.undefined)
      
      inline def setLockscroll(value: Boolean): Self = StObject.set(x, "lockscroll", value.asInstanceOf[js.Any])
      
      inline def setLockscrollUndefined: Self = StObject.set(x, "lockscroll", js.undefined)
      
      inline def setScroll(value: Boolean): Self = StObject.set(x, "scroll", value.asInstanceOf[js.Any])
      
      inline def setScrollUndefined: Self = StObject.set(x, "scroll", js.undefined)
      
      inline def setSize(value: js.Any): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setSizethumb(value: js.Any): Self = StObject.set(x, "sizethumb", value.asInstanceOf[js.Any])
      
      inline def setSizethumbUndefined: Self = StObject.set(x, "sizethumb", js.undefined)
      
      inline def setWheel(value: Double): Self = StObject.set(x, "wheel", value.asInstanceOf[js.Any])
      
      inline def setWheelUndefined: Self = StObject.set(x, "wheel", js.undefined)
    }
  }
}
