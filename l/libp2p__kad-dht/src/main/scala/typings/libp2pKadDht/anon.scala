package typings.libp2pKadDht

import typings.libp2pKadDht.distSrcMessageDhtMod.Message.ConnectionType
import typings.libp2pKadDht.distSrcMessageDhtMod.Message.MessageType
import typings.libp2pKadDht.distSrcMessageDhtMod.Message.Peer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Partial<@libp2p/kad-dht.@libp2p/kad-dht/dist/src/message/dht.Message> */
  trait PartialMessage extends StObject {
    
    var closerPeers: js.UndefOr[js.Array[Peer]] = js.undefined
    
    var clusterLevelRaw: js.UndefOr[Double] = js.undefined
    
    var key: js.UndefOr[js.typedarray.Uint8Array] = js.undefined
    
    var providerPeers: js.UndefOr[js.Array[Peer]] = js.undefined
    
    var record: js.UndefOr[js.typedarray.Uint8Array] = js.undefined
    
    var `type`: js.UndefOr[MessageType] = js.undefined
  }
  object PartialMessage {
    
    inline def apply(): PartialMessage = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialMessage]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialMessage] (val x: Self) extends AnyVal {
      
      inline def setCloserPeers(value: js.Array[Peer]): Self = StObject.set(x, "closerPeers", value.asInstanceOf[js.Any])
      
      inline def setCloserPeersUndefined: Self = StObject.set(x, "closerPeers", js.undefined)
      
      inline def setCloserPeersVarargs(value: Peer*): Self = StObject.set(x, "closerPeers", js.Array(value*))
      
      inline def setClusterLevelRaw(value: Double): Self = StObject.set(x, "clusterLevelRaw", value.asInstanceOf[js.Any])
      
      inline def setClusterLevelRawUndefined: Self = StObject.set(x, "clusterLevelRaw", js.undefined)
      
      inline def setKey(value: js.typedarray.Uint8Array): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setProviderPeers(value: js.Array[Peer]): Self = StObject.set(x, "providerPeers", value.asInstanceOf[js.Any])
      
      inline def setProviderPeersUndefined: Self = StObject.set(x, "providerPeers", js.undefined)
      
      inline def setProviderPeersVarargs(value: Peer*): Self = StObject.set(x, "providerPeers", js.Array(value*))
      
      inline def setRecord(value: js.typedarray.Uint8Array): Self = StObject.set(x, "record", value.asInstanceOf[js.Any])
      
      inline def setRecordUndefined: Self = StObject.set(x, "record", js.undefined)
      
      inline def setType(value: MessageType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  /* Inlined std.Partial<@libp2p/kad-dht.@libp2p/kad-dht/dist/src/message/dht.Message.Peer> */
  trait PartialPeer extends StObject {
    
    var addrs: js.UndefOr[js.Array[js.typedarray.Uint8Array]] = js.undefined
    
    var connection: js.UndefOr[ConnectionType] = js.undefined
    
    var id: js.UndefOr[js.typedarray.Uint8Array] = js.undefined
  }
  object PartialPeer {
    
    inline def apply(): PartialPeer = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialPeer]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialPeer] (val x: Self) extends AnyVal {
      
      inline def setAddrs(value: js.Array[js.typedarray.Uint8Array]): Self = StObject.set(x, "addrs", value.asInstanceOf[js.Any])
      
      inline def setAddrsUndefined: Self = StObject.set(x, "addrs", js.undefined)
      
      inline def setAddrsVarargs(value: js.typedarray.Uint8Array*): Self = StObject.set(x, "addrs", js.Array(value*))
      
      inline def setConnection(value: ConnectionType): Self = StObject.set(x, "connection", value.asInstanceOf[js.Any])
      
      inline def setConnectionUndefined: Self = StObject.set(x, "connection", js.undefined)
      
      inline def setId(value: js.typedarray.Uint8Array): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    }
  }
  
  /* Inlined std.Partial<@libp2p/kad-dht.@libp2p/kad-dht/dist/src/message/dht.Record> */
  trait PartialRecord extends StObject {
    
    var author: js.UndefOr[js.typedarray.Uint8Array] = js.undefined
    
    var key: js.UndefOr[js.typedarray.Uint8Array] = js.undefined
    
    var signature: js.UndefOr[js.typedarray.Uint8Array] = js.undefined
    
    var timeReceived: js.UndefOr[String] = js.undefined
    
    var value: js.UndefOr[js.typedarray.Uint8Array] = js.undefined
  }
  object PartialRecord {
    
    inline def apply(): PartialRecord = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialRecord]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialRecord] (val x: Self) extends AnyVal {
      
      inline def setAuthor(value: js.typedarray.Uint8Array): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
      
      inline def setAuthorUndefined: Self = StObject.set(x, "author", js.undefined)
      
      inline def setKey(value: js.typedarray.Uint8Array): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setSignature(value: js.typedarray.Uint8Array): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
      
      inline def setSignatureUndefined: Self = StObject.set(x, "signature", js.undefined)
      
      inline def setTimeReceived(value: String): Self = StObject.set(x, "timeReceived", value.asInstanceOf[js.Any])
      
      inline def setTimeReceivedUndefined: Self = StObject.set(x, "timeReceived", js.undefined)
      
      inline def setValue(value: js.typedarray.Uint8Array): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
