package typings.heremaps.H.ui

import typings.heremaps.H.Map_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ZoomRectangle {
  
  /**
    * @property alignment {H.ui.LayoutAlignment=} - the layout alignment which should be applied to this control, default is H.ui.LayoutAlignment.BOTTOM_RIGHT
    * @property adjustZoom {function(number, H.Map): number=} - optional function that defines how zoom level should be changed, by default zoom level is picked to fit the
    * bounding rectangle into the view port.
    */
  trait Options extends StObject {
    
    var adjustZoom: js.UndefOr[js.Function2[/* n */ Double, /* m */ Map_, Double]] = js.undefined
    
    var alignment: js.UndefOr[LayoutAlignment] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setAdjustZoom(value: (/* n */ Double, /* m */ Map_) => Double): Self = StObject.set(x, "adjustZoom", js.Any.fromFunction2(value))
      
      inline def setAdjustZoomUndefined: Self = StObject.set(x, "adjustZoom", js.undefined)
      
      inline def setAlignment(value: LayoutAlignment): Self = StObject.set(x, "alignment", value.asInstanceOf[js.Any])
      
      inline def setAlignmentUndefined: Self = StObject.set(x, "alignment", js.undefined)
    }
  }
}
