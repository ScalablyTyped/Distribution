package typings.grpcGrpcJs

import typings.grpcGrpcJs.channelTraceMod.ChannelTrace
import typings.grpcGrpcJs.connectivityStateMod.ConnectivityState
import typings.grpcGrpcJs.grpcGrpcJsStrings.channel
import typings.grpcGrpcJs.grpcGrpcJsStrings.server
import typings.grpcGrpcJs.grpcGrpcJsStrings.socket
import typings.grpcGrpcJs.grpcGrpcJsStrings.subchannel
import typings.grpcGrpcJs.subchannelAddressMod.SubchannelAddress
import typings.grpcGrpcJs.v1ChannelzMod.ChannelzDefinition
import typings.grpcGrpcJs.v1ChannelzMod.ChannelzHandlers
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object channelzMod {
  
  @JSImport("@grpc/grpc-js/build/src/channelz", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@grpc/grpc-js/build/src/channelz", "ChannelzCallTracker")
  @js.native
  open class ChannelzCallTracker () extends StObject {
    
    def addCallFailed(): Unit = js.native
    
    def addCallStarted(): Unit = js.native
    
    def addCallSucceeded(): Unit = js.native
    
    var callsFailed: Double = js.native
    
    var callsStarted: Double = js.native
    
    var callsSucceeded: Double = js.native
    
    var lastCallStartedTimestamp: js.Date | Null = js.native
  }
  
  @JSImport("@grpc/grpc-js/build/src/channelz", "ChannelzChildrenTracker")
  @js.native
  open class ChannelzChildrenTracker () extends StObject {
    
    /* private */ var channelChildren: Any = js.native
    
    def getChildLists(): ChannelzChildren = js.native
    
    def refChild(child: ChannelRef): Unit = js.native
    def refChild(child: SocketRef): Unit = js.native
    def refChild(child: SubchannelRef): Unit = js.native
    
    /* private */ var socketChildren: Any = js.native
    
    /* private */ var subchannelChildren: Any = js.native
    
    def unrefChild(child: ChannelRef): Unit = js.native
    def unrefChild(child: SocketRef): Unit = js.native
    def unrefChild(child: SubchannelRef): Unit = js.native
  }
  
  @JSImport("@grpc/grpc-js/build/src/channelz", "ChannelzTrace")
  @js.native
  open class ChannelzTrace () extends StObject {
    
    def addTrace(severity: TraceSeverity, description: String): Unit = js.native
    def addTrace(severity: TraceSeverity, description: String, child: ChannelRef): Unit = js.native
    def addTrace(severity: TraceSeverity, description: String, child: SubchannelRef): Unit = js.native
    
    var creationTimestamp: js.Date = js.native
    
    var events: js.Array[TraceEvent] = js.native
    
    var eventsLogged: Double = js.native
    
    def getTraceMessage(): ChannelTrace = js.native
  }
  
  inline def getChannelzHandlers(): ChannelzHandlers = ^.asInstanceOf[js.Dynamic].applyDynamic("getChannelzHandlers")().asInstanceOf[ChannelzHandlers]
  
  inline def getChannelzServiceDefinition(): ChannelzDefinition = ^.asInstanceOf[js.Dynamic].applyDynamic("getChannelzServiceDefinition")().asInstanceOf[ChannelzDefinition]
  
  inline def registerChannelzChannel(name: String, getInfo: js.Function0[ChannelInfo], channelzEnabled: Boolean): ChannelRef = (^.asInstanceOf[js.Dynamic].applyDynamic("registerChannelzChannel")(name.asInstanceOf[js.Any], getInfo.asInstanceOf[js.Any], channelzEnabled.asInstanceOf[js.Any])).asInstanceOf[ChannelRef]
  
  inline def registerChannelzServer(getInfo: js.Function0[ServerInfo], channelzEnabled: Boolean): ServerRef = (^.asInstanceOf[js.Dynamic].applyDynamic("registerChannelzServer")(getInfo.asInstanceOf[js.Any], channelzEnabled.asInstanceOf[js.Any])).asInstanceOf[ServerRef]
  
  inline def registerChannelzSocket(name: String, getInfo: js.Function0[SocketInfo], channelzEnabled: Boolean): SocketRef = (^.asInstanceOf[js.Dynamic].applyDynamic("registerChannelzSocket")(name.asInstanceOf[js.Any], getInfo.asInstanceOf[js.Any], channelzEnabled.asInstanceOf[js.Any])).asInstanceOf[SocketRef]
  
  inline def registerChannelzSubchannel(name: String, getInfo: js.Function0[SubchannelInfo], channelzEnabled: Boolean): SubchannelRef = (^.asInstanceOf[js.Dynamic].applyDynamic("registerChannelzSubchannel")(name.asInstanceOf[js.Any], getInfo.asInstanceOf[js.Any], channelzEnabled.asInstanceOf[js.Any])).asInstanceOf[SubchannelRef]
  
  inline def setup(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setup")().asInstanceOf[Unit]
  
  inline def unregisterChannelzRef(ref: ChannelRef): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unregisterChannelzRef")(ref.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def unregisterChannelzRef(ref: ServerRef): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unregisterChannelzRef")(ref.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def unregisterChannelzRef(ref: SocketRef): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unregisterChannelzRef")(ref.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def unregisterChannelzRef(ref: SubchannelRef): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unregisterChannelzRef")(ref.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  trait ChannelInfo extends StObject {
    
    var callTracker: ChannelzCallTracker
    
    var children: ChannelzChildren
    
    var state: ConnectivityState
    
    var target: String
    
    var trace: ChannelzTrace
  }
  object ChannelInfo {
    
    inline def apply(
      callTracker: ChannelzCallTracker,
      children: ChannelzChildren,
      state: ConnectivityState,
      target: String,
      trace: ChannelzTrace
    ): ChannelInfo = {
      val __obj = js.Dynamic.literal(callTracker = callTracker.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], trace = trace.asInstanceOf[js.Any])
      __obj.asInstanceOf[ChannelInfo]
    }
    
    extension [Self <: ChannelInfo](x: Self) {
      
      inline def setCallTracker(value: ChannelzCallTracker): Self = StObject.set(x, "callTracker", value.asInstanceOf[js.Any])
      
      inline def setChildren(value: ChannelzChildren): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setState(value: ConnectivityState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTrace(value: ChannelzTrace): Self = StObject.set(x, "trace", value.asInstanceOf[js.Any])
    }
  }
  
  trait ChannelRef extends StObject {
    
    var id: Double
    
    var kind: channel
    
    var name: String
  }
  object ChannelRef {
    
    inline def apply(id: Double, name: String): ChannelRef = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], kind = "channel", name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[ChannelRef]
    }
    
    extension [Self <: ChannelRef](x: Self) {
      
      inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setKind(value: channel): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait ChannelzChildren extends StObject {
    
    var channels: js.Array[ChannelRef]
    
    var sockets: js.Array[SocketRef]
    
    var subchannels: js.Array[SubchannelRef]
  }
  object ChannelzChildren {
    
    inline def apply(channels: js.Array[ChannelRef], sockets: js.Array[SocketRef], subchannels: js.Array[SubchannelRef]): ChannelzChildren = {
      val __obj = js.Dynamic.literal(channels = channels.asInstanceOf[js.Any], sockets = sockets.asInstanceOf[js.Any], subchannels = subchannels.asInstanceOf[js.Any])
      __obj.asInstanceOf[ChannelzChildren]
    }
    
    extension [Self <: ChannelzChildren](x: Self) {
      
      inline def setChannels(value: js.Array[ChannelRef]): Self = StObject.set(x, "channels", value.asInstanceOf[js.Any])
      
      inline def setChannelsVarargs(value: ChannelRef*): Self = StObject.set(x, "channels", js.Array(value*))
      
      inline def setSockets(value: js.Array[SocketRef]): Self = StObject.set(x, "sockets", value.asInstanceOf[js.Any])
      
      inline def setSocketsVarargs(value: SocketRef*): Self = StObject.set(x, "sockets", js.Array(value*))
      
      inline def setSubchannels(value: js.Array[SubchannelRef]): Self = StObject.set(x, "subchannels", value.asInstanceOf[js.Any])
      
      inline def setSubchannelsVarargs(value: SubchannelRef*): Self = StObject.set(x, "subchannels", js.Array(value*))
    }
  }
  
  trait ServerInfo extends StObject {
    
    var callTracker: ChannelzCallTracker
    
    var listenerChildren: ChannelzChildren
    
    var sessionChildren: ChannelzChildren
    
    var trace: ChannelzTrace
  }
  object ServerInfo {
    
    inline def apply(
      callTracker: ChannelzCallTracker,
      listenerChildren: ChannelzChildren,
      sessionChildren: ChannelzChildren,
      trace: ChannelzTrace
    ): ServerInfo = {
      val __obj = js.Dynamic.literal(callTracker = callTracker.asInstanceOf[js.Any], listenerChildren = listenerChildren.asInstanceOf[js.Any], sessionChildren = sessionChildren.asInstanceOf[js.Any], trace = trace.asInstanceOf[js.Any])
      __obj.asInstanceOf[ServerInfo]
    }
    
    extension [Self <: ServerInfo](x: Self) {
      
      inline def setCallTracker(value: ChannelzCallTracker): Self = StObject.set(x, "callTracker", value.asInstanceOf[js.Any])
      
      inline def setListenerChildren(value: ChannelzChildren): Self = StObject.set(x, "listenerChildren", value.asInstanceOf[js.Any])
      
      inline def setSessionChildren(value: ChannelzChildren): Self = StObject.set(x, "sessionChildren", value.asInstanceOf[js.Any])
      
      inline def setTrace(value: ChannelzTrace): Self = StObject.set(x, "trace", value.asInstanceOf[js.Any])
    }
  }
  
  trait ServerRef extends StObject {
    
    var id: Double
    
    var kind: server
  }
  object ServerRef {
    
    inline def apply(id: Double): ServerRef = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], kind = "server")
      __obj.asInstanceOf[ServerRef]
    }
    
    extension [Self <: ServerRef](x: Self) {
      
      inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setKind(value: server): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    }
  }
  
  trait SocketInfo extends StObject {
    
    var keepAlivesSent: Double
    
    var lastLocalStreamCreatedTimestamp: js.Date | Null
    
    var lastMessageReceivedTimestamp: js.Date | Null
    
    var lastMessageSentTimestamp: js.Date | Null
    
    var lastRemoteStreamCreatedTimestamp: js.Date | Null
    
    var localAddress: SubchannelAddress | Null
    
    var localFlowControlWindow: Double | Null
    
    var messagesReceived: Double
    
    var messagesSent: Double
    
    var remoteAddress: SubchannelAddress | Null
    
    var remoteFlowControlWindow: Double | Null
    
    var remoteName: String | Null
    
    var security: TlsInfo | Null
    
    var streamsFailed: Double
    
    var streamsStarted: Double
    
    var streamsSucceeded: Double
  }
  object SocketInfo {
    
    inline def apply(
      keepAlivesSent: Double,
      messagesReceived: Double,
      messagesSent: Double,
      streamsFailed: Double,
      streamsStarted: Double,
      streamsSucceeded: Double
    ): SocketInfo = {
      val __obj = js.Dynamic.literal(keepAlivesSent = keepAlivesSent.asInstanceOf[js.Any], messagesReceived = messagesReceived.asInstanceOf[js.Any], messagesSent = messagesSent.asInstanceOf[js.Any], streamsFailed = streamsFailed.asInstanceOf[js.Any], streamsStarted = streamsStarted.asInstanceOf[js.Any], streamsSucceeded = streamsSucceeded.asInstanceOf[js.Any], lastLocalStreamCreatedTimestamp = null, lastMessageReceivedTimestamp = null, lastMessageSentTimestamp = null, lastRemoteStreamCreatedTimestamp = null, localAddress = null, localFlowControlWindow = null, remoteAddress = null, remoteFlowControlWindow = null, remoteName = null, security = null)
      __obj.asInstanceOf[SocketInfo]
    }
    
    extension [Self <: SocketInfo](x: Self) {
      
      inline def setKeepAlivesSent(value: Double): Self = StObject.set(x, "keepAlivesSent", value.asInstanceOf[js.Any])
      
      inline def setLastLocalStreamCreatedTimestamp(value: js.Date): Self = StObject.set(x, "lastLocalStreamCreatedTimestamp", value.asInstanceOf[js.Any])
      
      inline def setLastLocalStreamCreatedTimestampNull: Self = StObject.set(x, "lastLocalStreamCreatedTimestamp", null)
      
      inline def setLastMessageReceivedTimestamp(value: js.Date): Self = StObject.set(x, "lastMessageReceivedTimestamp", value.asInstanceOf[js.Any])
      
      inline def setLastMessageReceivedTimestampNull: Self = StObject.set(x, "lastMessageReceivedTimestamp", null)
      
      inline def setLastMessageSentTimestamp(value: js.Date): Self = StObject.set(x, "lastMessageSentTimestamp", value.asInstanceOf[js.Any])
      
      inline def setLastMessageSentTimestampNull: Self = StObject.set(x, "lastMessageSentTimestamp", null)
      
      inline def setLastRemoteStreamCreatedTimestamp(value: js.Date): Self = StObject.set(x, "lastRemoteStreamCreatedTimestamp", value.asInstanceOf[js.Any])
      
      inline def setLastRemoteStreamCreatedTimestampNull: Self = StObject.set(x, "lastRemoteStreamCreatedTimestamp", null)
      
      inline def setLocalAddress(value: SubchannelAddress): Self = StObject.set(x, "localAddress", value.asInstanceOf[js.Any])
      
      inline def setLocalAddressNull: Self = StObject.set(x, "localAddress", null)
      
      inline def setLocalFlowControlWindow(value: Double): Self = StObject.set(x, "localFlowControlWindow", value.asInstanceOf[js.Any])
      
      inline def setLocalFlowControlWindowNull: Self = StObject.set(x, "localFlowControlWindow", null)
      
      inline def setMessagesReceived(value: Double): Self = StObject.set(x, "messagesReceived", value.asInstanceOf[js.Any])
      
      inline def setMessagesSent(value: Double): Self = StObject.set(x, "messagesSent", value.asInstanceOf[js.Any])
      
      inline def setRemoteAddress(value: SubchannelAddress): Self = StObject.set(x, "remoteAddress", value.asInstanceOf[js.Any])
      
      inline def setRemoteAddressNull: Self = StObject.set(x, "remoteAddress", null)
      
      inline def setRemoteFlowControlWindow(value: Double): Self = StObject.set(x, "remoteFlowControlWindow", value.asInstanceOf[js.Any])
      
      inline def setRemoteFlowControlWindowNull: Self = StObject.set(x, "remoteFlowControlWindow", null)
      
      inline def setRemoteName(value: String): Self = StObject.set(x, "remoteName", value.asInstanceOf[js.Any])
      
      inline def setRemoteNameNull: Self = StObject.set(x, "remoteName", null)
      
      inline def setSecurity(value: TlsInfo): Self = StObject.set(x, "security", value.asInstanceOf[js.Any])
      
      inline def setSecurityNull: Self = StObject.set(x, "security", null)
      
      inline def setStreamsFailed(value: Double): Self = StObject.set(x, "streamsFailed", value.asInstanceOf[js.Any])
      
      inline def setStreamsStarted(value: Double): Self = StObject.set(x, "streamsStarted", value.asInstanceOf[js.Any])
      
      inline def setStreamsSucceeded(value: Double): Self = StObject.set(x, "streamsSucceeded", value.asInstanceOf[js.Any])
    }
  }
  
  trait SocketRef extends StObject {
    
    var id: Double
    
    var kind: socket
    
    var name: String
  }
  object SocketRef {
    
    inline def apply(id: Double, name: String): SocketRef = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], kind = "socket", name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[SocketRef]
    }
    
    extension [Self <: SocketRef](x: Self) {
      
      inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setKind(value: socket): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  type SubchannelInfo = ChannelInfo
  
  trait SubchannelRef extends StObject {
    
    var id: Double
    
    var kind: subchannel
    
    var name: String
  }
  object SubchannelRef {
    
    inline def apply(id: Double, name: String): SubchannelRef = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], kind = "subchannel", name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[SubchannelRef]
    }
    
    extension [Self <: SubchannelRef](x: Self) {
      
      inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setKind(value: subchannel): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait TlsInfo extends StObject {
    
    var cipherSuiteOtherName: String | Null
    
    var cipherSuiteStandardName: String | Null
    
    var localCertificate: Buffer | Null
    
    var remoteCertificate: Buffer | Null
  }
  object TlsInfo {
    
    inline def apply(): TlsInfo = {
      val __obj = js.Dynamic.literal(cipherSuiteOtherName = null, cipherSuiteStandardName = null, localCertificate = null, remoteCertificate = null)
      __obj.asInstanceOf[TlsInfo]
    }
    
    extension [Self <: TlsInfo](x: Self) {
      
      inline def setCipherSuiteOtherName(value: String): Self = StObject.set(x, "cipherSuiteOtherName", value.asInstanceOf[js.Any])
      
      inline def setCipherSuiteOtherNameNull: Self = StObject.set(x, "cipherSuiteOtherName", null)
      
      inline def setCipherSuiteStandardName(value: String): Self = StObject.set(x, "cipherSuiteStandardName", value.asInstanceOf[js.Any])
      
      inline def setCipherSuiteStandardNameNull: Self = StObject.set(x, "cipherSuiteStandardName", null)
      
      inline def setLocalCertificate(value: Buffer): Self = StObject.set(x, "localCertificate", value.asInstanceOf[js.Any])
      
      inline def setLocalCertificateNull: Self = StObject.set(x, "localCertificate", null)
      
      inline def setRemoteCertificate(value: Buffer): Self = StObject.set(x, "remoteCertificate", value.asInstanceOf[js.Any])
      
      inline def setRemoteCertificateNull: Self = StObject.set(x, "remoteCertificate", null)
    }
  }
  
  trait TraceEvent extends StObject {
    
    var childChannel: js.UndefOr[ChannelRef] = js.undefined
    
    var childSubchannel: js.UndefOr[SubchannelRef] = js.undefined
    
    var description: String
    
    var severity: TraceSeverity
    
    var timestamp: js.Date
  }
  object TraceEvent {
    
    inline def apply(description: String, severity: TraceSeverity, timestamp: js.Date): TraceEvent = {
      val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], severity = severity.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
      __obj.asInstanceOf[TraceEvent]
    }
    
    extension [Self <: TraceEvent](x: Self) {
      
      inline def setChildChannel(value: ChannelRef): Self = StObject.set(x, "childChannel", value.asInstanceOf[js.Any])
      
      inline def setChildChannelUndefined: Self = StObject.set(x, "childChannel", js.undefined)
      
      inline def setChildSubchannel(value: SubchannelRef): Self = StObject.set(x, "childSubchannel", value.asInstanceOf[js.Any])
      
      inline def setChildSubchannelUndefined: Self = StObject.set(x, "childSubchannel", js.undefined)
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setSeverity(value: TraceSeverity): Self = StObject.set(x, "severity", value.asInstanceOf[js.Any])
      
      inline def setTimestamp(value: js.Date): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.grpcGrpcJs.grpcGrpcJsStrings.CT_UNKNOWN
    - typings.grpcGrpcJs.grpcGrpcJsStrings.CT_INFO
    - typings.grpcGrpcJs.grpcGrpcJsStrings.CT_WARNING
    - typings.grpcGrpcJs.grpcGrpcJsStrings.CT_ERROR
  */
  trait TraceSeverity extends StObject
  object TraceSeverity {
    
    inline def CT_ERROR: typings.grpcGrpcJs.grpcGrpcJsStrings.CT_ERROR = "CT_ERROR".asInstanceOf[typings.grpcGrpcJs.grpcGrpcJsStrings.CT_ERROR]
    
    inline def CT_INFO: typings.grpcGrpcJs.grpcGrpcJsStrings.CT_INFO = "CT_INFO".asInstanceOf[typings.grpcGrpcJs.grpcGrpcJsStrings.CT_INFO]
    
    inline def CT_UNKNOWN: typings.grpcGrpcJs.grpcGrpcJsStrings.CT_UNKNOWN = "CT_UNKNOWN".asInstanceOf[typings.grpcGrpcJs.grpcGrpcJsStrings.CT_UNKNOWN]
    
    inline def CT_WARNING: typings.grpcGrpcJs.grpcGrpcJsStrings.CT_WARNING = "CT_WARNING".asInstanceOf[typings.grpcGrpcJs.grpcGrpcJsStrings.CT_WARNING]
  }
}
