package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GridColumnCommandItemText extends StObject {
  
  var cancel: js.UndefOr[String] = js.undefined
  
  var edit: js.UndefOr[String] = js.undefined
  
  var update: js.UndefOr[String] = js.undefined
}
object GridColumnCommandItemText {
  
  inline def apply(): GridColumnCommandItemText = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridColumnCommandItemText]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GridColumnCommandItemText] (val x: Self) extends AnyVal {
    
    inline def setCancel(value: String): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
    
    inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
    
    inline def setEdit(value: String): Self = StObject.set(x, "edit", value.asInstanceOf[js.Any])
    
    inline def setEditUndefined: Self = StObject.set(x, "edit", js.undefined)
    
    inline def setUpdate(value: String): Self = StObject.set(x, "update", value.asInstanceOf[js.Any])
    
    inline def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
  }
}
