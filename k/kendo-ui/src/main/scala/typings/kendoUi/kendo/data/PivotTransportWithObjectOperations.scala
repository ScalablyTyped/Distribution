package typings.kendoUi.kendo.data

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PivotTransportWithObjectOperations extends PivotTransport {
  
  var connection: PivotTransportConnection = js.native
  
  @JSName("discover")
  var discover_PivotTransportWithObjectOperations: js.UndefOr[PivotTransportDiscover] = js.native
  
  @JSName("read")
  var read_PivotTransportWithObjectOperations: js.UndefOr[DataSourceTransportRead] = js.native
}
object PivotTransportWithObjectOperations {
  
  @scala.inline
  def apply(connection: PivotTransportConnection): PivotTransportWithObjectOperations = {
    val __obj = js.Dynamic.literal(connection = connection.asInstanceOf[js.Any])
    __obj.asInstanceOf[PivotTransportWithObjectOperations]
  }
  
  @scala.inline
  implicit class PivotTransportWithObjectOperationsMutableBuilder[Self <: PivotTransportWithObjectOperations] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConnection(value: PivotTransportConnection): Self = StObject.set(x, "connection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiscover(value: PivotTransportDiscover): Self = StObject.set(x, "discover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiscoverUndefined: Self = StObject.set(x, "discover", js.undefined)
    
    @scala.inline
    def setRead(value: DataSourceTransportRead): Self = StObject.set(x, "read", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadUndefined: Self = StObject.set(x, "read", js.undefined)
  }
}
