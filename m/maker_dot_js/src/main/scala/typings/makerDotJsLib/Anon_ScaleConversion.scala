package typings
package makerDotJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ScaleConversion extends js.Object {
  var scaleConversion: scala.Double
  var svgUnitType: java.lang.String
}

object Anon_ScaleConversion {
  @scala.inline
  def apply(scaleConversion: scala.Double, svgUnitType: java.lang.String): Anon_ScaleConversion = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("scaleConversion")(scaleConversion)
    __obj.updateDynamic("svgUnitType")(svgUnitType)
    __obj.asInstanceOf[Anon_ScaleConversion]
  }
}

