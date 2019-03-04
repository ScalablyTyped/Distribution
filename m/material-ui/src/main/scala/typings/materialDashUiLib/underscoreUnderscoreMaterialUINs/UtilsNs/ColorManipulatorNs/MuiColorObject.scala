package typings
package materialDashUiLib.underscoreUnderscoreMaterialUINs.UtilsNs.ColorManipulatorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MuiColorObject extends js.Object {
  var `type`: java.lang.String
  var values: js.Array[scala.Double]
}

object MuiColorObject {
  @scala.inline
  def apply(`type`: java.lang.String, values: js.Array[scala.Double]): MuiColorObject = {
    val __obj = js.Dynamic.literal(values = values)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[MuiColorObject]
  }
}

