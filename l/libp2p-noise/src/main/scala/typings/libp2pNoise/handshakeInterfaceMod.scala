package typings.libp2pNoise

import typings.libp2pNoise.anon.Plaintext
import typings.libp2pNoise.basicMod.bytes
import typings.libp2pNoise.handshakeMod.NoiseSession
import typings.node.Buffer
import typings.peerId.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object handshakeInterfaceMod {
  
  trait IHandshake extends StObject {
    
    def decrypt(ciphertext: bytes, session: NoiseSession): Plaintext
    
    def encrypt(plaintext: bytes, session: NoiseSession): bytes
    
    var remoteEarlyData: Buffer
    
    var remotePeer: ^
    
    var session: NoiseSession
  }
  object IHandshake {
    
    inline def apply(
      decrypt: (bytes, NoiseSession) => Plaintext,
      encrypt: (bytes, NoiseSession) => bytes,
      remoteEarlyData: Buffer,
      remotePeer: ^,
      session: NoiseSession
    ): IHandshake = {
      val __obj = js.Dynamic.literal(decrypt = js.Any.fromFunction2(decrypt), encrypt = js.Any.fromFunction2(encrypt), remoteEarlyData = remoteEarlyData.asInstanceOf[js.Any], remotePeer = remotePeer.asInstanceOf[js.Any], session = session.asInstanceOf[js.Any])
      __obj.asInstanceOf[IHandshake]
    }
    
    extension [Self <: IHandshake](x: Self) {
      
      inline def setDecrypt(value: (bytes, NoiseSession) => Plaintext): Self = StObject.set(x, "decrypt", js.Any.fromFunction2(value))
      
      inline def setEncrypt(value: (bytes, NoiseSession) => bytes): Self = StObject.set(x, "encrypt", js.Any.fromFunction2(value))
      
      inline def setRemoteEarlyData(value: Buffer): Self = StObject.set(x, "remoteEarlyData", value.asInstanceOf[js.Any])
      
      inline def setRemotePeer(value: ^): Self = StObject.set(x, "remotePeer", value.asInstanceOf[js.Any])
      
      inline def setSession(value: NoiseSession): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
    }
  }
}
