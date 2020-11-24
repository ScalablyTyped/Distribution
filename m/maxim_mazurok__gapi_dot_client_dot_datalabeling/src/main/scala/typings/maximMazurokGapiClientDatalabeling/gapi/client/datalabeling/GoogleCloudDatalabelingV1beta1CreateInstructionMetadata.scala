package typings.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDatalabelingV1beta1CreateInstructionMetadata extends js.Object {
  
  /** Timestamp when create instruction request was created. */
  var createTime: js.UndefOr[String] = js.native
  
  /** The name of the created Instruction. projects/{project_id}/instructions/{instruction_id} */
  var instruction: js.UndefOr[String] = js.native
  
  /** Partial failures encountered. E.g. single files that couldn't be read. Status details field will contain standard GCP error details. */
  var partialFailures: js.UndefOr[js.Array[GoogleRpcStatus]] = js.native
}
object GoogleCloudDatalabelingV1beta1CreateInstructionMetadata {
  
  @scala.inline
  def apply(): GoogleCloudDatalabelingV1beta1CreateInstructionMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatalabelingV1beta1CreateInstructionMetadata]
  }
  
  @scala.inline
  implicit class GoogleCloudDatalabelingV1beta1CreateInstructionMetadataOps[Self <: GoogleCloudDatalabelingV1beta1CreateInstructionMetadata] (val x: Self) extends AnyVal {
    
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
    def setCreateTime(value: String): Self = this.set("createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreateTime: Self = this.set("createTime", js.undefined)
    
    @scala.inline
    def setInstruction(value: String): Self = this.set("instruction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstruction: Self = this.set("instruction", js.undefined)
    
    @scala.inline
    def setPartialFailuresVarargs(value: GoogleRpcStatus*): Self = this.set("partialFailures", js.Array(value :_*))
    
    @scala.inline
    def setPartialFailures(value: js.Array[GoogleRpcStatus]): Self = this.set("partialFailures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePartialFailures: Self = this.set("partialFailures", js.undefined)
  }
}
