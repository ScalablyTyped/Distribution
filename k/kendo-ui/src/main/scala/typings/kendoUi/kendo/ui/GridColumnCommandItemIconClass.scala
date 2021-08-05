package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GridColumnCommandItemIconClass extends StObject {
  
  var cancel: js.UndefOr[String] = js.undefined
  
  var edit: js.UndefOr[String] = js.undefined
  
  var update: js.UndefOr[String] = js.undefined
}
object GridColumnCommandItemIconClass {
  
  inline def apply(): GridColumnCommandItemIconClass = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridColumnCommandItemIconClass]
  }
  
  extension [Self <: GridColumnCommandItemIconClass](x: Self) {
    
    inline def setCancel(value: String): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
    
    inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
    
    inline def setEdit(value: String): Self = StObject.set(x, "edit", value.asInstanceOf[js.Any])
    
    inline def setEditUndefined: Self = StObject.set(x, "edit", js.undefined)
    
    inline def setUpdate(value: String): Self = StObject.set(x, "update", value.asInstanceOf[js.Any])
    
    inline def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
  }
}
