package typings.jqueryElang

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// ELangEdit
@js.native
trait IELangEditDelegates extends js.Object {
  
  var btnAddClickHandler: js.Function = js.native
  
  var btnAddHandler: js.Function = js.native
  
  var insertCallback: js.Function = js.native
  
  var insertHandler: js.Function = js.native
  
  var modifyCallback: js.Function = js.native
  
  var modifyHandler: js.Function = js.native
  
  var removeCallback: js.Function = js.native
  
  var removeHandler: js.Function = js.native
  
  var selectCallback: js.Function = js.native
  
  var selectHandler: js.Function = js.native
}
object IELangEditDelegates {
  
  @scala.inline
  def apply(
    btnAddClickHandler: js.Function,
    btnAddHandler: js.Function,
    insertCallback: js.Function,
    insertHandler: js.Function,
    modifyCallback: js.Function,
    modifyHandler: js.Function,
    removeCallback: js.Function,
    removeHandler: js.Function,
    selectCallback: js.Function,
    selectHandler: js.Function
  ): IELangEditDelegates = {
    val __obj = js.Dynamic.literal(btnAddClickHandler = btnAddClickHandler.asInstanceOf[js.Any], btnAddHandler = btnAddHandler.asInstanceOf[js.Any], insertCallback = insertCallback.asInstanceOf[js.Any], insertHandler = insertHandler.asInstanceOf[js.Any], modifyCallback = modifyCallback.asInstanceOf[js.Any], modifyHandler = modifyHandler.asInstanceOf[js.Any], removeCallback = removeCallback.asInstanceOf[js.Any], removeHandler = removeHandler.asInstanceOf[js.Any], selectCallback = selectCallback.asInstanceOf[js.Any], selectHandler = selectHandler.asInstanceOf[js.Any])
    __obj.asInstanceOf[IELangEditDelegates]
  }
  
  @scala.inline
  implicit class IELangEditDelegatesOps[Self <: IELangEditDelegates] (val x: Self) extends AnyVal {
    
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
    def setBtnAddClickHandler(value: js.Function): Self = this.set("btnAddClickHandler", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBtnAddHandler(value: js.Function): Self = this.set("btnAddHandler", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsertCallback(value: js.Function): Self = this.set("insertCallback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsertHandler(value: js.Function): Self = this.set("insertHandler", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModifyCallback(value: js.Function): Self = this.set("modifyCallback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModifyHandler(value: js.Function): Self = this.set("modifyHandler", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveCallback(value: js.Function): Self = this.set("removeCallback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveHandler(value: js.Function): Self = this.set("removeHandler", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectCallback(value: js.Function): Self = this.set("selectCallback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectHandler(value: js.Function): Self = this.set("selectHandler", value.asInstanceOf[js.Any])
  }
}
