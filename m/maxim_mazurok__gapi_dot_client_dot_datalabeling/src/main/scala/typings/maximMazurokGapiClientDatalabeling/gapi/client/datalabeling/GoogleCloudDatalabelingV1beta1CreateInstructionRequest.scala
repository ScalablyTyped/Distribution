package typings.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDatalabelingV1beta1CreateInstructionRequest extends js.Object {
  
  /** Required. Instruction of how to perform the labeling task. */
  var instruction: js.UndefOr[GoogleCloudDatalabelingV1beta1Instruction] = js.native
}
object GoogleCloudDatalabelingV1beta1CreateInstructionRequest {
  
  @scala.inline
  def apply(): GoogleCloudDatalabelingV1beta1CreateInstructionRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatalabelingV1beta1CreateInstructionRequest]
  }
  
  @scala.inline
  implicit class GoogleCloudDatalabelingV1beta1CreateInstructionRequestOps[Self <: GoogleCloudDatalabelingV1beta1CreateInstructionRequest] (val x: Self) extends AnyVal {
    
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
    def setInstruction(value: GoogleCloudDatalabelingV1beta1Instruction): Self = this.set("instruction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstruction: Self = this.set("instruction", js.undefined)
  }
}
