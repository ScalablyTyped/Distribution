package typings.libp2pPeerStore

import typings.libp2pInterfacePeerStore.mod.TagOptions
import typings.libp2pPeerStore.distSrcPbPeerMod.Address
import typings.libp2pPeerStore.distSrcPbPeerMod.Tag
import typings.multiformatsMultiaddr.mod.Multiaddr_
import typings.std.Map
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Partial<@libp2p/peer-store.@libp2p/peer-store/dist/src/pb/peer.Address> */
  trait PartialAddress extends StObject {
    
    var isCertified: js.UndefOr[Boolean] = js.undefined
    
    var multiaddr: js.UndefOr[js.typedarray.Uint8Array] = js.undefined
  }
  object PartialAddress {
    
    inline def apply(): PartialAddress = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialAddress]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialAddress] (val x: Self) extends AnyVal {
      
      inline def setIsCertified(value: Boolean): Self = StObject.set(x, "isCertified", value.asInstanceOf[js.Any])
      
      inline def setIsCertifiedUndefined: Self = StObject.set(x, "isCertified", js.undefined)
      
      inline def setMultiaddr(value: js.typedarray.Uint8Array): Self = StObject.set(x, "multiaddr", value.asInstanceOf[js.Any])
      
      inline def setMultiaddrUndefined: Self = StObject.set(x, "multiaddr", js.undefined)
    }
  }
  
  /* Inlined std.Partial<@libp2p/peer-store.@libp2p/peer-store/dist/src/pb/peer.Peer> */
  trait PartialPeer extends StObject {
    
    var addresses: js.UndefOr[js.Array[Address]] = js.undefined
    
    var metadata: js.UndefOr[Map[String, js.typedarray.Uint8Array]] = js.undefined
    
    var peerRecordEnvelope: js.UndefOr[js.typedarray.Uint8Array] = js.undefined
    
    var protocols: js.UndefOr[js.Array[String]] = js.undefined
    
    var publicKey: js.UndefOr[js.typedarray.Uint8Array] = js.undefined
    
    var tags: js.UndefOr[Map[String, Tag]] = js.undefined
  }
  object PartialPeer {
    
    inline def apply(): PartialPeer = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialPeer]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialPeer] (val x: Self) extends AnyVal {
      
      inline def setAddresses(value: js.Array[Address]): Self = StObject.set(x, "addresses", value.asInstanceOf[js.Any])
      
      inline def setAddressesUndefined: Self = StObject.set(x, "addresses", js.undefined)
      
      inline def setAddressesVarargs(value: Address*): Self = StObject.set(x, "addresses", js.Array(value*))
      
      inline def setMetadata(value: Map[String, js.typedarray.Uint8Array]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
      
      inline def setPeerRecordEnvelope(value: js.typedarray.Uint8Array): Self = StObject.set(x, "peerRecordEnvelope", value.asInstanceOf[js.Any])
      
      inline def setPeerRecordEnvelopeUndefined: Self = StObject.set(x, "peerRecordEnvelope", js.undefined)
      
      inline def setProtocols(value: js.Array[String]): Self = StObject.set(x, "protocols", value.asInstanceOf[js.Any])
      
      inline def setProtocolsUndefined: Self = StObject.set(x, "protocols", js.undefined)
      
      inline def setProtocolsVarargs(value: String*): Self = StObject.set(x, "protocols", js.Array(value*))
      
      inline def setPublicKey(value: js.typedarray.Uint8Array): Self = StObject.set(x, "publicKey", value.asInstanceOf[js.Any])
      
      inline def setPublicKeyUndefined: Self = StObject.set(x, "publicKey", js.undefined)
      
      inline def setTags(value: Map[String, Tag]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  /* Inlined std.Partial<@libp2p/interface-peer-store.@libp2p/interface-peer-store.PeerData> */
  trait PartialPeerData extends StObject {
    
    var addresses: js.UndefOr[js.Array[typings.libp2pInterfacePeerStore.mod.Address]] = js.undefined
    
    var metadata: js.UndefOr[
        (Map[String, js.UndefOr[js.typedarray.Uint8Array]]) | (Record[String, js.UndefOr[js.typedarray.Uint8Array]])
      ] = js.undefined
    
    var multiaddrs: js.UndefOr[js.Array[Multiaddr_]] = js.undefined
    
    var peerRecordEnvelope: js.UndefOr[js.typedarray.Uint8Array] = js.undefined
    
    var protocols: js.UndefOr[js.Array[String]] = js.undefined
    
    var publicKey: js.UndefOr[js.typedarray.Uint8Array] = js.undefined
    
    var tags: js.UndefOr[(Map[String, js.UndefOr[TagOptions]]) | (Record[String, js.UndefOr[TagOptions]])] = js.undefined
  }
  object PartialPeerData {
    
    inline def apply(): PartialPeerData = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialPeerData]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialPeerData] (val x: Self) extends AnyVal {
      
      inline def setAddresses(value: js.Array[typings.libp2pInterfacePeerStore.mod.Address]): Self = StObject.set(x, "addresses", value.asInstanceOf[js.Any])
      
      inline def setAddressesUndefined: Self = StObject.set(x, "addresses", js.undefined)
      
      inline def setAddressesVarargs(value: typings.libp2pInterfacePeerStore.mod.Address*): Self = StObject.set(x, "addresses", js.Array(value*))
      
      inline def setMetadata(
        value: (Map[String, js.UndefOr[js.typedarray.Uint8Array]]) | (Record[String, js.UndefOr[js.typedarray.Uint8Array]])
      ): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
      
      inline def setMultiaddrs(value: js.Array[Multiaddr_]): Self = StObject.set(x, "multiaddrs", value.asInstanceOf[js.Any])
      
      inline def setMultiaddrsUndefined: Self = StObject.set(x, "multiaddrs", js.undefined)
      
      inline def setMultiaddrsVarargs(value: Multiaddr_ *): Self = StObject.set(x, "multiaddrs", js.Array(value*))
      
      inline def setPeerRecordEnvelope(value: js.typedarray.Uint8Array): Self = StObject.set(x, "peerRecordEnvelope", value.asInstanceOf[js.Any])
      
      inline def setPeerRecordEnvelopeUndefined: Self = StObject.set(x, "peerRecordEnvelope", js.undefined)
      
      inline def setProtocols(value: js.Array[String]): Self = StObject.set(x, "protocols", value.asInstanceOf[js.Any])
      
      inline def setProtocolsUndefined: Self = StObject.set(x, "protocols", js.undefined)
      
      inline def setProtocolsVarargs(value: String*): Self = StObject.set(x, "protocols", js.Array(value*))
      
      inline def setPublicKey(value: js.typedarray.Uint8Array): Self = StObject.set(x, "publicKey", value.asInstanceOf[js.Any])
      
      inline def setPublicKeyUndefined: Self = StObject.set(x, "publicKey", js.undefined)
      
      inline def setTags(value: (Map[String, js.UndefOr[TagOptions]]) | (Record[String, js.UndefOr[TagOptions]])): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  /* Inlined std.Partial<@libp2p/peer-store.@libp2p/peer-store/dist/src/pb/peer.Peer.Peer$metadataEntry> */
  trait PartialPeermetadataEntry extends StObject {
    
    var key: js.UndefOr[String] = js.undefined
    
    var value: js.UndefOr[js.typedarray.Uint8Array] = js.undefined
  }
  object PartialPeermetadataEntry {
    
    inline def apply(): PartialPeermetadataEntry = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialPeermetadataEntry]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialPeermetadataEntry] (val x: Self) extends AnyVal {
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setValue(value: js.typedarray.Uint8Array): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  /* Inlined std.Partial<@libp2p/peer-store.@libp2p/peer-store/dist/src/pb/peer.Peer.Peer$tagsEntry> */
  trait PartialPeertagsEntry extends StObject {
    
    var key: js.UndefOr[String] = js.undefined
    
    var value: js.UndefOr[Tag] = js.undefined
  }
  object PartialPeertagsEntry {
    
    inline def apply(): PartialPeertagsEntry = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialPeertagsEntry]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialPeertagsEntry] (val x: Self) extends AnyVal {
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setValue(value: Tag): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  /* Inlined std.Partial<@libp2p/peer-store.@libp2p/peer-store/dist/src/pb/peer.Tag> */
  trait PartialTag extends StObject {
    
    var expiry: js.UndefOr[js.BigInt] = js.undefined
    
    var value: js.UndefOr[Double] = js.undefined
  }
  object PartialTag {
    
    inline def apply(): PartialTag = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialTag]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialTag] (val x: Self) extends AnyVal {
      
      inline def setExpiry(value: js.BigInt): Self = StObject.set(x, "expiry", value.asInstanceOf[js.Any])
      
      inline def setExpiryUndefined: Self = StObject.set(x, "expiry", js.undefined)
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
