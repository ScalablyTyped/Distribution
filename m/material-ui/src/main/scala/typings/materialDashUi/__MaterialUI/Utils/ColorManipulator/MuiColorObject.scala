package typings.materialDashUi.__MaterialUI.Utils.ColorManipulator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MuiColorObject extends js.Object {
  var `type`: String
  var values: js.Array[Double]
}

object MuiColorObject {
  @scala.inline
  def apply(`type`: String, values: js.Array[Double]): MuiColorObject = {
    val __obj = js.Dynamic.literal(values = values)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[MuiColorObject]
  }
}

