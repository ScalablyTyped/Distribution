package typings.googleapis.contentV2Mod.contentV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Tax calculation rule to apply in a state or province (USA only).
  */
@js.native
trait SchemaAccountTaxTaxRule extends js.Object {
  /**
    * Country code in which tax is applicable.
    */
  var country: js.UndefOr[String] = js.native
  /**
    * State (or province) is which the tax is applicable, described by its
    * location ID (also called criteria ID).
    */
  var locationId: js.UndefOr[String] = js.native
  /**
    * Explicit tax rate in percent, represented as a floating point number
    * without the percentage character. Must not be negative.
    */
  var ratePercent: js.UndefOr[String] = js.native
  /**
    * If true, shipping charges are also taxed.
    */
  var shippingTaxed: js.UndefOr[Boolean] = js.native
  /**
    * Whether the tax rate is taken from a global tax table or specified
    * explicitly.
    */
  var useGlobalRate: js.UndefOr[Boolean] = js.native
}

object SchemaAccountTaxTaxRule {
  @scala.inline
  def apply(
    country: String = null,
    locationId: String = null,
    ratePercent: String = null,
    shippingTaxed: js.UndefOr[Boolean] = js.undefined,
    useGlobalRate: js.UndefOr[Boolean] = js.undefined
  ): SchemaAccountTaxTaxRule = {
    val __obj = js.Dynamic.literal()
    if (country != null) __obj.updateDynamic("country")(country.asInstanceOf[js.Any])
    if (locationId != null) __obj.updateDynamic("locationId")(locationId.asInstanceOf[js.Any])
    if (ratePercent != null) __obj.updateDynamic("ratePercent")(ratePercent.asInstanceOf[js.Any])
    if (!js.isUndefined(shippingTaxed)) __obj.updateDynamic("shippingTaxed")(shippingTaxed.get.asInstanceOf[js.Any])
    if (!js.isUndefined(useGlobalRate)) __obj.updateDynamic("useGlobalRate")(useGlobalRate.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaAccountTaxTaxRule]
  }
}

