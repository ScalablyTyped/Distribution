package typings.ionicCore.virtualScrollInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VirtualNode extends js.Object {
  
  var cell: Cell = js.native
  
  var change: NodeChange = js.native
  
  var d: Boolean = js.native
  
  var top: Double = js.native
  
  var visible: Boolean = js.native
}
object VirtualNode {
  
  @scala.inline
  def apply(cell: Cell, change: NodeChange, d: Boolean, top: Double, visible: Boolean): VirtualNode = {
    val __obj = js.Dynamic.literal(cell = cell.asInstanceOf[js.Any], change = change.asInstanceOf[js.Any], d = d.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[VirtualNode]
  }
  
  @scala.inline
  implicit class VirtualNodeOps[Self <: VirtualNode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCell(value: Cell): Self = this.set("cell", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChange(value: NodeChange): Self = this.set("change", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setD(value: Boolean): Self = this.set("d", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTop(value: Double): Self = this.set("top", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
  }
}
