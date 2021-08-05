package typings.kendoUi.kendo.data

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataSourceTransportWithFunctionOperations
  extends StObject
     with DataSourceTransport {
  
  @JSName("create")
  var create_DataSourceTransportWithFunctionOperations: js.UndefOr[js.Function1[/* options */ DataSourceTransportOptions, Unit]] = js.undefined
  
  @JSName("destroy")
  var destroy_DataSourceTransportWithFunctionOperations: js.UndefOr[js.Function1[/* options */ DataSourceTransportOptions, Unit]] = js.undefined
  
  @JSName("read")
  var read_DataSourceTransportWithFunctionOperations: js.UndefOr[js.Function1[/* options */ DataSourceTransportReadOptions, Unit]] = js.undefined
  
  @JSName("update")
  var update_DataSourceTransportWithFunctionOperations: js.UndefOr[js.Function1[/* options */ DataSourceTransportOptions, Unit]] = js.undefined
}
object DataSourceTransportWithFunctionOperations {
  
  inline def apply(): DataSourceTransportWithFunctionOperations = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSourceTransportWithFunctionOperations]
  }
  
  extension [Self <: DataSourceTransportWithFunctionOperations](x: Self) {
    
    inline def setCreate(value: /* options */ DataSourceTransportOptions => Unit): Self = StObject.set(x, "create", js.Any.fromFunction1(value))
    
    inline def setCreateUndefined: Self = StObject.set(x, "create", js.undefined)
    
    inline def setDestroy(value: /* options */ DataSourceTransportOptions => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction1(value))
    
    inline def setDestroyUndefined: Self = StObject.set(x, "destroy", js.undefined)
    
    inline def setRead(value: /* options */ DataSourceTransportReadOptions => Unit): Self = StObject.set(x, "read", js.Any.fromFunction1(value))
    
    inline def setReadUndefined: Self = StObject.set(x, "read", js.undefined)
    
    inline def setUpdate(value: /* options */ DataSourceTransportOptions => Unit): Self = StObject.set(x, "update", js.Any.fromFunction1(value))
    
    inline def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
  }
}
