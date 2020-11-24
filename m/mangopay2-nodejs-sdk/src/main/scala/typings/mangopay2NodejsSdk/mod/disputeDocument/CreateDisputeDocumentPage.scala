package typings.mangopay2NodejsSdk.mod.disputeDocument

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * - Documents have to be in "CREATED" Status
  * - You can create as many pages as needed
  *
  * Remember to change Status to "VALIDATION_ASKED" to submit KYC documents
  * The maximum size per page is about 7Mb (or 10Mb when base64encoded). The following formats are accepted for the documents : .pdf, .jpeg, .jpg, .gif and .png. The minimum size is 1Kb.
  */
@js.native
trait CreateDisputeDocumentPage extends js.Object {
  
  /**
    * The base64 encoded file which needs to be uploaded
    *
    * You need to fill in only the binary code. Do not send the first part that some converters add into the binary code which is
    * `<img src=" data:image/png;base64..." />`
    *
    * e.g.
    * ```json
    * {
    *   "File": "/9j/4AAQSkZJRgABAQEBLAEsAAD/.../wgARCAAyADIDAREAAhEBAxEB/8QAGwAAAgMBAQEA"
    * }
    * ```
    */
  var File: String = js.native
}
object CreateDisputeDocumentPage {
  
  @scala.inline
  def apply(File: String): CreateDisputeDocumentPage = {
    val __obj = js.Dynamic.literal(File = File.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDisputeDocumentPage]
  }
  
  @scala.inline
  implicit class CreateDisputeDocumentPageOps[Self <: CreateDisputeDocumentPage] (val x: Self) extends AnyVal {
    
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
    def setFile(value: String): Self = this.set("File", value.asInstanceOf[js.Any])
  }
}
