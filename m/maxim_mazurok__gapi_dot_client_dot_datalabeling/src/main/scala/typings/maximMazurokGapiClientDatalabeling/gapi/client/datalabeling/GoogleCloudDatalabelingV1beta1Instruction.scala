package typings.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDatalabelingV1beta1Instruction extends js.Object {
  
  /** Output only. The names of any related resources that are blocking changes to the instruction. */
  var blockingResources: js.UndefOr[js.Array[String]] = js.native
  
  /** Output only. Creation time of instruction. */
  var createTime: js.UndefOr[String] = js.native
  
  /**
    * Deprecated: this instruction format is not supported any more. Instruction from a CSV file, such as for classification task. The CSV file should have exact two columns, in the
    * following format: * The first column is labeled data, such as an image reference, text. * The second column is comma separated labels associated with data.
    */
  var csvInstruction: js.UndefOr[GoogleCloudDatalabelingV1beta1CsvInstruction] = js.native
  
  /** Required. The data type of this instruction. */
  var dataType: js.UndefOr[String] = js.native
  
  /** Optional. User-provided description of the instruction. The description can be up to 10000 characters long. */
  var description: js.UndefOr[String] = js.native
  
  /** Required. The display name of the instruction. Maximum of 64 characters. */
  var displayName: js.UndefOr[String] = js.native
  
  /** Output only. Instruction resource name, format: projects/{project_id}/instructions/{instruction_id} */
  var name: js.UndefOr[String] = js.native
  
  /** Instruction from a PDF document. The PDF should be in a Cloud Storage bucket. */
  var pdfInstruction: js.UndefOr[GoogleCloudDatalabelingV1beta1PdfInstruction] = js.native
  
  /** Output only. Last update time of instruction. */
  var updateTime: js.UndefOr[String] = js.native
}
object GoogleCloudDatalabelingV1beta1Instruction {
  
  @scala.inline
  def apply(): GoogleCloudDatalabelingV1beta1Instruction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatalabelingV1beta1Instruction]
  }
  
  @scala.inline
  implicit class GoogleCloudDatalabelingV1beta1InstructionOps[Self <: GoogleCloudDatalabelingV1beta1Instruction] (val x: Self) extends AnyVal {
    
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
    def setBlockingResourcesVarargs(value: String*): Self = this.set("blockingResources", js.Array(value :_*))
    
    @scala.inline
    def setBlockingResources(value: js.Array[String]): Self = this.set("blockingResources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlockingResources: Self = this.set("blockingResources", js.undefined)
    
    @scala.inline
    def setCreateTime(value: String): Self = this.set("createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreateTime: Self = this.set("createTime", js.undefined)
    
    @scala.inline
    def setCsvInstruction(value: GoogleCloudDatalabelingV1beta1CsvInstruction): Self = this.set("csvInstruction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCsvInstruction: Self = this.set("csvInstruction", js.undefined)
    
    @scala.inline
    def setDataType(value: String): Self = this.set("dataType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataType: Self = this.set("dataType", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setPdfInstruction(value: GoogleCloudDatalabelingV1beta1PdfInstruction): Self = this.set("pdfInstruction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePdfInstruction: Self = this.set("pdfInstruction", js.undefined)
    
    @scala.inline
    def setUpdateTime(value: String): Self = this.set("updateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateTime: Self = this.set("updateTime", js.undefined)
  }
}
