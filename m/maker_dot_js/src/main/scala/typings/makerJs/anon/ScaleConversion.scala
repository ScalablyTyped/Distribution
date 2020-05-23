package typings.makerJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScaleConversion extends js.Object {
  var scaleConversion: Double
  var svgUnitType: String
}

object ScaleConversion {
  @scala.inline
  def apply(scaleConversion: Double, svgUnitType: String): ScaleConversion = {
    val __obj = js.Dynamic.literal(scaleConversion = scaleConversion.asInstanceOf[js.Any], svgUnitType = svgUnitType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScaleConversion]
  }
}

