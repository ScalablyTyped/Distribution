package typings.heremaps.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Feature extends js.Object {
  
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
  implicit class FeatureOps[Self <: Feature] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFeatureVarargs(value: js.Any*): Self = this.set("feature", js.Array(value :_*))
    
    @scala.inline
    def setFeature(value: js.Array[_]): Self = this.set("feature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrafficMode(value: String): Self = this.set("trafficMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransportModesVarargs(value: String*): Self = this.set("transportModes", js.Array(value :_*))
    
    @scala.inline
    def setTransportModes(value: js.Array[String]): Self = this.set("transportModes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
