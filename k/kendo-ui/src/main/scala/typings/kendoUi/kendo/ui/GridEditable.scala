package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GridEditable extends StObject {
  
  var cancelDelete: js.UndefOr[String] = js.undefined
  
  var confirmDelete: js.UndefOr[String] = js.undefined
  
  var confirmation: js.UndefOr[Boolean | String | js.Function] = js.undefined
  
  var createAt: js.UndefOr[String] = js.undefined
  
  var destroy: js.UndefOr[Boolean] = js.undefined
  
  var mode: js.UndefOr[String] = js.undefined
  
  var template: js.UndefOr[String | js.Function] = js.undefined
  
  var update: js.UndefOr[Boolean] = js.undefined
  
  var window: js.UndefOr[js.Any] = js.undefined
}
object GridEditable {
  
  inline def apply(): GridEditable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridEditable]
  }
  
  extension [Self <: GridEditable](x: Self) {
    
    inline def setCancelDelete(value: String): Self = StObject.set(x, "cancelDelete", value.asInstanceOf[js.Any])
    
    inline def setCancelDeleteUndefined: Self = StObject.set(x, "cancelDelete", js.undefined)
    
    inline def setConfirmDelete(value: String): Self = StObject.set(x, "confirmDelete", value.asInstanceOf[js.Any])
    
    inline def setConfirmDeleteUndefined: Self = StObject.set(x, "confirmDelete", js.undefined)
    
    inline def setConfirmation(value: Boolean | String | js.Function): Self = StObject.set(x, "confirmation", value.asInstanceOf[js.Any])
    
    inline def setConfirmationUndefined: Self = StObject.set(x, "confirmation", js.undefined)
    
    inline def setCreateAt(value: String): Self = StObject.set(x, "createAt", value.asInstanceOf[js.Any])
    
    inline def setCreateAtUndefined: Self = StObject.set(x, "createAt", js.undefined)
    
    inline def setDestroy(value: Boolean): Self = StObject.set(x, "destroy", value.asInstanceOf[js.Any])
    
    inline def setDestroyUndefined: Self = StObject.set(x, "destroy", js.undefined)
    
    inline def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setTemplate(value: String | js.Function): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
    
    inline def setUpdate(value: Boolean): Self = StObject.set(x, "update", value.asInstanceOf[js.Any])
    
    inline def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
    
    inline def setWindow(value: js.Any): Self = StObject.set(x, "window", value.asInstanceOf[js.Any])
    
    inline def setWindowUndefined: Self = StObject.set(x, "window", js.undefined)
  }
}
