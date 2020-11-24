package typings.heremaps.H.map.layer.ObjectLayer

import typings.heremaps.H.map.Overlay
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A response object returned by the H.map.layer.ObjectLayer#requestOverlays function.
  * @property total {number} - The total number of overlays within the requested bounds, inclusive overlays which are not ready loaded yet
  * @property overlays {Array<H.map.Overlay>} - A list all overlays which are ready to render
  */
@js.native
trait OverlaysResponse extends js.Object {
  
  var overlays: js.Array[Overlay] = js.native
  
  var total: Double = js.native
}
object OverlaysResponse {
  
  @scala.inline
  def apply(overlays: js.Array[Overlay], total: Double): OverlaysResponse = {
    val __obj = js.Dynamic.literal(overlays = overlays.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[OverlaysResponse]
  }
  
  @scala.inline
  implicit class OverlaysResponseOps[Self <: OverlaysResponse] (val x: Self) extends AnyVal {
    
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
    def setOverlaysVarargs(value: Overlay*): Self = this.set("overlays", js.Array(value :_*))
    
    @scala.inline
    def setOverlays(value: js.Array[Overlay]): Self = this.set("overlays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotal(value: Double): Self = this.set("total", value.asInstanceOf[js.Any])
  }
}
