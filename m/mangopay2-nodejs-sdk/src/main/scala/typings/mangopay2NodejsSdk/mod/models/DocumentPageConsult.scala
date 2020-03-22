package typings.mangopay2NodejsSdk.mod.models

import typings.mangopay2NodejsSdk.PartialDocumentPageConsul
import typings.mangopay2NodejsSdk.mod.Timestamp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mangopay2-nodejs-sdk", "models.DocumentPageConsult")
@js.native
class DocumentPageConsult protected ()
  extends Model[js.Any]
     with typings.mangopay2NodejsSdk.mod.disputeDocument.DocumentPageConsult {
  def this(data: PartialDocumentPageConsul) = this()
  /**
    * Time in millis when the page consult will expire.
    */
  /* CompleteClass */
  override var ExpirationDate: Timestamp = js.native
  /**
    * URL where this document page can be viewed.
    */
  /* CompleteClass */
  override var Url: String = js.native
}

