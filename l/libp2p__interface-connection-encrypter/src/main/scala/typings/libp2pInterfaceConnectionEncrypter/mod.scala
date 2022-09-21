package typings.libp2pInterfaceConnectionEncrypter

import typings.itStreamTypes.mod.Duplex
import typings.libp2pInterfacePeerId.mod.PeerId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @js.native
  trait ConnectionEncrypter extends StObject {
    
    var protocol: String = js.native
    
    /**
      * Decrypt incoming data.
      */
    def secureInbound(
      localPeer: PeerId,
      connection: Duplex[js.typedarray.Uint8Array, js.typedarray.Uint8Array, js.Promise[Unit]]
    ): js.Promise[SecuredConnection] = js.native
    def secureInbound(
      localPeer: PeerId,
      connection: Duplex[js.typedarray.Uint8Array, js.typedarray.Uint8Array, js.Promise[Unit]],
      remotePeer: PeerId
    ): js.Promise[SecuredConnection] = js.native
    
    /**
      * Encrypt outgoing data to the remote party.
      */
    def secureOutbound(
      localPeer: PeerId,
      connection: Duplex[js.typedarray.Uint8Array, js.typedarray.Uint8Array, js.Promise[Unit]],
      remotePeer: PeerId
    ): js.Promise[SecuredConnection] = js.native
  }
  
  trait SecuredConnection extends StObject {
    
    var conn: Duplex[js.typedarray.Uint8Array, js.typedarray.Uint8Array, js.Promise[Unit]]
    
    var remoteEarlyData: js.typedarray.Uint8Array
    
    var remotePeer: PeerId
  }
  object SecuredConnection {
    
    inline def apply(
      conn: Duplex[js.typedarray.Uint8Array, js.typedarray.Uint8Array, js.Promise[Unit]],
      remoteEarlyData: js.typedarray.Uint8Array,
      remotePeer: PeerId
    ): SecuredConnection = {
      val __obj = js.Dynamic.literal(conn = conn.asInstanceOf[js.Any], remoteEarlyData = remoteEarlyData.asInstanceOf[js.Any], remotePeer = remotePeer.asInstanceOf[js.Any])
      __obj.asInstanceOf[SecuredConnection]
    }
    
    extension [Self <: SecuredConnection](x: Self) {
      
      inline def setConn(value: Duplex[js.typedarray.Uint8Array, js.typedarray.Uint8Array, js.Promise[Unit]]): Self = StObject.set(x, "conn", value.asInstanceOf[js.Any])
      
      inline def setRemoteEarlyData(value: js.typedarray.Uint8Array): Self = StObject.set(x, "remoteEarlyData", value.asInstanceOf[js.Any])
      
      inline def setRemotePeer(value: PeerId): Self = StObject.set(x, "remotePeer", value.asInstanceOf[js.Any])
    }
  }
}
