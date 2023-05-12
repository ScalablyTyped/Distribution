package typings.libp2pPeerRecord

import typings.libp2pInterfacePeerId.mod.PeerId
import typings.libp2pInterfaceRecord.mod.Envelope
import typings.libp2pInterfaceRecord.mod.Record
import typings.uint8arraylist.mod.Uint8ArrayList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcEnvelopeMod {
  
  @JSImport("@libp2p/peer-record/dist/src/envelope", "RecordEnvelope")
  @js.native
  open class RecordEnvelope protected ()
    extends StObject
       with Envelope {
    /**
      * The Envelope is responsible for keeping an arbitrary signed record
      * by a libp2p peer.
      */
    def this(init: RecordEnvelopeInit) = this()
    
    /* CompleteClass */
    override def equals(other: Envelope): Boolean = js.native
    
    /* CompleteClass */
    override def marshal(): js.typedarray.Uint8Array = js.native
    
    var marshaled: js.UndefOr[js.typedarray.Uint8Array] = js.native
    
    /* CompleteClass */
    var payload: js.typedarray.Uint8Array = js.native
    
    /* CompleteClass */
    var payloadType: js.typedarray.Uint8Array | Uint8ArrayList = js.native
    @JSName("payloadType")
    var payloadType_RecordEnvelope: js.typedarray.Uint8Array = js.native
    
    /* CompleteClass */
    var peerId: PeerId = js.native
    
    /* CompleteClass */
    var signature: js.typedarray.Uint8Array | Uint8ArrayList = js.native
    @JSName("signature")
    var signature_RecordEnvelope: js.typedarray.Uint8Array = js.native
    
    /* CompleteClass */
    override def validate(domain: String): js.Promise[Boolean] = js.native
  }
  /* static members */
  object RecordEnvelope {
    
    @JSImport("@libp2p/peer-record/dist/src/envelope", "RecordEnvelope")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Unmarshal a serialized Envelope protobuf message
      */
    inline def createFromProtobuf(data: js.typedarray.Uint8Array): js.Promise[RecordEnvelope] = ^.asInstanceOf[js.Dynamic].applyDynamic("createFromProtobuf")(data.asInstanceOf[js.Any]).asInstanceOf[js.Promise[RecordEnvelope]]
    inline def createFromProtobuf(data: Uint8ArrayList): js.Promise[RecordEnvelope] = ^.asInstanceOf[js.Dynamic].applyDynamic("createFromProtobuf")(data.asInstanceOf[js.Any]).asInstanceOf[js.Promise[RecordEnvelope]]
    
    /**
      * Open and certify a given marshalled envelope.
      * Data is unmarshalled and the signature validated for the given domain.
      */
    inline def openAndCertify(data: js.typedarray.Uint8Array, domain: String): js.Promise[RecordEnvelope] = (^.asInstanceOf[js.Dynamic].applyDynamic("openAndCertify")(data.asInstanceOf[js.Any], domain.asInstanceOf[js.Any])).asInstanceOf[js.Promise[RecordEnvelope]]
    inline def openAndCertify(data: Uint8ArrayList, domain: String): js.Promise[RecordEnvelope] = (^.asInstanceOf[js.Dynamic].applyDynamic("openAndCertify")(data.asInstanceOf[js.Any], domain.asInstanceOf[js.Any])).asInstanceOf[js.Promise[RecordEnvelope]]
    
    /**
      * Seal marshals the given Record, places the marshaled bytes inside an Envelope
      * and signs it with the given peerId's private key
      */
    inline def seal(record: Record, peerId: PeerId): js.Promise[RecordEnvelope] = (^.asInstanceOf[js.Dynamic].applyDynamic("seal")(record.asInstanceOf[js.Any], peerId.asInstanceOf[js.Any])).asInstanceOf[js.Promise[RecordEnvelope]]
  }
  
  trait RecordEnvelopeInit extends StObject {
    
    var payload: js.typedarray.Uint8Array
    
    var payloadType: js.typedarray.Uint8Array
    
    var peerId: PeerId
    
    var signature: js.typedarray.Uint8Array
  }
  object RecordEnvelopeInit {
    
    inline def apply(
      payload: js.typedarray.Uint8Array,
      payloadType: js.typedarray.Uint8Array,
      peerId: PeerId,
      signature: js.typedarray.Uint8Array
    ): RecordEnvelopeInit = {
      val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any], payloadType = payloadType.asInstanceOf[js.Any], peerId = peerId.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any])
      __obj.asInstanceOf[RecordEnvelopeInit]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RecordEnvelopeInit] (val x: Self) extends AnyVal {
      
      inline def setPayload(value: js.typedarray.Uint8Array): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
      
      inline def setPayloadType(value: js.typedarray.Uint8Array): Self = StObject.set(x, "payloadType", value.asInstanceOf[js.Any])
      
      inline def setPeerId(value: PeerId): Self = StObject.set(x, "peerId", value.asInstanceOf[js.Any])
      
      inline def setSignature(value: js.typedarray.Uint8Array): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
    }
  }
}
