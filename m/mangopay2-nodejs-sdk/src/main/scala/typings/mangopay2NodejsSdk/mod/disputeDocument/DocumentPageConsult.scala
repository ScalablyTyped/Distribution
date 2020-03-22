package typings.mangopay2NodejsSdk.mod.disputeDocument

import typings.mangopay2NodejsSdk.mod.Timestamp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocumentPageConsult extends js.Object {
  /**
    * Time in millis when the page consult will expire.
    */
  var ExpirationDate: Timestamp
  /**
    * URL where this document page can be viewed.
    */
  var Url: String
}

object DocumentPageConsult {
  @scala.inline
  def apply(ExpirationDate: Timestamp, Url: String): DocumentPageConsult = {
    val __obj = js.Dynamic.literal(ExpirationDate = ExpirationDate.asInstanceOf[js.Any], Url = Url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DocumentPageConsult]
  }
}

