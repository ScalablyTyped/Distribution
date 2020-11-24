package typings.materialMenu.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MENUSELECTEDLISTITEM extends js.Object {
  
  var MENU_SELECTED_LIST_ITEM: String = js.native
  
  var MENU_SELECTION_GROUP: String = js.native
  
  var ROOT: String = js.native
}
object MENUSELECTEDLISTITEM {
  
  @scala.inline
  def apply(MENU_SELECTED_LIST_ITEM: String, MENU_SELECTION_GROUP: String, ROOT: String): MENUSELECTEDLISTITEM = {
    val __obj = js.Dynamic.literal(MENU_SELECTED_LIST_ITEM = MENU_SELECTED_LIST_ITEM.asInstanceOf[js.Any], MENU_SELECTION_GROUP = MENU_SELECTION_GROUP.asInstanceOf[js.Any], ROOT = ROOT.asInstanceOf[js.Any])
    __obj.asInstanceOf[MENUSELECTEDLISTITEM]
  }
  
  @scala.inline
  implicit class MENUSELECTEDLISTITEMOps[Self <: MENUSELECTEDLISTITEM] (val x: Self) extends AnyVal {
    
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
    def setMENU_SELECTED_LIST_ITEM(value: String): Self = this.set("MENU_SELECTED_LIST_ITEM", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMENU_SELECTION_GROUP(value: String): Self = this.set("MENU_SELECTION_GROUP", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setROOT(value: String): Self = this.set("ROOT", value.asInstanceOf[js.Any])
  }
}
