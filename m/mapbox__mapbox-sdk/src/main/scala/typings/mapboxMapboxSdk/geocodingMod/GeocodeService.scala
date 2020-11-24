package typings.mapboxMapboxSdk.geocodingMod

import typings.mapboxMapboxSdk.mapiRequestMod.MapiRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GeocodeService extends js.Object {
  
  def forwardGeocode(request: GeocodeRequest): MapiRequest = js.native
  
  def reverseGeocode(request: GeocodeRequest): MapiRequest = js.native
}
object GeocodeService {
  
  @scala.inline
  def apply(forwardGeocode: GeocodeRequest => MapiRequest, reverseGeocode: GeocodeRequest => MapiRequest): GeocodeService = {
    val __obj = js.Dynamic.literal(forwardGeocode = js.Any.fromFunction1(forwardGeocode), reverseGeocode = js.Any.fromFunction1(reverseGeocode))
    __obj.asInstanceOf[GeocodeService]
  }
  
  @scala.inline
  implicit class GeocodeServiceOps[Self <: GeocodeService] (val x: Self) extends AnyVal {
    
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
    def setForwardGeocode(value: GeocodeRequest => MapiRequest): Self = this.set("forwardGeocode", js.Any.fromFunction1(value))
    
    @scala.inline
    def setReverseGeocode(value: GeocodeRequest => MapiRequest): Self = this.set("reverseGeocode", js.Any.fromFunction1(value))
  }
}
