package typings.kendoUi.kendo.data

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataSourceTransportSignalr extends StObject {
  
  var client: js.UndefOr[DataSourceTransportSignalrClient] = js.native
  
  var hub: js.UndefOr[js.Any] = js.native
  
  var promise: js.UndefOr[js.Any] = js.native
  
  var server: js.UndefOr[DataSourceTransportSignalrServer] = js.native
}
object DataSourceTransportSignalr {
  
  @scala.inline
  def apply(): DataSourceTransportSignalr = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSourceTransportSignalr]
  }
  
  @scala.inline
  implicit class DataSourceTransportSignalrMutableBuilder[Self <: DataSourceTransportSignalr] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClient(value: DataSourceTransportSignalrClient): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientUndefined: Self = StObject.set(x, "client", js.undefined)
    
    @scala.inline
    def setHub(value: js.Any): Self = StObject.set(x, "hub", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHubUndefined: Self = StObject.set(x, "hub", js.undefined)
    
    @scala.inline
    def setPromise(value: js.Any): Self = StObject.set(x, "promise", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPromiseUndefined: Self = StObject.set(x, "promise", js.undefined)
    
    @scala.inline
    def setServer(value: DataSourceTransportSignalrServer): Self = StObject.set(x, "server", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerUndefined: Self = StObject.set(x, "server", js.undefined)
  }
}
