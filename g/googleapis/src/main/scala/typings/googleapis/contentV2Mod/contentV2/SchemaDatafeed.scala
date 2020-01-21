package typings.googleapis.contentV2Mod.contentV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Datafeed configuration data.
  */
@js.native
trait SchemaDatafeed extends js.Object {
  /**
    * The two-letter ISO 639-1 language in which the attributes are defined in
    * the data feed.
    */
  var attributeLanguage: js.UndefOr[String] = js.native
  /**
    * [DEPRECATED] Please use targets[].language instead. The two-letter ISO
    * 639-1 language of the items in the feed. Must be a valid language for
    * targetCountry.
    */
  var contentLanguage: js.UndefOr[String] = js.native
  /**
    * The type of data feed. For product inventory feeds, only feeds for local
    * stores, not online stores, are supported.
    */
  var contentType: js.UndefOr[String] = js.native
  /**
    * Fetch schedule for the feed file.
    */
  var fetchSchedule: js.UndefOr[SchemaDatafeedFetchSchedule] = js.native
  /**
    * The filename of the feed. All feeds must have a unique file name.
    */
  var fileName: js.UndefOr[String] = js.native
  /**
    * Format of the feed file.
    */
  var format: js.UndefOr[SchemaDatafeedFormat] = js.native
  /**
    * The ID of the data feed.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * [DEPRECATED] Please use targets[].includedDestinations instead. The list
    * of intended destinations (corresponds to checked check boxes in Merchant
    * Center).
    */
  var intendedDestinations: js.UndefOr[js.Array[String]] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;content#datafeed&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * A descriptive name of the data feed.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * [DEPRECATED] Please use targets[].country instead. The country where the
    * items in the feed will be included in the search index, represented as a
    * CLDR territory code.
    */
  var targetCountry: js.UndefOr[String] = js.native
  /**
    * The targets this feed should apply to (country, language, destinations).
    */
  var targets: js.UndefOr[js.Array[SchemaDatafeedTarget]] = js.native
}

object SchemaDatafeed {
  @scala.inline
  def apply(
    attributeLanguage: String = null,
    contentLanguage: String = null,
    contentType: String = null,
    fetchSchedule: SchemaDatafeedFetchSchedule = null,
    fileName: String = null,
    format: SchemaDatafeedFormat = null,
    id: String = null,
    intendedDestinations: js.Array[String] = null,
    kind: String = null,
    name: String = null,
    targetCountry: String = null,
    targets: js.Array[SchemaDatafeedTarget] = null
  ): SchemaDatafeed = {
    val __obj = js.Dynamic.literal()
    if (attributeLanguage != null) __obj.updateDynamic("attributeLanguage")(attributeLanguage.asInstanceOf[js.Any])
    if (contentLanguage != null) __obj.updateDynamic("contentLanguage")(contentLanguage.asInstanceOf[js.Any])
    if (contentType != null) __obj.updateDynamic("contentType")(contentType.asInstanceOf[js.Any])
    if (fetchSchedule != null) __obj.updateDynamic("fetchSchedule")(fetchSchedule.asInstanceOf[js.Any])
    if (fileName != null) __obj.updateDynamic("fileName")(fileName.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (intendedDestinations != null) __obj.updateDynamic("intendedDestinations")(intendedDestinations.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (targetCountry != null) __obj.updateDynamic("targetCountry")(targetCountry.asInstanceOf[js.Any])
    if (targets != null) __obj.updateDynamic("targets")(targets.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaDatafeed]
  }
}

