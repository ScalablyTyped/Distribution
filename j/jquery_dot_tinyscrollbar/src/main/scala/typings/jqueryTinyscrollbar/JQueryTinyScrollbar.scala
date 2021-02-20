package typings.jqueryTinyscrollbar

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object JQueryTinyScrollbar {
  
  @js.native
  trait JQueryTinyScrollbarOptions extends StObject {
    
    /**
      * Vertical or horizontal scroller? 'x' or 'y'. (default: 'x')
      */
    var axis: js.UndefOr[String] = js.native
    
    /**
      * Enable mobile invert style scrolling. (default: false)
      */
    var invertscroll: js.UndefOr[Boolean] = js.native
    
    /**
      * Return scrollwheel event to browser if there is no more content. (default: true)
      */
    var lockscroll: js.UndefOr[Boolean] = js.native
    
    /**
      * Enable or disable the mousewheel. (default: true)
      */
    var scroll: js.UndefOr[Boolean] = js.native
    
    /**
      * Set the size of the scrollbar to auto or a fixed number. (default: 'auto')
      */
    var size: js.UndefOr[js.Any] = js.native
    
    /**
      * Set the size of the thumb to auto or a fixed number. (default: 'auto')
      */
    var sizethumb: js.UndefOr[js.Any] = js.native
    
    /**
      * How many pixels must the mouswheel scrolls at a time. (default: 40)
      */
    var wheel: js.UndefOr[Double] = js.native
  }
  object JQueryTinyScrollbarOptions {
    
    @scala.inline
    def apply(): JQueryTinyScrollbarOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[JQueryTinyScrollbarOptions]
    }
    
    @scala.inline
    implicit class JQueryTinyScrollbarOptionsMutableBuilder[Self <: JQueryTinyScrollbarOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAxis(value: String): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAxisUndefined: Self = StObject.set(x, "axis", js.undefined)
      
      @scala.inline
      def setInvertscroll(value: Boolean): Self = StObject.set(x, "invertscroll", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInvertscrollUndefined: Self = StObject.set(x, "invertscroll", js.undefined)
      
      @scala.inline
      def setLockscroll(value: Boolean): Self = StObject.set(x, "lockscroll", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLockscrollUndefined: Self = StObject.set(x, "lockscroll", js.undefined)
      
      @scala.inline
      def setScroll(value: Boolean): Self = StObject.set(x, "scroll", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollUndefined: Self = StObject.set(x, "scroll", js.undefined)
      
      @scala.inline
      def setSize(value: js.Any): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setSizethumb(value: js.Any): Self = StObject.set(x, "sizethumb", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizethumbUndefined: Self = StObject.set(x, "sizethumb", js.undefined)
      
      @scala.inline
      def setWheel(value: Double): Self = StObject.set(x, "wheel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWheelUndefined: Self = StObject.set(x, "wheel", js.undefined)
    }
  }
}
