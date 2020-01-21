package typings.googleapis.directoryV1Mod.adminDirectoryV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON template for address.
  */
@js.native
trait SchemaUserAddress extends js.Object {
  /**
    * Country.
    */
  var country: js.UndefOr[String] = js.native
  /**
    * Country code.
    */
  var countryCode: js.UndefOr[String] = js.native
  /**
    * Custom type.
    */
  var customType: js.UndefOr[String] = js.native
  /**
    * Extended Address.
    */
  var extendedAddress: js.UndefOr[String] = js.native
  /**
    * Formatted address.
    */
  var formatted: js.UndefOr[String] = js.native
  /**
    * Locality.
    */
  var locality: js.UndefOr[String] = js.native
  /**
    * Other parts of address.
    */
  var poBox: js.UndefOr[String] = js.native
  /**
    * Postal code.
    */
  var postalCode: js.UndefOr[String] = js.native
  /**
    * If this is user&#39;s primary address. Only one entry could be marked as
    * primary.
    */
  var primary: js.UndefOr[Boolean] = js.native
  /**
    * Region.
    */
  var region: js.UndefOr[String] = js.native
  /**
    * User supplied address was structured. Structured addresses are NOT
    * supported at this time. You might be able to write structured addresses,
    * but any values will eventually be clobbered.
    */
  var sourceIsStructured: js.UndefOr[Boolean] = js.native
  /**
    * Street.
    */
  var streetAddress: js.UndefOr[String] = js.native
  /**
    * Each entry can have a type which indicates standard values of that entry.
    * For example address could be of home, work etc. In addition to the
    * standard type, an entry can have a custom type and can take any value.
    * Such type should have the CUSTOM value as type and also have a customType
    * value.
    */
  var `type`: js.UndefOr[String] = js.native
}

object SchemaUserAddress {
  @scala.inline
  def apply(
    country: String = null,
    countryCode: String = null,
    customType: String = null,
    extendedAddress: String = null,
    formatted: String = null,
    locality: String = null,
    poBox: String = null,
    postalCode: String = null,
    primary: js.UndefOr[Boolean] = js.undefined,
    region: String = null,
    sourceIsStructured: js.UndefOr[Boolean] = js.undefined,
    streetAddress: String = null,
    `type`: String = null
  ): SchemaUserAddress = {
    val __obj = js.Dynamic.literal()
    if (country != null) __obj.updateDynamic("country")(country.asInstanceOf[js.Any])
    if (countryCode != null) __obj.updateDynamic("countryCode")(countryCode.asInstanceOf[js.Any])
    if (customType != null) __obj.updateDynamic("customType")(customType.asInstanceOf[js.Any])
    if (extendedAddress != null) __obj.updateDynamic("extendedAddress")(extendedAddress.asInstanceOf[js.Any])
    if (formatted != null) __obj.updateDynamic("formatted")(formatted.asInstanceOf[js.Any])
    if (locality != null) __obj.updateDynamic("locality")(locality.asInstanceOf[js.Any])
    if (poBox != null) __obj.updateDynamic("poBox")(poBox.asInstanceOf[js.Any])
    if (postalCode != null) __obj.updateDynamic("postalCode")(postalCode.asInstanceOf[js.Any])
    if (!js.isUndefined(primary)) __obj.updateDynamic("primary")(primary.asInstanceOf[js.Any])
    if (region != null) __obj.updateDynamic("region")(region.asInstanceOf[js.Any])
    if (!js.isUndefined(sourceIsStructured)) __obj.updateDynamic("sourceIsStructured")(sourceIsStructured.asInstanceOf[js.Any])
    if (streetAddress != null) __obj.updateDynamic("streetAddress")(streetAddress.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaUserAddress]
  }
}

