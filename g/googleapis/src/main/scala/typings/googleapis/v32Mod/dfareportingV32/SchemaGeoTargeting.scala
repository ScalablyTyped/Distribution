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
  def apply(): SchemaGeoTargeting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGeoTargeting]
  }
  @scala.inline
  implicit class SchemaGeoTargetingOps[Self <: SchemaGeoTargeting] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCitiesVarargs(value: SchemaCity*): Self = this.set("cities", js.Array(value :_*))
    @scala.inline
    def setCities(value: js.Array[SchemaCity]): Self = this.set("cities", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCities: Self = this.set("cities", js.undefined)
    @scala.inline
    def setCountriesVarargs(value: SchemaCountry*): Self = this.set("countries", js.Array(value :_*))
    @scala.inline
    def setCountries(value: js.Array[SchemaCountry]): Self = this.set("countries", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCountries: Self = this.set("countries", js.undefined)
    @scala.inline
    def setExcludeCountries(value: Boolean): Self = this.set("excludeCountries", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExcludeCountries: Self = this.set("excludeCountries", js.undefined)
    @scala.inline
    def setMetrosVarargs(value: SchemaMetro*): Self = this.set("metros", js.Array(value :_*))
    @scala.inline
    def setMetros(value: js.Array[SchemaMetro]): Self = this.set("metros", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetros: Self = this.set("metros", js.undefined)
    @scala.inline
    def setPostalCodesVarargs(value: SchemaPostalCode*): Self = this.set("postalCodes", js.Array(value :_*))
    @scala.inline
    def setPostalCodes(value: js.Array[SchemaPostalCode]): Self = this.set("postalCodes", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePostalCodes: Self = this.set("postalCodes", js.undefined)
    @scala.inline
    def setRegionsVarargs(value: SchemaRegion*): Self = this.set("regions", js.Array(value :_*))
    @scala.inline
    def setRegions(value: js.Array[SchemaRegion]): Self = this.set("regions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegions: Self = this.set("regions", js.undefined)
  }
  
}

