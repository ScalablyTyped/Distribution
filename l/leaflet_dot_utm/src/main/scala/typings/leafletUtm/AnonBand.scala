package typings.leafletUtm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBand extends js.Object {
  var band: String
  var southHemi: Boolean
  var x: Double
  var y: Double
  var zone: Double
}

object AnonBand {
  @scala.inline
  def apply(band: String, southHemi: Boolean, x: Double, y: Double, zone: Double): AnonBand = {
    val __obj = js.Dynamic.literal(band = band.asInstanceOf[js.Any], southHemi = southHemi.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], zone = zone.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonBand]
  }
}

