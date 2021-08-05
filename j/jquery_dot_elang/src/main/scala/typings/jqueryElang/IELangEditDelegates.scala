package typings.jqueryElang

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// ELangEdit
trait IELangEditDelegates extends StObject {
  
  var btnAddClickHandler: js.Function
  
  var btnAddHandler: js.Function
  
  var insertCallback: js.Function
  
  var insertHandler: js.Function
  
  var modifyCallback: js.Function
  
  var modifyHandler: js.Function
  
  var removeCallback: js.Function
  
  var removeHandler: js.Function
  
  var selectCallback: js.Function
  
  var selectHandler: js.Function
}
object IELangEditDelegates {
  
  inline def apply(
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
  
  extension [Self <: IELangEditDelegates](x: Self) {
    
    inline def setBtnAddClickHandler(value: js.Function): Self = StObject.set(x, "btnAddClickHandler", value.asInstanceOf[js.Any])
    
    inline def setBtnAddHandler(value: js.Function): Self = StObject.set(x, "btnAddHandler", value.asInstanceOf[js.Any])
    
    inline def setInsertCallback(value: js.Function): Self = StObject.set(x, "insertCallback", value.asInstanceOf[js.Any])
    
    inline def setInsertHandler(value: js.Function): Self = StObject.set(x, "insertHandler", value.asInstanceOf[js.Any])
    
    inline def setModifyCallback(value: js.Function): Self = StObject.set(x, "modifyCallback", value.asInstanceOf[js.Any])
    
    inline def setModifyHandler(value: js.Function): Self = StObject.set(x, "modifyHandler", value.asInstanceOf[js.Any])
    
    inline def setRemoveCallback(value: js.Function): Self = StObject.set(x, "removeCallback", value.asInstanceOf[js.Any])
    
    inline def setRemoveHandler(value: js.Function): Self = StObject.set(x, "removeHandler", value.asInstanceOf[js.Any])
    
    inline def setSelectCallback(value: js.Function): Self = StObject.set(x, "selectCallback", value.asInstanceOf[js.Any])
    
    inline def setSelectHandler(value: js.Function): Self = StObject.set(x, "selectHandler", value.asInstanceOf[js.Any])
  }
}
