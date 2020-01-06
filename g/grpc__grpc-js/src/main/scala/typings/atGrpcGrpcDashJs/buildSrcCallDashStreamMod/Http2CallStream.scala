package typings.atGrpcGrpcDashJs.buildSrcCallDashStreamMod

import typings.atGrpcGrpcDashJs.Anon_Callback
import typings.atGrpcGrpcDashJs.Anon_CancelWithStatus
import typings.atGrpcGrpcDashJs.Anon_Read
import typings.atGrpcGrpcDashJs.atGrpcGrpcDashJsStrings.data
import typings.atGrpcGrpcDashJs.atGrpcGrpcDashJsStrings.metadata
import typings.atGrpcGrpcDashJs.atGrpcGrpcDashJsStrings.status
import typings.atGrpcGrpcDashJs.buildSrcCallDashCredentialsMod.CallCredentials
import typings.atGrpcGrpcDashJs.buildSrcChannelMod.ChannelImplementation
import typings.atGrpcGrpcDashJs.buildSrcConstantsMod.Status
import typings.atGrpcGrpcDashJs.buildSrcEventsMod.EmitterAugmentation1
import typings.atGrpcGrpcDashJs.buildSrcFilterDashStackMod.FilterStackFactory
import typings.atGrpcGrpcDashJs.buildSrcFilterMod.Filter
import typings.atGrpcGrpcDashJs.buildSrcMetadataMod.Metadata
import typings.atGrpcGrpcDashJs.buildSrcObjectDashStreamMod.WriteCallback
import typings.atGrpcGrpcDashJs.buildSrcSubchannelMod.Subchannel
import typings.node.Anon_End
import typings.node.Buffer
import typings.node.NodeJS.WritableStream
import typings.node.http2Mod.ClientHttp2Stream
import typings.node.streamMod.Duplex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.node.NodeJS.EventEmitter because Already inherited
- typings.node.eventsMod.EventEmitter because Already inherited
- typings.node.NodeJS.WritableStream because var conflicts: writable. Inlined 
- typings.node.NodeJS.ReadableStream because Already inherited
- typings.node.streamMod.internal because Already inherited
- typings.node.streamMod.Writable because Inheritance from two classes. Inlined _destroy, _destroy, _final, addListener_close, addListener_drain, addListener_error, addListener_finish, addListener_pipe, addListener_unpipe, cork, destroy, destroy, emit_close, emit_drain, emit_error, emit_finish, emit_pipe, emit_unpipe, on_close, on_drain, on_error, on_finish, on_pipe, on_unpipe, once_close, once_drain, once_error, once_finish, once_pipe, once_unpipe, prependListener_close, prependListener_drain, prependListener_error, prependListener_finish, prependListener_pipe, prependListener_unpipe, prependOnceListener_close, prependOnceListener_drain, prependOnceListener_error, prependOnceListener_finish, prependOnceListener_pipe, prependOnceListener_unpipe, removeListener_close, removeListener_drain, removeListener_error, removeListener_finish, removeListener_pipe, removeListener_unpipe, uncork
- typings.node.streamMod.Readable because Already inherited
- typings.atGrpcGrpcDashJs.buildSrcObjectDashStreamMod.IntermediateObjectWritable because Inheritance from two classes. Inlined 
- typings.atGrpcGrpcDashJs.buildSrcObjectDashStreamMod.IntermediateObjectReadable because var conflicts: destroyed, readable. Inlined 
- typings.atGrpcGrpcDashJs.buildSrcObjectDashStreamMod.ObjectWritable because Inheritance from two classes. Inlined _write, write, write, write, write, setDefaultEncoding, end, end, end, end, end */ @JSImport("@grpc/grpc-js/build/src/call-stream", "Http2CallStream")
@js.native
class Http2CallStream protected ()
  extends Duplex
     with Anon_CancelWithStatus
     with EmitterAugmentation1[metadata | status | data, Buffer | Metadata | StatusObject]
     with Anon_Callback[Buffer, WriteObject]
     with Anon_Read[Buffer] {
  def this(
    methodName: String,
    channel: ChannelImplementation,
    options: CallStreamOptions,
    filterStackFactory: FilterStackFactory,
    channelCallCredentials: CallCredentials
  ) = this()
  var canPush: js.Any = js.native
  val channel: js.Any = js.native
  val channelCallCredentials: js.Any = js.native
  var credentials: CallCredentials = js.native
  var decoder: js.Any = js.native
  var destroyHttp2Stream: js.Any = js.native
  var disconnectListener: js.Any = js.native
  /**
    * On first call, emits a 'status' event with the given StatusObject.
    * Subsequent calls are no-ops.
    * @param status The status of the call.
    */
  var endCall: js.Any = js.native
  var filterReceivedMessage: js.Any = js.native
  var filterStack: Filter = js.native
  var finalStatus: js.Any = js.native
  var handleFilterError: js.Any = js.native
  var handleFilteredRead: js.Any = js.native
  var handleTrailers: js.Any = js.native
  var handlingHeaders: js.Any = js.native
  var handlingTrailers: js.Any = js.native
  var http2Stream: js.Any = js.native
  var isReadFilterPending: js.Any = js.native
  var mappedStatusCode: js.Any = js.native
  val methodName: js.Any = js.native
  val options: js.Any = js.native
  var pendingFinalCallback: js.Any = js.native
  var pendingRead: js.Any = js.native
  var pendingWrite: js.Any = js.native
  var pendingWriteCallback: js.Any = js.native
  var subchannel: js.Any = js.native
  var tryPush: js.Any = js.native
  var unfilteredReadMessages: js.Any = js.native
  var unpushedReadMessages: js.Any = js.native
  def _final(cb: js.Function): Unit = js.native
  def _write(chunk: WriteObject, encoding: String, cb: WriteCallback): Unit = js.native
  /* CompleteClass */
  override def addListener(event: metadata | status | data, listener: js.Function1[Buffer | Metadata | StatusObject, Unit]): this.type = js.native
  def attachHttp2Stream(stream: ClientHttp2Stream, subchannel: Subchannel): Unit = js.native
  /* CompleteClass */
  override def cancelWithStatus(status: Status, details: String): Unit = js.native
  /* CompleteClass */
  override def emit(event: metadata | status | data, arg1: Buffer | Metadata | StatusObject): Boolean = js.native
  /* InferMemberOverrides */
  override def end(): Unit = js.native
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
  /* CompleteClass */
  override def getStatus(): StatusObject | Null = js.native
  /* CompleteClass */
  override def on(event: metadata | status | data, listener: js.Function1[Buffer | Metadata | StatusObject, Unit]): this.type = js.native
  /* CompleteClass */
  override def once(event: metadata | status | data, listener: js.Function1[Buffer | Metadata | StatusObject, Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def pipe[T /* <: WritableStream */](destination: T): T = js.native
  /* InferMemberOverrides */
  override def pipe[T /* <: WritableStream */](destination: T, options: Anon_End): T = js.native
  /* CompleteClass */
  override def prependListener(event: metadata | status | data, listener: js.Function1[Buffer | Metadata | StatusObject, Unit]): this.type = js.native
  /* CompleteClass */
  override def prependOnceListener(event: metadata | status | data, listener: js.Function1[Buffer | Metadata | StatusObject, Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def read(): (String | Buffer) with Buffer = js.native
  /* InferMemberOverrides */
  override def read(size: Double): (String | Buffer) with Buffer = js.native
  /* CompleteClass */
  override def removeListener(event: metadata | status | data, listener: js.Function1[Buffer | Metadata | StatusObject, Unit]): this.type = js.native
  /* CompleteClass */
  override def sendMetadata(metadata: Metadata): Unit = js.native
  /* CompleteClass */
  override def setCredentials(credentials: CallCredentials): Unit = js.native
}

