package typings.grpcGrpcJs

import typings.grpcGrpcJs.anon.PartialCallEventTracker
import typings.grpcGrpcJs.buildSrcCallInterfaceMod.StatusObject
import typings.grpcGrpcJs.buildSrcChannelCredentialsMod.ChannelCredentials
import typings.grpcGrpcJs.buildSrcChannelOptionsMod.ChannelOptions
import typings.grpcGrpcJs.buildSrcChannelzMod.SocketRef
import typings.grpcGrpcJs.buildSrcMetadataMod.Metadata
import typings.grpcGrpcJs.buildSrcSubchannelAddressMod.SubchannelAddress
import typings.grpcGrpcJs.buildSrcSubchannelCallMod.SubchannelCall
import typings.grpcGrpcJs.buildSrcSubchannelCallMod.SubchannelCallInterceptingListener
import typings.grpcGrpcJs.buildSrcUriParserMod.GrpcUri
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcTransportMod {
  
  @JSImport("@grpc/grpc-js/build/src/transport", "Http2SubchannelConnector")
  @js.native
  open class Http2SubchannelConnector protected ()
    extends StObject
       with SubchannelConnector {
    def this(channelTarget: GrpcUri) = this()
    
    /* private */ var channelTarget: Any = js.native
    
    /* CompleteClass */
    override def connect(address: SubchannelAddress, credentials: ChannelCredentials, options: ChannelOptions): js.Promise[Transport] = js.native
    
    /* private */ var createSession: Any = js.native
    
    /* private */ var isShutdown: Any = js.native
    
    /* private */ var session: Any = js.native
    
    /* CompleteClass */
    override def shutdown(): Unit = js.native
    
    /* private */ var trace: Any = js.native
  }
  
  trait CallEventTracker extends StObject {
    
    def addMessageReceived(): Unit
    
    def addMessageSent(): Unit
    
    def onCallEnd(status: StatusObject): Unit
    
    def onStreamEnd(success: Boolean): Unit
  }
  object CallEventTracker {
    
    inline def apply(
      addMessageReceived: () => Unit,
      addMessageSent: () => Unit,
      onCallEnd: StatusObject => Unit,
      onStreamEnd: Boolean => Unit
    ): CallEventTracker = {
      val __obj = js.Dynamic.literal(addMessageReceived = js.Any.fromFunction0(addMessageReceived), addMessageSent = js.Any.fromFunction0(addMessageSent), onCallEnd = js.Any.fromFunction1(onCallEnd), onStreamEnd = js.Any.fromFunction1(onStreamEnd))
      __obj.asInstanceOf[CallEventTracker]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CallEventTracker] (val x: Self) extends AnyVal {
      
      inline def setAddMessageReceived(value: () => Unit): Self = StObject.set(x, "addMessageReceived", js.Any.fromFunction0(value))
      
      inline def setAddMessageSent(value: () => Unit): Self = StObject.set(x, "addMessageSent", js.Any.fromFunction0(value))
      
      inline def setOnCallEnd(value: StatusObject => Unit): Self = StObject.set(x, "onCallEnd", js.Any.fromFunction1(value))
      
      inline def setOnStreamEnd(value: Boolean => Unit): Self = StObject.set(x, "onStreamEnd", js.Any.fromFunction1(value))
    }
  }
  
  trait Http2Transport
    extends StObject
       with Transport {
    
    /* private */ var activeCalls: Any
    
    /* private */ var addActiveCall: Any
    
    /* private */ val channelzEnabled: Any
    
    /* private */ var channelzRef: Any
    
    /* private */ var clearKeepaliveTimeout: Any
    
    /* private */ var disconnectHandled: Any
    
    /* private */ var disconnectListeners: Any
    
    /* private */ var flowControlTrace: Any
    
    /* private */ var getChannelzInfo: Any
    
    /**
      * Handle connection drops, but not GOAWAYs.
      */
    /* private */ var handleDisconnect: Any
    
    /* private */ var internalsTrace: Any
    
    /**
      * Timer reference for timeout that indicates when to send the next ping
      */
    /* private */ var keepaliveIntervalId: Any
    
    /**
      * The amount of time in between sending pings
      */
    /* private */ var keepaliveTimeMs: Any
    
    /**
      * Timer reference tracking when the most recent ping will be considered lost
      */
    /* private */ var keepaliveTimeoutId: Any
    
    /**
      * The amount of time to wait for an acknowledgement after sending a ping
      */
    /* private */ var keepaliveTimeoutMs: Any
    
    /* private */ var keepaliveTrace: Any
    
    /**
      * Indicates whether keepalive pings should be sent without any active calls
      */
    /* private */ var keepaliveWithoutCalls: Any
    
    /* private */ var keepalivesSent: Any
    
    /* private */ var lastMessageReceivedTimestamp: Any
    
    /* private */ var lastMessageSentTimestamp: Any
    
    /* private */ var messagesReceived: Any
    
    /* private */ var messagesSent: Any
    
    /**
      * Name of the remote server, if it is not the same as the subchannel
      * address, i.e. if connecting through an HTTP CONNECT proxy.
      */
    /* private */ var remoteName: Any
    
    /* private */ var removeActiveCall: Any
    
    /**
      * Indicate to the owner of this object that this transport should no longer
      * be used. That happens if the connection drops, or if the server sends a
      * GOAWAY.
      * @param tooManyPings If true, this was triggered by a GOAWAY with data
      * indicating that the session was closed becaues the client sent too many
      * pings.
      * @returns
      */
    /* private */ var reportDisconnectToOwner: Any
    
    /* private */ var sendPing: Any
    
    /* private */ var session: Any
    
    /* private */ var startKeepalivePings: Any
    
    /**
      * Stop keepalive pings when terminating a connection. This discards the
      * outstanding ping timeout, so it should not be called if the same
      * connection will still be used.
      */
    /* private */ var stopKeepalivePings: Any
    
    /* private */ var streamTracker: Any
    
    /* private */ var subchannelAddressString: Any
    
    /* private */ var trace: Any
    
    /* private */ var userAgent: Any
  }
  object Http2Transport {
    
    inline def apply(
      activeCalls: Any,
      addActiveCall: Any,
      addDisconnectListener: TransportDisconnectListener => Unit,
      channelzEnabled: Any,
      channelzRef: Any,
      clearKeepaliveTimeout: Any,
      createCall: (Metadata, String, String, SubchannelCallInterceptingListener, PartialCallEventTracker) => SubchannelCall,
      disconnectHandled: Any,
      disconnectListeners: Any,
      flowControlTrace: Any,
      getChannelzInfo: Any,
      getChannelzRef: () => SocketRef,
      getPeerName: () => String,
      handleDisconnect: Any,
      internalsTrace: Any,
      keepaliveIntervalId: Any,
      keepaliveTimeMs: Any,
      keepaliveTimeoutId: Any,
      keepaliveTimeoutMs: Any,
      keepaliveTrace: Any,
      keepaliveWithoutCalls: Any,
      keepalivesSent: Any,
      lastMessageReceivedTimestamp: Any,
      lastMessageSentTimestamp: Any,
      messagesReceived: Any,
      messagesSent: Any,
      remoteName: Any,
      removeActiveCall: Any,
      reportDisconnectToOwner: Any,
      sendPing: Any,
      session: Any,
      shutdown: () => Unit,
      startKeepalivePings: Any,
      stopKeepalivePings: Any,
      streamTracker: Any,
      subchannelAddressString: Any,
      trace: Any,
      userAgent: Any
    ): Http2Transport = {
      val __obj = js.Dynamic.literal(activeCalls = activeCalls.asInstanceOf[js.Any], addActiveCall = addActiveCall.asInstanceOf[js.Any], addDisconnectListener = js.Any.fromFunction1(addDisconnectListener), channelzEnabled = channelzEnabled.asInstanceOf[js.Any], channelzRef = channelzRef.asInstanceOf[js.Any], clearKeepaliveTimeout = clearKeepaliveTimeout.asInstanceOf[js.Any], createCall = js.Any.fromFunction5(createCall), disconnectHandled = disconnectHandled.asInstanceOf[js.Any], disconnectListeners = disconnectListeners.asInstanceOf[js.Any], flowControlTrace = flowControlTrace.asInstanceOf[js.Any], getChannelzInfo = getChannelzInfo.asInstanceOf[js.Any], getChannelzRef = js.Any.fromFunction0(getChannelzRef), getPeerName = js.Any.fromFunction0(getPeerName), handleDisconnect = handleDisconnect.asInstanceOf[js.Any], internalsTrace = internalsTrace.asInstanceOf[js.Any], keepaliveIntervalId = keepaliveIntervalId.asInstanceOf[js.Any], keepaliveTimeMs = keepaliveTimeMs.asInstanceOf[js.Any], keepaliveTimeoutId = keepaliveTimeoutId.asInstanceOf[js.Any], keepaliveTimeoutMs = keepaliveTimeoutMs.asInstanceOf[js.Any], keepaliveTrace = keepaliveTrace.asInstanceOf[js.Any], keepaliveWithoutCalls = keepaliveWithoutCalls.asInstanceOf[js.Any], keepalivesSent = keepalivesSent.asInstanceOf[js.Any], lastMessageReceivedTimestamp = lastMessageReceivedTimestamp.asInstanceOf[js.Any], lastMessageSentTimestamp = lastMessageSentTimestamp.asInstanceOf[js.Any], messagesReceived = messagesReceived.asInstanceOf[js.Any], messagesSent = messagesSent.asInstanceOf[js.Any], remoteName = remoteName.asInstanceOf[js.Any], removeActiveCall = removeActiveCall.asInstanceOf[js.Any], reportDisconnectToOwner = reportDisconnectToOwner.asInstanceOf[js.Any], sendPing = sendPing.asInstanceOf[js.Any], session = session.asInstanceOf[js.Any], shutdown = js.Any.fromFunction0(shutdown), startKeepalivePings = startKeepalivePings.asInstanceOf[js.Any], stopKeepalivePings = stopKeepalivePings.asInstanceOf[js.Any], streamTracker = streamTracker.asInstanceOf[js.Any], subchannelAddressString = subchannelAddressString.asInstanceOf[js.Any], trace = trace.asInstanceOf[js.Any], userAgent = userAgent.asInstanceOf[js.Any])
      __obj.asInstanceOf[Http2Transport]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Http2Transport] (val x: Self) extends AnyVal {
      
      inline def setActiveCalls(value: Any): Self = StObject.set(x, "activeCalls", value.asInstanceOf[js.Any])
      
      inline def setAddActiveCall(value: Any): Self = StObject.set(x, "addActiveCall", value.asInstanceOf[js.Any])
      
      inline def setChannelzEnabled(value: Any): Self = StObject.set(x, "channelzEnabled", value.asInstanceOf[js.Any])
      
      inline def setChannelzRef(value: Any): Self = StObject.set(x, "channelzRef", value.asInstanceOf[js.Any])
      
      inline def setClearKeepaliveTimeout(value: Any): Self = StObject.set(x, "clearKeepaliveTimeout", value.asInstanceOf[js.Any])
      
      inline def setDisconnectHandled(value: Any): Self = StObject.set(x, "disconnectHandled", value.asInstanceOf[js.Any])
      
      inline def setDisconnectListeners(value: Any): Self = StObject.set(x, "disconnectListeners", value.asInstanceOf[js.Any])
      
      inline def setFlowControlTrace(value: Any): Self = StObject.set(x, "flowControlTrace", value.asInstanceOf[js.Any])
      
      inline def setGetChannelzInfo(value: Any): Self = StObject.set(x, "getChannelzInfo", value.asInstanceOf[js.Any])
      
      inline def setHandleDisconnect(value: Any): Self = StObject.set(x, "handleDisconnect", value.asInstanceOf[js.Any])
      
      inline def setInternalsTrace(value: Any): Self = StObject.set(x, "internalsTrace", value.asInstanceOf[js.Any])
      
      inline def setKeepaliveIntervalId(value: Any): Self = StObject.set(x, "keepaliveIntervalId", value.asInstanceOf[js.Any])
      
      inline def setKeepaliveTimeMs(value: Any): Self = StObject.set(x, "keepaliveTimeMs", value.asInstanceOf[js.Any])
      
      inline def setKeepaliveTimeoutId(value: Any): Self = StObject.set(x, "keepaliveTimeoutId", value.asInstanceOf[js.Any])
      
      inline def setKeepaliveTimeoutMs(value: Any): Self = StObject.set(x, "keepaliveTimeoutMs", value.asInstanceOf[js.Any])
      
      inline def setKeepaliveTrace(value: Any): Self = StObject.set(x, "keepaliveTrace", value.asInstanceOf[js.Any])
      
      inline def setKeepaliveWithoutCalls(value: Any): Self = StObject.set(x, "keepaliveWithoutCalls", value.asInstanceOf[js.Any])
      
      inline def setKeepalivesSent(value: Any): Self = StObject.set(x, "keepalivesSent", value.asInstanceOf[js.Any])
      
      inline def setLastMessageReceivedTimestamp(value: Any): Self = StObject.set(x, "lastMessageReceivedTimestamp", value.asInstanceOf[js.Any])
      
      inline def setLastMessageSentTimestamp(value: Any): Self = StObject.set(x, "lastMessageSentTimestamp", value.asInstanceOf[js.Any])
      
      inline def setMessagesReceived(value: Any): Self = StObject.set(x, "messagesReceived", value.asInstanceOf[js.Any])
      
      inline def setMessagesSent(value: Any): Self = StObject.set(x, "messagesSent", value.asInstanceOf[js.Any])
      
      inline def setRemoteName(value: Any): Self = StObject.set(x, "remoteName", value.asInstanceOf[js.Any])
      
      inline def setRemoveActiveCall(value: Any): Self = StObject.set(x, "removeActiveCall", value.asInstanceOf[js.Any])
      
      inline def setReportDisconnectToOwner(value: Any): Self = StObject.set(x, "reportDisconnectToOwner", value.asInstanceOf[js.Any])
      
      inline def setSendPing(value: Any): Self = StObject.set(x, "sendPing", value.asInstanceOf[js.Any])
      
      inline def setSession(value: Any): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
      
      inline def setStartKeepalivePings(value: Any): Self = StObject.set(x, "startKeepalivePings", value.asInstanceOf[js.Any])
      
      inline def setStopKeepalivePings(value: Any): Self = StObject.set(x, "stopKeepalivePings", value.asInstanceOf[js.Any])
      
      inline def setStreamTracker(value: Any): Self = StObject.set(x, "streamTracker", value.asInstanceOf[js.Any])
      
      inline def setSubchannelAddressString(value: Any): Self = StObject.set(x, "subchannelAddressString", value.asInstanceOf[js.Any])
      
      inline def setTrace(value: Any): Self = StObject.set(x, "trace", value.asInstanceOf[js.Any])
      
      inline def setUserAgent(value: Any): Self = StObject.set(x, "userAgent", value.asInstanceOf[js.Any])
    }
  }
  
  trait SubchannelConnector extends StObject {
    
    def connect(address: SubchannelAddress, credentials: ChannelCredentials, options: ChannelOptions): js.Promise[Transport]
    
    def shutdown(): Unit
  }
  object SubchannelConnector {
    
    inline def apply(
      connect: (SubchannelAddress, ChannelCredentials, ChannelOptions) => js.Promise[Transport],
      shutdown: () => Unit
    ): SubchannelConnector = {
      val __obj = js.Dynamic.literal(connect = js.Any.fromFunction3(connect), shutdown = js.Any.fromFunction0(shutdown))
      __obj.asInstanceOf[SubchannelConnector]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SubchannelConnector] (val x: Self) extends AnyVal {
      
      inline def setConnect(value: (SubchannelAddress, ChannelCredentials, ChannelOptions) => js.Promise[Transport]): Self = StObject.set(x, "connect", js.Any.fromFunction3(value))
      
      inline def setShutdown(value: () => Unit): Self = StObject.set(x, "shutdown", js.Any.fromFunction0(value))
    }
  }
  
  trait Transport extends StObject {
    
    def addDisconnectListener(listener: TransportDisconnectListener): Unit
    
    def createCall(
      metadata: Metadata,
      host: String,
      method: String,
      listener: SubchannelCallInterceptingListener,
      subchannelCallStatsTracker: PartialCallEventTracker
    ): SubchannelCall
    
    def getChannelzRef(): SocketRef
    
    def getPeerName(): String
    
    def shutdown(): Unit
  }
  object Transport {
    
    inline def apply(
      addDisconnectListener: TransportDisconnectListener => Unit,
      createCall: (Metadata, String, String, SubchannelCallInterceptingListener, PartialCallEventTracker) => SubchannelCall,
      getChannelzRef: () => SocketRef,
      getPeerName: () => String,
      shutdown: () => Unit
    ): Transport = {
      val __obj = js.Dynamic.literal(addDisconnectListener = js.Any.fromFunction1(addDisconnectListener), createCall = js.Any.fromFunction5(createCall), getChannelzRef = js.Any.fromFunction0(getChannelzRef), getPeerName = js.Any.fromFunction0(getPeerName), shutdown = js.Any.fromFunction0(shutdown))
      __obj.asInstanceOf[Transport]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Transport] (val x: Self) extends AnyVal {
      
      inline def setAddDisconnectListener(value: TransportDisconnectListener => Unit): Self = StObject.set(x, "addDisconnectListener", js.Any.fromFunction1(value))
      
      inline def setCreateCall(
        value: (Metadata, String, String, SubchannelCallInterceptingListener, PartialCallEventTracker) => SubchannelCall
      ): Self = StObject.set(x, "createCall", js.Any.fromFunction5(value))
      
      inline def setGetChannelzRef(value: () => SocketRef): Self = StObject.set(x, "getChannelzRef", js.Any.fromFunction0(value))
      
      inline def setGetPeerName(value: () => String): Self = StObject.set(x, "getPeerName", js.Any.fromFunction0(value))
      
      inline def setShutdown(value: () => Unit): Self = StObject.set(x, "shutdown", js.Any.fromFunction0(value))
    }
  }
  
  type TransportDisconnectListener = js.Function1[/* tooManyPings */ Boolean, Unit]
}
