package typings.kendoUi.kendo.data

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataSourceTransportWithObjectOperations
  extends StObject
     with DataSourceTransport {
  
  @JSName("create")
  var create_DataSourceTransportWithObjectOperations: js.UndefOr[DataSourceTransportCreate] = js.undefined
  
  @JSName("destroy")
  var destroy_DataSourceTransportWithObjectOperations: js.UndefOr[DataSourceTransportDestroy] = js.undefined
  
  @JSName("read")
  var read_DataSourceTransportWithObjectOperations: js.UndefOr[DataSourceTransportRead] = js.undefined
  
  @JSName("update")
  var update_DataSourceTransportWithObjectOperations: js.UndefOr[DataSourceTransportUpdate] = js.undefined
}
object DataSourceTransportWithObjectOperations {
  
  inline def apply(): DataSourceTransportWithObjectOperations = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSourceTransportWithObjectOperations]
  }
  
  extension [Self <: DataSourceTransportWithObjectOperations](x: Self) {
    
    inline def setCreate(value: DataSourceTransportCreate): Self = StObject.set(x, "create", value.asInstanceOf[js.Any])
    
    inline def setCreateUndefined: Self = StObject.set(x, "create", js.undefined)
    
    inline def setDestroy(value: DataSourceTransportDestroy): Self = StObject.set(x, "destroy", value.asInstanceOf[js.Any])
    
    inline def setDestroyUndefined: Self = StObject.set(x, "destroy", js.undefined)
    
    inline def setRead(value: DataSourceTransportRead): Self = StObject.set(x, "read", value.asInstanceOf[js.Any])
    
    inline def setReadUndefined: Self = StObject.set(x, "read", js.undefined)
    
    inline def setUpdate(value: DataSourceTransportUpdate): Self = StObject.set(x, "update", value.asInstanceOf[js.Any])
    
    inline def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
  }
}
