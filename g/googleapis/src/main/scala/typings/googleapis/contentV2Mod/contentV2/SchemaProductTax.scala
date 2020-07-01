package typings.googleapis.contentV2Mod.contentV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaProductTax extends js.Object {
  /**
    * The country within which the item is taxed, specified as a CLDR territory
    * code.
    */
  var country: js.UndefOr[String] = js.native
  /**
    * The numeric ID of a location that the tax rate applies to as defined in
    * the AdWords API.
    */
  var locationId: js.UndefOr[String] = js.native
  /**
    * The postal code range that the tax rate applies to, represented by a ZIP
    * code, a ZIP code prefix using * wildcard, a range between two ZIP codes
    * or two ZIP code prefixes of equal length. Examples: 94114, 94*,
    * 94002-95460, 94*-95*.
    */
  var postalCode: js.UndefOr[String] = js.native
  /**
    * The percentage of tax rate that applies to the item price.
    */
  var rate: js.UndefOr[Double] = js.native
  /**
    * The geographic region to which the tax rate applies.
    */
  var region: js.UndefOr[String] = js.native
  /**
    * Set to true if tax is charged on shipping.
    */
  var taxShip: js.UndefOr[Boolean] = js.native
}

object SchemaProductTax {
  @scala.inline
  def apply(
    country: String = null,
    locationId: String = null,
    postalCode: String = null,
    rate: js.UndefOr[Double] = js.undefined,
    region: String = null,
    taxShip: js.UndefOr[Boolean] = js.undefined
  ): SchemaProductTax = {
    val __obj = js.Dynamic.literal()
    if (country != null) __obj.updateDynamic("country")(country.asInstanceOf[js.Any])
    if (locationId != null) __obj.updateDynamic("locationId")(locationId.asInstanceOf[js.Any])
    if (postalCode != null) __obj.updateDynamic("postalCode")(postalCode.asInstanceOf[js.Any])
    if (!js.isUndefined(rate)) __obj.updateDynamic("rate")(rate.get.asInstanceOf[js.Any])
    if (region != null) __obj.updateDynamic("region")(region.asInstanceOf[js.Any])
    if (!js.isUndefined(taxShip)) __obj.updateDynamic("taxShip")(taxShip.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaProductTax]
  }
}

