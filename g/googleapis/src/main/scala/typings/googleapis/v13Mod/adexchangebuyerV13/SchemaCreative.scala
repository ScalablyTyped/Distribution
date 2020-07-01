package typings.googleapis.v13Mod.adexchangebuyerV13

import typings.googleapis.anon.Advertiser
import typings.googleapis.anon.Date
import typings.googleapis.anon.Details
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A creative and its classification data.
  */
@js.native
trait SchemaCreative extends js.Object {
  /**
    * The HTML snippet that displays the ad when inserted in the web page. If
    * set, videoURL should not be set.
    */
  var HTMLSnippet: js.UndefOr[String] = js.native
  /**
    * Account id.
    */
  var accountId: js.UndefOr[Double] = js.native
  /**
    * Detected advertiser id, if any. Read-only. This field should not be set
    * in requests.
    */
  var advertiserId: js.UndefOr[js.Array[String]] = js.native
  /**
    * The name of the company being advertised in the creative.
    */
  var advertiserName: js.UndefOr[String] = js.native
  /**
    * The agency id for this creative.
    */
  var agencyId: js.UndefOr[String] = js.native
  /**
    * The last upload timestamp of this creative if it was uploaded via API.
    * Read-only. The value of this field is generated, and will be ignored for
    * uploads. (formatted RFC 3339 timestamp).
    */
  var apiUploadTimestamp: js.UndefOr[String] = js.native
  /**
    * All attributes for the ads that may be shown from this snippet.
    */
  var attribute: js.UndefOr[js.Array[Double]] = js.native
  /**
    * A buyer-specific id identifying the creative in this ad.
    */
  var buyerCreativeId: js.UndefOr[String] = js.native
  /**
    * The set of destination urls for the snippet.
    */
  var clickThroughUrl: js.UndefOr[js.Array[String]] = js.native
  /**
    * Shows any corrections that were applied to this creative. Read-only. This
    * field should not be set in requests.
    */
  var corrections: js.UndefOr[js.Array[Details]] = js.native
  /**
    * The reasons for disapproval, if any. Note that not all disapproval
    * reasons may be categorized, so it is possible for the creative to have a
    * status of DISAPPROVED with an empty list for disapproval_reasons. In this
    * case, please reach out to your TAM to help debug the issue. Read-only.
    * This field should not be set in requests.
    */
  var disapprovalReasons: js.UndefOr[js.Array[Details]] = js.native
  /**
    * The filtering reasons for the creative. Read-only. This field should not
    * be set in requests.
    */
  var filteringReasons: js.UndefOr[Date] = js.native
  /**
    * Ad height.
    */
  var height: js.UndefOr[Double] = js.native
  /**
    * The set of urls to be called to record an impression.
    */
  var impressionTrackingUrl: js.UndefOr[js.Array[String]] = js.native
  /**
    * Resource type.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * If nativeAd is set, HTMLSnippet and videoURL should not be set.
    */
  var nativeAd: js.UndefOr[Advertiser] = js.native
  /**
    * Detected product categories, if any. Read-only. This field should not be
    * set in requests.
    */
  var productCategories: js.UndefOr[js.Array[Double]] = js.native
  /**
    * All restricted categories for the ads that may be shown from this
    * snippet.
    */
  var restrictedCategories: js.UndefOr[js.Array[Double]] = js.native
  /**
    * Detected sensitive categories, if any. Read-only. This field should not
    * be set in requests.
    */
  var sensitiveCategories: js.UndefOr[js.Array[Double]] = js.native
  /**
    * Creative serving status. Read-only. This field should not be set in
    * requests.
    */
  var status: js.UndefOr[String] = js.native
  /**
    * All vendor types for the ads that may be shown from this snippet.
    */
  var vendorType: js.UndefOr[js.Array[Double]] = js.native
  /**
    * The version for this creative. Read-only. This field should not be set in
    * requests.
    */
  var version: js.UndefOr[Double] = js.native
  /**
    * The URL to fetch a video ad. If set, HTMLSnippet and the nativeAd should
    * not be set.
    */
  var videoURL: js.UndefOr[String] = js.native
  /**
    * Ad width.
    */
  var width: js.UndefOr[Double] = js.native
}

object SchemaCreative {
  @scala.inline
  def apply(
    HTMLSnippet: String = null,
    accountId: js.UndefOr[Double] = js.undefined,
    advertiserId: js.Array[String] = null,
    advertiserName: String = null,
    agencyId: String = null,
    apiUploadTimestamp: String = null,
    attribute: js.Array[Double] = null,
    buyerCreativeId: String = null,
    clickThroughUrl: js.Array[String] = null,
    corrections: js.Array[Details] = null,
    disapprovalReasons: js.Array[Details] = null,
    filteringReasons: Date = null,
    height: js.UndefOr[Double] = js.undefined,
    impressionTrackingUrl: js.Array[String] = null,
    kind: String = null,
    nativeAd: Advertiser = null,
    productCategories: js.Array[Double] = null,
    restrictedCategories: js.Array[Double] = null,
    sensitiveCategories: js.Array[Double] = null,
    status: String = null,
    vendorType: js.Array[Double] = null,
    version: js.UndefOr[Double] = js.undefined,
    videoURL: String = null,
    width: js.UndefOr[Double] = js.undefined
  ): SchemaCreative = {
    val __obj = js.Dynamic.literal()
    if (HTMLSnippet != null) __obj.updateDynamic("HTMLSnippet")(HTMLSnippet.asInstanceOf[js.Any])
    if (!js.isUndefined(accountId)) __obj.updateDynamic("accountId")(accountId.get.asInstanceOf[js.Any])
    if (advertiserId != null) __obj.updateDynamic("advertiserId")(advertiserId.asInstanceOf[js.Any])
    if (advertiserName != null) __obj.updateDynamic("advertiserName")(advertiserName.asInstanceOf[js.Any])
    if (agencyId != null) __obj.updateDynamic("agencyId")(agencyId.asInstanceOf[js.Any])
    if (apiUploadTimestamp != null) __obj.updateDynamic("apiUploadTimestamp")(apiUploadTimestamp.asInstanceOf[js.Any])
    if (attribute != null) __obj.updateDynamic("attribute")(attribute.asInstanceOf[js.Any])
    if (buyerCreativeId != null) __obj.updateDynamic("buyerCreativeId")(buyerCreativeId.asInstanceOf[js.Any])
    if (clickThroughUrl != null) __obj.updateDynamic("clickThroughUrl")(clickThroughUrl.asInstanceOf[js.Any])
    if (corrections != null) __obj.updateDynamic("corrections")(corrections.asInstanceOf[js.Any])
    if (disapprovalReasons != null) __obj.updateDynamic("disapprovalReasons")(disapprovalReasons.asInstanceOf[js.Any])
    if (filteringReasons != null) __obj.updateDynamic("filteringReasons")(filteringReasons.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (impressionTrackingUrl != null) __obj.updateDynamic("impressionTrackingUrl")(impressionTrackingUrl.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (nativeAd != null) __obj.updateDynamic("nativeAd")(nativeAd.asInstanceOf[js.Any])
    if (productCategories != null) __obj.updateDynamic("productCategories")(productCategories.asInstanceOf[js.Any])
    if (restrictedCategories != null) __obj.updateDynamic("restrictedCategories")(restrictedCategories.asInstanceOf[js.Any])
    if (sensitiveCategories != null) __obj.updateDynamic("sensitiveCategories")(sensitiveCategories.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (vendorType != null) __obj.updateDynamic("vendorType")(vendorType.asInstanceOf[js.Any])
    if (!js.isUndefined(version)) __obj.updateDynamic("version")(version.get.asInstanceOf[js.Any])
    if (videoURL != null) __obj.updateDynamic("videoURL")(videoURL.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaCreative]
  }
}

