package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AutoCompleteVirtual extends StObject {
  
  var itemHeight: js.UndefOr[Double] = js.native
  
  var mapValueTo: js.UndefOr[String] = js.native
  
  var valueMapper: js.UndefOr[js.Function] = js.native
}
object AutoCompleteVirtual {
  
  @scala.inline
  def apply(): AutoCompleteVirtual = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoCompleteVirtual]
  }
  
  @scala.inline
  implicit class AutoCompleteVirtualMutableBuilder[Self <: AutoCompleteVirtual] (val x: Self) extends AnyVal {
    
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
