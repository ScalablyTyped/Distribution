package typings.mangopay2NodejsSdk

import typings.mangopay2NodejsSdk.mod.Timestamp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<mangopay2-nodejs-sdk.mangopay2-nodejs-sdk.disputeDocument.DocumentPageConsult> */
trait PartialDocumentPageConsul extends js.Object {
  var ExpirationDate: js.UndefOr[Timestamp] = js.undefined
  var Url: js.UndefOr[String] = js.undefined
}

object PartialDocumentPageConsul {
  @scala.inline
  def apply(ExpirationDate: Int | Double = null, Url: String = null): PartialDocumentPageConsul = {
    val __obj = js.Dynamic.literal()
    if (ExpirationDate != null) __obj.updateDynamic("ExpirationDate")(ExpirationDate.asInstanceOf[js.Any])
    if (Url != null) __obj.updateDynamic("Url")(Url.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialDocumentPageConsul]
  }
}

