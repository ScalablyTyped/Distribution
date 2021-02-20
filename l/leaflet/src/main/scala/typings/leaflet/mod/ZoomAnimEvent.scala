package typings.leaflet.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ZoomAnimEvent extends LeafletEvent {
  
  var center: LatLng_ = js.native
  
  var noUpdate: Boolean = js.native
  
  var zoom: Double = js.native
}
object ZoomAnimEvent {
  
  @scala.inline
  def apply(
    center: LatLng_,
    layer: js.Any,
    noUpdate: Boolean,
    propagatedFrom: js.Any,
    sourceTarget: js.Any,
    target: js.Any,
    `type`: String,
    zoom: Double
  ): ZoomAnimEvent = {
    val __obj = js.Dynamic.literal(center = center.asInstanceOf[js.Any], layer = layer.asInstanceOf[js.Any], noUpdate = noUpdate.asInstanceOf[js.Any], propagatedFrom = propagatedFrom.asInstanceOf[js.Any], sourceTarget = sourceTarget.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], zoom = zoom.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ZoomAnimEvent]
  }
  
  @scala.inline
  implicit class ZoomAnimEventMutableBuilder[Self <: ZoomAnimEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCenter(value: LatLng_): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoUpdate(value: Boolean): Self = StObject.set(x, "noUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoom(value: Double): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
  }
}
