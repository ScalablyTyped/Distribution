package typings.maximMazurokGapiClientBigqueryreservation.gapi.client.bigqueryreservation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateSlotPoolMetadata extends js.Object {
  
  /** Resource name of the slot pool that is being created. E.g., projects/myproject/locations/us-central1/reservations/foo/slotPools/123 */
  var slotPool: js.UndefOr[String] = js.native
}
object CreateSlotPoolMetadata {
  
  @scala.inline
  def apply(): CreateSlotPoolMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateSlotPoolMetadata]
  }
  
  @scala.inline
  implicit class CreateSlotPoolMetadataOps[Self <: CreateSlotPoolMetadata] (val x: Self) extends AnyVal {
    
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
    def setSlotPool(value: String): Self = this.set("slotPool", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSlotPool: Self = this.set("slotPool", js.undefined)
  }
}
