package typings
package gradientDashStringLib.gradientDashStringMod.gradientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PositionedColorInput extends js.Object {
  var color: tinycolor2Lib.tinycolor2Mod.tinycolorNs.ColorInput
  var pos: scala.Double
}

object PositionedColorInput {
  @scala.inline
  def apply(color: tinycolor2Lib.tinycolor2Mod.tinycolorNs.ColorInput, pos: scala.Double): PositionedColorInput = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], pos = pos)
  
    __obj.asInstanceOf[PositionedColorInput]
  }
}

