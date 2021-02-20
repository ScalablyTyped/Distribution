package typings.heremaps.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Feature extends StObject {
  
  var feature: js.Array[_] = js.native
  
  var trafficMode: String = js.native
  
  var transportModes: js.Array[String] = js.native
  
  var `type`: String = js.native
}
object Feature {
  
  @scala.inline
  def apply(feature: js.Array[_], trafficMode: String, transportModes: js.Array[String], `type`: String): Feature = {
    val __obj = js.Dynamic.literal(feature = feature.asInstanceOf[js.Any], trafficMode = trafficMode.asInstanceOf[js.Any], transportModes = transportModes.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Feature]
  }
  
  @scala.inline
  implicit class FeatureMutableBuilder[Self <: Feature] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFeature(value: js.Array[_]): Self = StObject.set(x, "feature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeatureVarargs(value: js.Any*): Self = StObject.set(x, "feature", js.Array(value :_*))
    
    @scala.inline
    def setTrafficMode(value: String): Self = StObject.set(x, "trafficMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransportModes(value: js.Array[String]): Self = StObject.set(x, "transportModes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransportModesVarargs(value: String*): Self = StObject.set(x, "transportModes", js.Array(value :_*))
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
