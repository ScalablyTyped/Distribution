package typings.grpcGrpcJs

import typings.grpcGrpcJs.buildSrcCallCredentialsMod.CallCredentials
import typings.grpcGrpcJs.buildSrcChannelMod.ChannelImplementation
import typings.grpcGrpcJs.buildSrcConstantsMod.Status
import typings.grpcGrpcJs.buildSrcFilterMod.Filter
import typings.grpcGrpcJs.buildSrcFilterStackMod.FilterStack
import typings.grpcGrpcJs.buildSrcFilterStackMod.FilterStackFactory
import typings.grpcGrpcJs.buildSrcMetadataMod.Metadata
import typings.grpcGrpcJs.buildSrcServerCallMod.ServerSurfaceCall
import typings.grpcGrpcJs.buildSrcSubchannelMod.Subchannel
import typings.grpcGrpcJs.buildSrcSubchannelMod.SubchannelCallStatsTracker
import typings.grpcGrpcJs.grpcGrpcJsInts.`1`
import typings.grpcGrpcJs.grpcGrpcJsInts.`2`
import typings.grpcGrpcJs.grpcGrpcJsInts.`4`
import typings.node.bufferMod.global.Buffer
import typings.node.http2Mod.ClientHttp2Stream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcCallStreamMod {
  
  @JSImport("@grpc/grpc-js/build/src/call-stream", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@grpc/grpc-js/build/src/call-stream", "Http2CallStream")
  @js.native
  open class Http2CallStream protected ()
    extends StObject
       with Call {
    def this(
      methodName: String,
      channel: ChannelImplementation,
      options: CallStreamOptions,
      filterStackFactory: FilterStackFactory,
      channelCallCredentials: CallCredentials,
      callNumber: Double
    ) = this()
    
    def addFilters(extraFilters: js.Array[Filter]): Unit = js.native
    
    def addStatusWatcher(watcher: js.Function1[/* status */ StatusObject, Unit]): Unit = js.native
    
    def addStreamEndWatcher(watcher: js.Function1[/* success */ Boolean, Unit]): Unit = js.native
    
    def attachHttp2Stream(
      stream: ClientHttp2Stream,
      subchannel: Subchannel,
      extraFilters: js.Array[Filter],
      callStatsTracker: SubchannelCallStatsTracker
    ): Unit = js.native
    
    /* private */ val callNumber: Any = js.native
    
    /* private */ var callStatsTracker: Any = js.native
    
    /* private */ var canPush: Any = js.native
    
    /* CompleteClass */
    override def cancelWithStatus(status: Status, details: String): Unit = js.native
    
    /* private */ val channel: Any = js.native
    
    /* private */ val channelCallCredentials: Any = js.native
    
    /* private */ var configDeadline: Any = js.native
    
    var credentials: CallCredentials = js.native
    
    /* private */ var decoder: Any = js.native
    
    /* private */ var destroyHttp2Stream: Any = js.native
    
    /* private */ var disconnectListener: Any = js.native
    
    /**
      * On first call, emits a 'status' event with the given StatusObject.
      * Subsequent calls are no-ops.
      * @param status The status of the call.
      */
    /* private */ var endCall: Any = js.native
    
    /* private */ var filterReceivedMessage: Any = js.native
    
    var filterStack: FilterStack = js.native
    
    /* private */ var finalStatus: Any = js.native
    
    def getCallNumber(): Double = js.native
    
    /* CompleteClass */
    override def getCredentials(): CallCredentials = js.native
    
    /* CompleteClass */
    override def getDeadline(): Deadline = js.native
    
    /* CompleteClass */
    override def getHost(): String = js.native
    
    /* CompleteClass */
    override def getMethod(): String = js.native
    
    /* CompleteClass */
    override def getPeer(): String = js.native
    
    def getStatus(): StatusObject | Null = js.native
    
    /* CompleteClass */
    override def halfClose(): Unit = js.native
    
    /* private */ var handleFilterError: Any = js.native
    
    /* private */ var handleFilteredRead: Any = js.native
    
    /* private */ var handleTrailers: Any = js.native
    
    /* private */ var http2Stream: Any = js.native
    
    /* private */ var internalError: Any = js.native
    
    /* private */ var isReadFilterPending: Any = js.native
    
    /* private */ var isWriteFilterPending: Any = js.native
    
    /* private */ var listener: Any = js.native
    
    /* private */ var mappedStatusCode: Any = js.native
    
    /* private */ var maybeCloseWrites: Any = js.native
    
    /* private */ var maybeOutputStatus: Any = js.native
    
    /* private */ val methodName: Any = js.native
    
    /* private */ val options: Any = js.native
    
    /* private */ var outputStatus: Any = js.native
    
    /* private */ var pendingRead: Any = js.native
    
    /* private */ var pendingWrite: Any = js.native
    
    /* private */ var pendingWriteCallback: Any = js.native
    
    /* private */ var push: Any = js.native
    
    /**
      * Indicates that an 'end' event has come from the http2 stream, so there
      * will be no more data events.
      */
    /* private */ var readsClosed: Any = js.native
    
    /* CompleteClass */
    override def sendMessageWithContext(context: MessageContext, message: Buffer): Unit = js.native
    
    def setConfigDeadline(configDeadline: Deadline): Unit = js.native
    
    /* CompleteClass */
    override def setCredentials(credentials: CallCredentials): Unit = js.native
    
    /* CompleteClass */
    override def start(metadata: Metadata, listener: InterceptingListener): Unit = js.native
    
    /* CompleteClass */
    override def startRead(): Unit = js.native
    
    /* private */ var statusOutput: Any = js.native
    
    /* private */ var statusWatchers: Any = js.native
    
    /* private */ var streamEndWatchers: Any = js.native
    
    /* private */ var subchannel: Any = js.native
    
    /* private */ var trace: Any = js.native
    
    /* private */ var tryPush: Any = js.native
    
    /* private */ var unfilteredReadMessages: Any = js.native
    
    /* private */ var unpushedReadMessages: Any = js.native
    
    /* private */ var writeMessageToStream: Any = js.native
    
    /* private */ var writesClosed: Any = js.native
  }
  
  @JSImport("@grpc/grpc-js/build/src/call-stream", "InterceptingListenerImpl")
  @js.native
  open class InterceptingListenerImpl protected ()
    extends StObject
       with InterceptingListener {
    def this(listener: FullListener, nextListener: InterceptingListener) = this()
    
    /* private */ var hasPendingMessage: Any = js.native
    
    /* private */ var listener: Any = js.native
    
    /* private */ var nextListener: Any = js.native
    
    /* CompleteClass */
    override def onReceiveMessage(message: Any): Unit = js.native
    
    /* CompleteClass */
    override def onReceiveMetadata(metadata: Metadata): Unit = js.native
    
    /* CompleteClass */
    override def onReceiveStatus(status: StatusObject): Unit = js.native
    
    /* private */ var pendingMessage: Any = js.native
    
    /* private */ var pendingStatus: Any = js.native
    
    /* private */ var processPendingMessage: Any = js.native
    
    /* private */ var processPendingStatus: Any = js.native
    
    /* private */ var processingMessage: Any = js.native
    
    /* private */ var processingMetadata: Any = js.native
  }
  
  inline def isInterceptingListener(listener: InterceptingListener): /* is @grpc/grpc-js.@grpc/grpc-js/build/src/call-stream.InterceptingListener */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInterceptingListener")(listener.asInstanceOf[js.Any]).asInstanceOf[/* is @grpc/grpc-js.@grpc/grpc-js/build/src/call-stream.InterceptingListener */ Boolean]
  inline def isInterceptingListener(listener: Listener): /* is @grpc/grpc-js.@grpc/grpc-js/build/src/call-stream.InterceptingListener */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInterceptingListener")(listener.asInstanceOf[js.Any]).asInstanceOf[/* is @grpc/grpc-js.@grpc/grpc-js/build/src/call-stream.InterceptingListener */ Boolean]
  
  trait Call extends StObject {
    
    def cancelWithStatus(status: Status, details: String): Unit
    
    def getCredentials(): CallCredentials
    
    def getDeadline(): Deadline
    
    def getHost(): String
    
    def getMethod(): String
    
    def getPeer(): String
    
    def halfClose(): Unit
    
    def sendMessageWithContext(context: MessageContext, message: Buffer): Unit
    
    def setCredentials(credentials: CallCredentials): Unit
    
    def start(metadata: Metadata, listener: InterceptingListener): Unit
    
    def startRead(): Unit
  }
  object Call {
    
    inline def apply(
      cancelWithStatus: (Status, String) => Unit,
      getCredentials: () => CallCredentials,
      getDeadline: () => Deadline,
      getHost: () => String,
      getMethod: () => String,
      getPeer: () => String,
      halfClose: () => Unit,
      sendMessageWithContext: (MessageContext, Buffer) => Unit,
      setCredentials: CallCredentials => Unit,
      start: (Metadata, InterceptingListener) => Unit,
      startRead: () => Unit
    ): Call = {
      val __obj = js.Dynamic.literal(cancelWithStatus = js.Any.fromFunction2(cancelWithStatus), getCredentials = js.Any.fromFunction0(getCredentials), getDeadline = js.Any.fromFunction0(getDeadline), getHost = js.Any.fromFunction0(getHost), getMethod = js.Any.fromFunction0(getMethod), getPeer = js.Any.fromFunction0(getPeer), halfClose = js.Any.fromFunction0(halfClose), sendMessageWithContext = js.Any.fromFunction2(sendMessageWithContext), setCredentials = js.Any.fromFunction1(setCredentials), start = js.Any.fromFunction2(start), startRead = js.Any.fromFunction0(startRead))
      __obj.asInstanceOf[Call]
    }
    
    extension [Self <: Call](x: Self) {
      
      inline def setCancelWithStatus(value: (Status, String) => Unit): Self = StObject.set(x, "cancelWithStatus", js.Any.fromFunction2(value))
      
      inline def setGetCredentials(value: () => CallCredentials): Self = StObject.set(x, "getCredentials", js.Any.fromFunction0(value))
      
      inline def setGetDeadline(value: () => Deadline): Self = StObject.set(x, "getDeadline", js.Any.fromFunction0(value))
      
      inline def setGetHost(value: () => String): Self = StObject.set(x, "getHost", js.Any.fromFunction0(value))
      
      inline def setGetMethod(value: () => String): Self = StObject.set(x, "getMethod", js.Any.fromFunction0(value))
      
      inline def setGetPeer(value: () => String): Self = StObject.set(x, "getPeer", js.Any.fromFunction0(value))
      
      inline def setHalfClose(value: () => Unit): Self = StObject.set(x, "halfClose", js.Any.fromFunction0(value))
      
      inline def setSendMessageWithContext(value: (MessageContext, Buffer) => Unit): Self = StObject.set(x, "sendMessageWithContext", js.Any.fromFunction2(value))
      
      inline def setSetCredentials(value: CallCredentials => Unit): Self = StObject.set(x, "setCredentials", js.Any.fromFunction1(value))
      
      inline def setStart(value: (Metadata, InterceptingListener) => Unit): Self = StObject.set(x, "start", js.Any.fromFunction2(value))
      
      inline def setStartRead(value: () => Unit): Self = StObject.set(x, "startRead", js.Any.fromFunction0(value))
    }
  }
  
  trait CallStreamOptions extends StObject {
    
    var deadline: Deadline
    
    var flags: Double
    
    var host: String
    
    var parentCall: ServerSurfaceCall | Null
  }
  object CallStreamOptions {
    
    inline def apply(deadline: Deadline, flags: Double, host: String): CallStreamOptions = {
      val __obj = js.Dynamic.literal(deadline = deadline.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], parentCall = null)
      __obj.asInstanceOf[CallStreamOptions]
    }
    
    extension [Self <: CallStreamOptions](x: Self) {
      
      inline def setDeadline(value: Deadline): Self = StObject.set(x, "deadline", value.asInstanceOf[js.Any])
      
      inline def setFlags(value: Double): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setParentCall(value: ServerSurfaceCall): Self = StObject.set(x, "parentCall", value.asInstanceOf[js.Any])
      
      inline def setParentCallNull: Self = StObject.set(x, "parentCall", null)
    }
  }
  
  type Deadline = js.Date | Double
  
  trait FullListener extends StObject {
    
    def onReceiveMessage(message: Any, next: js.Function1[/* message */ Any, Unit]): Unit
    @JSName("onReceiveMessage")
    var onReceiveMessage_Original: MessageListener
    
    def onReceiveMetadata(metadata: Metadata, next: js.Function1[/* metadata */ Metadata, Unit]): Unit
    @JSName("onReceiveMetadata")
    var onReceiveMetadata_Original: MetadataListener
    
    def onReceiveStatus(status: StatusObject, next: js.Function1[/* status */ StatusObject, Unit]): Unit
    @JSName("onReceiveStatus")
    var onReceiveStatus_Original: StatusListener
  }
  object FullListener {
    
    inline def apply(
      onReceiveMessage: (/* message */ Any, /* next */ js.Function1[/* message */ Any, Unit]) => Unit,
      onReceiveMetadata: (/* metadata */ Metadata, /* next */ js.Function1[/* metadata */ Metadata, Unit]) => Unit,
      onReceiveStatus: (/* status */ StatusObject, /* next */ js.Function1[/* status */ StatusObject, Unit]) => Unit
    ): FullListener = {
      val __obj = js.Dynamic.literal(onReceiveMessage = js.Any.fromFunction2(onReceiveMessage), onReceiveMetadata = js.Any.fromFunction2(onReceiveMetadata), onReceiveStatus = js.Any.fromFunction2(onReceiveStatus))
      __obj.asInstanceOf[FullListener]
    }
    
    extension [Self <: FullListener](x: Self) {
      
      inline def setOnReceiveMessage(value: (/* message */ Any, /* next */ js.Function1[/* message */ Any, Unit]) => Unit): Self = StObject.set(x, "onReceiveMessage", js.Any.fromFunction2(value))
      
      inline def setOnReceiveMetadata(value: (/* metadata */ Metadata, /* next */ js.Function1[/* metadata */ Metadata, Unit]) => Unit): Self = StObject.set(x, "onReceiveMetadata", js.Any.fromFunction2(value))
      
      inline def setOnReceiveStatus(
        value: (/* status */ StatusObject, /* next */ js.Function1[/* status */ StatusObject, Unit]) => Unit
      ): Self = StObject.set(x, "onReceiveStatus", js.Any.fromFunction2(value))
    }
  }
  
  trait InterceptingListener extends StObject {
    
    def onReceiveMessage(message: Any): Unit
    
    def onReceiveMetadata(metadata: Metadata): Unit
    
    def onReceiveStatus(status: StatusObject): Unit
  }
  object InterceptingListener {
    
    inline def apply(
      onReceiveMessage: Any => Unit,
      onReceiveMetadata: Metadata => Unit,
      onReceiveStatus: StatusObject => Unit
    ): InterceptingListener = {
      val __obj = js.Dynamic.literal(onReceiveMessage = js.Any.fromFunction1(onReceiveMessage), onReceiveMetadata = js.Any.fromFunction1(onReceiveMetadata), onReceiveStatus = js.Any.fromFunction1(onReceiveStatus))
      __obj.asInstanceOf[InterceptingListener]
    }
    
    extension [Self <: InterceptingListener](x: Self) {
      
      inline def setOnReceiveMessage(value: Any => Unit): Self = StObject.set(x, "onReceiveMessage", js.Any.fromFunction1(value))
      
      inline def setOnReceiveMetadata(value: Metadata => Unit): Self = StObject.set(x, "onReceiveMetadata", js.Any.fromFunction1(value))
      
      inline def setOnReceiveStatus(value: StatusObject => Unit): Self = StObject.set(x, "onReceiveStatus", js.Any.fromFunction1(value))
    }
  }
  
  /* Inlined std.Partial<@grpc/grpc-js.@grpc/grpc-js/build/src/call-stream.FullListener> */
  trait Listener extends StObject {
    
    var onReceiveMessage: js.UndefOr[MessageListener] = js.undefined
    
    var onReceiveMetadata: js.UndefOr[MetadataListener] = js.undefined
    
    var onReceiveStatus: js.UndefOr[StatusListener] = js.undefined
  }
  object Listener {
    
    inline def apply(): Listener = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Listener]
    }
    
    extension [Self <: Listener](x: Self) {
      
      inline def setOnReceiveMessage(value: (/* message */ Any, /* next */ js.Function1[/* message */ Any, Unit]) => Unit): Self = StObject.set(x, "onReceiveMessage", js.Any.fromFunction2(value))
      
      inline def setOnReceiveMessageUndefined: Self = StObject.set(x, "onReceiveMessage", js.undefined)
      
      inline def setOnReceiveMetadata(value: (/* metadata */ Metadata, /* next */ js.Function1[/* metadata */ Metadata, Unit]) => Unit): Self = StObject.set(x, "onReceiveMetadata", js.Any.fromFunction2(value))
      
      inline def setOnReceiveMetadataUndefined: Self = StObject.set(x, "onReceiveMetadata", js.undefined)
      
      inline def setOnReceiveStatus(
        value: (/* status */ StatusObject, /* next */ js.Function1[/* status */ StatusObject, Unit]) => Unit
      ): Self = StObject.set(x, "onReceiveStatus", js.Any.fromFunction2(value))
      
      inline def setOnReceiveStatusUndefined: Self = StObject.set(x, "onReceiveStatus", js.undefined)
    }
  }
  
  trait MessageContext extends StObject {
    
    var callback: js.UndefOr[WriteCallback] = js.undefined
    
    var flags: js.UndefOr[Double] = js.undefined
  }
  object MessageContext {
    
    inline def apply(): MessageContext = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MessageContext]
    }
    
    extension [Self <: MessageContext](x: Self) {
      
      inline def setCallback(value: /* error */ js.UndefOr[js.Error | Null] => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction1(value))
      
      inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      inline def setFlags(value: Double): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
      
      inline def setFlagsUndefined: Self = StObject.set(x, "flags", js.undefined)
    }
  }
  
  type MessageListener = js.Function2[/* message */ Any, /* next */ js.Function1[/* message */ Any, Unit], Unit]
  
  type MetadataListener = js.Function2[
    /* metadata */ Metadata, 
    /* next */ js.Function1[/* metadata */ Metadata, Unit], 
    Unit
  ]
  
  /* Inlined std.Partial<@grpc/grpc-js.@grpc/grpc-js/build/src/call-stream.CallStreamOptions> */
  trait PartialCallStreamOptions extends StObject {
    
    var deadline: js.UndefOr[Deadline] = js.undefined
    
    var flags: js.UndefOr[Double] = js.undefined
    
    var host: js.UndefOr[String] = js.undefined
    
    var parentCall: js.UndefOr[ServerSurfaceCall | Null] = js.undefined
  }
  object PartialCallStreamOptions {
    
    inline def apply(): PartialCallStreamOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialCallStreamOptions]
    }
    
    extension [Self <: PartialCallStreamOptions](x: Self) {
      
      inline def setDeadline(value: Deadline): Self = StObject.set(x, "deadline", value.asInstanceOf[js.Any])
      
      inline def setDeadlineUndefined: Self = StObject.set(x, "deadline", js.undefined)
      
      inline def setFlags(value: Double): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
      
      inline def setFlagsUndefined: Self = StObject.set(x, "flags", js.undefined)
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      inline def setParentCall(value: ServerSurfaceCall): Self = StObject.set(x, "parentCall", value.asInstanceOf[js.Any])
      
      inline def setParentCallNull: Self = StObject.set(x, "parentCall", null)
      
      inline def setParentCallUndefined: Self = StObject.set(x, "parentCall", js.undefined)
    }
  }
  
  type StatusListener = js.Function2[
    /* status */ StatusObject, 
    /* next */ js.Function1[/* status */ StatusObject, Unit], 
    Unit
  ]
  
  trait StatusObject extends StObject {
    
    var code: Status
    
    var details: String
    
    var metadata: Metadata
  }
  object StatusObject {
    
    inline def apply(code: Status, details: String, metadata: Metadata): StatusObject = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[StatusObject]
    }
    
    extension [Self <: StatusObject](x: Self) {
      
      inline def setCode(value: Status): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setDetails(value: String): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
      
      inline def setMetadata(value: Metadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    }
  }
  
  type WriteCallback = js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit]
  
  /* Rewritten from type alias, can be one of: 
    - typings.grpcGrpcJs.grpcGrpcJsInts.`1`
    - typings.grpcGrpcJs.grpcGrpcJsInts.`2`
    - typings.grpcGrpcJs.grpcGrpcJsInts.`4`
  */
  trait WriteFlags extends StObject
  object WriteFlags {
    
    inline def BufferHint: `1` = 1.asInstanceOf[`1`]
    
    inline def NoCompress: `2` = 2.asInstanceOf[`2`]
    
    inline def WriteThrough: `4` = 4.asInstanceOf[`4`]
  }
  
  trait WriteObject extends StObject {
    
    var flags: js.UndefOr[Double] = js.undefined
    
    var message: Buffer
  }
  object WriteObject {
    
    inline def apply(message: Buffer): WriteObject = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[WriteObject]
    }
    
    extension [Self <: WriteObject](x: Self) {
      
      inline def setFlags(value: Double): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
      
      inline def setFlagsUndefined: Self = StObject.set(x, "flags", js.undefined)
      
      inline def setMessage(value: Buffer): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    }
  }
}
