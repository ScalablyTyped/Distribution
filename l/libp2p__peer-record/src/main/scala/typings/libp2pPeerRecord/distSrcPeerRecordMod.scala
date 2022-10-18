package typings.libp2pPeerRecord

import typings.libp2pInterfacePeerId.mod.PeerId
import typings.multiformatsMultiaddr.mod.Multiaddr_
import typings.uint8arraylist.mod.Uint8ArrayList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcPeerRecordMod {
  
  @JSImport("@libp2p/peer-record/dist/src/peer-record", "PeerRecord")
  @js.native
  open class PeerRecord protected () extends StObject {
    def this(init: PeerRecordInit) = this()
    
    var codec: js.typedarray.Uint8Array = js.native
    
    var domain: String = js.native
    
    /**
      * Marshal a record to be used in an envelope
      */
    def marshal(): js.typedarray.Uint8Array = js.native
    
    /* private */ var marshaled: Any = js.native
    
    var multiaddrs: js.Array[Multiaddr_] = js.native
    
    var peerId: PeerId = js.native
    
    var seqNumber: js.BigInt = js.native
  }
  /* static members */
  object PeerRecord {
    
    @JSImport("@libp2p/peer-record/dist/src/peer-record", "PeerRecord")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@libp2p/peer-record/dist/src/peer-record", "PeerRecord.CODEC")
    @js.native
    def CODEC: js.typedarray.Uint8Array = js.native
    inline def CODEC_=(x: js.typedarray.Uint8Array): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CODEC")(x.asInstanceOf[js.Any])
    
    @JSImport("@libp2p/peer-record/dist/src/peer-record", "PeerRecord.DOMAIN")
    @js.native
    def DOMAIN: String = js.native
    inline def DOMAIN_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DOMAIN")(x.asInstanceOf[js.Any])
    
    /**
      * Unmarshal Peer Record Protobuf
      */
    inline def createFromProtobuf(buf: js.typedarray.Uint8Array): PeerRecord = ^.asInstanceOf[js.Dynamic].applyDynamic("createFromProtobuf")(buf.asInstanceOf[js.Any]).asInstanceOf[PeerRecord]
    inline def createFromProtobuf(buf: Uint8ArrayList): PeerRecord = ^.asInstanceOf[js.Dynamic].applyDynamic("createFromProtobuf")(buf.asInstanceOf[js.Any]).asInstanceOf[PeerRecord]
  }
  
  trait PeerRecordInit extends StObject {
    
    /**
      * Addresses of the associated peer.
      */
    var multiaddrs: js.UndefOr[js.Array[Multiaddr_]] = js.undefined
    
    var peerId: PeerId
    
    /**
      * Monotonically-increasing sequence counter that's used to order PeerRecords in time.
      */
    var seqNumber: js.UndefOr[js.BigInt] = js.undefined
  }
  object PeerRecordInit {
    
    inline def apply(peerId: PeerId): PeerRecordInit = {
      val __obj = js.Dynamic.literal(peerId = peerId.asInstanceOf[js.Any])
      __obj.asInstanceOf[PeerRecordInit]
    }
    
    extension [Self <: PeerRecordInit](x: Self) {
      
      inline def setMultiaddrs(value: js.Array[Multiaddr_]): Self = StObject.set(x, "multiaddrs", value.asInstanceOf[js.Any])
      
      inline def setMultiaddrsUndefined: Self = StObject.set(x, "multiaddrs", js.undefined)
      
      inline def setMultiaddrsVarargs(value: Multiaddr_ *): Self = StObject.set(x, "multiaddrs", js.Array(value*))
      
      inline def setPeerId(value: PeerId): Self = StObject.set(x, "peerId", value.asInstanceOf[js.Any])
      
      inline def setSeqNumber(value: js.BigInt): Self = StObject.set(x, "seqNumber", value.asInstanceOf[js.Any])
      
      inline def setSeqNumberUndefined: Self = StObject.set(x, "seqNumber", js.undefined)
    }
  }
}
