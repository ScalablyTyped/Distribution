package typings.atIonicCore.distTypesComponentsVirtualDashScrollVirtualDashScrollDashInterfaceMod

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
    val __obj = js.Dynamic.literal(height = height, i = i, index = index, reads = reads, value = value, visible = visible)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Cell]
  }
}

