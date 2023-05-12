package typings.libp2pPeerRecord

import typings.libp2pPeerRecord.distSrcPeerRecordPeerRecordMod.PeerRecord.AddressInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Partial<@libp2p/peer-record.@libp2p/peer-record/dist/src/peer-record/peer-record.PeerRecord.AddressInfo> */
  trait PartialAddressInfo extends StObject {
    
    var multiaddr: js.UndefOr[js.typedarray.Uint8Array] = js.undefined
  }
  object PartialAddressInfo {
    
    inline def apply(): PartialAddressInfo = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialAddressInfo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialAddressInfo] (val x: Self) extends AnyVal {
      
      inline def setMultiaddr(value: js.typedarray.Uint8Array): Self = StObject.set(x, "multiaddr", value.asInstanceOf[js.Any])
      
      inline def setMultiaddrUndefined: Self = StObject.set(x, "multiaddr", js.undefined)
    }
  }
  
  /* Inlined std.Partial<@libp2p/peer-record.@libp2p/peer-record/dist/src/envelope/envelope.Envelope> */
  trait PartialEnvelope extends StObject {
    
    var payload: js.UndefOr[js.typedarray.Uint8Array] = js.undefined
    
    var payloadType: js.UndefOr[js.typedarray.Uint8Array] = js.undefined
    
    var publicKey: js.UndefOr[js.typedarray.Uint8Array] = js.undefined
    
    var signature: js.UndefOr[js.typedarray.Uint8Array] = js.undefined
  }
  object PartialEnvelope {
    
    inline def apply(): PartialEnvelope = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialEnvelope]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialEnvelope] (val x: Self) extends AnyVal {
      
      inline def setPayload(value: js.typedarray.Uint8Array): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
      
      inline def setPayloadType(value: js.typedarray.Uint8Array): Self = StObject.set(x, "payloadType", value.asInstanceOf[js.Any])
      
      inline def setPayloadTypeUndefined: Self = StObject.set(x, "payloadType", js.undefined)
      
      inline def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
      
      inline def setPublicKey(value: js.typedarray.Uint8Array): Self = StObject.set(x, "publicKey", value.asInstanceOf[js.Any])
      
      inline def setPublicKeyUndefined: Self = StObject.set(x, "publicKey", js.undefined)
      
      inline def setSignature(value: js.typedarray.Uint8Array): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
      
      inline def setSignatureUndefined: Self = StObject.set(x, "signature", js.undefined)
    }
  }
  
  /* Inlined std.Partial<@libp2p/peer-record.@libp2p/peer-record/dist/src/peer-record/peer-record.PeerRecord> */
  trait PartialPeerRecord extends StObject {
    
    var addresses: js.UndefOr[js.Array[AddressInfo]] = js.undefined
    
    var peerId: js.UndefOr[js.typedarray.Uint8Array] = js.undefined
    
    var seq: js.UndefOr[js.BigInt] = js.undefined
  }
  object PartialPeerRecord {
    
    inline def apply(): PartialPeerRecord = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialPeerRecord]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialPeerRecord] (val x: Self) extends AnyVal {
      
      inline def setAddresses(value: js.Array[AddressInfo]): Self = StObject.set(x, "addresses", value.asInstanceOf[js.Any])
      
      inline def setAddressesUndefined: Self = StObject.set(x, "addresses", js.undefined)
      
      inline def setAddressesVarargs(value: AddressInfo*): Self = StObject.set(x, "addresses", js.Array(value*))
      
      inline def setPeerId(value: js.typedarray.Uint8Array): Self = StObject.set(x, "peerId", value.asInstanceOf[js.Any])
      
      inline def setPeerIdUndefined: Self = StObject.set(x, "peerId", js.undefined)
      
      inline def setSeq(value: js.BigInt): Self = StObject.set(x, "seq", value.asInstanceOf[js.Any])
      
      inline def setSeqUndefined: Self = StObject.set(x, "seq", js.undefined)
    }
  }
}
