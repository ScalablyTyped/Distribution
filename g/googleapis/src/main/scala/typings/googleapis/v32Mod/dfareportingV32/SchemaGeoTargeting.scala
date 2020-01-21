package typings.googleapis.v32Mod.dfareportingV32

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Geographical Targeting.
  */
@js.native
trait SchemaGeoTargeting extends js.Object {
  /**
    * Cities to be targeted. For each city only dartId is required. The other
    * fields are populated automatically when the ad is inserted or updated. If
    * targeting a city, do not target or exclude the country of the city, and
    * do not target the metro or region of the city.
    */
  var cities: js.UndefOr[js.Array[SchemaCity]] = js.native
  /**
    * Countries to be targeted or excluded from targeting, depending on the
    * setting of the excludeCountries field. For each country only dartId is
    * required. The other fields are populated automatically when the ad is
    * inserted or updated. If targeting or excluding a country, do not target
    * regions, cities, metros, or postal codes in the same country.
    */
  var countries: js.UndefOr[js.Array[SchemaCountry]] = js.native
  /**
    * Whether or not to exclude the countries in the countries field from
    * targeting. If false, the countries field refers to countries which will
    * be targeted by the ad.
    */
  var excludeCountries: js.UndefOr[Boolean] = js.native
  /**
    * Metros to be targeted. For each metro only dmaId is required. The other
    * fields are populated automatically when the ad is inserted or updated. If
    * targeting a metro, do not target or exclude the country of the metro.
    */
  var metros: js.UndefOr[js.Array[SchemaMetro]] = js.native
  /**
    * Postal codes to be targeted. For each postal code only id is required.
    * The other fields are populated automatically when the ad is inserted or
    * updated. If targeting a postal code, do not target or exclude the country
    * of the postal code.
    */
  var postalCodes: js.UndefOr[js.Array[SchemaPostalCode]] = js.native
  /**
    * Regions to be targeted. For each region only dartId is required. The
    * other fields are populated automatically when the ad is inserted or
    * updated. If targeting a region, do not target or exclude the country of
    * the region.
    */
  var regions: js.UndefOr[js.Array[SchemaRegion]] = js.native
}

object SchemaGeoTargeting {
  @scala.inline
  def apply(
    cities: js.Array[SchemaCity] = null,
    countries: js.Array[SchemaCountry] = null,
    excludeCountries: js.UndefOr[Boolean] = js.undefined,
    metros: js.Array[SchemaMetro] = null,
    postalCodes: js.Array[SchemaPostalCode] = null,
    regions: js.Array[SchemaRegion] = null
  ): SchemaGeoTargeting = {
    val __obj = js.Dynamic.literal()
    if (cities != null) __obj.updateDynamic("cities")(cities.asInstanceOf[js.Any])
    if (countries != null) __obj.updateDynamic("countries")(countries.asInstanceOf[js.Any])
    if (!js.isUndefined(excludeCountries)) __obj.updateDynamic("excludeCountries")(excludeCountries.asInstanceOf[js.Any])
    if (metros != null) __obj.updateDynamic("metros")(metros.asInstanceOf[js.Any])
    if (postalCodes != null) __obj.updateDynamic("postalCodes")(postalCodes.asInstanceOf[js.Any])
    if (regions != null) __obj.updateDynamic("regions")(regions.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGeoTargeting]
  }
}

