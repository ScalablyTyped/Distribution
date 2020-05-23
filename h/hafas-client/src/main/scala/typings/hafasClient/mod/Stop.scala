package typings.hafasClient.mod

import typings.hafasClient.hafasClientStrings.stop
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Stop extends js.Object {
  var id: String
  var isMeta: js.UndefOr[Boolean] = js.undefined
  var location: js.UndefOr[Location] = js.undefined
  var name: String
  var products: Products
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
    isMeta: js.UndefOr[Boolean] = js.undefined,
    location: Location = null,
    station: Station = null
  ): Stop = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], products = products.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(isMeta)) __obj.updateDynamic("isMeta")(isMeta.get.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (station != null) __obj.updateDynamic("station")(station.asInstanceOf[js.Any])
    __obj.asInstanceOf[Stop]
  }
}

