package typings.libp2pNoise

import typings.libp2pNoise.anon.FnCall
import typings.libp2pNoise.basicMod.bytes
import typings.libp2pNoise.libp2pMod.INoiseConnection
import typings.libp2pNoise.libp2pMod.SecureOutbound
import typings.peerId.mod.^
import typings.std.ReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("libp2p-noise/dist/src/noise", JSImport.Namespace)
@js.native
object noiseMod extends js.Object {
  
  @js.native
  /**
    *
    * @param {bytes} staticNoiseKey x25519 private key, reuse for faster handshakes
    * @param {bytes} earlyData
    */
  class Noise () extends INoiseConnection {
    def this(staticNoiseKey: bytes) = this()
    def this(staticNoiseKey: js.UndefOr[scala.Nothing], earlyData: bytes) = this()
    def this(staticNoiseKey: bytes, earlyData: bytes) = this()
    
    var createSecureConnection: js.Any = js.native
    
    val earlyData: js.Any = js.native
    
    /**
      * If Noise pipes supported, tries IK handshake first with XX as fallback if it fails.
      * If noise pipes disabled or remote peer static key is unknown, use XX.
      * @param {HandshakeParams} params
      */
    var performHandshake: js.Any = js.native
    
    var performIKHandshake: js.Any = js.native
    
    var performXXFallbackHandshake: js.Any = js.native
    
    var performXXHandshake: js.Any = js.native
    
    val prologue: js.Any = js.native
    
    var protocol: String = js.native
    
    /**
      * Decrypt incoming data (handshake as responder).
      * @param {PeerId} localPeer - PeerId of the receiving peer.
      * @param {any} connection - streaming iterable duplex that will be encryption.
      * @param {PeerId} remotePeer - optional PeerId of the initiating peer, if known. This may only exist during transport upgrades.
      * @returns {Promise<SecureOutbound>}
      */
    def secureInbound(localPeer: ^, connection: js.Any): js.Promise[SecureOutbound] = js.native
    
    val staticKeys: js.Any = js.native
    
    var useNoisePipes: js.Any = js.native
  }
  
  type WrappedConnection = ReturnType[FnCall]
}
