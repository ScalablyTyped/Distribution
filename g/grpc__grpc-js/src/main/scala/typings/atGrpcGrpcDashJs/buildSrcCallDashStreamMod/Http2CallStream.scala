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
import typings.atGrpcGrpcDashJs.buildSrcObjectDashStreamMod.ObjectWritable
import typings.atGrpcGrpcDashJs.buildSrcObjectDashStreamMod.WriteCallback
import typings.atGrpcGrpcDashJs.buildSrcSubchannelMod.Subchannel
import typings.node.Anon_End
import typings.node.Buffer
import typings.node.BufferEncoding
import typings.node.NodeJS.ReadableStream
import typings.node.NodeJS.WritableStream
import typings.node.http2Mod.ClientHttp2Stream
import typings.node.nodeStrings.end
import typings.node.nodeStrings.readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.node.NodeJS.EventEmitter because Already inherited
- typings.node.eventsMod.EventEmitter because Already inherited
- typings.node.streamMod.internal because Already inherited
- typings.node.streamMod.Readable because Inheritance from two classes. Inlined readableHighWaterMark, readableLength, readableObjectMode, _destroy, _destroy, _read, addListener_close, addListener_data, addListener_end, addListener_error, addListener_readable, destroy, destroy, emit_close, emit_data, emit_end, emit_error, emit_readable, on_close, on_data, on_end, on_error, on_readable, once_close, once_data, once_end, once_error, once_readable, pipe, pipe, prependListener_close, prependListener_data, prependListener_end, prependListener_error, prependListener_readable, prependOnceListener_close, prependOnceListener_data, prependOnceListener_end, prependOnceListener_error, prependOnceListener_readable, push, push, removeListener_close, removeListener_data, removeListener_end, removeListener_error, removeListener_readable, unshift, unshift
- typings.node.streamMod.Duplex because Inheritance from two classes. Inlined _final, _write, addListener_drain, addListener_finish, addListener_pipe, addListener_unpipe, cork, emit_drain, emit_finish, emit_pipe, emit_unpipe, end, end, end, end, end, end, on_drain, on_finish, on_pipe, on_unpipe, once_drain, once_finish, once_pipe, once_unpipe, prependListener_drain, prependListener_finish, prependListener_pipe, prependListener_unpipe, prependOnceListener_drain, prependOnceListener_finish, prependOnceListener_pipe, prependOnceListener_unpipe, removeListener_drain, removeListener_finish, removeListener_pipe, removeListener_unpipe, setDefaultEncoding, uncork, write, write, write, write
- typings.atGrpcGrpcDashJs.buildSrcObjectDashStreamMod.IntermediateObjectReadable because Inheritance from two classes. Inlined read, read */ @JSImport("@grpc/grpc-js/build/src/call-stream", "Http2CallStream")
@js.native
class Http2CallStream protected ()
  extends ObjectWritable[WriteObject]
     with Anon_CancelWithStatus
     with Anon_Callback[Buffer, WriteObject]
     with Anon_Read[Buffer]
     with EmitterAugmentation1[metadata | status | data, Buffer | Metadata | StatusObject]
     with ReadableStream {
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
  val readableHighWaterMark: Double = js.native
  val readableLength: Double = js.native
  val readableObjectMode: Boolean = js.native
  var subchannel: js.Any = js.native
  var tryPush: js.Any = js.native
  var unfilteredReadMessages: js.Any = js.native
  var unpushedReadMessages: js.Any = js.native
  def _final(cb: js.Function): Unit = js.native
  def _read(size: Double): Unit = js.native
  /* InferMemberOverrides */
  override def _write(chunk: WriteObject, encoding: String, callback: js.Function): Unit = js.native
  def _write(chunk: WriteObject, encoding: String, cb: WriteCallback): Unit = js.native
  /* CompleteClass */
  override def addListener(event: metadata | status | data, listener: js.Function1[Buffer | Metadata | StatusObject, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_data(event: typings.node.nodeStrings.data, listener: js.Function1[/* chunk */ js.Any, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_end(event: end, listener: js.Function0[Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_readable(event: readable, listener: js.Function0[Unit]): this.type = js.native
  def attachHttp2Stream(stream: ClientHttp2Stream, subchannel: Subchannel): Unit = js.native
  /* CompleteClass */
  override def cancelWithStatus(status: Status, details: String): Unit = js.native
  /* CompleteClass */
  override def emit(event: metadata | status | data, arg1: Buffer | Metadata | StatusObject): Boolean = js.native
  @JSName("emit")
  def emit_data(event: typings.node.nodeStrings.data, chunk: js.Any): Boolean = js.native
  @JSName("emit")
  def emit_end(event: end): Boolean = js.native
  @JSName("emit")
  def emit_readable(event: readable): Boolean = js.native
  /* InferMemberOverrides */
  override def end(): Unit = js.native
  /* InferMemberOverrides */
  override def end(chunk: WriteObject): Unit = js.native
  /* InferMemberOverrides */
  override def end(chunk: WriteObject, cb: js.Function): Unit = js.native
  /* InferMemberOverrides */
  override def end(chunk: WriteObject, encoding: js.Any): Unit = js.native
  /* InferMemberOverrides */
  override def end(chunk: WriteObject, encoding: js.Any, cb: js.Function): Unit = js.native
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
  @JSName("on")
  def on_data(event: typings.node.nodeStrings.data, listener: js.Function1[/* chunk */ js.Any, Unit]): this.type = js.native
  @JSName("on")
  def on_end(event: end, listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_readable(event: readable, listener: js.Function0[Unit]): this.type = js.native
  /* CompleteClass */
  override def once(event: metadata | status | data, listener: js.Function1[Buffer | Metadata | StatusObject, Unit]): this.type = js.native
  @JSName("once")
  def once_data(event: typings.node.nodeStrings.data, listener: js.Function1[/* chunk */ js.Any, Unit]): this.type = js.native
  @JSName("once")
  def once_end(event: end, listener: js.Function0[Unit]): this.type = js.native
  @JSName("once")
  def once_readable(event: readable, listener: js.Function0[Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def pipe[T /* <: WritableStream */](destination: T): T = js.native
  /* InferMemberOverrides */
  override def pipe[T /* <: WritableStream */](destination: T, options: Anon_End): T = js.native
  /* CompleteClass */
  override def prependListener(event: metadata | status | data, listener: js.Function1[Buffer | Metadata | StatusObject, Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_data(event: typings.node.nodeStrings.data, listener: js.Function1[/* chunk */ js.Any, Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_end(event: end, listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_readable(event: readable, listener: js.Function0[Unit]): this.type = js.native
  /* CompleteClass */
  override def prependOnceListener(event: metadata | status | data, listener: js.Function1[Buffer | Metadata | StatusObject, Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_data(event: typings.node.nodeStrings.data, listener: js.Function1[/* chunk */ js.Any, Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_end(event: end, listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_readable(event: readable, listener: js.Function0[Unit]): this.type = js.native
  def push(chunk: js.Any): Boolean = js.native
  def push(chunk: js.Any, encoding: String): Boolean = js.native
  /* InferMemberOverrides */
  override def read(): Buffer with (String | Buffer) = js.native
  /* InferMemberOverrides */
  override def read(size: Double): Buffer with (String | Buffer) = js.native
  /* CompleteClass */
  override def removeListener(event: metadata | status | data, listener: js.Function1[Buffer | Metadata | StatusObject, Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_data(event: typings.node.nodeStrings.data, listener: js.Function1[/* chunk */ js.Any, Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_end(event: end, listener: js.Function0[Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_readable(event: readable, listener: js.Function0[Unit]): this.type = js.native
  /* CompleteClass */
  override def sendMetadata(metadata: Metadata): Unit = js.native
  /* CompleteClass */
  override def setCredentials(credentials: CallCredentials): Unit = js.native
  def unshift(chunk: js.Any): Unit = js.native
  def unshift(chunk: js.Any, encoding: BufferEncoding): Unit = js.native
  /* InferMemberOverrides */
  override def write(chunk: WriteObject): Boolean = js.native
  /* InferMemberOverrides */
  override def write(chunk: WriteObject, cb: js.Function): Boolean = js.native
  /* InferMemberOverrides */
  override def write(chunk: WriteObject, encoding: js.Any): Boolean = js.native
  /* InferMemberOverrides */
  override def write(chunk: WriteObject, encoding: js.Any, cb: js.Function): Boolean = js.native
}

