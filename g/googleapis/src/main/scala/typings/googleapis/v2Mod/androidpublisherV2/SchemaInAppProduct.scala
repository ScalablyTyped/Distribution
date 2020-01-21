package typings.googleapis.v2Mod.androidpublisherV2

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaInAppProduct extends js.Object {
  /**
    * The default language of the localized data, as defined by BCP 47. e.g.
    * &quot;en-US&quot;, &quot;en-GB&quot;.
    */
  var defaultLanguage: js.UndefOr[String] = js.native
  /**
    * Default price cannot be zero. In-app products can never be free. Default
    * price is always in the developer&#39;s Checkout merchant currency.
    */
  var defaultPrice: js.UndefOr[SchemaPrice] = js.native
  /**
    * Grace period of the subscription, specified in ISO 8601 format. It will
    * allow developers to give their subscribers a grace period when the
    * payment for the new recurrence period is declined. Acceptable values =
    * &quot;P3D&quot; (three days) and &quot;P7D&quot; (seven days)
    */
  var gracePeriod: js.UndefOr[String] = js.native
  /**
    * List of localized title and description data.
    */
  var listings: js.UndefOr[StringDictionary[SchemaInAppProductListing]] = js.native
  /**
    * The package name of the parent app.
    */
  var packageName: js.UndefOr[String] = js.native
  /**
    * Prices per buyer region. None of these prices should be zero. In-app
    * products can never be free.
    */
  var prices: js.UndefOr[StringDictionary[SchemaPrice]] = js.native
  /**
    * Purchase type enum value. Unmodifiable after creation.
    */
  var purchaseType: js.UndefOr[String] = js.native
  /**
    * Definition of a season for a seasonal subscription. Can be defined only
    * for yearly subscriptions.
    */
  var season: js.UndefOr[SchemaSeason] = js.native
  /**
    * The stock-keeping-unit (SKU) of the product, unique within an app.
    */
  var sku: js.UndefOr[String] = js.native
  var status: js.UndefOr[String] = js.native
  /**
    * Subscription period, specified in ISO 8601 format. Acceptable values are
    * &quot;P1W&quot; (one week), &quot;P1M&quot; (one month), &quot;P3M&quot;
    * (three months), &quot;P6M&quot; (six months), and &quot;P1Y&quot; (one
    * year).
    */
  var subscriptionPeriod: js.UndefOr[String] = js.native
  /**
    * Trial period, specified in ISO 8601 format. Acceptable values are
    * anything between &quot;P7D&quot; (seven days) and &quot;P999D&quot; (999
    * days). Seasonal subscriptions cannot have a trial period.
    */
  var trialPeriod: js.UndefOr[String] = js.native
}

object SchemaInAppProduct {
  @scala.inline
  def apply(
    defaultLanguage: String = null,
    defaultPrice: SchemaPrice = null,
    gracePeriod: String = null,
    listings: StringDictionary[SchemaInAppProductListing] = null,
    packageName: String = null,
    prices: StringDictionary[SchemaPrice] = null,
    purchaseType: String = null,
    season: SchemaSeason = null,
    sku: String = null,
    status: String = null,
    subscriptionPeriod: String = null,
    trialPeriod: String = null
  ): SchemaInAppProduct = {
    val __obj = js.Dynamic.literal()
    if (defaultLanguage != null) __obj.updateDynamic("defaultLanguage")(defaultLanguage.asInstanceOf[js.Any])
    if (defaultPrice != null) __obj.updateDynamic("defaultPrice")(defaultPrice.asInstanceOf[js.Any])
    if (gracePeriod != null) __obj.updateDynamic("gracePeriod")(gracePeriod.asInstanceOf[js.Any])
    if (listings != null) __obj.updateDynamic("listings")(listings.asInstanceOf[js.Any])
    if (packageName != null) __obj.updateDynamic("packageName")(packageName.asInstanceOf[js.Any])
    if (prices != null) __obj.updateDynamic("prices")(prices.asInstanceOf[js.Any])
    if (purchaseType != null) __obj.updateDynamic("purchaseType")(purchaseType.asInstanceOf[js.Any])
    if (season != null) __obj.updateDynamic("season")(season.asInstanceOf[js.Any])
    if (sku != null) __obj.updateDynamic("sku")(sku.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (subscriptionPeriod != null) __obj.updateDynamic("subscriptionPeriod")(subscriptionPeriod.asInstanceOf[js.Any])
    if (trialPeriod != null) __obj.updateDynamic("trialPeriod")(trialPeriod.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaInAppProduct]
  }
}

