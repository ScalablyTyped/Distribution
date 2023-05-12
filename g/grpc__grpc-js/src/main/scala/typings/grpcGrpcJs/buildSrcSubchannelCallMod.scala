package typings.grpcGrpcJs

import typings.grpcGrpcJs.buildSrcCallInterfaceMod.InterceptingListener
import typings.grpcGrpcJs.buildSrcCallInterfaceMod.MessageContext
import typings.grpcGrpcJs.buildSrcCallInterfaceMod.StatusObject
import typings.grpcGrpcJs.buildSrcConstantsMod.Status
import typings.grpcGrpcJs.buildSrcMetadataMod.Metadata
import typings.grpcGrpcJs.buildSrcTransportMod.CallEventTracker
import typings.grpcGrpcJs.buildSrcTransportMod.Transport
import typings.node.bufferMod.global.Buffer
import typings.node.http2Mod.ClientHttp2Stream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcSubchannelCallMod {
  
  @JSImport("@grpc/grpc-js/build/src/subchannel-call", "Http2SubchannelCall")
  @js.native
  open class Http2SubchannelCall protected ()
    extends StObject
       with SubchannelCall {
    def this(
      http2Stream: ClientHttp2Stream,
      callEventTracker: CallEventTracker,
      listener: SubchannelCallInterceptingListener,
      transport: Transport,
      callId: Double
    ) = this()
    
    /* private */ val callEventTracker: Any = js.native
    
    /* private */ val callId: Any = js.native
    
    /* private */ var canPush: Any = js.native
    
    /* CompleteClass */
    override def cancelWithStatus(status: Status, details: String): Unit = js.native
    
    /* private */ var decoder: Any = js.native
    
    /* private */ var destroyHttp2Stream: Any = js.native
    
    /**
      * On first call, emits a 'status' event with the given StatusObject.
      * Subsequent calls are no-ops.
      * @param status The status of the call.
      */
    /* private */ var endCall: Any = js.native
    
    /* private */ var finalStatus: Any = js.native
    
    /* CompleteClass */
    override def getCallNumber(): Double = js.native
    
    /* CompleteClass */
    override def getPeer(): String = js.native
    
    def getStatus(): StatusObject | Null = js.native
    
    /* CompleteClass */
    override def halfClose(): Unit = js.native
    
    /* private */ var handleTrailers: Any = js.native
    
    /* private */ val http2Stream: Any = js.native
    
    /* private */ var internalError: Any = js.native
    
    /* private */ var isPushPending: Any = js.native
    
    /* private */ var isReadFilterPending: Any = js.native
    
    /* private */ val listener: Any = js.native
    
    /* private */ var mappedStatusCode: Any = js.native
    
    /* private */ var maybeOutputStatus: Any = js.native
    
    def onDisconnect(): Unit = js.native
    
    /* private */ var outputStatus: Any = js.native
    
    /* private */ var push: Any = js.native
    
    /**
      * Indicates that an 'end' event has come from the http2 stream, so there
      * will be no more data events.
      */
    /* private */ var readsClosed: Any = js.native
    
    /* CompleteClass */
    override def sendMessageWithContext(context: MessageContext, message: Buffer): Unit = js.native
    
    /* CompleteClass */
    override def startRead(): Unit = js.native
    
    /* private */ var statusOutput: Any = js.native
    
    /* private */ var trace: Any = js.native
    
    /* private */ val transport: Any = js.native
    
    /* private */ var tryPush: Any = js.native
    
    /* private */ var unpushedReadMessages: Any = js.native
  }
  
  trait StatusObjectWithRstCode
    extends StObject
       with StatusObject {
    
    var rstCode: js.UndefOr[Double] = js.undefined
  }
  object StatusObjectWithRstCode {
    
    inline def apply(code: Status, details: String, metadata: Metadata): StatusObjectWithRstCode = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[StatusObjectWithRstCode]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StatusObjectWithRstCode] (val x: Self) extends AnyVal {
      
      inline def setRstCode(value: Double): Self = StObject.set(x, "rstCode", value.asInstanceOf[js.Any])
      
      inline def setRstCodeUndefined: Self = StObject.set(x, "rstCode", js.undefined)
    }
  }
  
  trait SubchannelCall extends StObject {
    
    def cancelWithStatus(status: Status, details: String): Unit
    
    def getCallNumber(): Double
    
    def getPeer(): String
    
    def halfClose(): Unit
    
    def sendMessageWithContext(context: MessageContext, message: Buffer): Unit
    
    def startRead(): Unit
  }
  object SubchannelCall {
    
    inline def apply(
      cancelWithStatus: (Status, String) => Unit,
      getCallNumber: () => Double,
      getPeer: () => String,
      halfClose: () => Unit,
      sendMessageWithContext: (MessageContext, Buffer) => Unit,
      startRead: () => Unit
    ): SubchannelCall = {
      val __obj = js.Dynamic.literal(cancelWithStatus = js.Any.fromFunction2(cancelWithStatus), getCallNumber = js.Any.fromFunction0(getCallNumber), getPeer = js.Any.fromFunction0(getPeer), halfClose = js.Any.fromFunction0(halfClose), sendMessageWithContext = js.Any.fromFunction2(sendMessageWithContext), startRead = js.Any.fromFunction0(startRead))
      __obj.asInstanceOf[SubchannelCall]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SubchannelCall] (val x: Self) extends AnyVal {
      
      inline def setCancelWithStatus(value: (Status, String) => Unit): Self = StObject.set(x, "cancelWithStatus", js.Any.fromFunction2(value))
      
      inline def setGetCallNumber(value: () => Double): Self = StObject.set(x, "getCallNumber", js.Any.fromFunction0(value))
      
      inline def setGetPeer(value: () => String): Self = StObject.set(x, "getPeer", js.Any.fromFunction0(value))
      
      inline def setHalfClose(value: () => Unit): Self = StObject.set(x, "halfClose", js.Any.fromFunction0(value))
      
      inline def setSendMessageWithContext(value: (MessageContext, Buffer) => Unit): Self = StObject.set(x, "sendMessageWithContext", js.Any.fromFunction2(value))
      
      inline def setStartRead(value: () => Unit): Self = StObject.set(x, "startRead", js.Any.fromFunction0(value))
    }
  }
  
  trait SubchannelCallInterceptingListener
    extends StObject
       with InterceptingListener {
    
    def onReceiveStatus(status: StatusObjectWithRstCode): Unit
  }
  object SubchannelCallInterceptingListener {
    
    inline def apply(
      onReceiveMessage: Any => Unit,
      onReceiveMetadata: Metadata => Unit,
      onReceiveStatus: StatusObjectWithRstCode => Unit
    ): SubchannelCallInterceptingListener = {
      val __obj = js.Dynamic.literal(onReceiveMessage = js.Any.fromFunction1(onReceiveMessage), onReceiveMetadata = js.Any.fromFunction1(onReceiveMetadata), onReceiveStatus = js.Any.fromFunction1(onReceiveStatus))
      __obj.asInstanceOf[SubchannelCallInterceptingListener]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SubchannelCallInterceptingListener] (val x: Self) extends AnyVal {
      
      inline def setOnReceiveStatus(value: StatusObjectWithRstCode => Unit): Self = StObject.set(x, "onReceiveStatus", js.Any.fromFunction1(value))
    }
  }
}
