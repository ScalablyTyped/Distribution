package typings.kendoUi.kendo.mobile.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListViewFilterable extends StObject {
  
  var autoFilter: js.UndefOr[Boolean] = js.native
  
  var field: js.UndefOr[String] = js.native
  
  var ignoreCase: js.UndefOr[Boolean] = js.native
  
  var operator: js.UndefOr[String] = js.native
  
  var placeholder: js.UndefOr[String] = js.native
}
object ListViewFilterable {
  
  @scala.inline
  def apply(): ListViewFilterable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListViewFilterable]
  }
  
  @scala.inline
  implicit class ListViewFilterableMutableBuilder[Self <: ListViewFilterable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoFilter(value: Boolean): Self = StObject.set(x, "autoFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoFilterUndefined: Self = StObject.set(x, "autoFilter", js.undefined)
    
    @scala.inline
    def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
    
    @scala.inline
    def setIgnoreCase(value: Boolean): Self = StObject.set(x, "ignoreCase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnoreCaseUndefined: Self = StObject.set(x, "ignoreCase", js.undefined)
    
    @scala.inline
    def setOperator(value: String): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperatorUndefined: Self = StObject.set(x, "operator", js.undefined)
    
    @scala.inline
    def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
  }
}
