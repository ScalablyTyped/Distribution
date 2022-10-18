package typings.grpcGrpcJs

import typings.grpcGrpcJs.buildSrcCallCredentialsMod.CallCredentials
import typings.grpcGrpcJs.buildSrcCallInterfaceMod.Call
import typings.grpcGrpcJs.buildSrcCallInterfaceMod.InterceptingListener
import typings.grpcGrpcJs.buildSrcCallInterfaceMod.MessageContext
import typings.grpcGrpcJs.buildSrcCallInterfaceMod.StatusObject
import typings.grpcGrpcJs.buildSrcConstantsMod.Status
import typings.grpcGrpcJs.buildSrcDeadlineMod.Deadline
import typings.grpcGrpcJs.buildSrcFilterStackMod.FilterStackFactory
import typings.grpcGrpcJs.buildSrcInternalChannelMod.InternalChannel
import typings.grpcGrpcJs.buildSrcMetadataMod.Metadata
import typings.grpcGrpcJs.buildSrcResolverMod.CallConfig
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcLoadBalancingCallMod {
  
  @JSImport("@grpc/grpc-js/build/src/load-balancing-call", "LoadBalancingCall")
  @js.native
  open class LoadBalancingCall protected ()
    extends StObject
       with Call {
    def this(
      channel: InternalChannel,
      callConfig: CallConfig,
      methodName: String,
      host: String,
      credentials: CallCredentials,
      deadline: Deadline,
      filterStackFactory: FilterStackFactory,
      callNumber: Double
    ) = this()
    
    /* private */ val callConfig: Any = js.native
    
    /* private */ val callNumber: Any = js.native
    
    /* CompleteClass */
    override def cancelWithStatus(status: Status, details: String): Unit = js.native
    
    /* private */ val channel: Any = js.native
    
    /* private */ var child: Any = js.native
    
    /* private */ val credentials: Any = js.native
    
    /* private */ val deadline: Any = js.native
    
    def doPick(): Unit = js.native
    
    /* private */ var ended: Any = js.native
    
    /* private */ var filterStack: Any = js.native
    
    /* CompleteClass */
    override def getCallNumber(): Double = js.native
    
    /* CompleteClass */
    override def getPeer(): String = js.native
    
    /* CompleteClass */
    override def halfClose(): Unit = js.native
    
    /* private */ val host: Any = js.native
    
    /* private */ var listener: Any = js.native
    
    /* private */ var metadata: Any = js.native
    
    /* private */ val methodName: Any = js.native
    
    /* private */ var onCallEnded: Any = js.native
    
    /* private */ var outputStatus: Any = js.native
    
    /* private */ var pendingChildStatus: Any = js.native
    
    /* private */ var pendingHalfClose: Any = js.native
    
    /* private */ var pendingMessage: Any = js.native
    
    /* private */ var readFilterPending: Any = js.native
    
    /* private */ var readPending: Any = js.native
    
    /* CompleteClass */
    override def sendMessageWithContext(context: MessageContext, message: Buffer): Unit = js.native
    
    /* private */ var serviceUrl: Any = js.native
    
    /* CompleteClass */
    override def setCredentials(credentials: CallCredentials): Unit = js.native
    
    /* CompleteClass */
    override def start(metadata: Metadata, listener: InterceptingListener): Unit = js.native
    
    /* CompleteClass */
    override def startRead(): Unit = js.native
    
    /* private */ var trace: Any = js.native
    
    /* private */ var writeFilterPending: Any = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.grpcGrpcJs.grpcGrpcJsStrings.NOT_STARTED
    - typings.grpcGrpcJs.grpcGrpcJsStrings.DROP
    - typings.grpcGrpcJs.grpcGrpcJsStrings.REFUSED
    - typings.grpcGrpcJs.grpcGrpcJsStrings.PROCESSED
  */
  trait RpcProgress extends StObject
  object RpcProgress {
    
    inline def DROP: typings.grpcGrpcJs.grpcGrpcJsStrings.DROP = "DROP".asInstanceOf[typings.grpcGrpcJs.grpcGrpcJsStrings.DROP]
    
    inline def NOT_STARTED: typings.grpcGrpcJs.grpcGrpcJsStrings.NOT_STARTED = "NOT_STARTED".asInstanceOf[typings.grpcGrpcJs.grpcGrpcJsStrings.NOT_STARTED]
    
    inline def PROCESSED: typings.grpcGrpcJs.grpcGrpcJsStrings.PROCESSED = "PROCESSED".asInstanceOf[typings.grpcGrpcJs.grpcGrpcJsStrings.PROCESSED]
    
    inline def REFUSED: typings.grpcGrpcJs.grpcGrpcJsStrings.REFUSED = "REFUSED".asInstanceOf[typings.grpcGrpcJs.grpcGrpcJsStrings.REFUSED]
  }
  
  trait StatusObjectWithProgress
    extends StObject
       with StatusObject {
    
    var progress: RpcProgress
  }
  object StatusObjectWithProgress {
    
    inline def apply(code: Status, details: String, metadata: Metadata, progress: RpcProgress): StatusObjectWithProgress = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any])
      __obj.asInstanceOf[StatusObjectWithProgress]
    }
    
    extension [Self <: StatusObjectWithProgress](x: Self) {
      
      inline def setProgress(value: RpcProgress): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
    }
  }
}
