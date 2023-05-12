package typings.mapboxMapboxGlDraw.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<geojson.geojson.Feature<geojson.geojson.Geometry, geojson.geojson.GeoJsonProperties>, 'id'> */
trait PickFeatureGeometryGeoJso extends StObject {
  
  var id: js.UndefOr[String | Double] = js.undefined
}
object PickFeatureGeometryGeoJso {
  
  inline def apply(): PickFeatureGeometryGeoJso = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickFeatureGeometryGeoJso]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PickFeatureGeometryGeoJso] (val x: Self) extends AnyVal {
    
    inline def setId(value: String | Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
  }
}
