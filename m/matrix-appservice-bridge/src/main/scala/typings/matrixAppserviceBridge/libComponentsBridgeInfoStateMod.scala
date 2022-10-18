package typings.matrixAppserviceBridge

import typings.matrixAppserviceBridge.anon.Content
import typings.matrixAppserviceBridge.anon.Displayname
import typings.matrixAppserviceBridge.libBridgeMod.Bridge
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsBridgeInfoStateMod {
  
  @JSImport("matrix-appservice-bridge/lib/components/bridge-info-state", "BridgeInfoStateSyncer")
  @js.native
  open class BridgeInfoStateSyncer[BridgeMappingInfo] protected () extends StObject {
    def this(bridge: Bridge, opts: Opts[BridgeMappingInfo]) = this()
    
    /* private */ var bridge: Any = js.native
    
    def createBridgeInfoContent(mapping: MappingInfo): MSC2346Content = js.native
    
    def createInitialState(roomId: String, bridgeMappingInfo: BridgeMappingInfo): js.Promise[Content] = js.native
    
    def createStateKey(mapping: MappingInfo): String = js.native
    
    /**
      * Check all rooms and ensure they have correct state.
      * @param allMappings All bridged room mappings
      * @param concurrency How many rooms to handle at a time, defaults to 3.
      */
    def initialSync(allMappings: Record[String, js.Array[BridgeMappingInfo]]): js.Promise[Unit] = js.native
    def initialSync(allMappings: Record[String, js.Array[BridgeMappingInfo]], concurrency: Double): js.Promise[Unit] = js.native
    
    /* private */ var opts: Any = js.native
    
    /* private */ var syncRoom: Any = js.native
  }
  /* static members */
  object BridgeInfoStateSyncer {
    
    @JSImport("matrix-appservice-bridge/lib/components/bridge-info-state", "BridgeInfoStateSyncer.EventType")
    @js.native
    val EventType: /* "uk.half-shot.bridge" */ String = js.native
  }
  
  trait MSC2346Content
    extends StObject
       with MappingInfo {
    
    var bridgebot: String
  }
  object MSC2346Content {
    
    inline def apply(bridgebot: String, channel: Displayname, protocol: Displayname): MSC2346Content = {
      val __obj = js.Dynamic.literal(bridgebot = bridgebot.asInstanceOf[js.Any], channel = channel.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any])
      __obj.asInstanceOf[MSC2346Content]
    }
    
    extension [Self <: MSC2346Content](x: Self) {
      
      inline def setBridgebot(value: String): Self = StObject.set(x, "bridgebot", value.asInstanceOf[js.Any])
    }
  }
  
  trait MappingInfo extends StObject {
    
    var channel: Displayname
    
    var creator: js.UndefOr[String] = js.undefined
    
    var network: js.UndefOr[Displayname] = js.undefined
    
    var protocol: Displayname
  }
  object MappingInfo {
    
    inline def apply(channel: Displayname, protocol: Displayname): MappingInfo = {
      val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any])
      __obj.asInstanceOf[MappingInfo]
    }
    
    extension [Self <: MappingInfo](x: Self) {
      
      inline def setChannel(value: Displayname): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
      
      inline def setCreator(value: String): Self = StObject.set(x, "creator", value.asInstanceOf[js.Any])
      
      inline def setCreatorUndefined: Self = StObject.set(x, "creator", js.undefined)
      
      inline def setNetwork(value: Displayname): Self = StObject.set(x, "network", value.asInstanceOf[js.Any])
      
      inline def setNetworkUndefined: Self = StObject.set(x, "network", js.undefined)
      
      inline def setProtocol(value: Displayname): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
    }
  }
  
  trait Opts[BridgeMappingInfo] extends StObject {
    
    /**
      * The name of the bridge implementation, ideally in Java package naming format:
      * @example org.matrix.matrix-appservice-irc
      */
    var bridgeName: String
    
    /**
      * This should return some standard information about a given
      * mapping.
      */
    def getMapping(roomId: String, info: BridgeMappingInfo): js.Promise[MappingInfo]
  }
  object Opts {
    
    inline def apply[BridgeMappingInfo](bridgeName: String, getMapping: (String, BridgeMappingInfo) => js.Promise[MappingInfo]): Opts[BridgeMappingInfo] = {
      val __obj = js.Dynamic.literal(bridgeName = bridgeName.asInstanceOf[js.Any], getMapping = js.Any.fromFunction2(getMapping))
      __obj.asInstanceOf[Opts[BridgeMappingInfo]]
    }
    
    extension [Self <: Opts[?], BridgeMappingInfo](x: Self & Opts[BridgeMappingInfo]) {
      
      inline def setBridgeName(value: String): Self = StObject.set(x, "bridgeName", value.asInstanceOf[js.Any])
      
      inline def setGetMapping(value: (String, BridgeMappingInfo) => js.Promise[MappingInfo]): Self = StObject.set(x, "getMapping", js.Any.fromFunction2(value))
    }
  }
}
