package typings.libp2pNoise

import typings.libp2pNoise.basicMod.bytes
import typings.libp2pNoise.basicMod.bytes32
import typings.libp2pNoise.handshakeMod.Hkdf
import typings.libp2pNoise.libp2pMod.KeyPair
import typings.libp2pNoise.payloadMod.pb.INoiseHandshakePayload
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("libp2p-noise/dist/src/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createHandshakePayload(libp2pPublicKey: Uint8Array, signedPayload: Uint8Array): bytes = (^.asInstanceOf[js.Dynamic].applyDynamic("createHandshakePayload")(libp2pPublicKey.asInstanceOf[js.Any], signedPayload.asInstanceOf[js.Any])).asInstanceOf[bytes]
  inline def createHandshakePayload(libp2pPublicKey: Uint8Array, signedPayload: Uint8Array, earlyData: Uint8Array): bytes = (^.asInstanceOf[js.Dynamic].applyDynamic("createHandshakePayload")(libp2pPublicKey.asInstanceOf[js.Any], signedPayload.asInstanceOf[js.Any], earlyData.asInstanceOf[js.Any])).asInstanceOf[bytes]
  
  inline def decodePayload(payload: bytes): INoiseHandshakePayload = ^.asInstanceOf[js.Dynamic].applyDynamic("decodePayload")(payload.asInstanceOf[js.Any]).asInstanceOf[INoiseHandshakePayload]
  inline def decodePayload(payload: Uint8Array): INoiseHandshakePayload = ^.asInstanceOf[js.Dynamic].applyDynamic("decodePayload")(payload.asInstanceOf[js.Any]).asInstanceOf[INoiseHandshakePayload]
  
  inline def generateKeypair(): KeyPair = ^.asInstanceOf[js.Dynamic].applyDynamic("generateKeypair")().asInstanceOf[KeyPair]
  
  inline def getHandshakePayload(publicKey: bytes): bytes = ^.asInstanceOf[js.Dynamic].applyDynamic("getHandshakePayload")(publicKey.asInstanceOf[js.Any]).asInstanceOf[bytes]
  
  inline def getHkdf(ck: bytes32, ikm: bytes): Hkdf = (^.asInstanceOf[js.Dynamic].applyDynamic("getHkdf")(ck.asInstanceOf[js.Any], ikm.asInstanceOf[js.Any])).asInstanceOf[Hkdf]
  
  inline def getPayload(localPeer: typings.peerId.mod.^, staticPublicKey: bytes): js.Promise[bytes] = (^.asInstanceOf[js.Dynamic].applyDynamic("getPayload")(localPeer.asInstanceOf[js.Any], staticPublicKey.asInstanceOf[js.Any])).asInstanceOf[js.Promise[bytes]]
  inline def getPayload(localPeer: typings.peerId.mod.^, staticPublicKey: bytes, earlyData: bytes): js.Promise[bytes] = (^.asInstanceOf[js.Dynamic].applyDynamic("getPayload")(localPeer.asInstanceOf[js.Any], staticPublicKey.asInstanceOf[js.Any], earlyData.asInstanceOf[js.Any])).asInstanceOf[js.Promise[bytes]]
  
  inline def getPeerIdFromPayload(payload: INoiseHandshakePayload): js.Promise[typings.peerId.mod.^] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPeerIdFromPayload")(payload.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.peerId.mod.^]]
  
  inline def isValidPublicKey(pk: bytes): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidPublicKey")(pk.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def signPayload(peerId: typings.peerId.mod.^, payload: bytes): js.Promise[bytes] = (^.asInstanceOf[js.Dynamic].applyDynamic("signPayload")(peerId.asInstanceOf[js.Any], payload.asInstanceOf[js.Any])).asInstanceOf[js.Promise[bytes]]
  
  inline def verifySignedPayload(noiseStaticKey: bytes, payload: INoiseHandshakePayload, remotePeer: typings.peerId.mod.^): js.Promise[typings.peerId.mod.^] = (^.asInstanceOf[js.Dynamic].applyDynamic("verifySignedPayload")(noiseStaticKey.asInstanceOf[js.Any], payload.asInstanceOf[js.Any], remotePeer.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.peerId.mod.^]]
}
