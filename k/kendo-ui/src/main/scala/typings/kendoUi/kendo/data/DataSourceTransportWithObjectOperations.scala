package typings.kendoUi.kendo.data

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataSourceTransportWithObjectOperations extends DataSourceTransport {
  
  @JSName("create")
  var create_DataSourceTransportWithObjectOperations: js.UndefOr[DataSourceTransportCreate] = js.native
  
  @JSName("destroy")
  var destroy_DataSourceTransportWithObjectOperations: js.UndefOr[DataSourceTransportDestroy] = js.native
  
  @JSName("read")
  var read_DataSourceTransportWithObjectOperations: js.UndefOr[DataSourceTransportRead] = js.native
  
  @JSName("update")
  var update_DataSourceTransportWithObjectOperations: js.UndefOr[DataSourceTransportUpdate] = js.native
}
object DataSourceTransportWithObjectOperations {
  
  @scala.inline
  def apply(): DataSourceTransportWithObjectOperations = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSourceTransportWithObjectOperations]
  }
  
  @scala.inline
  implicit class DataSourceTransportWithObjectOperationsMutableBuilder[Self <: DataSourceTransportWithObjectOperations] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreate(value: DataSourceTransportCreate): Self = StObject.set(x, "create", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateUndefined: Self = StObject.set(x, "create", js.undefined)
    
    @scala.inline
    def setDestroy(value: DataSourceTransportDestroy): Self = StObject.set(x, "destroy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestroyUndefined: Self = StObject.set(x, "destroy", js.undefined)
    
    @scala.inline
    def setRead(value: DataSourceTransportRead): Self = StObject.set(x, "read", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadUndefined: Self = StObject.set(x, "read", js.undefined)
    
    @scala.inline
    def setUpdate(value: DataSourceTransportUpdate): Self = StObject.set(x, "update", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
  }
}
