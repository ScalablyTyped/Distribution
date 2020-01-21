package typings.googleapis.v33Mod.dfareportingV33

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains information about a city that can be targeted by ads.
  */
@js.native
trait SchemaCity extends js.Object {
  /**
    * Country code of the country to which this city belongs.
    */
  var countryCode: js.UndefOr[String] = js.native
  /**
    * DART ID of the country to which this city belongs.
    */
  var countryDartId: js.UndefOr[String] = js.native
  /**
    * DART ID of this city. This is the ID used for targeting and generating
    * reports.
    */
  var dartId: js.UndefOr[String] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#city&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Metro region code of the metro region (DMA) to which this city belongs.
    */
  var metroCode: js.UndefOr[String] = js.native
  /**
    * ID of the metro region (DMA) to which this city belongs.
    */
  var metroDmaId: js.UndefOr[String] = js.native
  /**
    * Name of this city.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Region code of the region to which this city belongs.
    */
  var regionCode: js.UndefOr[String] = js.native
  /**
    * DART ID of the region to which this city belongs.
    */
  var regionDartId: js.UndefOr[String] = js.native
}

object SchemaCity {
  @scala.inline
  def apply(
    countryCode: String = null,
    countryDartId: String = null,
    dartId: String = null,
    kind: String = null,
    metroCode: String = null,
    metroDmaId: String = null,
    name: String = null,
    regionCode: String = null,
    regionDartId: String = null
  ): SchemaCity = {
    val __obj = js.Dynamic.literal()
    if (countryCode != null) __obj.updateDynamic("countryCode")(countryCode.asInstanceOf[js.Any])
    if (countryDartId != null) __obj.updateDynamic("countryDartId")(countryDartId.asInstanceOf[js.Any])
    if (dartId != null) __obj.updateDynamic("dartId")(dartId.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (metroCode != null) __obj.updateDynamic("metroCode")(metroCode.asInstanceOf[js.Any])
    if (metroDmaId != null) __obj.updateDynamic("metroDmaId")(metroDmaId.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (regionCode != null) __obj.updateDynamic("regionCode")(regionCode.asInstanceOf[js.Any])
    if (regionDartId != null) __obj.updateDynamic("regionDartId")(regionDartId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaCity]
  }
}

