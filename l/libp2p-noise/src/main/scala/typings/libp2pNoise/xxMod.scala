package typings.libp2pNoise

import typings.libp2pNoise.abstractHandshakeMod.AbstractHandshake
import typings.libp2pNoise.anon.Plaintext
import typings.libp2pNoise.basicMod.bytes
import typings.libp2pNoise.basicMod.bytes32
import typings.libp2pNoise.handshakeMod.MessageBuffer
import typings.libp2pNoise.handshakeMod.NoiseSession
import typings.libp2pNoise.libp2pMod.KeyPair
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("libp2p-noise/dist/src/handshakes/xx", JSImport.Namespace)
@js.native
object xxMod extends js.Object {
  
  @js.native
  class XX () extends AbstractHandshake {
    
    def initSession(initiator: Boolean, prologue: bytes32, s: KeyPair): NoiseSession = js.native
    
    var initializeInitiator: js.Any = js.native
    
    var initializeResponder: js.Any = js.native
    
    var readMessageA: js.Any = js.native
    
    var readMessageB: js.Any = js.native
    
    var readMessageC: js.Any = js.native
    
    def recvMessage(session: NoiseSession, message: MessageBuffer): Plaintext = js.native
    
    def sendMessage(session: NoiseSession, message: bytes): MessageBuffer = js.native
    def sendMessage(session: NoiseSession, message: bytes, ephemeral: KeyPair): MessageBuffer = js.native
    
    var writeMessageA: js.Any = js.native
    
    var writeMessageB: js.Any = js.native
    
    var writeMessageC: js.Any = js.native
  }
}
