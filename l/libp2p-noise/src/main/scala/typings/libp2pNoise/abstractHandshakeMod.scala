package typings.libp2pNoise

import typings.libp2pNoise.anon.Cs1
import typings.libp2pNoise.anon.Plaintext
import typings.libp2pNoise.basicMod.bytes
import typings.libp2pNoise.basicMod.bytes32
import typings.libp2pNoise.basicMod.uint32
import typings.libp2pNoise.handshakeMod.CipherState
import typings.libp2pNoise.handshakeMod.MessageBuffer
import typings.libp2pNoise.handshakeMod.SymmetricState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object abstractHandshakeMod {
  
  @JSImport("libp2p-noise/dist/src/handshakes/abstract-handshake", "AbstractHandshake")
  @js.native
  abstract class AbstractHandshake () extends StObject {
    
    /* protected */ def createEmptyKey(): bytes32 = js.native
    
    /* protected */ def decrypt(k: bytes32, n: uint32, ad: bytes, ciphertext: bytes): Plaintext = js.native
    
    /* protected */ def decryptAndHash(ss: SymmetricState, ciphertext: bytes): Plaintext = js.native
    
    def decryptWithAd(cs: CipherState, ad: bytes, ciphertext: bytes): Plaintext = js.native
    
    /* protected */ def dh(privateKey: bytes32, publicKey: bytes32): bytes32 = js.native
    
    /* protected */ def encrypt(k: bytes32, n: uint32, ad: bytes, plaintext: bytes): bytes = js.native
    
    /* protected */ def encryptAndHash(ss: SymmetricState, plaintext: bytes): bytes = js.native
    
    def encryptWithAd(cs: CipherState, ad: bytes, plaintext: bytes): bytes = js.native
    
    /* protected */ def getHash(a: bytes, b: bytes): bytes32 = js.native
    
    /* protected */ def hasKey(cs: CipherState): Boolean = js.native
    
    /* protected */ def hashProtocolName(protocolName: bytes): bytes32 = js.native
    
    /* protected */ def incrementNonce(n: uint32): uint32 = js.native
    
    /* protected */ def initializeKey(k: bytes32): CipherState = js.native
    
    /* protected */ def initializeSymmetric(protocolName: String): SymmetricState = js.native
    
    /* protected */ def isEmptyKey(k: bytes32): Boolean = js.native
    
    /* protected */ def mixHash(ss: SymmetricState, data: bytes): Unit = js.native
    
    /* protected */ def mixKey(ss: SymmetricState, ikm: bytes32): Unit = js.native
    
    /* protected */ def nonceToBytes(n: uint32): bytes = js.native
    
    /* protected */ def readMessageRegular(cs: CipherState, message: MessageBuffer): Plaintext = js.native
    
    /* protected */ def setNonce(cs: CipherState, nonce: uint32): Unit = js.native
    
    /* protected */ def split(ss: SymmetricState): Cs1 = js.native
    
    /* protected */ def writeMessageRegular(cs: CipherState, payload: bytes): MessageBuffer = js.native
  }
  
  @JSImport("libp2p-noise/dist/src/handshakes/abstract-handshake", "MIN_NONCE")
  @js.native
  val MIN_NONCE: /* 0 */ Double = js.native
}
