package typings.gridstack.typesMod

import typings.gridstack.mod.GridStack
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GridStackNode extends GridStackWidget {
  
  /** pointer back to HTML element */
  var el: js.UndefOr[GridItemHTMLElement] = js.native
  
  /** pointer back to Grid instance */
  var grid: js.UndefOr[GridStack] = js.native
}
object GridStackNode {
  
  @scala.inline
  def apply(): GridStackNode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridStackNode]
  }
  
  @scala.inline
  implicit class GridStackNodeOps[Self <: GridStackNode] (val x: Self) extends AnyVal {
    
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
    def setEl(value: GridItemHTMLElement): Self = this.set("el", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEl: Self = this.set("el", js.undefined)
    
    @scala.inline
    def setGrid(value: GridStack): Self = this.set("grid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGrid: Self = this.set("grid", js.undefined)
  }
}
