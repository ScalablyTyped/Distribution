package typings.maximMazurokGapiClientCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReservationsResizeRequest extends js.Object {
  
  /** Number of allocated resources can be resized with minimum = 1 and maximum = 1000. */
  var specificSkuCount: js.UndefOr[String] = js.native
}
object ReservationsResizeRequest {
  
  @scala.inline
  def apply(): ReservationsResizeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReservationsResizeRequest]
  }
  
  @scala.inline
  implicit class ReservationsResizeRequestOps[Self <: ReservationsResizeRequest] (val x: Self) extends AnyVal {
    
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
    def setSpecificSkuCount(value: String): Self = this.set("specificSkuCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpecificSkuCount: Self = this.set("specificSkuCount", js.undefined)
  }
}
