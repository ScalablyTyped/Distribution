package typings.leafletUtm.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Band extends js.Object {
  var band: String
  var southHemi: Boolean
  var x: Double
  var y: Double
  var zone: Double
}

object Band {
  @scala.inline
  def apply(band: String, southHemi: Boolean, x: Double, y: Double, zone: Double): Band = {
    val __obj = js.Dynamic.literal(band = band.asInstanceOf[js.Any], southHemi = southHemi.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], zone = zone.asInstanceOf[js.Any])
    __obj.asInstanceOf[Band]
  }
}

