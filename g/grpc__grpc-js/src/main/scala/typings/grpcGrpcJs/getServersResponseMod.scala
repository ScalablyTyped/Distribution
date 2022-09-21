package typings.grpcGrpcJs

import typings.grpcGrpcJs.serverMod.Server
import typings.grpcGrpcJs.serverMod.ServerOutput
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getServersResponseMod {
  
  trait GetServersResponse extends StObject {
    
    /**
      * If set, indicates that the list of servers is the final list.  Requesting
      * more servers will only return more if they are created after this RPC
      * completes.
      */
    var end: js.UndefOr[Boolean] = js.undefined
    
    /**
      * list of servers that the connection detail service knows about.  Sorted in
      * ascending server_id order.
      * Must contain at least 1 result, otherwise 'end' must be true.
      */
    var server: js.UndefOr[js.Array[Server]] = js.undefined
  }
  object GetServersResponse {
    
    inline def apply(): GetServersResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetServersResponse]
    }
    
    extension [Self <: GetServersResponse](x: Self) {
      
      inline def setEnd(value: Boolean): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
      
      inline def setServer(value: js.Array[Server]): Self = StObject.set(x, "server", value.asInstanceOf[js.Any])
      
      inline def setServerUndefined: Self = StObject.set(x, "server", js.undefined)
      
      inline def setServerVarargs(value: Server*): Self = StObject.set(x, "server", js.Array(value*))
    }
  }
  
  trait GetServersResponseOutput extends StObject {
    
    /**
      * If set, indicates that the list of servers is the final list.  Requesting
      * more servers will only return more if they are created after this RPC
      * completes.
      */
    var end: Boolean
    
    /**
      * list of servers that the connection detail service knows about.  Sorted in
      * ascending server_id order.
      * Must contain at least 1 result, otherwise 'end' must be true.
      */
    var server: js.Array[ServerOutput]
  }
  object GetServersResponseOutput {
    
    inline def apply(end: Boolean, server: js.Array[ServerOutput]): GetServersResponseOutput = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], server = server.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetServersResponseOutput]
    }
    
    extension [Self <: GetServersResponseOutput](x: Self) {
      
      inline def setEnd(value: Boolean): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setServer(value: js.Array[ServerOutput]): Self = StObject.set(x, "server", value.asInstanceOf[js.Any])
      
      inline def setServerVarargs(value: ServerOutput*): Self = StObject.set(x, "server", js.Array(value*))
    }
  }
}
