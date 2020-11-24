package typings.googlemaps.google.maps.Data

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetGeometryEvent extends js.Object {
  
  var feature: Feature = js.native
  
  var newGeometry: Geometry = js.native
  
  var oldGeometry: Geometry = js.native
}
object SetGeometryEvent {
  
  @scala.inline
  def apply(feature: Feature, newGeometry: Geometry, oldGeometry: Geometry): SetGeometryEvent = {
    val __obj = js.Dynamic.literal(feature = feature.asInstanceOf[js.Any], newGeometry = newGeometry.asInstanceOf[js.Any], oldGeometry = oldGeometry.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetGeometryEvent]
  }
  
  @scala.inline
  implicit class SetGeometryEventOps[Self <: SetGeometryEvent] (val x: Self) extends AnyVal {
    
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
    def setFeature(value: Feature): Self = this.set("feature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewGeometry(value: Geometry): Self = this.set("newGeometry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldGeometry(value: Geometry): Self = this.set("oldGeometry", value.asInstanceOf[js.Any])
  }
}
