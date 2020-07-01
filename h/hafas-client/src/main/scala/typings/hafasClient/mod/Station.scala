package typings.hafasClient.mod

import typings.hafasClient.hafasClientStrings.station
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A station is a larger building or area that can be identified by a name.
  * It is usually represented by a single node on a public transport map.
  * Whereas a stop usually specifies a location, a station often is a broader area
  * that may span across multiple levels or buildings.
  */
trait Station extends js.Object {
  var facilities: js.UndefOr[Facilities] = js.undefined
  var id: String
  var isMeta: js.UndefOr[Boolean] = js.undefined
  var location: js.UndefOr[Location] = js.undefined
  var name: String
  var products: js.UndefOr[Products] = js.undefined
  /** region ids */
  var regions: js.UndefOr[js.Array[String]] = js.undefined
  var reisezentrumOpeningHours: js.UndefOr[ReisezentrumOpeningHours] = js.undefined
  var station: js.UndefOr[Station] = js.undefined
  var `type`: station
}

object Station {
  @scala.inline
  def apply(
    id: String,
    name: String,
    `type`: station,
    facilities: Facilities = null,
    isMeta: js.UndefOr[Boolean] = js.undefined,
    location: Location = null,
    products: Products = null,
    regions: js.Array[String] = null,
    reisezentrumOpeningHours: ReisezentrumOpeningHours = null,
    station: Station = null
  ): Station = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (facilities != null) __obj.updateDynamic("facilities")(facilities.asInstanceOf[js.Any])
    if (!js.isUndefined(isMeta)) __obj.updateDynamic("isMeta")(isMeta.get.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (products != null) __obj.updateDynamic("products")(products.asInstanceOf[js.Any])
    if (regions != null) __obj.updateDynamic("regions")(regions.asInstanceOf[js.Any])
    if (reisezentrumOpeningHours != null) __obj.updateDynamic("reisezentrumOpeningHours")(reisezentrumOpeningHours.asInstanceOf[js.Any])
    if (station != null) __obj.updateDynamic("station")(station.asInstanceOf[js.Any])
    __obj.asInstanceOf[Station]
  }
}

