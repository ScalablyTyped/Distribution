package typings.jqueryElang

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IELangDBDelegates extends StObject {
  
  var insertHandler: js.Function
  
  var modifyHandler: js.Function
  
  var removeHandler: js.Function
  
  var selectHandler: js.Function
}
object IELangDBDelegates {
  
  inline def apply(
    insertHandler: js.Function,
    modifyHandler: js.Function,
    removeHandler: js.Function,
    selectHandler: js.Function
  ): IELangDBDelegates = {
    val __obj = js.Dynamic.literal(insertHandler = insertHandler.asInstanceOf[js.Any], modifyHandler = modifyHandler.asInstanceOf[js.Any], removeHandler = removeHandler.asInstanceOf[js.Any], selectHandler = selectHandler.asInstanceOf[js.Any])
    __obj.asInstanceOf[IELangDBDelegates]
  }
  
  extension [Self <: IELangDBDelegates](x: Self) {
    
    inline def setInsertHandler(value: js.Function): Self = StObject.set(x, "insertHandler", value.asInstanceOf[js.Any])
    
    inline def setModifyHandler(value: js.Function): Self = StObject.set(x, "modifyHandler", value.asInstanceOf[js.Any])
    
    inline def setRemoveHandler(value: js.Function): Self = StObject.set(x, "removeHandler", value.asInstanceOf[js.Any])
    
    inline def setSelectHandler(value: js.Function): Self = StObject.set(x, "selectHandler", value.asInstanceOf[js.Any])
  }
}
