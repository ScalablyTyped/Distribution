package typings.maximMazurokGapiClientBigqueryreservation.gapi.client.bigqueryreservation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SplitCapacityCommitmentRequest extends js.Object {
  
  /** Number of slots in the capacity commitment after the split. */
  var slotCount: js.UndefOr[String] = js.native
}
object SplitCapacityCommitmentRequest {
  
  @scala.inline
  def apply(): SplitCapacityCommitmentRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SplitCapacityCommitmentRequest]
  }
  
  @scala.inline
  implicit class SplitCapacityCommitmentRequestOps[Self <: SplitCapacityCommitmentRequest] (val x: Self) extends AnyVal {
    
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
    def setSlotCount(value: String): Self = this.set("slotCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSlotCount: Self = this.set("slotCount", js.undefined)
  }
}
