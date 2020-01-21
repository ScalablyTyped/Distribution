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
  def apply(dateTime: SchemaGooglePrivacyDlpV2DateTime = null): SchemaGooglePrivacyDlpV2QuoteInfo = {
    val __obj = js.Dynamic.literal()
    if (dateTime != null) __obj.updateDynamic("dateTime")(dateTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2QuoteInfo]
  }
}

