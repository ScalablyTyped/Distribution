package typings.mangopay2NodejsSdk.mod.kycDocument

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * - Documents have to be in "CREATED" Status
  * - You can create as many pages as needed
  *
  * Remember to change Status to "VALIDATION_ASKED" to submit KYC documents
  * The maximum size per page is about 7Mb (or 10Mb when base64encoded). The following formats are accepted for the documents : .pdf, .jpeg, .jpg, .gif and .png. The minimum size is 1Kb.
  */
trait CreateKycPage extends js.Object {
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
  var File: String
}

object CreateKycPage {
  @scala.inline
  def apply(File: String): CreateKycPage = {
    val __obj = js.Dynamic.literal(File = File.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateKycPage]
  }
}

