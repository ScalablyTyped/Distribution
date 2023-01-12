package typings.kendoUi.kendo.data

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PivotTransportWithObjectOperations
  extends StObject
     with PivotTransport {
  
  var connection: PivotTransportConnection
  
  @JSName("discover")
  var discover_PivotTransportWithObjectOperations: js.UndefOr[PivotTransportDiscover] = js.undefined
  
  @JSName("read")
  var read_PivotTransportWithObjectOperations: js.UndefOr[DataSourceTransportRead] = js.undefined
}
object PivotTransportWithObjectOperations {
  
  inline def apply(connection: PivotTransportConnection): PivotTransportWithObjectOperations = {
    val __obj = js.Dynamic.literal(connection = connection.asInstanceOf[js.Any])
    __obj.asInstanceOf[PivotTransportWithObjectOperations]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PivotTransportWithObjectOperations] (val x: Self) extends AnyVal {
    
    inline def setConnection(value: PivotTransportConnection): Self = StObject.set(x, "connection", value.asInstanceOf[js.Any])
    
    inline def setDiscover(value: PivotTransportDiscover): Self = StObject.set(x, "discover", value.asInstanceOf[js.Any])
    
    inline def setDiscoverUndefined: Self = StObject.set(x, "discover", js.undefined)
    
    inline def setRead(value: DataSourceTransportRead): Self = StObject.set(x, "read", value.asInstanceOf[js.Any])
    
    inline def setReadUndefined: Self = StObject.set(x, "read", js.undefined)
  }
}
