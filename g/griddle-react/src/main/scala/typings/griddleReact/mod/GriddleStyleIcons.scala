package typings.griddleReact.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GriddleStyleIcons extends js.Object {
  
  var sortAscendingIcon: js.UndefOr[js.Any] = js.native
  
  var sortDescendingIcon: js.UndefOr[js.Any] = js.native
}
object GriddleStyleIcons {
  
  @scala.inline
  def apply(): GriddleStyleIcons = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GriddleStyleIcons]
  }
  
  @scala.inline
  implicit class GriddleStyleIconsOps[Self <: GriddleStyleIcons] (val x: Self) extends AnyVal {
    
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
    def setSortAscendingIcon(value: js.Any): Self = this.set("sortAscendingIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSortAscendingIcon: Self = this.set("sortAscendingIcon", js.undefined)
    
    @scala.inline
    def setSortDescendingIcon(value: js.Any): Self = this.set("sortDescendingIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSortDescendingIcon: Self = this.set("sortDescendingIcon", js.undefined)
  }
}
