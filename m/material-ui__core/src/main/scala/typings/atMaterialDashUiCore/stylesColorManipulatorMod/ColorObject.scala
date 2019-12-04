package typings.atMaterialDashUiCore.stylesColorManipulatorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColorObject extends js.Object {
  var `type`: ColorFormat
  var values: (js.Tuple3[Double, Double, Double]) | (js.Tuple4[Double, Double, Double, Double])
}

object ColorObject {
  @scala.inline
  def apply(
    `type`: ColorFormat,
    values: (js.Tuple3[Double, Double, Double]) | (js.Tuple4[Double, Double, Double, Double])
  ): ColorObject = {
    val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorObject]
  }
}

