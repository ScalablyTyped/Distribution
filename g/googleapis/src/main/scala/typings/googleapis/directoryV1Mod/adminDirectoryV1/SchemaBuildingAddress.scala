package typings.googleapis.directoryV1Mod.adminDirectoryV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON template for the postal address of a building in Directory API.
  */
@js.native
trait SchemaBuildingAddress extends js.Object {
  /**
    * Unstructured address lines describing the lower levels of an address.
    */
  var addressLines: js.UndefOr[js.Array[String]] = js.native
  /**
    * Optional. Highest administrative subdivision which is used for postal
    * addresses of a country or region.
    */
  var administrativeArea: js.UndefOr[String] = js.native
  /**
    * Optional. BCP-47 language code of the contents of this address (if
    * known).
    */
  var languageCode: js.UndefOr[String] = js.native
  /**
    * Optional. Generally refers to the city/town portion of the address.
    * Examples: US city, IT comune, UK post town. In regions of the world where
    * localities are not well defined or do not fit into this structure well,
    * leave locality empty and use addressLines.
    */
  var locality: js.UndefOr[String] = js.native
  /**
    * Optional. Postal code of the address.
    */
  var postalCode: js.UndefOr[String] = js.native
  /**
    * Required. CLDR region code of the country/region of the address.
    */
  var regionCode: js.UndefOr[String] = js.native
  /**
    * Optional. Sublocality of the address.
    */
  var sublocality: js.UndefOr[String] = js.native
}

object SchemaBuildingAddress {
  @scala.inline
  def apply(
    addressLines: js.Array[String] = null,
    administrativeArea: String = null,
    languageCode: String = null,
    locality: String = null,
    postalCode: String = null,
    regionCode: String = null,
    sublocality: String = null
  ): SchemaBuildingAddress = {
    val __obj = js.Dynamic.literal()
    if (addressLines != null) __obj.updateDynamic("addressLines")(addressLines.asInstanceOf[js.Any])
    if (administrativeArea != null) __obj.updateDynamic("administrativeArea")(administrativeArea.asInstanceOf[js.Any])
    if (languageCode != null) __obj.updateDynamic("languageCode")(languageCode.asInstanceOf[js.Any])
    if (locality != null) __obj.updateDynamic("locality")(locality.asInstanceOf[js.Any])
    if (postalCode != null) __obj.updateDynamic("postalCode")(postalCode.asInstanceOf[js.Any])
    if (regionCode != null) __obj.updateDynamic("regionCode")(regionCode.asInstanceOf[js.Any])
    if (sublocality != null) __obj.updateDynamic("sublocality")(sublocality.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaBuildingAddress]
  }
}

