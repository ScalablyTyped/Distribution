package typings.libp2pPeerStore

import typings.protonsRuntime.distSrcCodecMod.Codec
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
    
    inline def encode(obj: Address): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(obj.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
    
    extension [Self <: Address](x: Self) {
      
      inline def setIsCertified(value: Boolean): Self = StObject.set(x, "isCertified", value.asInstanceOf[js.Any])
      
      inline def setIsCertifiedUndefined: Self = StObject.set(x, "isCertified", js.undefined)
      
      inline def setMultiaddr(value: js.typedarray.Uint8Array): Self = StObject.set(x, "multiaddr", value.asInstanceOf[js.Any])
    }
  }
  
  trait Metadata extends StObject {
    
    var key: String
    
    var value: js.typedarray.Uint8Array
  }
  object Metadata {
    
    inline def apply(key: String, value: js.typedarray.Uint8Array): Metadata = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Metadata]
    }
    
    @JSImport("@libp2p/peer-store/dist/src/pb/peer", "Metadata")
    @js.native
    val ^ : js.Any = js.native
    
    inline def codec(): Codec[Metadata] = ^.asInstanceOf[js.Dynamic].applyDynamic("codec")().asInstanceOf[Codec[Metadata]]
    
    inline def decode(buf: js.typedarray.Uint8Array): Metadata = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(buf.asInstanceOf[js.Any]).asInstanceOf[Metadata]
    inline def decode(buf: Uint8ArrayList): Metadata = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(buf.asInstanceOf[js.Any]).asInstanceOf[Metadata]
    
    inline def encode(obj: Metadata): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(obj.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
    
    extension [Self <: Metadata](x: Self) {
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setValue(value: js.typedarray.Uint8Array): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait Peer extends StObject {
    
    var addresses: js.Array[Address]
    
    var metadata: js.Array[Metadata]
    
    var peerRecordEnvelope: js.UndefOr[js.typedarray.Uint8Array] = js.undefined
    
    var protocols: js.Array[String]
    
    var pubKey: js.UndefOr[js.typedarray.Uint8Array] = js.undefined
  }
  object Peer {
    
    inline def apply(addresses: js.Array[Address], metadata: js.Array[Metadata], protocols: js.Array[String]): Peer = {
      val __obj = js.Dynamic.literal(addresses = addresses.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], protocols = protocols.asInstanceOf[js.Any])
      __obj.asInstanceOf[Peer]
    }
    
    @JSImport("@libp2p/peer-store/dist/src/pb/peer", "Peer")
    @js.native
    val ^ : js.Any = js.native
    
    inline def codec(): Codec[Peer] = ^.asInstanceOf[js.Dynamic].applyDynamic("codec")().asInstanceOf[Codec[Peer]]
    
    inline def decode(buf: js.typedarray.Uint8Array): Peer = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(buf.asInstanceOf[js.Any]).asInstanceOf[Peer]
    inline def decode(buf: Uint8ArrayList): Peer = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(buf.asInstanceOf[js.Any]).asInstanceOf[Peer]
    
    inline def encode(obj: Peer): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(obj.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
    
    extension [Self <: Peer](x: Self) {
      
      inline def setAddresses(value: js.Array[Address]): Self = StObject.set(x, "addresses", value.asInstanceOf[js.Any])
      
      inline def setAddressesVarargs(value: Address*): Self = StObject.set(x, "addresses", js.Array(value*))
      
      inline def setMetadata(value: js.Array[Metadata]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      inline def setMetadataVarargs(value: Metadata*): Self = StObject.set(x, "metadata", js.Array(value*))
      
      inline def setPeerRecordEnvelope(value: js.typedarray.Uint8Array): Self = StObject.set(x, "peerRecordEnvelope", value.asInstanceOf[js.Any])
      
      inline def setPeerRecordEnvelopeUndefined: Self = StObject.set(x, "peerRecordEnvelope", js.undefined)
      
      inline def setProtocols(value: js.Array[String]): Self = StObject.set(x, "protocols", value.asInstanceOf[js.Any])
      
      inline def setProtocolsVarargs(value: String*): Self = StObject.set(x, "protocols", js.Array(value*))
      
      inline def setPubKey(value: js.typedarray.Uint8Array): Self = StObject.set(x, "pubKey", value.asInstanceOf[js.Any])
      
      inline def setPubKeyUndefined: Self = StObject.set(x, "pubKey", js.undefined)
    }
  }
}
