package typings.libp2pKadDht

import typings.libp2pKadDht.anon.PartialMessage
import typings.libp2pKadDht.anon.PartialPeer
import typings.libp2pKadDht.anon.PartialRecord
import typings.libp2pKadDht.distSrcMessageDhtMod.Message.MessageType
import typings.libp2pKadDht.distSrcMessageDhtMod.Message.Peer
import typings.protonsRuntime.distSrcCodecMod.Codec
import typings.uint8arraylist.mod.Uint8ArrayList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcMessageDhtMod {
  
  trait Message extends StObject {
    
    var closerPeers: js.Array[Peer]
    
    var clusterLevelRaw: js.UndefOr[Double] = js.undefined
    
    var key: js.UndefOr[js.typedarray.Uint8Array] = js.undefined
    
    var providerPeers: js.Array[Peer]
    
    var record: js.UndefOr[js.typedarray.Uint8Array] = js.undefined
    
    var `type`: js.UndefOr[MessageType] = js.undefined
  }
  object Message {
    
    inline def apply(closerPeers: js.Array[Peer], providerPeers: js.Array[Peer]): Message = {
      val __obj = js.Dynamic.literal(closerPeers = closerPeers.asInstanceOf[js.Any], providerPeers = providerPeers.asInstanceOf[js.Any])
      __obj.asInstanceOf[Message]
    }
    
    @JSImport("@libp2p/kad-dht/dist/src/message/dht", "Message")
    @js.native
    val ^ : js.Any = js.native
    
    @js.native
    sealed trait ConnectionType extends StObject
    @JSImport("@libp2p/kad-dht/dist/src/message/dht", "Message.ConnectionType")
    @js.native
    object ConnectionType extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[ConnectionType & String] = js.native
      
      @js.native
      sealed trait CANNOT_CONNECT
        extends StObject
           with ConnectionType
      /* "CANNOT_CONNECT" */ val CANNOT_CONNECT: typings.libp2pKadDht.distSrcMessageDhtMod.Message.ConnectionType.CANNOT_CONNECT & String = js.native
      
      @js.native
      sealed trait CAN_CONNECT
        extends StObject
           with ConnectionType
      /* "CAN_CONNECT" */ val CAN_CONNECT: typings.libp2pKadDht.distSrcMessageDhtMod.Message.ConnectionType.CAN_CONNECT & String = js.native
      
      @js.native
      sealed trait CONNECTED
        extends StObject
           with ConnectionType
      /* "CONNECTED" */ val CONNECTED: typings.libp2pKadDht.distSrcMessageDhtMod.Message.ConnectionType.CONNECTED & String = js.native
      
      @js.native
      sealed trait NOT_CONNECTED
        extends StObject
           with ConnectionType
      /* "NOT_CONNECTED" */ val NOT_CONNECTED: typings.libp2pKadDht.distSrcMessageDhtMod.Message.ConnectionType.NOT_CONNECTED & String = js.native
      
      def codec(): Codec[ConnectionType] = js.native
    }
    
    @js.native
    sealed trait MessageType extends StObject
    @JSImport("@libp2p/kad-dht/dist/src/message/dht", "Message.MessageType")
    @js.native
    object MessageType extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[MessageType & String] = js.native
      
      @js.native
      sealed trait ADD_PROVIDER
        extends StObject
           with MessageType
      /* "ADD_PROVIDER" */ val ADD_PROVIDER: typings.libp2pKadDht.distSrcMessageDhtMod.Message.MessageType.ADD_PROVIDER & String = js.native
      
      @js.native
      sealed trait FIND_NODE
        extends StObject
           with MessageType
      /* "FIND_NODE" */ val FIND_NODE: typings.libp2pKadDht.distSrcMessageDhtMod.Message.MessageType.FIND_NODE & String = js.native
      
      @js.native
      sealed trait GET_PROVIDERS
        extends StObject
           with MessageType
      /* "GET_PROVIDERS" */ val GET_PROVIDERS: typings.libp2pKadDht.distSrcMessageDhtMod.Message.MessageType.GET_PROVIDERS & String = js.native
      
      @js.native
      sealed trait GET_VALUE
        extends StObject
           with MessageType
      /* "GET_VALUE" */ val GET_VALUE: typings.libp2pKadDht.distSrcMessageDhtMod.Message.MessageType.GET_VALUE & String = js.native
      
      @js.native
      sealed trait PING
        extends StObject
           with MessageType
      /* "PING" */ val PING: typings.libp2pKadDht.distSrcMessageDhtMod.Message.MessageType.PING & String = js.native
      
      @js.native
      sealed trait PUT_VALUE
        extends StObject
           with MessageType
      /* "PUT_VALUE" */ val PUT_VALUE: typings.libp2pKadDht.distSrcMessageDhtMod.Message.MessageType.PUT_VALUE & String = js.native
      
      def codec(): Codec[MessageType] = js.native
    }
    
    trait Peer extends StObject {
      
      var addrs: js.Array[js.typedarray.Uint8Array]
      
      var connection: js.UndefOr[ConnectionType] = js.undefined
      
      var id: js.UndefOr[js.typedarray.Uint8Array] = js.undefined
    }
    object Peer {
      
      inline def apply(addrs: js.Array[js.typedarray.Uint8Array]): Peer = {
        val __obj = js.Dynamic.literal(addrs = addrs.asInstanceOf[js.Any])
        __obj.asInstanceOf[Peer]
      }
      
      @JSImport("@libp2p/kad-dht/dist/src/message/dht", "Message.Peer")
      @js.native
      val ^ : js.Any = js.native
      
      inline def codec(): Codec[Peer] = ^.asInstanceOf[js.Dynamic].applyDynamic("codec")().asInstanceOf[Codec[Peer]]
      
      inline def decode(buf: js.typedarray.Uint8Array): Peer = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(buf.asInstanceOf[js.Any]).asInstanceOf[Peer]
      inline def decode(buf: Uint8ArrayList): Peer = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(buf.asInstanceOf[js.Any]).asInstanceOf[Peer]
      
      inline def encode(obj: PartialPeer): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(obj.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Peer] (val x: Self) extends AnyVal {
        
        inline def setAddrs(value: js.Array[js.typedarray.Uint8Array]): Self = StObject.set(x, "addrs", value.asInstanceOf[js.Any])
        
        inline def setAddrsVarargs(value: js.typedarray.Uint8Array*): Self = StObject.set(x, "addrs", js.Array(value*))
        
        inline def setConnection(value: ConnectionType): Self = StObject.set(x, "connection", value.asInstanceOf[js.Any])
        
        inline def setConnectionUndefined: Self = StObject.set(x, "connection", js.undefined)
        
        inline def setId(value: js.typedarray.Uint8Array): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      }
    }
    
    inline def codec(): Codec[Message] = ^.asInstanceOf[js.Dynamic].applyDynamic("codec")().asInstanceOf[Codec[Message]]
    
    inline def decode(buf: js.typedarray.Uint8Array): Message = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(buf.asInstanceOf[js.Any]).asInstanceOf[Message]
    inline def decode(buf: Uint8ArrayList): Message = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(buf.asInstanceOf[js.Any]).asInstanceOf[Message]
    
    inline def encode(obj: PartialMessage): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(obj.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Message] (val x: Self) extends AnyVal {
      
      inline def setCloserPeers(value: js.Array[Peer]): Self = StObject.set(x, "closerPeers", value.asInstanceOf[js.Any])
      
      inline def setCloserPeersVarargs(value: Peer*): Self = StObject.set(x, "closerPeers", js.Array(value*))
      
      inline def setClusterLevelRaw(value: Double): Self = StObject.set(x, "clusterLevelRaw", value.asInstanceOf[js.Any])
      
      inline def setClusterLevelRawUndefined: Self = StObject.set(x, "clusterLevelRaw", js.undefined)
      
      inline def setKey(value: js.typedarray.Uint8Array): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setProviderPeers(value: js.Array[Peer]): Self = StObject.set(x, "providerPeers", value.asInstanceOf[js.Any])
      
      inline def setProviderPeersVarargs(value: Peer*): Self = StObject.set(x, "providerPeers", js.Array(value*))
      
      inline def setRecord(value: js.typedarray.Uint8Array): Self = StObject.set(x, "record", value.asInstanceOf[js.Any])
      
      inline def setRecordUndefined: Self = StObject.set(x, "record", js.undefined)
      
      inline def setType(value: MessageType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait Record extends StObject {
    
    var author: js.UndefOr[js.typedarray.Uint8Array] = js.undefined
    
    var key: js.UndefOr[js.typedarray.Uint8Array] = js.undefined
    
    var signature: js.UndefOr[js.typedarray.Uint8Array] = js.undefined
    
    var timeReceived: js.UndefOr[String] = js.undefined
    
    var value: js.UndefOr[js.typedarray.Uint8Array] = js.undefined
  }
  object Record {
    
    inline def apply(): Record = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Record]
    }
    
    @JSImport("@libp2p/kad-dht/dist/src/message/dht", "Record")
    @js.native
    val ^ : js.Any = js.native
    
    inline def codec(): Codec[Record] = ^.asInstanceOf[js.Dynamic].applyDynamic("codec")().asInstanceOf[Codec[Record]]
    
    inline def decode(buf: js.typedarray.Uint8Array): Record = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(buf.asInstanceOf[js.Any]).asInstanceOf[Record]
    inline def decode(buf: Uint8ArrayList): Record = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(buf.asInstanceOf[js.Any]).asInstanceOf[Record]
    
    inline def encode(obj: PartialRecord): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(obj.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Record] (val x: Self) extends AnyVal {
      
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
