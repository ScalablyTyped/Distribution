package typings.libp2pPeerRecord

import typings.libp2pPeerRecord.distSrcPeerRecordPeerRecordMod.PeerRecord.AddressInfo
import typings.protonsRuntime.distSrcCodecMod.Codec
import typings.uint8arraylist.mod.Uint8ArrayList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcPeerRecordPeerRecordMod {
  
  trait PeerRecord extends StObject {
    
    var addresses: js.Array[AddressInfo]
    
    var peerId: js.typedarray.Uint8Array
    
    var seq: js.BigInt
  }
  object PeerRecord {
    
    inline def apply(addresses: js.Array[AddressInfo], peerId: js.typedarray.Uint8Array, seq: js.BigInt): PeerRecord = {
      val __obj = js.Dynamic.literal(addresses = addresses.asInstanceOf[js.Any], peerId = peerId.asInstanceOf[js.Any], seq = seq.asInstanceOf[js.Any])
      __obj.asInstanceOf[PeerRecord]
    }
    
    @JSImport("@libp2p/peer-record/dist/src/peer-record/peer-record", "PeerRecord")
    @js.native
    val ^ : js.Any = js.native
    
    trait AddressInfo extends StObject {
      
      var multiaddr: js.typedarray.Uint8Array
    }
    object AddressInfo {
      
      inline def apply(multiaddr: js.typedarray.Uint8Array): AddressInfo = {
        val __obj = js.Dynamic.literal(multiaddr = multiaddr.asInstanceOf[js.Any])
        __obj.asInstanceOf[AddressInfo]
      }
      
      @JSImport("@libp2p/peer-record/dist/src/peer-record/peer-record", "PeerRecord.AddressInfo")
      @js.native
      val ^ : js.Any = js.native
      
      inline def codec(): Codec[AddressInfo] = ^.asInstanceOf[js.Dynamic].applyDynamic("codec")().asInstanceOf[Codec[AddressInfo]]
      
      inline def decode(buf: js.typedarray.Uint8Array): AddressInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(buf.asInstanceOf[js.Any]).asInstanceOf[AddressInfo]
      inline def decode(buf: Uint8ArrayList): AddressInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(buf.asInstanceOf[js.Any]).asInstanceOf[AddressInfo]
      
      inline def encode(obj: AddressInfo): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(obj.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
      
      @scala.inline
      implicit open class MutableBuilder[Self <: AddressInfo] (val x: Self) extends AnyVal {
        
        inline def setMultiaddr(value: js.typedarray.Uint8Array): Self = StObject.set(x, "multiaddr", value.asInstanceOf[js.Any])
      }
    }
    
    inline def codec(): Codec[PeerRecord] = ^.asInstanceOf[js.Dynamic].applyDynamic("codec")().asInstanceOf[Codec[PeerRecord]]
    
    inline def decode(buf: js.typedarray.Uint8Array): PeerRecord = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(buf.asInstanceOf[js.Any]).asInstanceOf[PeerRecord]
    inline def decode(buf: Uint8ArrayList): PeerRecord = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(buf.asInstanceOf[js.Any]).asInstanceOf[PeerRecord]
    
    inline def encode(obj: PeerRecord): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(obj.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PeerRecord] (val x: Self) extends AnyVal {
      
      inline def setAddresses(value: js.Array[AddressInfo]): Self = StObject.set(x, "addresses", value.asInstanceOf[js.Any])
      
      inline def setAddressesVarargs(value: AddressInfo*): Self = StObject.set(x, "addresses", js.Array(value*))
      
      inline def setPeerId(value: js.typedarray.Uint8Array): Self = StObject.set(x, "peerId", value.asInstanceOf[js.Any])
      
      inline def setSeq(value: js.BigInt): Self = StObject.set(x, "seq", value.asInstanceOf[js.Any])
    }
  }
}
