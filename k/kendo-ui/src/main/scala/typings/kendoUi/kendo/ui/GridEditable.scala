package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GridEditable extends StObject {
  
  var cancelDelete: js.UndefOr[String] = js.native
  
  var confirmDelete: js.UndefOr[String] = js.native
  
  var confirmation: js.UndefOr[Boolean | String | js.Function] = js.native
  
  var createAt: js.UndefOr[String] = js.native
  
  var destroy: js.UndefOr[Boolean] = js.native
  
  var mode: js.UndefOr[String] = js.native
  
  var template: js.UndefOr[String | js.Function] = js.native
  
  var update: js.UndefOr[Boolean] = js.native
  
  var window: js.UndefOr[js.Any] = js.native
}
object GridEditable {
  
  @scala.inline
  def apply(): GridEditable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridEditable]
  }
  
  @scala.inline
  implicit class GridEditableMutableBuilder[Self <: GridEditable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCancelDelete(value: String): Self = StObject.set(x, "cancelDelete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCancelDeleteUndefined: Self = StObject.set(x, "cancelDelete", js.undefined)
    
    @scala.inline
    def setConfirmDelete(value: String): Self = StObject.set(x, "confirmDelete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfirmDeleteUndefined: Self = StObject.set(x, "confirmDelete", js.undefined)
    
    @scala.inline
    def setConfirmation(value: Boolean | String | js.Function): Self = StObject.set(x, "confirmation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfirmationUndefined: Self = StObject.set(x, "confirmation", js.undefined)
    
    @scala.inline
    def setCreateAt(value: String): Self = StObject.set(x, "createAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateAtUndefined: Self = StObject.set(x, "createAt", js.undefined)
    
    @scala.inline
    def setDestroy(value: Boolean): Self = StObject.set(x, "destroy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestroyUndefined: Self = StObject.set(x, "destroy", js.undefined)
    
    @scala.inline
    def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    @scala.inline
    def setTemplate(value: String | js.Function): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
    
    @scala.inline
    def setUpdate(value: Boolean): Self = StObject.set(x, "update", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
    
    @scala.inline
    def setWindow(value: js.Any): Self = StObject.set(x, "window", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindowUndefined: Self = StObject.set(x, "window", js.undefined)
  }
}
