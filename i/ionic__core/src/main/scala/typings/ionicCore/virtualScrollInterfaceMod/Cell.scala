package typings.ionicCore.virtualScrollInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cell extends js.Object {
  var height: Double
  var i: Double
  var index: Double
  var reads: Double
  var `type`: CellType
  var value: js.Any
  var visible: Boolean
}

object Cell {
  @scala.inline
  def apply(
    height: Double,
    i: Double,
    index: Double,
    reads: Double,
    `type`: CellType,
    value: js.Any,
    visible: Boolean
  ): Cell = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], i = i.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], reads = reads.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cell]
  }
}

