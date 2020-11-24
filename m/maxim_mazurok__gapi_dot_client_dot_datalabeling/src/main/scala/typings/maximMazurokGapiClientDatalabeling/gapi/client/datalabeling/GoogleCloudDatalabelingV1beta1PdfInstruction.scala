package typings.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDatalabelingV1beta1PdfInstruction extends js.Object {
  
  /** PDF file for the instruction. Only gcs path is allowed. */
  var gcsFileUri: js.UndefOr[String] = js.native
}
object GoogleCloudDatalabelingV1beta1PdfInstruction {
  
  @scala.inline
  def apply(): GoogleCloudDatalabelingV1beta1PdfInstruction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatalabelingV1beta1PdfInstruction]
  }
  
  @scala.inline
  implicit class GoogleCloudDatalabelingV1beta1PdfInstructionOps[Self <: GoogleCloudDatalabelingV1beta1PdfInstruction] (val x: Self) extends AnyVal {
    
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
    def setGcsFileUri(value: String): Self = this.set("gcsFileUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGcsFileUri: Self = this.set("gcsFileUri", js.undefined)
  }
}
