package typings.googleapis.eventarcV1Mod.eventarcV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListChannelConnectionsResponse extends StObject {
  
  /**
    * The requested channel connections, up to the number specified in `page_size`.
    */
  var channelConnections: js.UndefOr[js.Array[SchemaChannelConnection]] = js.undefined
  
  /**
    * A page token that can be sent to `ListChannelConnections` to request the next page. If this is empty, then there are no more pages.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Unreachable resources, if any.
    */
  var unreachable: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaListChannelConnectionsResponse {
  
  inline def apply(): SchemaListChannelConnectionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListChannelConnectionsResponse]
  }
  
  extension [Self <: SchemaListChannelConnectionsResponse](x: Self) {
    
    inline def setChannelConnections(value: js.Array[SchemaChannelConnection]): Self = StObject.set(x, "channelConnections", value.asInstanceOf[js.Any])
    
    inline def setChannelConnectionsUndefined: Self = StObject.set(x, "channelConnections", js.undefined)
    
    inline def setChannelConnectionsVarargs(value: SchemaChannelConnection*): Self = StObject.set(x, "channelConnections", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setUnreachable(value: js.Array[String]): Self = StObject.set(x, "unreachable", value.asInstanceOf[js.Any])
    
    inline def setUnreachableNull: Self = StObject.set(x, "unreachable", null)
    
    inline def setUnreachableUndefined: Self = StObject.set(x, "unreachable", js.undefined)
    
    inline def setUnreachableVarargs(value: String*): Self = StObject.set(x, "unreachable", js.Array(value*))
  }
}
