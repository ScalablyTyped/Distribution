package typings.leafletDashGeosearch.leafletDashGeosearchMod

import typings.leafletDashGeosearch.Anon_AdminDistrict
import typings.leafletDashGeosearch.Anon_CalculationMethod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BingProviderResultRaw extends js.Object {
  var __type: String
  var address: Anon_AdminDistrict
  var bbox: js.Tuple4[Double, Double, Double, Double]
  var confidence: String
  var entityType: String
  var geocodePoints: js.Array[BingProviderResultPoint with Anon_CalculationMethod]
  var matchCodes: js.Array[String]
  var name: String
  var point: BingProviderResultPoint
}

object BingProviderResultRaw {
  @scala.inline
  def apply(
    __type: String,
    address: Anon_AdminDistrict,
    bbox: js.Tuple4[Double, Double, Double, Double],
    confidence: String,
    entityType: String,
    geocodePoints: js.Array[BingProviderResultPoint with Anon_CalculationMethod],
    matchCodes: js.Array[String],
    name: String,
    point: BingProviderResultPoint
  ): BingProviderResultRaw = {
    val __obj = js.Dynamic.literal(__type = __type.asInstanceOf[js.Any], address = address.asInstanceOf[js.Any], bbox = bbox.asInstanceOf[js.Any], confidence = confidence.asInstanceOf[js.Any], entityType = entityType.asInstanceOf[js.Any], geocodePoints = geocodePoints.asInstanceOf[js.Any], matchCodes = matchCodes.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], point = point.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BingProviderResultRaw]
  }
}

