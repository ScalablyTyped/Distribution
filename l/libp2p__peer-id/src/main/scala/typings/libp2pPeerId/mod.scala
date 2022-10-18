package typings.libp2pPeerId

import typings.libp2pInterfacePeerId.mod.PeerId
import typings.libp2pPeerId.libp2pPeerIdStrings.Ed25519
import typings.libp2pPeerId.libp2pPeerIdStrings.RSA
import typings.libp2pPeerId.libp2pPeerIdStrings.secp256k1
import typings.multiformats.cidMod.CID
import typings.multiformats.distTypesSrcLinkInterfaceMod.Version
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@libp2p/peer-id", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createPeerId(init: PeerIdInit): PeerIdImpl = ^.asInstanceOf[js.Dynamic].applyDynamic("createPeerId")(init.asInstanceOf[js.Any]).asInstanceOf[PeerIdImpl]
  
  inline def peerIdFromBytes(buf: js.typedarray.Uint8Array): PeerId = ^.asInstanceOf[js.Dynamic].applyDynamic("peerIdFromBytes")(buf.asInstanceOf[js.Any]).asInstanceOf[PeerId]
  
  inline def peerIdFromCID(cid: CID[Any, Double, Double, Version]): PeerId = ^.asInstanceOf[js.Dynamic].applyDynamic("peerIdFromCID")(cid.asInstanceOf[js.Any]).asInstanceOf[PeerId]
  
  inline def peerIdFromKeys(publicKey: js.typedarray.Uint8Array): js.Promise[PeerId] = ^.asInstanceOf[js.Dynamic].applyDynamic("peerIdFromKeys")(publicKey.asInstanceOf[js.Any]).asInstanceOf[js.Promise[PeerId]]
  inline def peerIdFromKeys(publicKey: js.typedarray.Uint8Array, privateKey: js.typedarray.Uint8Array): js.Promise[PeerId] = (^.asInstanceOf[js.Dynamic].applyDynamic("peerIdFromKeys")(publicKey.asInstanceOf[js.Any], privateKey.asInstanceOf[js.Any])).asInstanceOf[js.Promise[PeerId]]
  
  inline def peerIdFromPeerId(other: Any): PeerId = ^.asInstanceOf[js.Dynamic].applyDynamic("peerIdFromPeerId")(other.asInstanceOf[js.Any]).asInstanceOf[PeerId]
  
  inline def peerIdFromString(str: String): PeerId = ^.asInstanceOf[js.Dynamic].applyDynamic("peerIdFromString")(str.asInstanceOf[js.Any]).asInstanceOf[PeerId]
  inline def peerIdFromString(
    str: String,
    decoder: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MultibaseDecoder<any> */ Any
  ): PeerId = (^.asInstanceOf[js.Dynamic].applyDynamic("peerIdFromString")(str.asInstanceOf[js.Any], decoder.asInstanceOf[js.Any])).asInstanceOf[PeerId]
  
  @js.native
  trait PeerIdImpl extends StObject {
    
    def equals(id: String): Boolean = js.native
    def equals(id: js.typedarray.Uint8Array): Boolean = js.native
    /**
      * Checks the equality of `this` peer against a given PeerId
      */
    def equals(id: PeerId): Boolean = js.native
    
    var get: Any = js.native
    
    val multihash: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MultihashDigest */ Any = js.native
    
    val privateKey: js.UndefOr[js.typedarray.Uint8Array] = js.native
    
    val publicKey: js.UndefOr[js.typedarray.Uint8Array] = js.native
    
    /* private */ var string: Any = js.native
    
    def toBytes(): js.typedarray.Uint8Array = js.native
    
    def toCID(): CID[Any, Double, Double, Version] = js.native
    
    /**
      * Returns Multiaddr as a JSON encoded object
      */
    def toJSON(): String = js.native
    
    @JSName(js.Symbol.toStringTag)
    var toStringTag: js.Function0[String] = js.native
    
    var `type`: RSA | Ed25519 | secp256k1 = js.native
  }
  
  trait PeerIdInit extends StObject {
    
    var multihash: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MultihashDigest */ Any
    
    var privateKey: js.UndefOr[js.typedarray.Uint8Array] = js.undefined
    
    var `type`: RSA | Ed25519 | secp256k1
  }
  object PeerIdInit {
    
    inline def apply(
      multihash: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MultihashDigest */ Any,
      `type`: RSA | Ed25519 | secp256k1
    ): PeerIdInit = {
      val __obj = js.Dynamic.literal(multihash = multihash.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[PeerIdInit]
    }
    
    extension [Self <: PeerIdInit](x: Self) {
      
      inline def setMultihash(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MultihashDigest */ Any
      ): Self = StObject.set(x, "multihash", value.asInstanceOf[js.Any])
      
      inline def setPrivateKey(value: js.typedarray.Uint8Array): Self = StObject.set(x, "privateKey", value.asInstanceOf[js.Any])
      
      inline def setPrivateKeyUndefined: Self = StObject.set(x, "privateKey", js.undefined)
      
      inline def setType(value: RSA | Ed25519 | secp256k1): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
