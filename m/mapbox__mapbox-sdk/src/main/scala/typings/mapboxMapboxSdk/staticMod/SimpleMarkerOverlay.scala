package typings.mapboxMapboxSdk.staticMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SimpleMarkerOverlay extends js.Object {
  
  var marker: SimpleMarker = js.native
}
object SimpleMarkerOverlay {
  
  @scala.inline
  def apply(marker: SimpleMarker): SimpleMarkerOverlay = {
    val __obj = js.Dynamic.literal(marker = marker.asInstanceOf[js.Any])
    __obj.asInstanceOf[SimpleMarkerOverlay]
  }
  
  @scala.inline
  implicit class SimpleMarkerOverlayOps[Self <: SimpleMarkerOverlay] (val x: Self) extends AnyVal {
    
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
    def setMarker(value: SimpleMarker): Self = this.set("marker", value.asInstanceOf[js.Any])
  }
}
