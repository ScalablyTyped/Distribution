package typings.libp2pKadDht

import typings.libp2pInterfacePeerInfo.mod.PeerInfo
import typings.libp2pKadDht.distSrcMessageDhtMod.Message.ConnectionType
import typings.libp2pKadDht.distSrcMessageDhtMod.Message.MessageType
import typings.libp2pRecord.mod.Libp2pRecord
import typings.protonsRuntime.distSrcCodecMod.Codec
import typings.uint8arraylist.mod.Uint8ArrayList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcMessageMod {
  
  object CONNECTION_TYPE {
    
    @JSImport("@libp2p/kad-dht/dist/src/message", "CONNECTION_TYPE")
    @js.native
    val ^ : js.Any = js.native
    
    inline def codec(): Codec[ConnectionType] = ^.asInstanceOf[js.Dynamic].applyDynamic("codec")().asInstanceOf[Codec[ConnectionType]]
  }
  
  object MESSAGE_TYPE {
    
    @JSImport("@libp2p/kad-dht/dist/src/message", "MESSAGE_TYPE")
    @js.native
    val ^ : js.Any = js.native
    
    inline def codec(): Codec[MessageType] = ^.asInstanceOf[js.Dynamic].applyDynamic("codec")().asInstanceOf[Codec[MessageType]]
  }
  
  @JSImport("@libp2p/kad-dht/dist/src/message", "MESSAGE_TYPE_LOOKUP")
  @js.native
  val MESSAGE_TYPE_LOOKUP: js.Array[String] = js.native
  
  @JSImport("@libp2p/kad-dht/dist/src/message", "Message")
  @js.native
  open class Message protected () extends StObject {
    def this(`type`: MessageType, key: js.typedarray.Uint8Array, level: Double) = this()
    
    var closerPeers: js.Array[PeerInfo] = js.native
    
    /**
      * @type {number}
      */
    def clusterLevel: Double = js.native
    
    /* private */ var clusterLevelRaw: Any = js.native
    
    def clusterLevel_=(level: Double): Unit = js.native
    
    var key: js.typedarray.Uint8Array = js.native
    
    var providerPeers: js.Array[PeerInfo] = js.native
    
    var record: js.UndefOr[Libp2pRecord] = js.native
    
    /**
      * Encode into protobuf
      */
    def serialize(): js.typedarray.Uint8Array = js.native
    
    var `type`: MessageType = js.native
  }
  /* static members */
  object Message {
    
    @JSImport("@libp2p/kad-dht/dist/src/message", "Message")
    @js.native
    val ^ : js.Any = js.native
    
    inline def deserialize(raw: js.typedarray.Uint8Array): Message = ^.asInstanceOf[js.Dynamic].applyDynamic("deserialize")(raw.asInstanceOf[js.Any]).asInstanceOf[Message]
    /**
      * Decode from protobuf
      */
    inline def deserialize(raw: Uint8ArrayList): Message = ^.asInstanceOf[js.Dynamic].applyDynamic("deserialize")(raw.asInstanceOf[js.Any]).asInstanceOf[Message]
  }
}
