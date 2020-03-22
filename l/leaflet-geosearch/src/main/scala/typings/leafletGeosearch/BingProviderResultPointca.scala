package typings.leafletGeosearch

import typings.leafletGeosearch.mod.PointTuple
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined leaflet-geosearch.leaflet-geosearch.BingProviderResultPoint & {  calculationMethod  :string,   usageTypes  :std.Array<string>} */
trait BingProviderResultPointca extends js.Object {
  var calculationMethod: String
  var coordinates: PointTuple
  var `type`: String
  var usageTypes: js.Array[String]
}

object BingProviderResultPointca {
  @scala.inline
  def apply(calculationMethod: String, coordinates: PointTuple, `type`: String, usageTypes: js.Array[String]): BingProviderResultPointca = {
    val __obj = js.Dynamic.literal(calculationMethod = calculationMethod.asInstanceOf[js.Any], coordinates = coordinates.asInstanceOf[js.Any], usageTypes = usageTypes.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BingProviderResultPointca]
  }
}

