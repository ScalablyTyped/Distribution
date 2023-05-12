package typings.grpcGrpcJs

import typings.grpcGrpcJs.buildSrcCallCredentialsMod.CallCredentials
import typings.grpcGrpcJs.buildSrcCallInterfaceMod.Call
import typings.grpcGrpcJs.buildSrcCallInterfaceMod.InterceptingListener
import typings.grpcGrpcJs.buildSrcCallInterfaceMod.MessageContext
import typings.grpcGrpcJs.buildSrcConstantsMod.Status
import typings.grpcGrpcJs.buildSrcDeadlineMod.Deadline
import typings.grpcGrpcJs.buildSrcInternalChannelMod.InternalChannel
import typings.grpcGrpcJs.buildSrcMetadataMod.Metadata
import typings.grpcGrpcJs.buildSrcResolverMod.CallConfig
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcRetryingCallMod {
  
  @JSImport("@grpc/grpc-js/build/src/retrying-call", "MessageBufferTracker")
  @js.native
  open class MessageBufferTracker protected () extends StObject {
    def this(totalLimit: Double, limitPerCall: Double) = this()
    
    def allocate(size: Double, callId: Double): Boolean = js.native
    
    /* private */ var allocatedPerCall: Any = js.native
    
    def free(size: Double, callId: Double): Unit = js.native
    
    def freeAll(callId: Double): Unit = js.native
    
    /* private */ var limitPerCall: Any = js.native
    
    /* private */ var totalAllocated: Any = js.native
    
    /* private */ var totalLimit: Any = js.native
  }
  
  @JSImport("@grpc/grpc-js/build/src/retrying-call", "RetryThrottler")
  @js.native
  open class RetryThrottler protected () extends StObject {
    def this(maxTokens: Double, tokenRatio: Double) = this()
    def this(maxTokens: Double, tokenRatio: Double, previousRetryThrottler: RetryThrottler) = this()
    
    def addCallFailed(): Unit = js.native
    
    def addCallSucceeded(): Unit = js.native
    
    def canRetryCall(): Boolean = js.native
    
    /* private */ val maxTokens: Any = js.native
    
    /* private */ val tokenRatio: Any = js.native
    
    /* private */ var tokens: Any = js.native
  }
  
  @JSImport("@grpc/grpc-js/build/src/retrying-call", "RetryingCall")
  @js.native
  open class RetryingCall protected ()
    extends StObject
       with Call {
    def this(
      channel: InternalChannel,
      callConfig: CallConfig,
      methodName: String,
      host: String,
      credentials: CallCredentials,
      deadline: Deadline,
      callNumber: Double,
      bufferTracker: MessageBufferTracker
    ) = this()
    def this(
      channel: InternalChannel,
      callConfig: CallConfig,
      methodName: String,
      host: String,
      credentials: CallCredentials,
      deadline: Deadline,
      callNumber: Double,
      bufferTracker: MessageBufferTracker,
      retryThrottler: RetryThrottler
    ) = this()
    
    /**
      * Number of attempts so far
      */
    /* private */ var attempts: Any = js.native
    
    /* private */ val bufferTracker: Any = js.native
    
    /* private */ val callConfig: Any = js.native
    
    /* private */ val callNumber: Any = js.native
    
    /* CompleteClass */
    override def cancelWithStatus(status: Status, details: String): Unit = js.native
    
    /* private */ val channel: Any = js.native
    
    /* private */ var clearSentMessages: Any = js.native
    
    /* private */ var commitCall: Any = js.native
    
    /* private */ var commitCallWithMostMessages: Any = js.native
    
    /* private */ var committedCallIndex: Any = js.native
    
    /* private */ var countActiveCalls: Any = js.native
    
    /* private */ val credentials: Any = js.native
    
    /* private */ val deadline: Any = js.native
    
    /* private */ var getBufferEntry: Any = js.native
    
    /* CompleteClass */
    override def getCallNumber(): Double = js.native
    
    def getHost(): String = js.native
    
    def getMethod(): String = js.native
    
    /* private */ var getNextBufferIndex: Any = js.native
    
    /* private */ var getNextRetryBackoffMs: Any = js.native
    
    /* CompleteClass */
    override def getPeer(): String = js.native
    
    /* private */ var getPushback: Any = js.native
    
    /* CompleteClass */
    override def halfClose(): Unit = js.native
    
    /* private */ var handleChildStatus: Any = js.native
    
    /* private */ var handleChildWriteCompleted: Any = js.native
    
    /* private */ var handleProcessedStatus: Any = js.native
    
    /* private */ var hedgingTimer: Any = js.native
    
    /* private */ val host: Any = js.native
    
    /* private */ var initialMetadata: Any = js.native
    
    /* private */ var initialRetryBackoffSec: Any = js.native
    
    /* private */ var isStatusCodeInList: Any = js.native
    
    /* private */ var listener: Any = js.native
    
    /* private */ var maybeRetryCall: Any = js.native
    
    /* private */ var maybeStartHedgingAttempt: Any = js.native
    
    /* private */ var maybeStartHedgingTimer: Any = js.native
    
    /* private */ val methodName: Any = js.native
    
    /* private */ var nextRetryBackoffSec: Any = js.native
    
    /**
      * Tracks whether a read has been started, so that we know whether to start
      * reads on new child calls. This only matters for the first read, because
      * once a message comes in the child call becomes committed and there will
      * be no new child calls.
      */
    /* private */ var readStarted: Any = js.native
    
    /* private */ var reportStatus: Any = js.native
    
    /* private */ val retryThrottler: Any = js.native
    
    /* CompleteClass */
    override def sendMessageWithContext(context: MessageContext, message: Buffer): Unit = js.native
    
    /* private */ var sendNextChildMessage: Any = js.native
    
    /* CompleteClass */
    override def setCredentials(credentials: CallCredentials): Unit = js.native
    
    /* CompleteClass */
    override def start(metadata: Metadata, listener: InterceptingListener): Unit = js.native
    
    /* private */ var startNewAttempt: Any = js.native
    
    /* CompleteClass */
    override def startRead(): Unit = js.native
    
    /* private */ var state: Any = js.native
    
    /* private */ var trace: Any = js.native
    
    /* private */ var transparentRetryUsed: Any = js.native
    
    /* private */ var underlyingCalls: Any = js.native
    
    /* private */ var writeBuffer: Any = js.native
    
    /**
      * The offset of message indices in the writeBuffer. For example, if
      * writeBufferOffset is 10, message 10 is in writeBuffer[0] and message 15
      * is in writeBuffer[5].
      */
    /* private */ var writeBufferOffset: Any = js.native
  }
}
