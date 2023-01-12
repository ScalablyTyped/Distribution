package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PivotGridMessages extends StObject {
  
  var columnFields: js.UndefOr[String] = js.undefined
  
  var fieldMenu: js.UndefOr[PivotGridMessagesFieldMenu] = js.undefined
  
  var measureFields: js.UndefOr[String] = js.undefined
  
  var rowFields: js.UndefOr[String] = js.undefined
}
object PivotGridMessages {
  
  inline def apply(): PivotGridMessages = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PivotGridMessages]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PivotGridMessages] (val x: Self) extends AnyVal {
    
    inline def setColumnFields(value: String): Self = StObject.set(x, "columnFields", value.asInstanceOf[js.Any])
    
    inline def setColumnFieldsUndefined: Self = StObject.set(x, "columnFields", js.undefined)
    
    inline def setFieldMenu(value: PivotGridMessagesFieldMenu): Self = StObject.set(x, "fieldMenu", value.asInstanceOf[js.Any])
    
    inline def setFieldMenuUndefined: Self = StObject.set(x, "fieldMenu", js.undefined)
    
    inline def setMeasureFields(value: String): Self = StObject.set(x, "measureFields", value.asInstanceOf[js.Any])
    
    inline def setMeasureFieldsUndefined: Self = StObject.set(x, "measureFields", js.undefined)
    
    inline def setRowFields(value: String): Self = StObject.set(x, "rowFields", value.asInstanceOf[js.Any])
    
    inline def setRowFieldsUndefined: Self = StObject.set(x, "rowFields", js.undefined)
  }
}
