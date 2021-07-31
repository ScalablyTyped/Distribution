package typings.maximMazurokGapiClientBigqueryconnection.gapi.client.bigqueryconnection

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListConnectionsResponse extends StObject {
  
  /** List of connections. */
  var connections: js.UndefOr[js.Array[Connection]] = js.undefined
  
  /** Next page token. */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object ListConnectionsResponse {
  
  @scala.inline
  def apply(): ListConnectionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListConnectionsResponse]
  }
  
  @scala.inline
  implicit class ListConnectionsResponseMutableBuilder[Self <: ListConnectionsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConnections(value: js.Array[Connection]): Self = StObject.set(x, "connections", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionsUndefined: Self = StObject.set(x, "connections", js.undefined)
    
    @scala.inline
    def setConnectionsVarargs(value: Connection*): Self = StObject.set(x, "connections", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
