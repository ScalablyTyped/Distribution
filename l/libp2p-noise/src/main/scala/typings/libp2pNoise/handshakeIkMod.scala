package typings.libp2pNoise

import typings.libp2pNoise.basicMod.bytes
import typings.libp2pNoise.basicMod.bytes32
import typings.libp2pNoise.handshakeInterfaceMod.IHandshake
import typings.libp2pNoise.handshakeMod.NoiseSession
import typings.libp2pNoise.ikMod.IK
import typings.libp2pNoise.libp2pMod.KeyPair
import typings.libp2pNoise.noiseMod.WrappedConnection
import typings.node.Buffer
import typings.peerId.mod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("libp2p-noise/dist/src/handshake-ik", JSImport.Namespace)
@js.native
object handshakeIkMod extends js.Object {
  
  @js.native
  class IKHandshake protected () extends IHandshake {
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
      remotePeer: js.UndefOr[scala.Nothing],
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
    
    var connection: js.Any = js.native
    
    def encrypt(plaintext: Buffer, session: NoiseSession): Buffer = js.native
    
    var getCS: js.Any = js.native
    
    def getLocalEphemeralKeys(): KeyPair = js.native
    
    var ik: js.Any = js.native
    
    var isInitiator: Boolean = js.native
    
    var payload: js.Any = js.native
    
    var prologue: js.Any = js.native
    
    var setRemoteEarlyData: js.Any = js.native
    
    def stage0(): js.Promise[Unit] = js.native
    
    def stage1(): js.Promise[Unit] = js.native
    
    var staticKeypair: js.Any = js.native
  }
}
