package typings.libp2pNoise

import typings.libp2pNoise.basicMod.bytes
import typings.libp2pNoise.basicMod.bytes32
import typings.libp2pNoise.handshakeMod.Hkdf
import typings.libp2pNoise.libp2pMod.KeyPair
import typings.libp2pNoise.payloadMod.pb.INoiseHandshakePayload
import typings.peerId.mod.^
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("libp2p-noise/dist/src/utils", JSImport.Namespace)
@js.native
object utilsMod extends js.Object {
  
  def createHandshakePayload(libp2pPublicKey: Uint8Array, signedPayload: Uint8Array): bytes = js.native
  def createHandshakePayload(libp2pPublicKey: Uint8Array, signedPayload: Uint8Array, earlyData: Uint8Array): bytes = js.native
  
  def decodePayload(payload: bytes): INoiseHandshakePayload = js.native
  def decodePayload(payload: Uint8Array): INoiseHandshakePayload = js.native
  
  def generateKeypair(): KeyPair = js.native
  
  def getHandshakePayload(publicKey: bytes): bytes = js.native
  
  def getHkdf(ck: bytes32, ikm: bytes): Hkdf = js.native
  
  def getPayload(localPeer: ^, staticPublicKey: bytes): js.Promise[bytes] = js.native
  def getPayload(localPeer: ^, staticPublicKey: bytes, earlyData: bytes): js.Promise[bytes] = js.native
  
  def getPeerIdFromPayload(payload: INoiseHandshakePayload): js.Promise[^] = js.native
  
  def isValidPublicKey(pk: bytes): Boolean = js.native
  
  def signPayload(peerId: ^, payload: bytes): js.Promise[bytes] = js.native
  
  def verifySignedPayload(noiseStaticKey: bytes, payload: INoiseHandshakePayload, remotePeer: ^): js.Promise[^] = js.native
}
