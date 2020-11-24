package typings.mapboxMapboxSdk.staticMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomMarkerOverlay extends js.Object {
  
  var marker: CustomMarker = js.native
}
object CustomMarkerOverlay {
  
  @scala.inline
  def apply(marker: CustomMarker): CustomMarkerOverlay = {
    val __obj = js.Dynamic.literal(marker = marker.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomMarkerOverlay]
  }
  
  @scala.inline
  implicit class CustomMarkerOverlayOps[Self <: CustomMarkerOverlay] (val x: Self) extends AnyVal {
    
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
    def setMarker(value: CustomMarker): Self = this.set("marker", value.asInstanceOf[js.Any])
  }
}
