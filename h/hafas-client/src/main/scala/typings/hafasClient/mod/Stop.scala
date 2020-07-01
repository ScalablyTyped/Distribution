package typings.hafasClient.mod

import typings.hafasClient.hafasClientStrings.stop
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A stop is a single small point or structure at which vehicles stop.
  * A stop always belongs to a station. It may for example be a sign, a basic shelter or a railway platform.
  */
trait Stop extends js.Object {
  var id: String
  var ids: js.UndefOr[Ids] = js.undefined
  var isMeta: js.UndefOr[Boolean] = js.undefined
  var lines: js.UndefOr[js.Array[Line]] = js.undefined
  var loadFactor: js.UndefOr[String] = js.undefined
  var location: js.UndefOr[Location] = js.undefined
  var name: String
  var products: Products
  var reisezentrumOpeningHours: js.UndefOr[ReisezentrumOpeningHours] = js.undefined
  var station: js.UndefOr[Station] = js.undefined
  var `type`: stop
}

object Stop {
  @scala.inline
  def apply(
    id: String,
    name: String,
    products: Products,
    `type`: stop,
    ids: Ids = null,
    isMeta: js.UndefOr[Boolean] = js.undefined,
    lines: js.Array[Line] = null,
    loadFactor: String = null,
    location: Location = null,
    reisezentrumOpeningHours: ReisezentrumOpeningHours = null,
    station: Station = null
  ): Stop = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], products = products.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (ids != null) __obj.updateDynamic("ids")(ids.asInstanceOf[js.Any])
    if (!js.isUndefined(isMeta)) __obj.updateDynamic("isMeta")(isMeta.get.asInstanceOf[js.Any])
    if (lines != null) __obj.updateDynamic("lines")(lines.asInstanceOf[js.Any])
    if (loadFactor != null) __obj.updateDynamic("loadFactor")(loadFactor.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (reisezentrumOpeningHours != null) __obj.updateDynamic("reisezentrumOpeningHours")(reisezentrumOpeningHours.asInstanceOf[js.Any])
    if (station != null) __obj.updateDynamic("station")(station.asInstanceOf[js.Any])
    __obj.asInstanceOf[Stop]
  }
}

