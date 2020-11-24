package typings.maximMazurokGapiClientBigqueryreservation.gapi.client.bigqueryreservation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BiReservation extends js.Object {
  
  /** The resource name of the singleton BI reservation. Reservation names have the form `projects/{project_id}/locations/{location_id}/bireservation`. */
  var name: js.UndefOr[String] = js.native
  
  /** Size of a reservation, in bytes. */
  var size: js.UndefOr[String] = js.native
  
  /** Output only. The last update timestamp of a reservation. */
  var updateTime: js.UndefOr[String] = js.native
}
object BiReservation {
  
  @scala.inline
  def apply(): BiReservation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BiReservation]
  }
  
  @scala.inline
  implicit class BiReservationOps[Self <: BiReservation] (val x: Self) extends AnyVal {
    
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setSize(value: String): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    
    @scala.inline
    def setUpdateTime(value: String): Self = this.set("updateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateTime: Self = this.set("updateTime", js.undefined)
  }
}
