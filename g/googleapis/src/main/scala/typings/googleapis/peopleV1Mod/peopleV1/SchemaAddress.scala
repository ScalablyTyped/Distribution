package typings.googleapis.peopleV1Mod.peopleV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A person&#39;s physical address. May be a P.O. box or street address. All
  * fields are optional.
  */
@js.native
trait SchemaAddress extends js.Object {
  /**
    * The city of the address.
    */
  var city: js.UndefOr[String] = js.native
  /**
    * The country of the address.
    */
  var country: js.UndefOr[String] = js.native
  /**
    * The [ISO 3166-1 alpha-2](http://www.iso.org/iso/country_codes.htm)
    * country code of the address.
    */
  var countryCode: js.UndefOr[String] = js.native
  /**
    * The extended address of the address; for example, the apartment number.
    */
  var extendedAddress: js.UndefOr[String] = js.native
  /**
    * The read-only type of the address translated and formatted in the
    * viewer&#39;s account locale or the `Accept-Language` HTTP header locale.
    */
  var formattedType: js.UndefOr[String] = js.native
  /**
    * The unstructured value of the address. If this is not set by the user it
    * will be automatically constructed from structured values.
    */
  var formattedValue: js.UndefOr[String] = js.native
  /**
    * Metadata about the address.
    */
  var metadata: js.UndefOr[SchemaFieldMetadata] = js.native
  /**
    * The P.O. box of the address.
    */
  var poBox: js.UndefOr[String] = js.native
  /**
    * The postal code of the address.
    */
  var postalCode: js.UndefOr[String] = js.native
  /**
    * The region of the address; for example, the state or province.
    */
  var region: js.UndefOr[String] = js.native
  /**
    * The street address.
    */
  var streetAddress: js.UndefOr[String] = js.native
  /**
    * The type of the address. The type can be custom or one of these
    * predefined values:  * `home` * `work` * `other`
    */
  var `type`: js.UndefOr[String] = js.native
}

object SchemaAddress {
  @scala.inline
  def apply(
    city: String = null,
    country: String = null,
    countryCode: String = null,
    extendedAddress: String = null,
    formattedType: String = null,
    formattedValue: String = null,
    metadata: SchemaFieldMetadata = null,
    poBox: String = null,
    postalCode: String = null,
    region: String = null,
    streetAddress: String = null,
    `type`: String = null
  ): SchemaAddress = {
    val __obj = js.Dynamic.literal()
    if (city != null) __obj.updateDynamic("city")(city.asInstanceOf[js.Any])
    if (country != null) __obj.updateDynamic("country")(country.asInstanceOf[js.Any])
    if (countryCode != null) __obj.updateDynamic("countryCode")(countryCode.asInstanceOf[js.Any])
    if (extendedAddress != null) __obj.updateDynamic("extendedAddress")(extendedAddress.asInstanceOf[js.Any])
    if (formattedType != null) __obj.updateDynamic("formattedType")(formattedType.asInstanceOf[js.Any])
    if (formattedValue != null) __obj.updateDynamic("formattedValue")(formattedValue.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (poBox != null) __obj.updateDynamic("poBox")(poBox.asInstanceOf[js.Any])
    if (postalCode != null) __obj.updateDynamic("postalCode")(postalCode.asInstanceOf[js.Any])
    if (region != null) __obj.updateDynamic("region")(region.asInstanceOf[js.Any])
    if (streetAddress != null) __obj.updateDynamic("streetAddress")(streetAddress.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaAddress]
  }
}

