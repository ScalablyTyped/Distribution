package typings.jupyterlabFileeditor.tabspacestatusMod.TabSpaceStatus

import typings.luminoWidgets.mod.Menu
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options for creating a TabSpace status item.
  */
@js.native
trait IOptions extends js.Object {
  
  /**
    * A menu to open when clicking on the status item. This should allow
    * the user to make a different selection about tabs/spaces.
    */
  var menu: Menu = js.native
}
object IOptions {
  
  @scala.inline
  def apply(menu: Menu): IOptions = {
    val __obj = js.Dynamic.literal(menu = menu.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions]
  }
  
  @scala.inline
  implicit class IOptionsOps[Self <: IOptions] (val x: Self) extends AnyVal {
    
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
    def setMenu(value: Menu): Self = this.set("menu", value.asInstanceOf[js.Any])
  }
}
