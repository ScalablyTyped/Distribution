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
  
  @scala.inline
  def apply(): PivotGridMessages = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PivotGridMessages]
  }
  
  @scala.inline
  implicit class PivotGridMessagesMutableBuilder[Self <: PivotGridMessages] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumnFields(value: String): Self = StObject.set(x, "columnFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnFieldsUndefined: Self = StObject.set(x, "columnFields", js.undefined)
    
    @scala.inline
    def setFieldMenu(value: PivotGridMessagesFieldMenu): Self = StObject.set(x, "fieldMenu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldMenuUndefined: Self = StObject.set(x, "fieldMenu", js.undefined)
    
    @scala.inline
    def setMeasureFields(value: String): Self = StObject.set(x, "measureFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeasureFieldsUndefined: Self = StObject.set(x, "measureFields", js.undefined)
    
    @scala.inline
    def setRowFields(value: String): Self = StObject.set(x, "rowFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowFieldsUndefined: Self = StObject.set(x, "rowFields", js.undefined)
  }
}
