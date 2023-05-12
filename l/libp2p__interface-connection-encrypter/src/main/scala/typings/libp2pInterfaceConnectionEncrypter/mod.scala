package typings.libp2pInterfaceConnectionEncrypter

import typings.itStreamTypes.mod.Duplex
import typings.itStreamTypes.mod.Source
import typings.libp2pInterfacePeerId.mod.PeerId
import typings.std.AsyncGenerator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @js.native
  trait ConnectionEncrypter[Extension] extends StObject {
    
    var protocol: String = js.native
    
    /**
      * Decrypt incoming data. If the remote PeerId is known,
      * pass it for extra verification, otherwise it will be determined during
      * the handshake
      */
    def secureInbound(
      localPeer: PeerId,
      connection: Duplex[
          AsyncGenerator[js.typedarray.Uint8Array, Any, Any], 
          Source[js.typedarray.Uint8Array], 
          js.Promise[Unit]
        ]
    ): js.Promise[SecuredConnection[Extension]] = js.native
    def secureInbound(
      localPeer: PeerId,
      connection: Duplex[
          AsyncGenerator[js.typedarray.Uint8Array, Any, Any], 
          Source[js.typedarray.Uint8Array], 
          js.Promise[Unit]
        ],
      remotePeer: PeerId
    ): js.Promise[SecuredConnection[Extension]] = js.native
    
    /**
      * Encrypt outgoing data to the remote party. If the remote PeerId is known,
      * pass it for extra verification, otherwise it will be determined during
      * the handshake.
      */
    def secureOutbound(
      localPeer: PeerId,
      connection: Duplex[
          AsyncGenerator[js.typedarray.Uint8Array, Any, Any], 
          Source[js.typedarray.Uint8Array], 
          js.Promise[Unit]
        ]
    ): js.Promise[SecuredConnection[Extension]] = js.native
    def secureOutbound(
      localPeer: PeerId,
      connection: Duplex[
          AsyncGenerator[js.typedarray.Uint8Array, Any, Any], 
          Source[js.typedarray.Uint8Array], 
          js.Promise[Unit]
        ],
      remotePeer: PeerId
    ): js.Promise[SecuredConnection[Extension]] = js.native
  }
  
  trait SecuredConnection[Extension] extends StObject {
    
    var conn: Duplex[
        AsyncGenerator[js.typedarray.Uint8Array, Any, Any], 
        Source[js.typedarray.Uint8Array], 
        js.Promise[Unit]
      ]
    
    var remoteExtensions: js.UndefOr[Extension] = js.undefined
    
    var remotePeer: PeerId
  }
  object SecuredConnection {
    
    inline def apply[Extension](
      conn: Duplex[
          AsyncGenerator[js.typedarray.Uint8Array, Any, Any], 
          Source[js.typedarray.Uint8Array], 
          js.Promise[Unit]
        ],
      remotePeer: PeerId
    ): SecuredConnection[Extension] = {
      val __obj = js.Dynamic.literal(conn = conn.asInstanceOf[js.Any], remotePeer = remotePeer.asInstanceOf[js.Any])
      __obj.asInstanceOf[SecuredConnection[Extension]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SecuredConnection[?], Extension] (val x: Self & SecuredConnection[Extension]) extends AnyVal {
      
      inline def setConn(
        value: Duplex[
              AsyncGenerator[js.typedarray.Uint8Array, Any, Any], 
              Source[js.typedarray.Uint8Array], 
              js.Promise[Unit]
            ]
      ): Self = StObject.set(x, "conn", value.asInstanceOf[js.Any])
      
      inline def setRemoteExtensions(value: Extension): Self = StObject.set(x, "remoteExtensions", value.asInstanceOf[js.Any])
      
      inline def setRemoteExtensionsUndefined: Self = StObject.set(x, "remoteExtensions", js.undefined)
      
      inline def setRemotePeer(value: PeerId): Self = StObject.set(x, "remotePeer", value.asInstanceOf[js.Any])
    }
  }
}
