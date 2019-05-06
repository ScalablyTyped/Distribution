package typings
package atIonicCoreLib.distTypesComponentsVirtualDashScrollVirtualDashScrollDashInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cell extends js.Object {
  var height: scala.Double
  var i: scala.Double
  var index: scala.Double
  var reads: scala.Double
  var `type`: CellType
  var value: js.Any
  var visible: scala.Boolean
}

object Cell {
  @scala.inline
  def apply(
    height: scala.Double,
    i: scala.Double,
    index: scala.Double,
    reads: scala.Double,
    `type`: CellType,
    value: js.Any,
    visible: scala.Boolean
  ): Cell = {
    val __obj = js.Dynamic.literal(height = height, i = i, index = index, reads = reads, value = value, visible = visible)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Cell]
  }
}

