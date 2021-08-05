package typings.googlemaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// TODO find source documentation
trait FusionTablesMouseEvent extends StObject {
  
  var infoWindowHtml: js.UndefOr[String] = js.undefined
  
  var latLng: js.UndefOr[LatLng] = js.undefined
  
  var pixelOffset: js.UndefOr[Size] = js.undefined
  
  var row: js.UndefOr[js.Object] = js.undefined
}
object FusionTablesMouseEvent {
  
  inline def apply(): FusionTablesMouseEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FusionTablesMouseEvent]
  }
  
  extension [Self <: FusionTablesMouseEvent](x: Self) {
    
    inline def setInfoWindowHtml(value: String): Self = StObject.set(x, "infoWindowHtml", value.asInstanceOf[js.Any])
    
    inline def setInfoWindowHtmlUndefined: Self = StObject.set(x, "infoWindowHtml", js.undefined)
    
    inline def setLatLng(value: LatLng): Self = StObject.set(x, "latLng", value.asInstanceOf[js.Any])
    
    inline def setLatLngUndefined: Self = StObject.set(x, "latLng", js.undefined)
    
    inline def setPixelOffset(value: Size): Self = StObject.set(x, "pixelOffset", value.asInstanceOf[js.Any])
    
    inline def setPixelOffsetUndefined: Self = StObject.set(x, "pixelOffset", js.undefined)
    
    inline def setRow(value: js.Object): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
    
    inline def setRowUndefined: Self = StObject.set(x, "row", js.undefined)
  }
}
