package typings.mangopay2NodejsSdk.mod.models

import typings.mangopay2NodejsSdk.mod.disputeDocument.CreateDisputeDocumentPage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mangopay2-nodejs-sdk", "models.DisputeDocumentPage")
@js.native
class DisputeDocumentPage protected ()
  extends EntityBase[js.Any]
     with CreateDisputeDocumentPage {
  def this(data: CreateDisputeDocumentPage) = this()
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
  /* CompleteClass */
  override var File: String = js.native
}

