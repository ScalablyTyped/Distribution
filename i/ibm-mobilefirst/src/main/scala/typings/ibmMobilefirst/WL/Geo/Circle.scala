package typings.ibmMobilefirst.WL.Geo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Circle extends Coordinate {
  var radius: Double
}

object Circle {
  @scala.inline
  def apply(latitute: Double, longitude: Double, radius: Double): Circle = {
    val __obj = js.Dynamic.literal(latitute = latitute.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any], radius = radius.asInstanceOf[js.Any])
    __obj.asInstanceOf[Circle]
  }
}

