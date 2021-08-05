package typings.libp2pNoise

import typings.libp2pNoise.anon.Plaintext
import typings.libp2pNoise.basicMod.bytes
import typings.libp2pNoise.basicMod.bytes32
import typings.libp2pNoise.handshakeInterfaceMod.IHandshake
import typings.libp2pNoise.handshakeMod.NoiseSession
import typings.libp2pNoise.ikMod.IK
import typings.libp2pNoise.libp2pMod.KeyPair
import typings.libp2pNoise.noiseMod.WrappedConnection
import typings.node.Buffer
import typings.peerId.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object handshakeIkMod {
  
  @JSImport("libp2p-noise/dist/src/handshake-ik", "IKHandshake")
  @js.native
  class IKHandshake protected ()
    extends StObject
       with IHandshake {
    def this(
      isInitiator: Boolean,
      payload: bytes,
      prologue: bytes32,
      staticKeypair: KeyPair,
      connection: WrappedConnection,
      remoteStaticKey: bytes
    ) = this()
    def this(
      isInitiator: Boolean,
      payload: bytes,
      prologue: bytes32,
      staticKeypair: KeyPair,
      connection: WrappedConnection,
      remoteStaticKey: bytes,
      remotePeer: ^
    ) = this()
    def this(
      isInitiator: Boolean,
      payload: bytes,
      prologue: bytes32,
      staticKeypair: KeyPair,
      connection: WrappedConnection,
      remoteStaticKey: bytes,
      remotePeer: Unit,
      handshake: IK
    ) = this()
    def this(
      isInitiator: Boolean,
      payload: bytes,
      prologue: bytes32,
      staticKeypair: KeyPair,
      connection: WrappedConnection,
      remoteStaticKey: bytes,
      remotePeer: ^,
      handshake: IK
    ) = this()
    
    /* private */ var connection: js.Any = js.native
    
    /* CompleteClass */
    override def decrypt(ciphertext: bytes, session: NoiseSession): Plaintext = js.native
    
    /* CompleteClass */
    override def encrypt(plaintext: bytes, session: NoiseSession): bytes = js.native
    def encrypt(plaintext: Buffer, session: NoiseSession): Buffer = js.native
    
    /* private */ var getCS: js.Any = js.native
    
    def getLocalEphemeralKeys(): KeyPair = js.native
    
    /* private */ var ik: js.Any = js.native
    
    var isInitiator: Boolean = js.native
    
    /* private */ var payload: js.Any = js.native
    
    /* private */ var prologue: js.Any = js.native
    
    /* CompleteClass */
    var remoteEarlyData: Buffer = js.native
    
    /* CompleteClass */
    var remotePeer: ^ = js.native
    
    /* CompleteClass */
    var session: NoiseSession = js.native
    
    /* private */ var setRemoteEarlyData: js.Any = js.native
    
    def stage0(): js.Promise[Unit] = js.native
    
    def stage1(): js.Promise[Unit] = js.native
    
    /* private */ var staticKeypair: js.Any = js.native
  }
}
