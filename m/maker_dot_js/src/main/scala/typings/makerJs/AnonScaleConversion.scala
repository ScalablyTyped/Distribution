package typings.makerJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonScaleConversion extends js.Object {
  var scaleConversion: Double
  var svgUnitType: String
}

object AnonScaleConversion {
  @scala.inline
  def apply(scaleConversion: Double, svgUnitType: String): AnonScaleConversion = {
    val __obj = js.Dynamic.literal(scaleConversion = scaleConversion.asInstanceOf[js.Any], svgUnitType = svgUnitType.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonScaleConversion]
  }
}

