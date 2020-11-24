package typings.googlemaps.google.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StreetViewPanoRequest extends js.Object {
  
  var pano: String = js.native
}
object StreetViewPanoRequest {
  
  @scala.inline
  def apply(pano: String): StreetViewPanoRequest = {
    val __obj = js.Dynamic.literal(pano = pano.asInstanceOf[js.Any])
    __obj.asInstanceOf[StreetViewPanoRequest]
  }
  
  @scala.inline
  implicit class StreetViewPanoRequestOps[Self <: StreetViewPanoRequest] (val x: Self) extends AnyVal {
    
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
    def setPano(value: String): Self = this.set("pano", value.asInstanceOf[js.Any])
  }
}
