package typings.haversine

import typings.haversine.haversineStrings.geojson
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFormatGeojson extends js.Object {
  var format: geojson
}

object AnonFormatGeojson {
  @scala.inline
  def apply(format: geojson): AnonFormatGeojson = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonFormatGeojson]
  }
}

