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
  
  @scala.inline
  def apply(): GridColumnCommandItemIconClass = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridColumnCommandItemIconClass]
  }
  
  @scala.inline
  implicit class GridColumnCommandItemIconClassMutableBuilder[Self <: GridColumnCommandItemIconClass] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCancel(value: String): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
    
    @scala.inline
    def setEdit(value: String): Self = StObject.set(x, "edit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEditUndefined: Self = StObject.set(x, "edit", js.undefined)
    
    @scala.inline
    def setUpdate(value: String): Self = StObject.set(x, "update", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
  }
}
