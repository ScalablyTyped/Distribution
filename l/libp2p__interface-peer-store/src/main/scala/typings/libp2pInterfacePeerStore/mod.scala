package typings.libp2pInterfacePeerStore

import typings.libp2pInterfacePeerId.mod.PeerId
import typings.multiformatsMultiaddr.mod.Multiaddr_
import typings.std.Map
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  trait Address extends StObject {
    
    /**
      * Obtained from a signed peer record
      */
    var isCertified: Boolean
    
    /**
      * Peer multiaddr
      */
    var multiaddr: Multiaddr_
  }
  object Address {
    
    inline def apply(isCertified: Boolean, multiaddr: Multiaddr_): Address = {
      val __obj = js.Dynamic.literal(isCertified = isCertified.asInstanceOf[js.Any], multiaddr = multiaddr.asInstanceOf[js.Any])
      __obj.asInstanceOf[Address]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Address] (val x: Self) extends AnyVal {
      
      inline def setIsCertified(value: Boolean): Self = StObject.set(x, "isCertified", value.asInstanceOf[js.Any])
      
      inline def setMultiaddr(value: Multiaddr_): Self = StObject.set(x, "multiaddr", value.asInstanceOf[js.Any])
    }
  }
  
  trait Peer extends StObject {
    
    /**
      * Peer's addresses containing a list of multiaddrs and a isCertified field
      * indicating if the address was loaded from a signed peer record or not
      */
    var addresses: js.Array[Address]
    
    /**
      * Peer's peer-id instance
      */
    var id: PeerId
    
    /**
      * Peer's metadata map
      */
    var metadata: Map[String, js.typedarray.Uint8Array]
    
    /**
      * The last peer record envelope received
      */
    var peerRecordEnvelope: js.UndefOr[js.typedarray.Uint8Array] = js.undefined
    
    /**
      * Peer's supported protocols
      */
    var protocols: js.Array[String]
    
    /**
      * Tags a peer has
      */
    var tags: Map[String, Tag]
  }
  object Peer {
    
    inline def apply(
      addresses: js.Array[Address],
      id: PeerId,
      metadata: Map[String, js.typedarray.Uint8Array],
      protocols: js.Array[String],
      tags: Map[String, Tag]
    ): Peer = {
      val __obj = js.Dynamic.literal(addresses = addresses.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], protocols = protocols.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
      __obj.asInstanceOf[Peer]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Peer] (val x: Self) extends AnyVal {
      
      inline def setAddresses(value: js.Array[Address]): Self = StObject.set(x, "addresses", value.asInstanceOf[js.Any])
      
      inline def setAddressesVarargs(value: Address*): Self = StObject.set(x, "addresses", js.Array(value*))
      
      inline def setId(value: PeerId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setMetadata(value: Map[String, js.typedarray.Uint8Array]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      inline def setPeerRecordEnvelope(value: js.typedarray.Uint8Array): Self = StObject.set(x, "peerRecordEnvelope", value.asInstanceOf[js.Any])
      
      inline def setPeerRecordEnvelopeUndefined: Self = StObject.set(x, "peerRecordEnvelope", js.undefined)
      
      inline def setProtocols(value: js.Array[String]): Self = StObject.set(x, "protocols", value.asInstanceOf[js.Any])
      
      inline def setProtocolsVarargs(value: String*): Self = StObject.set(x, "protocols", js.Array(value*))
      
      inline def setTags(value: Map[String, Tag]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    }
  }
  
  trait PeerData extends StObject {
    
    /**
      * Peer's addresses containing its multiaddrs and metadata - multiaddrs
      * passed here can be treated as certified if the `isCertifed` value is
      * set to true.
      *
      * If both addresses and multiaddrs are specified they will be merged
      * together with entries in addresses taking precedence.
      */
    var addresses: js.UndefOr[js.Array[Address]] = js.undefined
    
    /**
      * Peer's metadata map. When merging pass undefined as values to remove metadata.
      */
    var metadata: js.UndefOr[
        (Map[String, js.UndefOr[js.typedarray.Uint8Array]]) | (Record[String, js.UndefOr[js.typedarray.Uint8Array]])
      ] = js.undefined
    
    /**
      * Peer's multiaddrs - any multiaddrs passed here will be treated as
      * uncertified.
      *
      * If both addresses and multiaddrs are specified they will be merged
      * together with entries in addresses taking precedence.
      */
    var multiaddrs: js.UndefOr[js.Array[Multiaddr_]] = js.undefined
    
    /**
      * The last peer record envelope received
      */
    var peerRecordEnvelope: js.UndefOr[js.typedarray.Uint8Array] = js.undefined
    
    /**
      * Peer's supported protocols
      */
    var protocols: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * If this Peer has an RSA key, it's public key can be set with this property
      */
    var publicKey: js.UndefOr[js.typedarray.Uint8Array] = js.undefined
    
    /**
      * Peer tags. When merging pass undefined as values to remove tags.
      */
    var tags: js.UndefOr[(Map[String, js.UndefOr[TagOptions]]) | (Record[String, js.UndefOr[TagOptions]])] = js.undefined
  }
  object PeerData {
    
    inline def apply(): PeerData = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PeerData]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PeerData] (val x: Self) extends AnyVal {
      
      inline def setAddresses(value: js.Array[Address]): Self = StObject.set(x, "addresses", value.asInstanceOf[js.Any])
      
      inline def setAddressesUndefined: Self = StObject.set(x, "addresses", js.undefined)
      
      inline def setAddressesVarargs(value: Address*): Self = StObject.set(x, "addresses", js.Array(value*))
      
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
  
  @js.native
  trait PeerStore extends StObject {
    
    /**
      * Returns all peers in the peer store.
      *
      * @example
      *
      * ```js
      * for (const peer of await peerStore.all()) {
      *   // ...
      * }
      * ```
      */
    def all(): js.Promise[js.Array[Peer]] = js.native
    
    /**
      * Unmarshal and verify a signed peer record, extract the multiaddrs and
      * overwrite the stored addresses for the peer.
      *
      * Optionally pass an expected PeerId to verify that the peer record was
      * signed by that peer.
      *
      * @example
      *
      * ```js
      * await peerStore.consumePeerRecord(buf, expectedPeer)
      * ```
      */
    def consumePeerRecord(buf: js.typedarray.Uint8Array): js.Promise[Boolean] = js.native
    def consumePeerRecord(buf: js.typedarray.Uint8Array, expectedPeer: PeerId): js.Promise[Boolean] = js.native
    
    /**
      * Delete all data stored for the passed peer
      *
      * @example
      *
      * ```js
      * await peerStore.addressBook.set(peerId, multiaddrs)
      * await peerStore.addressBook.get(peerId)
      * // multiaddrs[]
      *
      * await peerStore.delete(peerId)
      *
      * await peerStore.addressBook.get(peerId)
      * // []
      * ```
      */
    def delete(peerId: PeerId): js.Promise[Unit] = js.native
    
    /**
      * Loop over every peer - the looping is async because we read from a
      * datastore but the peer operation is sync, this is to prevent
      * long-lived peer operations causing deadlocks over the datastore
      * which can happen if they try to access the peer store during the
      * loop
      *
      * @example
      *
      * ```js
      * await peerStore.forEach(peer => {
      *   // ...
      * })
      * ```
      */
    def forEach(fn: js.Function1[/* peer */ Peer, Unit]): js.Promise[Unit] = js.native
    
    /**
      * Returns all data stored for the passed PeerId
      *
      * @example
      *
      * ```js
      * const peer = await peerStore.get(peerId)
      * // { .. }
      * ```
      */
    def get(peerId: PeerId): js.Promise[Peer] = js.native
    
    /**
      * Returns true if the passed PeerId is in the peer store
      *
      * @example
      *
      * ```js
      * await peerStore.has(peerId)
      * // false
      * await peerStore.addressBook.add(peerId, multiaddrs)
      * await peerStore.has(peerId)
      * // true
      * ```
      */
    def has(peerId: PeerId): js.Promise[Boolean] = js.native
    
    /**
      * Adds a peer to the peer store, deeply merging any existing data.
      *
      * @example
      *
      * ```js
      * await peerStore.merge(peerId, {
      *   multiaddrs
      * })
      * ```
      */
    def merge(id: PeerId, data: PeerData): js.Promise[Peer] = js.native
    
    /**
      * Adds a peer to the peer store, overwriting only the passed fields
      *
      * @example
      *
      * ```js
      * await peerStore.patch(peerId, {
      *   multiaddrs
      * })
      * ```
      */
    def patch(id: PeerId, data: PeerData): js.Promise[Peer] = js.native
    
    /**
      * Adds a peer to the peer store, overwriting any existing data
      *
      * @example
      *
      * ```js
      * await peerStore.save(peerId, {
      *   multiaddrs
      * })
      * ```
      */
    def save(id: PeerId, data: PeerData): js.Promise[Peer] = js.native
  }
  
  trait Tag extends StObject {
    
    /**
      * The tag value
      */
    var value: Double
  }
  object Tag {
    
    inline def apply(value: Double): Tag = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Tag]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Tag] (val x: Self) extends AnyVal {
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait TagOptions extends StObject {
    
    /**
      * An optional duration in ms after which the tag will expire
      */
    var ttl: js.UndefOr[Double] = js.undefined
    
    /**
      * An optional tag value (1-100)
      */
    var value: js.UndefOr[Double] = js.undefined
  }
  object TagOptions {
    
    inline def apply(): TagOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TagOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TagOptions] (val x: Self) extends AnyVal {
      
      inline def setTtl(value: Double): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
      
      inline def setTtlUndefined: Self = StObject.set(x, "ttl", js.undefined)
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
