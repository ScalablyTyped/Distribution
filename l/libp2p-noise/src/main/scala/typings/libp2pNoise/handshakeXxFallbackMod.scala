package typings.libp2pNoise

import typings.libp2pNoise.basicMod.bytes
import typings.libp2pNoise.basicMod.bytes32
import typings.libp2pNoise.handshakeXxMod.XXHandshake
import typings.libp2pNoise.libp2pMod.KeyPair
import typings.libp2pNoise.noiseMod.WrappedConnection
import typings.libp2pNoise.xxMod.XX
import typings.peerId.mod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("libp2p-noise/dist/src/handshake-xx-fallback", JSImport.Namespace)
@js.native
object handshakeXxFallbackMod extends js.Object {
  
  @js.native
  class XXFallbackHandshake protected () extends XXHandshake {
    def this(
      isInitiator: Boolean,
      payload: bytes,
      prologue: bytes32,
      staticKeypair: KeyPair,
      connection: WrappedConnection,
      initialMsg: bytes
    ) = this()
    def this(
      isInitiator: Boolean,
      payload: bytes,
      prologue: bytes32,
      staticKeypair: KeyPair,
      connection: WrappedConnection,
      initialMsg: bytes,
      remotePeer: ^
    ) = this()
    def this(
      isInitiator: Boolean,
      payload: bytes,
      prologue: bytes32,
      staticKeypair: KeyPair,
      connection: WrappedConnection,
      initialMsg: bytes,
      remotePeer: js.UndefOr[scala.Nothing],
      ephemeralKeys: KeyPair
    ) = this()
    def this(
      isInitiator: Boolean,
      payload: bytes,
      prologue: bytes32,
      staticKeypair: KeyPair,
      connection: WrappedConnection,
      initialMsg: bytes,
      remotePeer: ^,
      ephemeralKeys: KeyPair
    ) = this()
    def this(
      isInitiator: Boolean,
      payload: bytes,
      prologue: bytes32,
      staticKeypair: KeyPair,
      connection: WrappedConnection,
      initialMsg: bytes,
      remotePeer: js.UndefOr[scala.Nothing],
      ephemeralKeys: js.UndefOr[scala.Nothing],
      handshake: XX
    ) = this()
    def this(
      isInitiator: Boolean,
      payload: bytes,
      prologue: bytes32,
      staticKeypair: KeyPair,
      connection: WrappedConnection,
      initialMsg: bytes,
      remotePeer: js.UndefOr[scala.Nothing],
      ephemeralKeys: KeyPair,
      handshake: XX
    ) = this()
    def this(
      isInitiator: Boolean,
      payload: bytes,
      prologue: bytes32,
      staticKeypair: KeyPair,
      connection: WrappedConnection,
      initialMsg: bytes,
      remotePeer: ^,
      ephemeralKeys: js.UndefOr[scala.Nothing],
      handshake: XX
    ) = this()
    def this(
      isInitiator: Boolean,
      payload: bytes,
      prologue: bytes32,
      staticKeypair: KeyPair,
      connection: WrappedConnection,
      initialMsg: bytes,
      remotePeer: ^,
      ephemeralKeys: KeyPair,
      handshake: XX
    ) = this()
    
    var ephemeralKeys: js.Any = js.native
    
    var initialMsg: js.Any = js.native
  }
}
