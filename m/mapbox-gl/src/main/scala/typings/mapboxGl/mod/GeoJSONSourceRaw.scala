package typings.mapboxGl.mod

import typings.mapboxGl.mapboxGlStrings.geojson
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GeoJSONSourceRaw
  extends Source
     with GeoJSONSourceOptions
     with AnySourceData {
  
  @JSName("type")
  var type_GeoJSONSourceRaw: geojson = js.native
}
object GeoJSONSourceRaw {
  
  @scala.inline
  def apply(`type`: geojson): GeoJSONSourceRaw = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeoJSONSourceRaw]
  }
  
  @scala.inline
  implicit class GeoJSONSourceRawMutableBuilder[Self <: GeoJSONSourceRaw] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: geojson): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
