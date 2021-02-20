package typings.heremaps.H.ui

import typings.heremaps.H.Map_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ZoomRectangle {
  
  /**
    * @property alignment {H.ui.LayoutAlignment=} - the layout alignment which should be applied to this control, default is H.ui.LayoutAlignment.BOTTOM_RIGHT
    * @property adjustZoom {function(number, H.Map): number=} - optional function that defines how zoom level should be changed, by default zoom level is picked to fit the
    * bounding rectangle into the view port.
    */
  @js.native
  trait Options extends StObject {
    
    var adjustZoom: js.UndefOr[js.Function2[/* n */ Double, /* m */ Map_, Double]] = js.native
    
    var alignment: js.UndefOr[LayoutAlignment] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdjustZoom(value: (/* n */ Double, /* m */ Map_) => Double): Self = StObject.set(x, "adjustZoom", js.Any.fromFunction2(value))
      
      @scala.inline
      def setAdjustZoomUndefined: Self = StObject.set(x, "adjustZoom", js.undefined)
      
      @scala.inline
      def setAlignment(value: LayoutAlignment): Self = StObject.set(x, "alignment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignmentUndefined: Self = StObject.set(x, "alignment", js.undefined)
    }
  }
}
