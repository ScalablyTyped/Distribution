package typings.libp2pNoise

import typings.libp2pNoise.basicMod.bytes
import typings.libp2pNoise.basicMod.bytes32
import typings.libp2pNoise.handshakeXxMod.XXHandshake
import typings.libp2pNoise.libp2pMod.KeyPair
import typings.libp2pNoise.noiseMod.WrappedConnection
import typings.libp2pNoise.xxMod.XX
import typings.peerId.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object handshakeXxFallbackMod {
  
  @JSImport("libp2p-noise/dist/src/handshake-xx-fallback", "XXFallbackHandshake")
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
      remotePeer: Unit,
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
      remotePeer: Unit,
      ephemeralKeys: Unit,
      handshake: XX
    ) = this()
    def this(
      isInitiator: Boolean,
      payload: bytes,
      prologue: bytes32,
      staticKeypair: KeyPair,
      connection: WrappedConnection,
      initialMsg: bytes,
      remotePeer: Unit,
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
      ephemeralKeys: Unit,
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
    
    /* private */ var ephemeralKeys: js.Any = js.native
    
    /* private */ var initialMsg: js.Any = js.native
  }
}
