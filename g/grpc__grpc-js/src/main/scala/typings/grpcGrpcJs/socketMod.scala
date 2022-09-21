package typings.grpcGrpcJs

import typings.grpcGrpcJs.addressMod.Address
import typings.grpcGrpcJs.addressMod.AddressOutput
import typings.grpcGrpcJs.securityMod.Security
import typings.grpcGrpcJs.securityMod.SecurityOutput
import typings.grpcGrpcJs.socketDataMod.SocketData
import typings.grpcGrpcJs.socketDataMod.SocketDataOutput
import typings.grpcGrpcJs.socketRefMod.SocketRef
import typings.grpcGrpcJs.socketRefMod.SocketRefOutput
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object socketMod {
  
  trait Socket extends StObject {
    
    /**
      * Data specific to this Socket.
      */
    var data: js.UndefOr[SocketData | Null] = js.undefined
    
    /**
      * The locally bound address.
      */
    var local: js.UndefOr[Address | Null] = js.undefined
    
    /**
      * The identifier for the Socket.
      */
    var ref: js.UndefOr[SocketRef | Null] = js.undefined
    
    /**
      * The remote bound address.  May be absent.
      */
    var remote: js.UndefOr[Address | Null] = js.undefined
    
    /**
      * Optional, represents the name of the remote endpoint, if different than
      * the original target name.
      */
    var remote_name: js.UndefOr[String] = js.undefined
    
    /**
      * Security details for this socket.  May be absent if not available, or
      * there is no security on the socket.
      */
    var security: js.UndefOr[Security | Null] = js.undefined
  }
  object Socket {
    
    inline def apply(): Socket = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Socket]
    }
    
    extension [Self <: Socket](x: Self) {
      
      inline def setData(value: SocketData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataNull: Self = StObject.set(x, "data", null)
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setLocal(value: Address): Self = StObject.set(x, "local", value.asInstanceOf[js.Any])
      
      inline def setLocalNull: Self = StObject.set(x, "local", null)
      
      inline def setLocalUndefined: Self = StObject.set(x, "local", js.undefined)
      
      inline def setRef(value: SocketRef): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setRefNull: Self = StObject.set(x, "ref", null)
      
      inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
      
      inline def setRemote(value: Address): Self = StObject.set(x, "remote", value.asInstanceOf[js.Any])
      
      inline def setRemoteNull: Self = StObject.set(x, "remote", null)
      
      inline def setRemoteUndefined: Self = StObject.set(x, "remote", js.undefined)
      
      inline def setRemote_name(value: String): Self = StObject.set(x, "remote_name", value.asInstanceOf[js.Any])
      
      inline def setRemote_nameUndefined: Self = StObject.set(x, "remote_name", js.undefined)
      
      inline def setSecurity(value: Security): Self = StObject.set(x, "security", value.asInstanceOf[js.Any])
      
      inline def setSecurityNull: Self = StObject.set(x, "security", null)
      
      inline def setSecurityUndefined: Self = StObject.set(x, "security", js.undefined)
    }
  }
  
  trait SocketOutput extends StObject {
    
    /**
      * Data specific to this Socket.
      */
    var data: SocketDataOutput | Null
    
    /**
      * The locally bound address.
      */
    var local: AddressOutput | Null
    
    /**
      * The identifier for the Socket.
      */
    var ref: SocketRefOutput | Null
    
    /**
      * The remote bound address.  May be absent.
      */
    var remote: AddressOutput | Null
    
    /**
      * Optional, represents the name of the remote endpoint, if different than
      * the original target name.
      */
    var remote_name: String
    
    /**
      * Security details for this socket.  May be absent if not available, or
      * there is no security on the socket.
      */
    var security: SecurityOutput | Null
  }
  object SocketOutput {
    
    inline def apply(remote_name: String): SocketOutput = {
      val __obj = js.Dynamic.literal(remote_name = remote_name.asInstanceOf[js.Any], data = null, local = null, ref = null, remote = null, security = null)
      __obj.asInstanceOf[SocketOutput]
    }
    
    extension [Self <: SocketOutput](x: Self) {
      
      inline def setData(value: SocketDataOutput): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataNull: Self = StObject.set(x, "data", null)
      
      inline def setLocal(value: AddressOutput): Self = StObject.set(x, "local", value.asInstanceOf[js.Any])
      
      inline def setLocalNull: Self = StObject.set(x, "local", null)
      
      inline def setRef(value: SocketRefOutput): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setRefNull: Self = StObject.set(x, "ref", null)
      
      inline def setRemote(value: AddressOutput): Self = StObject.set(x, "remote", value.asInstanceOf[js.Any])
      
      inline def setRemoteNull: Self = StObject.set(x, "remote", null)
      
      inline def setRemote_name(value: String): Self = StObject.set(x, "remote_name", value.asInstanceOf[js.Any])
      
      inline def setSecurity(value: SecurityOutput): Self = StObject.set(x, "security", value.asInstanceOf[js.Any])
      
      inline def setSecurityNull: Self = StObject.set(x, "security", null)
    }
  }
}
