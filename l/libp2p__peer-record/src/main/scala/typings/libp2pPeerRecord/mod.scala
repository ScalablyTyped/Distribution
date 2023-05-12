package typings.libp2pPeerRecord

import typings.libp2pInterfacePeerId.mod.PeerId
import typings.libp2pInterfaceRecord.mod.Record
import typings.libp2pPeerRecord.distSrcEnvelopeMod.RecordEnvelopeInit
import typings.libp2pPeerRecord.distSrcPeerRecordMod.PeerRecordInit
import typings.uint8arraylist.mod.Uint8ArrayList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@libp2p/peer-record", "PeerRecord")
  @js.native
  open class PeerRecord protected ()
    extends typings.libp2pPeerRecord.distSrcPeerRecordMod.PeerRecord {
    def this(init: PeerRecordInit) = this()
  }
  /* static members */
  object PeerRecord {
    
    @JSImport("@libp2p/peer-record", "PeerRecord")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@libp2p/peer-record", "PeerRecord.CODEC")
    @js.native
    def CODEC: js.typedarray.Uint8Array = js.native
    inline def CODEC_=(x: js.typedarray.Uint8Array): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CODEC")(x.asInstanceOf[js.Any])
    
    @JSImport("@libp2p/peer-record", "PeerRecord.DOMAIN")
    @js.native
    def DOMAIN: String = js.native
    inline def DOMAIN_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DOMAIN")(x.asInstanceOf[js.Any])
    
    /**
      * Unmarshal Peer Record Protobuf
      */
    inline def createFromProtobuf(buf: js.typedarray.Uint8Array): typings.libp2pPeerRecord.distSrcPeerRecordMod.PeerRecord = ^.asInstanceOf[js.Dynamic].applyDynamic("createFromProtobuf")(buf.asInstanceOf[js.Any]).asInstanceOf[typings.libp2pPeerRecord.distSrcPeerRecordMod.PeerRecord]
    inline def createFromProtobuf(buf: Uint8ArrayList): typings.libp2pPeerRecord.distSrcPeerRecordMod.PeerRecord = ^.asInstanceOf[js.Dynamic].applyDynamic("createFromProtobuf")(buf.asInstanceOf[js.Any]).asInstanceOf[typings.libp2pPeerRecord.distSrcPeerRecordMod.PeerRecord]
  }
  
  @JSImport("@libp2p/peer-record", "RecordEnvelope")
  @js.native
  open class RecordEnvelope protected ()
    extends typings.libp2pPeerRecord.distSrcEnvelopeMod.RecordEnvelope {
    /**
      * The Envelope is responsible for keeping an arbitrary signed record
      * by a libp2p peer.
      */
    def this(init: RecordEnvelopeInit) = this()
  }
  /* static members */
  object RecordEnvelope {
    
    @JSImport("@libp2p/peer-record", "RecordEnvelope")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Unmarshal a serialized Envelope protobuf message
      */
    inline def createFromProtobuf(data: js.typedarray.Uint8Array): js.Promise[typings.libp2pPeerRecord.distSrcEnvelopeMod.RecordEnvelope] = ^.asInstanceOf[js.Dynamic].applyDynamic("createFromProtobuf")(data.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.libp2pPeerRecord.distSrcEnvelopeMod.RecordEnvelope]]
    inline def createFromProtobuf(data: Uint8ArrayList): js.Promise[typings.libp2pPeerRecord.distSrcEnvelopeMod.RecordEnvelope] = ^.asInstanceOf[js.Dynamic].applyDynamic("createFromProtobuf")(data.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.libp2pPeerRecord.distSrcEnvelopeMod.RecordEnvelope]]
    
    /**
      * Open and certify a given marshalled envelope.
      * Data is unmarshalled and the signature validated for the given domain.
      */
    inline def openAndCertify(data: js.typedarray.Uint8Array, domain: String): js.Promise[typings.libp2pPeerRecord.distSrcEnvelopeMod.RecordEnvelope] = (^.asInstanceOf[js.Dynamic].applyDynamic("openAndCertify")(data.asInstanceOf[js.Any], domain.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.libp2pPeerRecord.distSrcEnvelopeMod.RecordEnvelope]]
    inline def openAndCertify(data: Uint8ArrayList, domain: String): js.Promise[typings.libp2pPeerRecord.distSrcEnvelopeMod.RecordEnvelope] = (^.asInstanceOf[js.Dynamic].applyDynamic("openAndCertify")(data.asInstanceOf[js.Any], domain.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.libp2pPeerRecord.distSrcEnvelopeMod.RecordEnvelope]]
    
    /**
      * Seal marshals the given Record, places the marshaled bytes inside an Envelope
      * and signs it with the given peerId's private key
      */
    inline def seal(record: Record, peerId: PeerId): js.Promise[typings.libp2pPeerRecord.distSrcEnvelopeMod.RecordEnvelope] = (^.asInstanceOf[js.Dynamic].applyDynamic("seal")(record.asInstanceOf[js.Any], peerId.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.libp2pPeerRecord.distSrcEnvelopeMod.RecordEnvelope]]
  }
}
