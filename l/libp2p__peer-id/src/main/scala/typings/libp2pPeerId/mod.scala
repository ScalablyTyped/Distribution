package typings.libp2pPeerId

import typings.libp2pInterfacePeerId.mod.PeerId
import typings.libp2pInterfacePeerId.mod.PeerIdType
import typings.multiformats.cidMod.CID
import typings.multiformats.distTypesSrcBasesInterfaceMod.MultibaseDecoder
import typings.multiformats.distTypesSrcHashesInterfaceMod.MultihashDigest
import typings.multiformats.distTypesSrcLinkInterfaceMod.Version
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@libp2p/peer-id", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createPeerId(init: PeerIdInit): PeerId = ^.asInstanceOf[js.Dynamic].applyDynamic("createPeerId")(init.asInstanceOf[js.Any]).asInstanceOf[PeerId]
  
  inline def peerIdFromBytes(buf: js.typedarray.Uint8Array): PeerId = ^.asInstanceOf[js.Dynamic].applyDynamic("peerIdFromBytes")(buf.asInstanceOf[js.Any]).asInstanceOf[PeerId]
  
  inline def peerIdFromCID(cid: CID[Any, Double, Double, Version]): PeerId = ^.asInstanceOf[js.Dynamic].applyDynamic("peerIdFromCID")(cid.asInstanceOf[js.Any]).asInstanceOf[PeerId]
  
  inline def peerIdFromKeys(publicKey: js.typedarray.Uint8Array): js.Promise[PeerId] = ^.asInstanceOf[js.Dynamic].applyDynamic("peerIdFromKeys")(publicKey.asInstanceOf[js.Any]).asInstanceOf[js.Promise[PeerId]]
  inline def peerIdFromKeys(publicKey: js.typedarray.Uint8Array, privateKey: js.typedarray.Uint8Array): js.Promise[PeerId] = (^.asInstanceOf[js.Dynamic].applyDynamic("peerIdFromKeys")(publicKey.asInstanceOf[js.Any], privateKey.asInstanceOf[js.Any])).asInstanceOf[js.Promise[PeerId]]
  
  inline def peerIdFromPeerId(other: Any): PeerId = ^.asInstanceOf[js.Dynamic].applyDynamic("peerIdFromPeerId")(other.asInstanceOf[js.Any]).asInstanceOf[PeerId]
  
  inline def peerIdFromString(str: String): PeerId = ^.asInstanceOf[js.Dynamic].applyDynamic("peerIdFromString")(str.asInstanceOf[js.Any]).asInstanceOf[PeerId]
  inline def peerIdFromString(str: String, decoder: MultibaseDecoder[Any]): PeerId = (^.asInstanceOf[js.Dynamic].applyDynamic("peerIdFromString")(str.asInstanceOf[js.Any], decoder.asInstanceOf[js.Any])).asInstanceOf[PeerId]
  
  trait PeerIdInit extends StObject {
    
    var multihash: MultihashDigest[Double]
    
    var privateKey: js.UndefOr[js.typedarray.Uint8Array] = js.undefined
    
    var `type`: PeerIdType
  }
  object PeerIdInit {
    
    inline def apply(multihash: MultihashDigest[Double], `type`: PeerIdType): PeerIdInit = {
      val __obj = js.Dynamic.literal(multihash = multihash.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[PeerIdInit]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PeerIdInit] (val x: Self) extends AnyVal {
      
      inline def setMultihash(value: MultihashDigest[Double]): Self = StObject.set(x, "multihash", value.asInstanceOf[js.Any])
      
      inline def setPrivateKey(value: js.typedarray.Uint8Array): Self = StObject.set(x, "privateKey", value.asInstanceOf[js.Any])
      
      inline def setPrivateKeyUndefined: Self = StObject.set(x, "privateKey", js.undefined)
      
      inline def setType(value: PeerIdType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
