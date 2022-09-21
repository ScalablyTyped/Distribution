package typings.grpcGrpcJs

import typings.grpcGrpcJs.socketRefMod.SocketRef
import typings.grpcGrpcJs.socketRefMod.SocketRefOutput
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getServerSocketsResponseMod {
  
  trait GetServerSocketsResponse extends StObject {
    
    /**
      * If set, indicates that the list of sockets is the final list.  Requesting
      * more sockets will only return more if they are created after this RPC
      * completes.
      */
    var end: js.UndefOr[Boolean] = js.undefined
    
    /**
      * list of socket refs that the connection detail service knows about.  Sorted in
      * ascending socket_id order.
      * Must contain at least 1 result, otherwise 'end' must be true.
      */
    var socket_ref: js.UndefOr[js.Array[SocketRef]] = js.undefined
  }
  object GetServerSocketsResponse {
    
    inline def apply(): GetServerSocketsResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetServerSocketsResponse]
    }
    
    extension [Self <: GetServerSocketsResponse](x: Self) {
      
      inline def setEnd(value: Boolean): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
      
      inline def setSocket_ref(value: js.Array[SocketRef]): Self = StObject.set(x, "socket_ref", value.asInstanceOf[js.Any])
      
      inline def setSocket_refUndefined: Self = StObject.set(x, "socket_ref", js.undefined)
      
      inline def setSocket_refVarargs(value: SocketRef*): Self = StObject.set(x, "socket_ref", js.Array(value*))
    }
  }
  
  trait GetServerSocketsResponseOutput extends StObject {
    
    /**
      * If set, indicates that the list of sockets is the final list.  Requesting
      * more sockets will only return more if they are created after this RPC
      * completes.
      */
    var end: Boolean
    
    /**
      * list of socket refs that the connection detail service knows about.  Sorted in
      * ascending socket_id order.
      * Must contain at least 1 result, otherwise 'end' must be true.
      */
    var socket_ref: js.Array[SocketRefOutput]
  }
  object GetServerSocketsResponseOutput {
    
    inline def apply(end: Boolean, socket_ref: js.Array[SocketRefOutput]): GetServerSocketsResponseOutput = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], socket_ref = socket_ref.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetServerSocketsResponseOutput]
    }
    
    extension [Self <: GetServerSocketsResponseOutput](x: Self) {
      
      inline def setEnd(value: Boolean): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setSocket_ref(value: js.Array[SocketRefOutput]): Self = StObject.set(x, "socket_ref", value.asInstanceOf[js.Any])
      
      inline def setSocket_refVarargs(value: SocketRefOutput*): Self = StObject.set(x, "socket_ref", js.Array(value*))
    }
  }
}
