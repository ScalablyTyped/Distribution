package typings.libp2pNoise

import typings.libp2pNoise.abstractHandshakeMod.AbstractHandshake
import typings.libp2pNoise.anon.Plaintext
import typings.libp2pNoise.basicMod.bytes
import typings.libp2pNoise.basicMod.bytes32
import typings.libp2pNoise.handshakeMod.MessageBuffer
import typings.libp2pNoise.handshakeMod.NoiseSession
import typings.libp2pNoise.libp2pMod.KeyPair
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object xxMod {
  
  @JSImport("libp2p-noise/dist/src/handshakes/xx", "XX")
  @js.native
  class XX () extends AbstractHandshake {
    
    def initSession(initiator: Boolean, prologue: bytes32, s: KeyPair): NoiseSession = js.native
    
    /* private */ var initializeInitiator: js.Any = js.native
    
    /* private */ var initializeResponder: js.Any = js.native
    
    /* private */ var readMessageA: js.Any = js.native
    
    /* private */ var readMessageB: js.Any = js.native
    
    /* private */ var readMessageC: js.Any = js.native
    
    def recvMessage(session: NoiseSession, message: MessageBuffer): Plaintext = js.native
    
    def sendMessage(session: NoiseSession, message: bytes): MessageBuffer = js.native
    def sendMessage(session: NoiseSession, message: bytes, ephemeral: KeyPair): MessageBuffer = js.native
    
    /* private */ var writeMessageA: js.Any = js.native
    
    /* private */ var writeMessageB: js.Any = js.native
    
    /* private */ var writeMessageC: js.Any = js.native
  }
}
