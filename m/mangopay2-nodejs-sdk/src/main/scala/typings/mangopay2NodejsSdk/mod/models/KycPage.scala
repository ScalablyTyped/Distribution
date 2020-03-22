package typings.mangopay2NodejsSdk.mod.models

import typings.mangopay2NodejsSdk.mod.kycDocument.CreateKycPage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mangopay2-nodejs-sdk", "models.KycPage")
@js.native
class KycPage protected () extends CreateKycPage {
  def this(data: CreateKycPage) = this()
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

