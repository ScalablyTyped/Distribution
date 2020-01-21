package typings.materialUiCore.colorManipulatorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColorObject extends js.Object {
  var `type`: ColorFormat = js.native
  var values: (js.Tuple3[Double, Double, Double]) | (js.Tuple4[Double, Double, Double, Double]) = js.native
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

