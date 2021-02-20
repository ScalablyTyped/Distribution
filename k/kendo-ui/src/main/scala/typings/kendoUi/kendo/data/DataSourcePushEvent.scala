package typings.kendoUi.kendo.data

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataSourcePushEvent extends DataSourceEvent {
  
  var items: js.UndefOr[js.Array[DataSourceItemOrGroup]] = js.native
  
  var `type`: js.UndefOr[String] = js.native
}
object DataSourcePushEvent {
  
  @scala.inline
  def apply(): DataSourcePushEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSourcePushEvent]
  }
  
  @scala.inline
  implicit class DataSourcePushEventMutableBuilder[Self <: DataSourcePushEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[DataSourceItemOrGroup]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: DataSourceItemOrGroup*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
