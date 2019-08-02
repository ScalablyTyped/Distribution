package typings.atMapboxMapboxDashSdk.servicesGeocodingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BoundingBox extends js.Object {
  var maxLatitude: Double
  var maxLongitude: Double
  var minLatitude: Double
  var minLongitude: Double
}

object BoundingBox {
  @scala.inline
  def apply(maxLatitude: Double, maxLongitude: Double, minLatitude: Double, minLongitude: Double): BoundingBox = {
    val __obj = js.Dynamic.literal(maxLatitude = maxLatitude, maxLongitude = maxLongitude, minLatitude = minLatitude, minLongitude = minLongitude)
  
    __obj.asInstanceOf[BoundingBox]
  }
}

