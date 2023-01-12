package typings.kendoUi.kendo.data

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataSourceRequestStartEvent
  extends StObject
     with DataSourceEvent {
  
  def preventDefault(): Unit
  
  var `type`: js.UndefOr[String] = js.undefined
}
object DataSourceRequestStartEvent {
  
  inline def apply(preventDefault: () => Unit): DataSourceRequestStartEvent = {
    val __obj = js.Dynamic.literal(preventDefault = js.Any.fromFunction0(preventDefault))
    __obj.asInstanceOf[DataSourceRequestStartEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DataSourceRequestStartEvent] (val x: Self) extends AnyVal {
    
    inline def setPreventDefault(value: () => Unit): Self = StObject.set(x, "preventDefault", js.Any.fromFunction0(value))
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
