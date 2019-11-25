package typings.atIonicCore.distTypesComponentsVirtualDashScrollVirtualDashScrollDashInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VirtualNode extends js.Object {
  var cell: Cell
  var change: NodeChange
  var d: Boolean
  var top: Double
  var visible: Boolean
}

object VirtualNode {
  @scala.inline
  def apply(cell: Cell, change: NodeChange, d: Boolean, top: Double, visible: Boolean): VirtualNode = {
    val __obj = js.Dynamic.literal(cell = cell.asInstanceOf[js.Any], change = change.asInstanceOf[js.Any], d = d.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[VirtualNode]
  }
}

