package typings.hafasClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Feature extends StObject {
  
  var geometry: Geometry
  
  var properties: js.UndefOr[Station | Stop | js.Object] = js.undefined
  
  var `type`: typings.hafasClient.hafasClientStrings.Feature
}
object Feature {
  
  @scala.inline
  def apply(geometry: Geometry): Feature = {
    val __obj = js.Dynamic.literal(geometry = geometry.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Feature")
    __obj.asInstanceOf[Feature]
  }
  
  @scala.inline
  implicit class FeatureMutableBuilder[Self <: Feature] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGeometry(value: Geometry): Self = StObject.set(x, "geometry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProperties(value: Station | Stop | js.Object): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    @scala.inline
    def setType(value: typings.hafasClient.hafasClientStrings.Feature): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
