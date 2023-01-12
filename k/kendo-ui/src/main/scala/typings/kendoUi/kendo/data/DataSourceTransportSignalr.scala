package typings.kendoUi.kendo.data

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataSourceTransportSignalr extends StObject {
  
  var client: js.UndefOr[DataSourceTransportSignalrClient] = js.undefined
  
  var hub: js.UndefOr[Any] = js.undefined
  
  var promise: js.UndefOr[Any] = js.undefined
  
  var server: js.UndefOr[DataSourceTransportSignalrServer] = js.undefined
}
object DataSourceTransportSignalr {
  
  inline def apply(): DataSourceTransportSignalr = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSourceTransportSignalr]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DataSourceTransportSignalr] (val x: Self) extends AnyVal {
    
    inline def setClient(value: DataSourceTransportSignalrClient): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
    
    inline def setClientUndefined: Self = StObject.set(x, "client", js.undefined)
    
    inline def setHub(value: Any): Self = StObject.set(x, "hub", value.asInstanceOf[js.Any])
    
    inline def setHubUndefined: Self = StObject.set(x, "hub", js.undefined)
    
    inline def setPromise(value: Any): Self = StObject.set(x, "promise", value.asInstanceOf[js.Any])
    
    inline def setPromiseUndefined: Self = StObject.set(x, "promise", js.undefined)
    
    inline def setServer(value: DataSourceTransportSignalrServer): Self = StObject.set(x, "server", value.asInstanceOf[js.Any])
    
    inline def setServerUndefined: Self = StObject.set(x, "server", js.undefined)
  }
}
