package typings.heremaps.H.ui

import typings.heremaps.H.service.MapType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Pano {
  
  /**
    * @property alignment {H.ui.LayoutAlignment=} - the layout alignment which should be applied to this control, default is H.ui.LayoutAlignment.RIGHT_BOTTOM
    * @property mapTypes {H.service.MapTypes} - The map types to use
    */
  trait Options extends StObject {
    
    var alignment: js.UndefOr[LayoutAlignment] = js.undefined
    
    var mapTypes: MapType
  }
  object Options {
    
    inline def apply(mapTypes: MapType): Options = {
      val __obj = js.Dynamic.literal(mapTypes = mapTypes.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setAlignment(value: LayoutAlignment): Self = StObject.set(x, "alignment", value.asInstanceOf[js.Any])
      
      inline def setAlignmentUndefined: Self = StObject.set(x, "alignment", js.undefined)
      
      inline def setMapTypes(value: MapType): Self = StObject.set(x, "mapTypes", value.asInstanceOf[js.Any])
    }
  }
}
