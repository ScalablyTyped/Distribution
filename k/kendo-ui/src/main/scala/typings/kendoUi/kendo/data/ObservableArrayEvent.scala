package typings.kendoUi.kendo.data

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ObservableArrayEvent extends StObject {
  
  var action: js.UndefOr[String] = js.native
  
  var field: js.UndefOr[String] = js.native
  
  var index: js.UndefOr[Double] = js.native
  
  var items: js.UndefOr[js.Array[Model]] = js.native
}
object ObservableArrayEvent {
  
  @scala.inline
  def apply(): ObservableArrayEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ObservableArrayEvent]
  }
  
  @scala.inline
  implicit class ObservableArrayEventMutableBuilder[Self <: ObservableArrayEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    @scala.inline
    def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    @scala.inline
    def setItems(value: js.Array[Model]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: Model*): Self = StObject.set(x, "items", js.Array(value :_*))
  }
}
