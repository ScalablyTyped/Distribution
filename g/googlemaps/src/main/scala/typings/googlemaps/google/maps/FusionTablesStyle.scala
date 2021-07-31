package typings.googlemaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// TODO find source documentation
trait FusionTablesStyle extends StObject {
  
  var markerOptions: js.UndefOr[FusionTablesMarkerOptions] = js.undefined
  
  var polygonOptions: js.UndefOr[FusionTablesPolygonOptions] = js.undefined
  
  var polylineOptions: js.UndefOr[FusionTablesPolylineOptions] = js.undefined
  
  var where: js.UndefOr[String] = js.undefined
}
object FusionTablesStyle {
  
  @scala.inline
  def apply(): FusionTablesStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FusionTablesStyle]
  }
  
  @scala.inline
  implicit class FusionTablesStyleMutableBuilder[Self <: FusionTablesStyle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMarkerOptions(value: FusionTablesMarkerOptions): Self = StObject.set(x, "markerOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerOptionsUndefined: Self = StObject.set(x, "markerOptions", js.undefined)
    
    @scala.inline
    def setPolygonOptions(value: FusionTablesPolygonOptions): Self = StObject.set(x, "polygonOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolygonOptionsUndefined: Self = StObject.set(x, "polygonOptions", js.undefined)
    
    @scala.inline
    def setPolylineOptions(value: FusionTablesPolylineOptions): Self = StObject.set(x, "polylineOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolylineOptionsUndefined: Self = StObject.set(x, "polylineOptions", js.undefined)
    
    @scala.inline
    def setWhere(value: String): Self = StObject.set(x, "where", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWhereUndefined: Self = StObject.set(x, "where", js.undefined)
  }
}
