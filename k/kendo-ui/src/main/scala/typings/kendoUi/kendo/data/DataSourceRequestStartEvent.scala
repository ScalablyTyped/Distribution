package typings.kendoUi.kendo.data

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataSourceRequestStartEvent extends DataSourceEvent {
  
  def preventDefault(): Unit = js.native
  
  var `type`: js.UndefOr[String] = js.native
}
object DataSourceRequestStartEvent {
  
  @scala.inline
  def apply(preventDefault: () => Unit): DataSourceRequestStartEvent = {
    val __obj = js.Dynamic.literal(preventDefault = js.Any.fromFunction0(preventDefault))
    __obj.asInstanceOf[DataSourceRequestStartEvent]
  }
  
  @scala.inline
  implicit class DataSourceRequestStartEventMutableBuilder[Self <: DataSourceRequestStartEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPreventDefault(value: () => Unit): Self = StObject.set(x, "preventDefault", js.Any.fromFunction0(value))
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
