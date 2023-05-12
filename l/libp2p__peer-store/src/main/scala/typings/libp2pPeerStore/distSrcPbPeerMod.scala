package typings.libp2pPeerStore

import typings.libp2pPeerStore.anon.PartialAddress
import typings.libp2pPeerStore.anon.PartialPeer
import typings.libp2pPeerStore.anon.PartialPeermetadataEntry
import typings.libp2pPeerStore.anon.PartialPeertagsEntry
import typings.libp2pPeerStore.anon.PartialTag
import typings.protonsRuntime.distSrcCodecMod.Codec
import typings.std.Map
import typings.uint8arraylist.mod.Uint8ArrayList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcPbPeerMod {
  
  trait Address extends StObject {
    
    var isCertified: js.UndefOr[Boolean] = js.undefined
    
    var multiaddr: js.typedarray.Uint8Array
  }
  object Address {
    
    inline def apply(multiaddr: js.typedarray.Uint8Array): Address = {
      val __obj = js.Dynamic.literal(multiaddr = multiaddr.asInstanceOf[js.Any])
      __obj.asInstanceOf[Address]
    }
    
    @JSImport("@libp2p/peer-store/dist/src/pb/peer", "Address")
    @js.native
    val ^ : js.Any = js.native
    
    inline def codec(): Codec[Address] = ^.asInstanceOf[js.Dynamic].applyDynamic("codec")().asInstanceOf[Codec[Address]]
    
    inline def decode(buf: js.typedarray.Uint8Array): Address = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(buf.asInstanceOf[js.Any]).asInstanceOf[Address]
    inline def decode(buf: Uint8ArrayList): Address = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(buf.asInstanceOf[js.Any]).asInstanceOf[Address]
    
    inline def encode(obj: PartialAddress): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(obj.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Address] (val x: Self) extends AnyVal {
      
      inline def setIsCertified(value: Boolean): Self = StObject.set(x, "isCertified", value.asInstanceOf[js.Any])
      
      inline def setIsCertifiedUndefined: Self = StObject.set(x, "isCertified", js.undefined)
      
      inline def setMultiaddr(value: js.typedarray.Uint8Array): Self = StObject.set(x, "multiaddr", value.asInstanceOf[js.Any])
    }
  }
  
  trait Peer extends StObject {
    
    var addresses: js.Array[Address]
    
    var metadata: Map[String, js.typedarray.Uint8Array]
    
    var peerRecordEnvelope: js.UndefOr[js.typedarray.Uint8Array] = js.undefined
    
    var protocols: js.Array[String]
    
    var publicKey: js.UndefOr[js.typedarray.Uint8Array] = js.undefined
    
    var tags: Map[String, Tag]
  }
  object Peer {
    
    inline def apply(
      addresses: js.Array[Address],
      metadata: Map[String, js.typedarray.Uint8Array],
      protocols: js.Array[String],
      tags: Map[String, Tag]
    ): Peer = {
      val __obj = js.Dynamic.literal(addresses = addresses.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], protocols = protocols.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
      __obj.asInstanceOf[Peer]
    }
    
    @JSImport("@libp2p/peer-store/dist/src/pb/peer", "Peer")
    @js.native
    val ^ : js.Any = js.native
    
    trait PeermetadataEntry extends StObject {
      
      var key: String
      
      var value: js.typedarray.Uint8Array
    }
    object PeermetadataEntry {
      
      inline def apply(key: String, value: js.typedarray.Uint8Array): PeermetadataEntry = {
        val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
        __obj.asInstanceOf[PeermetadataEntry]
      }
      
      @JSImport("@libp2p/peer-store/dist/src/pb/peer", "Peer.Peer$metadataEntry")
      @js.native
      val ^ : js.Any = js.native
      
      inline def codec(): Codec[PeermetadataEntry] = ^.asInstanceOf[js.Dynamic].applyDynamic("codec")().asInstanceOf[Codec[PeermetadataEntry]]
      
      inline def decode(buf: js.typedarray.Uint8Array): PeermetadataEntry = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(buf.asInstanceOf[js.Any]).asInstanceOf[PeermetadataEntry]
      inline def decode(buf: Uint8ArrayList): PeermetadataEntry = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(buf.asInstanceOf[js.Any]).asInstanceOf[PeermetadataEntry]
      
      inline def encode(obj: PartialPeermetadataEntry): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(obj.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
      
      @scala.inline
      implicit open class MutableBuilder[Self <: PeermetadataEntry] (val x: Self) extends AnyVal {
        
        inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
        
        inline def setValue(value: js.typedarray.Uint8Array): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      }
    }
    
    trait PeertagsEntry extends StObject {
      
      var key: String
      
      var value: js.UndefOr[Tag] = js.undefined
    }
    object PeertagsEntry {
      
      inline def apply(key: String): PeertagsEntry = {
        val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
        __obj.asInstanceOf[PeertagsEntry]
      }
      
      @JSImport("@libp2p/peer-store/dist/src/pb/peer", "Peer.Peer$tagsEntry")
      @js.native
      val ^ : js.Any = js.native
      
      inline def codec(): Codec[PeertagsEntry] = ^.asInstanceOf[js.Dynamic].applyDynamic("codec")().asInstanceOf[Codec[PeertagsEntry]]
      
      inline def decode(buf: js.typedarray.Uint8Array): PeertagsEntry = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(buf.asInstanceOf[js.Any]).asInstanceOf[PeertagsEntry]
      inline def decode(buf: Uint8ArrayList): PeertagsEntry = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(buf.asInstanceOf[js.Any]).asInstanceOf[PeertagsEntry]
      
      inline def encode(obj: PartialPeertagsEntry): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(obj.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
      
      @scala.inline
      implicit open class MutableBuilder[Self <: PeertagsEntry] (val x: Self) extends AnyVal {
        
        inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
        
        inline def setValue(value: Tag): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
        
        inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      }
    }
    
    inline def codec(): Codec[Peer] = ^.asInstanceOf[js.Dynamic].applyDynamic("codec")().asInstanceOf[Codec[Peer]]
    
    inline def decode(buf: js.typedarray.Uint8Array): Peer = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(buf.asInstanceOf[js.Any]).asInstanceOf[Peer]
    inline def decode(buf: Uint8ArrayList): Peer = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(buf.asInstanceOf[js.Any]).asInstanceOf[Peer]
    
    inline def encode(obj: PartialPeer): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(obj.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Peer] (val x: Self) extends AnyVal {
      
      inline def setAddresses(value: js.Array[Address]): Self = StObject.set(x, "addresses", value.asInstanceOf[js.Any])
      
      inline def setAddressesVarargs(value: Address*): Self = StObject.set(x, "addresses", js.Array(value*))
      
      inline def setMetadata(value: Map[String, js.typedarray.Uint8Array]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      inline def setPeerRecordEnvelope(value: js.typedarray.Uint8Array): Self = StObject.set(x, "peerRecordEnvelope", value.asInstanceOf[js.Any])
      
      inline def setPeerRecordEnvelopeUndefined: Self = StObject.set(x, "peerRecordEnvelope", js.undefined)
      
      inline def setProtocols(value: js.Array[String]): Self = StObject.set(x, "protocols", value.asInstanceOf[js.Any])
      
      inline def setProtocolsVarargs(value: String*): Self = StObject.set(x, "protocols", js.Array(value*))
      
      inline def setPublicKey(value: js.typedarray.Uint8Array): Self = StObject.set(x, "publicKey", value.asInstanceOf[js.Any])
      
      inline def setPublicKeyUndefined: Self = StObject.set(x, "publicKey", js.undefined)
      
      inline def setTags(value: Map[String, Tag]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    }
  }
  
  trait Tag extends StObject {
    
    var expiry: js.UndefOr[js.BigInt] = js.undefined
    
    var value: Double
  }
  object Tag {
    
    inline def apply(value: Double): Tag = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Tag]
    }
    
    @JSImport("@libp2p/peer-store/dist/src/pb/peer", "Tag")
    @js.native
    val ^ : js.Any = js.native
    
    inline def codec(): Codec[Tag] = ^.asInstanceOf[js.Dynamic].applyDynamic("codec")().asInstanceOf[Codec[Tag]]
    
    inline def decode(buf: js.typedarray.Uint8Array): Tag = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(buf.asInstanceOf[js.Any]).asInstanceOf[Tag]
    inline def decode(buf: Uint8ArrayList): Tag = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(buf.asInstanceOf[js.Any]).asInstanceOf[Tag]
    
    inline def encode(obj: PartialTag): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(obj.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Tag] (val x: Self) extends AnyVal {
      
      inline def setExpiry(value: js.BigInt): Self = StObject.set(x, "expiry", value.asInstanceOf[js.Any])
      
      inline def setExpiryUndefined: Self = StObject.set(x, "expiry", js.undefined)
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
