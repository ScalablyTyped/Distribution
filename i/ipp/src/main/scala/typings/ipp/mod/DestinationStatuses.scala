package typings.ipp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DestinationStatuses extends js.Object {
  
  var `destination-uri`: js.UndefOr[String] = js.native
  
  var `images-completed`: js.UndefOr[Double] = js.native
  
  var `transmission-status`: js.UndefOr[TransmissionStatus] = js.native
}
object DestinationStatuses {
  
  @scala.inline
  def apply(): DestinationStatuses = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DestinationStatuses]
  }
  
  @scala.inline
  implicit class DestinationStatusesOps[Self <: DestinationStatuses] (val x: Self) extends AnyVal {
    
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
    def `setDestination-uri`(value: String): Self = this.set("destination-uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteDestination-uri`: Self = this.set("destination-uri", js.undefined)
    
    @scala.inline
    def `setImages-completed`(value: Double): Self = this.set("images-completed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteImages-completed`: Self = this.set("images-completed", js.undefined)
    
    @scala.inline
    def `setTransmission-status`(value: TransmissionStatus): Self = this.set("transmission-status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteTransmission-status`: Self = this.set("transmission-status", js.undefined)
  }
}
