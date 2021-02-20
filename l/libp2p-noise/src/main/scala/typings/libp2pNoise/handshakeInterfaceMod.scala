package typings.libp2pNoise

import typings.libp2pNoise.anon.Plaintext
import typings.libp2pNoise.basicMod.bytes
import typings.libp2pNoise.handshakeMod.NoiseSession
import typings.node.Buffer
import typings.peerId.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object handshakeInterfaceMod {
  
  @js.native
  trait IHandshake extends StObject {
    
    def decrypt(ciphertext: bytes, session: NoiseSession): Plaintext = js.native
    
    def encrypt(plaintext: bytes, session: NoiseSession): bytes = js.native
    
    var remoteEarlyData: Buffer = js.native
    
    var remotePeer: ^ = js.native
    
    var session: NoiseSession = js.native
  }
  object IHandshake {
    
    @scala.inline
    def apply(
      decrypt: (bytes, NoiseSession) => Plaintext,
      encrypt: (bytes, NoiseSession) => bytes,
      remoteEarlyData: Buffer,
      remotePeer: ^,
      session: NoiseSession
    ): IHandshake = {
      val __obj = js.Dynamic.literal(decrypt = js.Any.fromFunction2(decrypt), encrypt = js.Any.fromFunction2(encrypt), remoteEarlyData = remoteEarlyData.asInstanceOf[js.Any], remotePeer = remotePeer.asInstanceOf[js.Any], session = session.asInstanceOf[js.Any])
      __obj.asInstanceOf[IHandshake]
    }
    
    @scala.inline
    implicit class IHandshakeMutableBuilder[Self <: IHandshake] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDecrypt(value: (bytes, NoiseSession) => Plaintext): Self = StObject.set(x, "decrypt", js.Any.fromFunction2(value))
      
      @scala.inline
      def setEncrypt(value: (bytes, NoiseSession) => bytes): Self = StObject.set(x, "encrypt", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRemoteEarlyData(value: Buffer): Self = StObject.set(x, "remoteEarlyData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemotePeer(value: ^): Self = StObject.set(x, "remotePeer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSession(value: NoiseSession): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
    }
  }
}
