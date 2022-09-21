package typings.libp2pPeerIdFactory

import typings.libp2pInterfaceKeys.mod.PrivateKey
import typings.libp2pInterfaceKeys.mod.PublicKey
import typings.libp2pInterfacePeerId.mod.Ed25519PeerId
import typings.libp2pInterfacePeerId.mod.PeerId
import typings.libp2pInterfacePeerId.mod.RSAPeerId
import typings.libp2pInterfacePeerId.mod.Secp256k1PeerId
import typings.libp2pPeerIdFactory.anon.Bits
import typings.libp2pPeerIdFactory.anon.Id
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@libp2p/peer-id-factory", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createEd25519PeerId(): js.Promise[Ed25519PeerId] = ^.asInstanceOf[js.Dynamic].applyDynamic("createEd25519PeerId")().asInstanceOf[js.Promise[Ed25519PeerId]]
  
  inline def createFromJSON(obj: Id): js.Promise[PeerId] = ^.asInstanceOf[js.Dynamic].applyDynamic("createFromJSON")(obj.asInstanceOf[js.Any]).asInstanceOf[js.Promise[PeerId]]
  
  inline def createFromPrivKey(privateKey: PrivateKey): js.Promise[PeerId] = ^.asInstanceOf[js.Dynamic].applyDynamic("createFromPrivKey")(privateKey.asInstanceOf[js.Any]).asInstanceOf[js.Promise[PeerId]]
  
  inline def createFromProtobuf(buf: js.typedarray.Uint8Array): js.Promise[PeerId] = ^.asInstanceOf[js.Dynamic].applyDynamic("createFromProtobuf")(buf.asInstanceOf[js.Any]).asInstanceOf[js.Promise[PeerId]]
  
  inline def createFromPubKey(publicKey: PublicKey): js.Promise[PeerId] = ^.asInstanceOf[js.Dynamic].applyDynamic("createFromPubKey")(publicKey.asInstanceOf[js.Any]).asInstanceOf[js.Promise[PeerId]]
  
  inline def createRSAPeerId(): js.Promise[RSAPeerId] = ^.asInstanceOf[js.Dynamic].applyDynamic("createRSAPeerId")().asInstanceOf[js.Promise[RSAPeerId]]
  inline def createRSAPeerId(opts: Bits): js.Promise[RSAPeerId] = ^.asInstanceOf[js.Dynamic].applyDynamic("createRSAPeerId")(opts.asInstanceOf[js.Any]).asInstanceOf[js.Promise[RSAPeerId]]
  
  inline def createSecp256k1PeerId(): js.Promise[Secp256k1PeerId] = ^.asInstanceOf[js.Dynamic].applyDynamic("createSecp256k1PeerId")().asInstanceOf[js.Promise[Secp256k1PeerId]]
  
  inline def exportToProtobuf(peerId: Ed25519PeerId): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("exportToProtobuf")(peerId.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  inline def exportToProtobuf(peerId: Ed25519PeerId, excludePrivateKey: Boolean): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("exportToProtobuf")(peerId.asInstanceOf[js.Any], excludePrivateKey.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def exportToProtobuf(peerId: RSAPeerId): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("exportToProtobuf")(peerId.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  inline def exportToProtobuf(peerId: RSAPeerId, excludePrivateKey: Boolean): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("exportToProtobuf")(peerId.asInstanceOf[js.Any], excludePrivateKey.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def exportToProtobuf(peerId: Secp256k1PeerId): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("exportToProtobuf")(peerId.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  inline def exportToProtobuf(peerId: Secp256k1PeerId, excludePrivateKey: Boolean): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("exportToProtobuf")(peerId.asInstanceOf[js.Any], excludePrivateKey.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
}
