package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OrgChartEditable extends StObject {
  
  var create: js.UndefOr[Boolean] = js.undefined
  
  var destroy: js.UndefOr[Boolean] = js.undefined
  
  var fields: js.UndefOr[Boolean] = js.undefined
  
  var form: js.UndefOr[Any] = js.undefined
  
  var parent: js.UndefOr[Boolean] = js.undefined
}
object OrgChartEditable {
  
  inline def apply(): OrgChartEditable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrgChartEditable]
  }
  
  extension [Self <: OrgChartEditable](x: Self) {
    
    inline def setCreate(value: Boolean): Self = StObject.set(x, "create", value.asInstanceOf[js.Any])
    
    inline def setCreateUndefined: Self = StObject.set(x, "create", js.undefined)
    
    inline def setDestroy(value: Boolean): Self = StObject.set(x, "destroy", value.asInstanceOf[js.Any])
    
    inline def setDestroyUndefined: Self = StObject.set(x, "destroy", js.undefined)
    
    inline def setFields(value: Boolean): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setForm(value: Any): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
    
    inline def setFormUndefined: Self = StObject.set(x, "form", js.undefined)
    
    inline def setParent(value: Boolean): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
  }
}
