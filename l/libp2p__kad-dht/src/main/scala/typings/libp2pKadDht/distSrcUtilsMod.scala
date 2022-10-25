package typings.libp2pKadDht

import typings.interfaceDatastore.keyMod.Key
import typings.libp2pInterfacePeerId.mod.PeerId
import typings.libp2pInterfacePeerInfo.mod.PeerInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcUtilsMod {
  
  @JSImport("@libp2p/kad-dht/dist/src/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def bufferToKey(buf: js.typedarray.Uint8Array): Key = ^.asInstanceOf[js.Dynamic].applyDynamic("bufferToKey")(buf.asInstanceOf[js.Any]).asInstanceOf[Key]
  
  inline def bufferToRecordKey(buf: js.typedarray.Uint8Array): Key = ^.asInstanceOf[js.Dynamic].applyDynamic("bufferToRecordKey")(buf.asInstanceOf[js.Any]).asInstanceOf[Key]
  
  inline def convertBuffer(buf: js.typedarray.Uint8Array): js.Promise[js.typedarray.Uint8Array] = ^.asInstanceOf[js.Dynamic].applyDynamic("convertBuffer")(buf.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.typedarray.Uint8Array]]
  
  inline def convertPeerId(peerId: PeerId): js.Promise[js.typedarray.Uint8Array] = ^.asInstanceOf[js.Dynamic].applyDynamic("convertPeerId")(peerId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.typedarray.Uint8Array]]
  
  inline def createPutRecord(key: js.typedarray.Uint8Array, value: js.typedarray.Uint8Array): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("createPutRecord")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def debounce(callback: js.Function0[Unit]): js.Function0[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("debounce")(callback.asInstanceOf[js.Any]).asInstanceOf[js.Function0[Unit]]
  inline def debounce(callback: js.Function0[Unit], wait: Double): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("debounce")(callback.asInstanceOf[js.Any], wait.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  
  inline def fromPublicKeyKey(key: js.typedarray.Uint8Array): PeerId = ^.asInstanceOf[js.Dynamic].applyDynamic("fromPublicKeyKey")(key.asInstanceOf[js.Any]).asInstanceOf[PeerId]
  
  inline def isIPNSKey(key: js.typedarray.Uint8Array): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIPNSKey")(key.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isPublicKeyKey(key: js.typedarray.Uint8Array): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPublicKeyKey")(key.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def keyForPublicKey(peer: PeerId): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("keyForPublicKey")(peer.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def removePrivateAddresses(peer: PeerInfo): PeerInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("removePrivateAddresses")(peer.asInstanceOf[js.Any]).asInstanceOf[PeerInfo]
  
  inline def removePublicAddresses(peer: PeerInfo): PeerInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("removePublicAddresses")(peer.asInstanceOf[js.Any]).asInstanceOf[PeerInfo]
}
