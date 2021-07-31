package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MultiColumnComboBoxVirtual extends StObject {
  
  var itemHeight: js.UndefOr[Double] = js.undefined
  
  var mapValueTo: js.UndefOr[String] = js.undefined
  
  var valueMapper: js.UndefOr[js.Function] = js.undefined
}
object MultiColumnComboBoxVirtual {
  
  @scala.inline
  def apply(): MultiColumnComboBoxVirtual = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MultiColumnComboBoxVirtual]
  }
  
  @scala.inline
  implicit class MultiColumnComboBoxVirtualMutableBuilder[Self <: MultiColumnComboBoxVirtual] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItemHeight(value: Double): Self = StObject.set(x, "itemHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemHeightUndefined: Self = StObject.set(x, "itemHeight", js.undefined)
    
    @scala.inline
    def setMapValueTo(value: String): Self = StObject.set(x, "mapValueTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMapValueToUndefined: Self = StObject.set(x, "mapValueTo", js.undefined)
    
    @scala.inline
    def setValueMapper(value: js.Function): Self = StObject.set(x, "valueMapper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueMapperUndefined: Self = StObject.set(x, "valueMapper", js.undefined)
  }
}
