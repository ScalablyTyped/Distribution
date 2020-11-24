package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContextMenuOpeningEventUIParam extends js.Object {
  
  /**
    * Get the [area](ig.spreadsheet.SpreadsheetContextMenuArea) for which the menu is being displayed.
    */
  var menuArea: js.UndefOr[String] = js.native
  
  /**
    * Gets a reference to the spreadsheet widget.
    */
  var owner: js.UndefOr[js.Any] = js.native
}
object ContextMenuOpeningEventUIParam {
  
  @scala.inline
  def apply(): ContextMenuOpeningEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContextMenuOpeningEventUIParam]
  }
  
  @scala.inline
  implicit class ContextMenuOpeningEventUIParamOps[Self <: ContextMenuOpeningEventUIParam] (val x: Self) extends AnyVal {
    
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
    def setMenuArea(value: String): Self = this.set("menuArea", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMenuArea: Self = this.set("menuArea", js.undefined)
    
    @scala.inline
    def setOwner(value: js.Any): Self = this.set("owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOwner: Self = this.set("owner", js.undefined)
  }
}
