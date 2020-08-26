package typings.mangopay2NodejsSdk.anon

import typings.mangopay2NodejsSdk.mod.Timestamp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<mangopay2-nodejs-sdk.mangopay2-nodejs-sdk.disputeDocument.DocumentPageConsult> */
@js.native
trait PartialDocumentPageConsul extends js.Object {
  var ExpirationDate: js.UndefOr[Timestamp] = js.native
  var Url: js.UndefOr[String] = js.native
}

object PartialDocumentPageConsul {
  @scala.inline
  def apply(): PartialDocumentPageConsul = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialDocumentPageConsul]
  }
  @scala.inline
  implicit class PartialDocumentPageConsulOps[Self <: PartialDocumentPageConsul] (val x: Self) extends AnyVal {
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
    def setExpirationDate(value: Timestamp): Self = this.set("ExpirationDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpirationDate: Self = this.set("ExpirationDate", js.undefined)
    @scala.inline
    def setUrl(value: String): Self = this.set("Url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("Url", js.undefined)
  }
  
}

