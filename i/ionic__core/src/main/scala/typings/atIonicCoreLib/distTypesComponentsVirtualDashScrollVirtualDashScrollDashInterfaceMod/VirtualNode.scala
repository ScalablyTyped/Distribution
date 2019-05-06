package typings
package atIonicCoreLib.distTypesComponentsVirtualDashScrollVirtualDashScrollDashInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VirtualNode extends js.Object {
  var cell: Cell
  var change: NodeChange
  var d: scala.Boolean
  var top: scala.Double
  var visible: scala.Boolean
}

object VirtualNode {
  @scala.inline
  def apply(cell: Cell, change: NodeChange, d: scala.Boolean, top: scala.Double, visible: scala.Boolean): VirtualNode = {
    val __obj = js.Dynamic.literal(cell = cell, change = change, d = d, top = top, visible = visible)
  
    __obj.asInstanceOf[VirtualNode]
  }
}

