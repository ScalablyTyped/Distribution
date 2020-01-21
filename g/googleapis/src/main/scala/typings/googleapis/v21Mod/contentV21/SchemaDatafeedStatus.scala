package typings.googleapis.v21Mod.contentV21

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The status of a datafeed, i.e., the result of the last retrieval of the
  * datafeed computed asynchronously when the feed processing is finished.
  */
@js.native
trait SchemaDatafeedStatus extends js.Object {
  /**
    * The country for which the status is reported, represented as a  CLDR
    * territory code.
    */
  var country: js.UndefOr[String] = js.native
  /**
    * The ID of the feed for which the status is reported.
    */
  var datafeedId: js.UndefOr[String] = js.native
  /**
    * The list of errors occurring in the feed.
    */
  var errors: js.UndefOr[js.Array[SchemaDatafeedStatusError]] = js.native
  /**
    * The number of items in the feed that were processed.
    */
  var itemsTotal: js.UndefOr[String] = js.native
  /**
    * The number of items in the feed that were valid.
    */
  var itemsValid: js.UndefOr[String] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;content#datafeedStatus&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The two-letter ISO 639-1 language for which the status is reported.
    */
  var language: js.UndefOr[String] = js.native
  /**
    * The last date at which the feed was uploaded.
    */
  var lastUploadDate: js.UndefOr[String] = js.native
  /**
    * The processing status of the feed.
    */
  var processingStatus: js.UndefOr[String] = js.native
  /**
    * The list of errors occurring in the feed.
    */
  var warnings: js.UndefOr[js.Array[SchemaDatafeedStatusError]] = js.native
}

object SchemaDatafeedStatus {
  @scala.inline
  def apply(
    country: String = null,
    datafeedId: String = null,
    errors: js.Array[SchemaDatafeedStatusError] = null,
    itemsTotal: String = null,
    itemsValid: String = null,
    kind: String = null,
    language: String = null,
    lastUploadDate: String = null,
    processingStatus: String = null,
    warnings: js.Array[SchemaDatafeedStatusError] = null
  ): SchemaDatafeedStatus = {
    val __obj = js.Dynamic.literal()
    if (country != null) __obj.updateDynamic("country")(country.asInstanceOf[js.Any])
    if (datafeedId != null) __obj.updateDynamic("datafeedId")(datafeedId.asInstanceOf[js.Any])
    if (errors != null) __obj.updateDynamic("errors")(errors.asInstanceOf[js.Any])
    if (itemsTotal != null) __obj.updateDynamic("itemsTotal")(itemsTotal.asInstanceOf[js.Any])
    if (itemsValid != null) __obj.updateDynamic("itemsValid")(itemsValid.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (lastUploadDate != null) __obj.updateDynamic("lastUploadDate")(lastUploadDate.asInstanceOf[js.Any])
    if (processingStatus != null) __obj.updateDynamic("processingStatus")(processingStatus.asInstanceOf[js.Any])
    if (warnings != null) __obj.updateDynamic("warnings")(warnings.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaDatafeedStatus]
  }
}

