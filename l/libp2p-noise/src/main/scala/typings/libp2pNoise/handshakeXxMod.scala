package typings.libp2pNoise

import typings.libp2pNoise.anon.Plaintext
import typings.libp2pNoise.basicMod.bytes
import typings.libp2pNoise.basicMod.bytes32
import typings.libp2pNoise.handshakeInterfaceMod.IHandshake
import typings.libp2pNoise.handshakeMod.NoiseSession
import typings.libp2pNoise.libp2pMod.KeyPair
import typings.libp2pNoise.noiseMod.WrappedConnection
import typings.libp2pNoise.xxMod.XX
import typings.node.Buffer
import typings.peerId.mod.^
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object handshakeXxMod {
  
  @JSImport("libp2p-noise/dist/src/handshake-xx", "XXHandshake")
  @js.native
  class XXHandshake protected ()
    extends StObject
       with IHandshake {
    def this(
      isInitiator: Boolean,
      payload: bytes,
      prologue: bytes32,
      staticKeypair: KeyPair,
      connection: WrappedConnection
    ) = this()
    def this(
      isInitiator: Boolean,
      payload: bytes,
      prologue: bytes32,
      staticKeypair: KeyPair,
      connection: WrappedConnection,
      remotePeer: ^
    ) = this()
    def this(
      isInitiator: Boolean,
      payload: bytes,
      prologue: bytes32,
      staticKeypair: KeyPair,
      connection: WrappedConnection,
      remotePeer: Unit,
      handshake: XX
    ) = this()
    def this(
      isInitiator: Boolean,
      payload: bytes,
      prologue: bytes32,
      staticKeypair: KeyPair,
      connection: WrappedConnection,
      remotePeer: ^,
      handshake: XX
    ) = this()
    
    /* protected */ var connection: WrappedConnection = js.native
    
    /* CompleteClass */
    override def decrypt(ciphertext: bytes, session: NoiseSession): Plaintext = js.native
    
    /* CompleteClass */
    override def encrypt(plaintext: bytes, session: NoiseSession): bytes = js.native
    
    def exchange(): js.Promise[Unit] = js.native
    
    def finish(): js.Promise[Unit] = js.native
    
    /* private */ var getCS: js.Any = js.native
    
    def getRemoteStaticKey(): bytes = js.native
    
    var isInitiator: Boolean = js.native
    
    /* protected */ var payload: bytes = js.native
    
    /* private */ var prologue: js.Any = js.native
    
    def propose(): js.Promise[Unit] = js.native
    
    /* CompleteClass */
    var remoteEarlyData: Buffer = js.native
    
    /* CompleteClass */
    var remotePeer: ^ = js.native
    
    /* CompleteClass */
    var session: NoiseSession = js.native
    
    /* protected */ def setRemoteEarlyData(): Unit = js.native
    /* protected */ def setRemoteEarlyData(data: Uint8Array): Unit = js.native
    
    /* protected */ var staticKeypair: KeyPair = js.native
    
    /* protected */ var xx: XX = js.native
  }
}
