package typings.ionicCore.headerUtilsMod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HeaderIndex extends js.Object {
  
  var el: HTMLElement = js.native
  
  var toolbars: js.Array[js.Any | ToolbarIndex] = js.native
}
object HeaderIndex {
  
  @scala.inline
  def apply(el: HTMLElement, toolbars: js.Array[js.Any | ToolbarIndex]): HeaderIndex = {
    val __obj = js.Dynamic.literal(el = el.asInstanceOf[js.Any], toolbars = toolbars.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeaderIndex]
  }
  
  @scala.inline
  implicit class HeaderIndexOps[Self <: HeaderIndex] (val x: Self) extends AnyVal {
    
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
    def setEl(value: HTMLElement): Self = this.set("el", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToolbarsVarargs(value: (js.Any | ToolbarIndex)*): Self = this.set("toolbars", js.Array(value :_*))
    
    @scala.inline
    def setToolbars(value: js.Array[js.Any | ToolbarIndex]): Self = this.set("toolbars", value.asInstanceOf[js.Any])
  }
}
