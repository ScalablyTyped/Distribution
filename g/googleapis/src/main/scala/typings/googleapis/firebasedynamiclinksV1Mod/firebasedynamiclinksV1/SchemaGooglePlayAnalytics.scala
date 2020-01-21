package typings.googleapis.firebasedynamiclinksV1Mod.firebasedynamiclinksV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Parameters for Google Play Campaign Measurements. [Learn
  * more](https://developers.google.com/analytics/devguides/collection/android/v4/campaigns#campaign-params)
  */
@js.native
trait SchemaGooglePlayAnalytics extends js.Object {
  /**
    * [AdWords autotagging
    * parameter](https://support.google.com/analytics/answer/1033981?hl=en);
    * used to measure Google AdWords ads. This value is generated dynamically
    * and should never be modified.
    */
  var gclid: js.UndefOr[String] = js.native
  /**
    * Campaign name; used for keyword analysis to identify a specific product
    * promotion or strategic campaign.
    */
  var utmCampaign: js.UndefOr[String] = js.native
  /**
    * Campaign content; used for A/B testing and content-targeted ads to
    * differentiate ads or links that point to the same URL.
    */
  var utmContent: js.UndefOr[String] = js.native
  /**
    * Campaign medium; used to identify a medium such as email or
    * cost-per-click.
    */
  var utmMedium: js.UndefOr[String] = js.native
  /**
    * Campaign source; used to identify a search engine, newsletter, or other
    * source.
    */
  var utmSource: js.UndefOr[String] = js.native
  /**
    * Campaign term; used with paid search to supply the keywords for ads.
    */
  var utmTerm: js.UndefOr[String] = js.native
}

object SchemaGooglePlayAnalytics {
  @scala.inline
  def apply(
    gclid: String = null,
    utmCampaign: String = null,
    utmContent: String = null,
    utmMedium: String = null,
    utmSource: String = null,
    utmTerm: String = null
  ): SchemaGooglePlayAnalytics = {
    val __obj = js.Dynamic.literal()
    if (gclid != null) __obj.updateDynamic("gclid")(gclid.asInstanceOf[js.Any])
    if (utmCampaign != null) __obj.updateDynamic("utmCampaign")(utmCampaign.asInstanceOf[js.Any])
    if (utmContent != null) __obj.updateDynamic("utmContent")(utmContent.asInstanceOf[js.Any])
    if (utmMedium != null) __obj.updateDynamic("utmMedium")(utmMedium.asInstanceOf[js.Any])
    if (utmSource != null) __obj.updateDynamic("utmSource")(utmSource.asInstanceOf[js.Any])
    if (utmTerm != null) __obj.updateDynamic("utmTerm")(utmTerm.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGooglePlayAnalytics]
  }
}

