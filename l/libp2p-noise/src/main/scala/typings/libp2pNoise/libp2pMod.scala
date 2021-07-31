package typings.libp2pNoise

import typings.libp2pNoise.basicMod.bytes
import typings.libp2pNoise.basicMod.bytes32
import typings.node.Buffer
import typings.peerId.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libp2pMod {
  
  trait INoiseConnection extends StObject {
    
    var remoteEarlyData: js.UndefOr[js.Function0[bytes]] = js.undefined
    
    def secureInbound(localPeer: ^, insecure: js.Any, remotePeer: ^): js.Promise[SecureOutbound]
    
    def secureOutbound(localPeer: ^, insecure: js.Any, remotePeer: ^): js.Promise[SecureOutbound]
  }
  object INoiseConnection {
    
    @scala.inline
    def apply(
      secureInbound: (^, js.Any, ^) => js.Promise[SecureOutbound],
      secureOutbound: (^, js.Any, ^) => js.Promise[SecureOutbound]
    ): INoiseConnection = {
      val __obj = js.Dynamic.literal(secureInbound = js.Any.fromFunction3(secureInbound), secureOutbound = js.Any.fromFunction3(secureOutbound))
      __obj.asInstanceOf[INoiseConnection]
    }
    
    @scala.inline
    implicit class INoiseConnectionMutableBuilder[Self <: INoiseConnection] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRemoteEarlyData(value: () => bytes): Self = StObject.set(x, "remoteEarlyData", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRemoteEarlyDataUndefined: Self = StObject.set(x, "remoteEarlyData", js.undefined)
      
      @scala.inline
      def setSecureInbound(value: (^, js.Any, ^) => js.Promise[SecureOutbound]): Self = StObject.set(x, "secureInbound", js.Any.fromFunction3(value))
      
      @scala.inline
      def setSecureOutbound(value: (^, js.Any, ^) => js.Promise[SecureOutbound]): Self = StObject.set(x, "secureOutbound", js.Any.fromFunction3(value))
    }
  }
  
  trait KeyPair extends StObject {
    
    var privateKey: bytes32
    
    var publicKey: bytes32
  }
  object KeyPair {
    
    @scala.inline
    def apply(privateKey: bytes32, publicKey: bytes32): KeyPair = {
      val __obj = js.Dynamic.literal(privateKey = privateKey.asInstanceOf[js.Any], publicKey = publicKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[KeyPair]
    }
    
    @scala.inline
    implicit class KeyPairMutableBuilder[Self <: KeyPair] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPrivateKey(value: bytes32): Self = StObject.set(x, "privateKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPublicKey(value: bytes32): Self = StObject.set(x, "publicKey", value.asInstanceOf[js.Any])
    }
  }
  
  trait SecureOutbound extends StObject {
    
    var conn: js.Any
    
    var remoteEarlyData: Buffer
    
    var remotePeer: ^
  }
  object SecureOutbound {
    
    @scala.inline
    def apply(conn: js.Any, remoteEarlyData: Buffer, remotePeer: ^): SecureOutbound = {
      val __obj = js.Dynamic.literal(conn = conn.asInstanceOf[js.Any], remoteEarlyData = remoteEarlyData.asInstanceOf[js.Any], remotePeer = remotePeer.asInstanceOf[js.Any])
      __obj.asInstanceOf[SecureOutbound]
    }
    
    @scala.inline
    implicit class SecureOutboundMutableBuilder[Self <: SecureOutbound] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConn(value: js.Any): Self = StObject.set(x, "conn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemoteEarlyData(value: Buffer): Self = StObject.set(x, "remoteEarlyData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemotePeer(value: ^): Self = StObject.set(x, "remotePeer", value.asInstanceOf[js.Any])
    }
  }
}
