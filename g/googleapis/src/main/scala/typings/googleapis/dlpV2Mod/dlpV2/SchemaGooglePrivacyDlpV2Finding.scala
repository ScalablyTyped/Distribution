package typings.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a piece of potentially sensitive content.
  */
@js.native
trait SchemaGooglePrivacyDlpV2Finding extends js.Object {
  /**
    * Timestamp when finding was detected.
    */
  var createTime: js.UndefOr[String] = js.native
  /**
    * The type of content that might have been found. Provided if
    * `excluded_types` is false.
    */
  var infoType: js.UndefOr[SchemaGooglePrivacyDlpV2InfoType] = js.native
  /**
    * Confidence of how likely it is that the `info_type` is correct.
    */
  var likelihood: js.UndefOr[String] = js.native
  /**
    * Where the content was found.
    */
  var location: js.UndefOr[SchemaGooglePrivacyDlpV2Location] = js.native
  /**
    * The content that was found. Even if the content is not textual, it may be
    * converted to a textual representation here. Provided if `include_quote`
    * is true and the finding is less than or equal to 4096 bytes long. If the
    * finding exceeds 4096 bytes in length, the quote may be omitted.
    */
  var quote: js.UndefOr[String] = js.native
  /**
    * Contains data parsed from quotes. Only populated if include_quote was set
    * to true and a supported infoType was requested. Currently supported
    * infoTypes: DATE, DATE_OF_BIRTH and TIME.
    */
  var quoteInfo: js.UndefOr[SchemaGooglePrivacyDlpV2QuoteInfo] = js.native
}

object SchemaGooglePrivacyDlpV2Finding {
  @scala.inline
  def apply(
    createTime: String = null,
    infoType: SchemaGooglePrivacyDlpV2InfoType = null,
    likelihood: String = null,
    location: SchemaGooglePrivacyDlpV2Location = null,
    quote: String = null,
    quoteInfo: SchemaGooglePrivacyDlpV2QuoteInfo = null
  ): SchemaGooglePrivacyDlpV2Finding = {
    val __obj = js.Dynamic.literal()
    if (createTime != null) __obj.updateDynamic("createTime")(createTime.asInstanceOf[js.Any])
    if (infoType != null) __obj.updateDynamic("infoType")(infoType.asInstanceOf[js.Any])
    if (likelihood != null) __obj.updateDynamic("likelihood")(likelihood.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (quote != null) __obj.updateDynamic("quote")(quote.asInstanceOf[js.Any])
    if (quoteInfo != null) __obj.updateDynamic("quoteInfo")(quoteInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2Finding]
  }
}

