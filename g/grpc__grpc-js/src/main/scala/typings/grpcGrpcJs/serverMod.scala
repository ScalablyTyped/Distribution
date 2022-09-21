package typings.grpcGrpcJs

import typings.grpcGrpcJs.serverDataMod.ServerData
import typings.grpcGrpcJs.serverDataMod.ServerDataOutput
import typings.grpcGrpcJs.serverRefMod.ServerRef
import typings.grpcGrpcJs.serverRefMod.ServerRefOutput
import typings.grpcGrpcJs.socketRefMod.SocketRef
import typings.grpcGrpcJs.socketRefMod.SocketRefOutput
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object serverMod {
  
  trait Server extends StObject {
    
    /**
      * The associated data of the Server.
      */
    var data: js.UndefOr[ServerData | Null] = js.undefined
    
    /**
      * The sockets that the server is listening on.  There are no ordering
      * guarantees.  This may be absent.
      */
    var listen_socket: js.UndefOr[js.Array[SocketRef]] = js.undefined
    
    /**
      * The identifier for a Server.  This should be set.
      */
    var ref: js.UndefOr[ServerRef | Null] = js.undefined
  }
  object Server {
    
    inline def apply(): Server = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Server]
    }
    
    extension [Self <: Server](x: Self) {
      
      inline def setData(value: ServerData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataNull: Self = StObject.set(x, "data", null)
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setListen_socket(value: js.Array[SocketRef]): Self = StObject.set(x, "listen_socket", value.asInstanceOf[js.Any])
      
      inline def setListen_socketUndefined: Self = StObject.set(x, "listen_socket", js.undefined)
      
      inline def setListen_socketVarargs(value: SocketRef*): Self = StObject.set(x, "listen_socket", js.Array(value*))
      
      inline def setRef(value: ServerRef): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setRefNull: Self = StObject.set(x, "ref", null)
      
      inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
    }
  }
  
  trait ServerOutput extends StObject {
    
    /**
      * The associated data of the Server.
      */
    var data: ServerDataOutput | Null
    
    /**
      * The sockets that the server is listening on.  There are no ordering
      * guarantees.  This may be absent.
      */
    var listen_socket: js.Array[SocketRefOutput]
    
    /**
      * The identifier for a Server.  This should be set.
      */
    var ref: ServerRefOutput | Null
  }
  object ServerOutput {
    
    inline def apply(listen_socket: js.Array[SocketRefOutput]): ServerOutput = {
      val __obj = js.Dynamic.literal(listen_socket = listen_socket.asInstanceOf[js.Any], data = null, ref = null)
      __obj.asInstanceOf[ServerOutput]
    }
    
    extension [Self <: ServerOutput](x: Self) {
      
      inline def setData(value: ServerDataOutput): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataNull: Self = StObject.set(x, "data", null)
      
      inline def setListen_socket(value: js.Array[SocketRefOutput]): Self = StObject.set(x, "listen_socket", value.asInstanceOf[js.Any])
      
      inline def setListen_socketVarargs(value: SocketRefOutput*): Self = StObject.set(x, "listen_socket", js.Array(value*))
      
      inline def setRef(value: ServerRefOutput): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setRefNull: Self = StObject.set(x, "ref", null)
    }
  }
}
