package typings.leafletDraw.anon

import typings.leaflet.mod.PathOptions
import typings.leafletDraw.leafletMod.EditToolbar.EditPolyOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<leaflet-draw.leaflet.EditToolbar.EditHandlerOptions, 'featureGroup'> */
trait OmitEditHandlerOptionsfea extends StObject {
  
  var poly: js.UndefOr[EditPolyOptions] = js.undefined
  
  var selectedPathOptions: js.UndefOr[PathOptions] = js.undefined
}
object OmitEditHandlerOptionsfea {
  
  inline def apply(): OmitEditHandlerOptionsfea = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OmitEditHandlerOptionsfea]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OmitEditHandlerOptionsfea] (val x: Self) extends AnyVal {
    
    inline def setPoly(value: EditPolyOptions): Self = StObject.set(x, "poly", value.asInstanceOf[js.Any])
    
    inline def setPolyUndefined: Self = StObject.set(x, "poly", js.undefined)
    
    inline def setSelectedPathOptions(value: PathOptions): Self = StObject.set(x, "selectedPathOptions", value.asInstanceOf[js.Any])
    
    inline def setSelectedPathOptionsUndefined: Self = StObject.set(x, "selectedPathOptions", js.undefined)
  }
}
