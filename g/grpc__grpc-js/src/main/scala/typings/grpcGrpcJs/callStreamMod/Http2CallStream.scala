package typings.grpcGrpcJs.callStreamMod

import typings.grpcGrpcJs.callCredentialsMod.CallCredentials
import typings.grpcGrpcJs.channelMod.ChannelImplementation
import typings.grpcGrpcJs.constantsMod.Status
import typings.grpcGrpcJs.filterMod.Filter
import typings.grpcGrpcJs.filterStackMod.FilterStackFactory
import typings.grpcGrpcJs.grpcGrpcJsStrings.metadata
import typings.grpcGrpcJs.grpcGrpcJsStrings.status
import typings.grpcGrpcJs.metadataMod.Metadata
import typings.grpcGrpcJs.objectStreamMod.WriteCallback
import typings.grpcGrpcJs.subchannelMod.Subchannel
import typings.node.http2Mod.ClientHttp2Stream
import typings.node.streamMod.Duplex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.grpcGrpcJs.callStreamMod.Call because var conflicts: _writev, destroyed, readable. Inlined cancelWithStatus, getPeer, sendMetadata, getDeadline, getCredentials, setCredentials, getStatus, getMethod, getHost, addListener_metadata, emit_metadata, on_metadata, once_metadata, prependListener_metadata, prependOnceListener_metadata, removeListener_metadata, addListener_status, emit_status, on_status, once_status, prependListener_status, prependOnceListener_status, removeListener_status */ @JSImport("@grpc/grpc-js/build/src/call-stream", "Http2CallStream")
@js.native
class Http2CallStream protected () extends Duplex {
  def this(
    methodName: String,
    channel: ChannelImplementation,
    options: CallStreamOptions,
    filterStackFactory: FilterStackFactory,
    channelCallCredentials: CallCredentials,
    callNumber: Double
  ) = this()
  val callNumber: js.Any = js.native
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
  var trace: js.Any = js.native
  var tryPush: js.Any = js.native
  var unfilteredReadMessages: js.Any = js.native
  var unpushedReadMessages: js.Any = js.native
  def _final(cb: js.Function): Unit = js.native
  def _write(chunk: WriteObject, encoding: String, cb: WriteCallback): Unit = js.native
  @JSName("addListener")
  def addListener_metadata(event: metadata, listener: js.Function1[/* arg1 */ Metadata, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_status(event: status, listener: js.Function1[/* arg1 */ StatusObject, Unit]): this.type = js.native
  def attachHttp2Stream(stream: ClientHttp2Stream, subchannel: Subchannel): Unit = js.native
  def cancelWithStatus(status: Status, details: String): Unit = js.native
  @JSName("emit")
  def emit_metadata(event: metadata, arg1: Metadata): Boolean = js.native
  @JSName("emit")
  def emit_status(event: status, arg1: StatusObject): Boolean = js.native
  def getCredentials(): CallCredentials = js.native
  def getDeadline(): Deadline = js.native
  def getHost(): String = js.native
  def getMethod(): String = js.native
  def getPeer(): String = js.native
  def getStatus(): StatusObject | Null = js.native
  @JSName("on")
  def on_metadata(event: metadata, listener: js.Function1[/* arg1 */ Metadata, Unit]): this.type = js.native
  @JSName("on")
  def on_status(event: status, listener: js.Function1[/* arg1 */ StatusObject, Unit]): this.type = js.native
  @JSName("once")
  def once_metadata(event: metadata, listener: js.Function1[/* arg1 */ Metadata, Unit]): this.type = js.native
  @JSName("once")
  def once_status(event: status, listener: js.Function1[/* arg1 */ StatusObject, Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_metadata(event: metadata, listener: js.Function1[/* arg1 */ Metadata, Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_status(event: status, listener: js.Function1[/* arg1 */ StatusObject, Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_metadata(event: metadata, listener: js.Function1[/* arg1 */ Metadata, Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_status(event: status, listener: js.Function1[/* arg1 */ StatusObject, Unit]): this.type = js.native
  def push(chunk: js.Any, encoding: String): Boolean = js.native
  @JSName("removeListener")
  def removeListener_metadata(event: metadata, listener: js.Function1[/* arg1 */ Metadata, Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_status(event: status, listener: js.Function1[/* arg1 */ StatusObject, Unit]): this.type = js.native
  def sendMetadata(metadata: Metadata): Unit = js.native
  def setCredentials(credentials: CallCredentials): Unit = js.native
}

