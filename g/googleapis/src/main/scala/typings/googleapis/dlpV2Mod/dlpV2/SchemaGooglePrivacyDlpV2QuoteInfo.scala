package typings.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Message for infoType-dependent details parsed from quote.
  */
@js.native
trait SchemaGooglePrivacyDlpV2QuoteInfo extends js.Object {
  /**
    * The date time indicated by the quote.
    */
  var dateTime: js.UndefOr[SchemaGooglePrivacyDlpV2DateTime] = js.native
}

object SchemaGooglePrivacyDlpV2QuoteInfo {
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2QuoteInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2QuoteInfo]
  }
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2QuoteInfoOps[Self <: SchemaGooglePrivacyDlpV2QuoteInfo] (val x: Self) extends AnyVal {
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
    def setDateTime(value: SchemaGooglePrivacyDlpV2DateTime): Self = this.set("dateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDateTime: Self = this.set("dateTime", js.undefined)
  }
  
}

