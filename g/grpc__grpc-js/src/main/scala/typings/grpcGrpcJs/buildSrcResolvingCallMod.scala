package typings.grpcGrpcJs

import typings.grpcGrpcJs.buildSrcCallCredentialsMod.CallCredentials
import typings.grpcGrpcJs.buildSrcCallInterfaceMod.Call
import typings.grpcGrpcJs.buildSrcCallInterfaceMod.CallStreamOptions
import typings.grpcGrpcJs.buildSrcCallInterfaceMod.InterceptingListener
import typings.grpcGrpcJs.buildSrcCallInterfaceMod.MessageContext
import typings.grpcGrpcJs.buildSrcCallInterfaceMod.StatusObject
import typings.grpcGrpcJs.buildSrcConstantsMod.Status
import typings.grpcGrpcJs.buildSrcFilterStackMod.FilterStackFactory
import typings.grpcGrpcJs.buildSrcInternalChannelMod.InternalChannel
import typings.grpcGrpcJs.buildSrcMetadataMod.Metadata
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcResolvingCallMod {
  
  @JSImport("@grpc/grpc-js/build/src/resolving-call", "ResolvingCall")
  @js.native
  open class ResolvingCall protected ()
    extends StObject
       with Call {
    def this(
      channel: InternalChannel,
      method: String,
      options: CallStreamOptions,
      filterStackFactory: FilterStackFactory,
      credentials: CallCredentials,
      callNumber: Double
    ) = this()
    
    def addStatusWatcher(watcher: js.Function1[/* status */ StatusObject, Unit]): Unit = js.native
    
    /* private */ var callNumber: Any = js.native
    
    /* CompleteClass */
    override def cancelWithStatus(status: Status, details: String): Unit = js.native
    
    /* private */ val channel: Any = js.native
    
    /* private */ var child: Any = js.native
    
    /* private */ var credentials: Any = js.native
    
    /* private */ var deadline: Any = js.native
    
    /* private */ var deadlineTimer: Any = js.native
    
    /* private */ var ended: Any = js.native
    
    /* private */ var filterStack: Any = js.native
    
    /* private */ val filterStackFactory: Any = js.native
    
    /* CompleteClass */
    override def getCallNumber(): Double = js.native
    
    def getConfig(): Unit = js.native
    
    /* CompleteClass */
    override def getPeer(): String = js.native
    
    /* CompleteClass */
    override def halfClose(): Unit = js.native
    
    /* private */ var host: Any = js.native
    
    /* private */ var listener: Any = js.native
    
    /* private */ var metadata: Any = js.native
    
    /* private */ val method: Any = js.native
    
    /* private */ var outputStatus: Any = js.native
    
    /* private */ var pendingChildStatus: Any = js.native
    
    /* private */ var pendingHalfClose: Any = js.native
    
    /* private */ var pendingMessage: Any = js.native
    
    /* private */ var readFilterPending: Any = js.native
    
    /* private */ var readPending: Any = js.native
    
    def reportResolverError(status: StatusObject): Unit = js.native
    
    /* private */ var runDeadlineTimer: Any = js.native
    
    /* private */ var sendMessageOnChild: Any = js.native
    
    /* CompleteClass */
    override def sendMessageWithContext(context: MessageContext, message: Buffer): Unit = js.native
    
    /* CompleteClass */
    override def setCredentials(credentials: CallCredentials): Unit = js.native
    
    /* CompleteClass */
    override def start(metadata: Metadata, listener: InterceptingListener): Unit = js.native
    
    /* CompleteClass */
    override def startRead(): Unit = js.native
    
    /* private */ var statusWatchers: Any = js.native
    
    /* private */ var trace: Any = js.native
    
    /* private */ var writeFilterPending: Any = js.native
  }
}
