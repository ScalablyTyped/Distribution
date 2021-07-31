package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GeoJSONFeature
  extends StObject
     with Dictionary[js.Any] {
  
  /**
    * Data type of the geographic feature.
    */
  var `type`: String
}
object GeoJSONFeature {
  
  @scala.inline
  def apply(`type`: String): GeoJSONFeature = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeoJSONFeature]
  }
  
  @scala.inline
  implicit class GeoJSONFeatureMutableBuilder[Self <: GeoJSONFeature] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
