package typings.mapboxGl.mod

import typings.mapboxGl.mapboxGlStrings.geojson
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GeoJSONSourceRaw
  extends StObject
     with Source
     with GeoJSONSourceOptions
     with _AnySourceData {
  
  @JSName("type")
  var type_GeoJSONSourceRaw: geojson
}
object GeoJSONSourceRaw {
  
  inline def apply(): GeoJSONSourceRaw = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("geojson")
    __obj.asInstanceOf[GeoJSONSourceRaw]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GeoJSONSourceRaw] (val x: Self) extends AnyVal {
    
    inline def setType(value: geojson): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
