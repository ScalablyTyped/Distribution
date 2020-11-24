package typings.maximMazurokGapiClientBigqueryreservation.gapi.client.bigqueryreservation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SplitCapacityCommitmentResponse extends js.Object {
  
  /** First capacity commitment, result of a split. */
  var first: js.UndefOr[CapacityCommitment] = js.native
  
  /** Second capacity commitment, result of a split. */
  var second: js.UndefOr[CapacityCommitment] = js.native
}
object SplitCapacityCommitmentResponse {
  
  @scala.inline
  def apply(): SplitCapacityCommitmentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SplitCapacityCommitmentResponse]
  }
  
  @scala.inline
  implicit class SplitCapacityCommitmentResponseOps[Self <: SplitCapacityCommitmentResponse] (val x: Self) extends AnyVal {
    
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
    def setFirst(value: CapacityCommitment): Self = this.set("first", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFirst: Self = this.set("first", js.undefined)
    
    @scala.inline
    def setSecond(value: CapacityCommitment): Self = this.set("second", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecond: Self = this.set("second", js.undefined)
  }
}
