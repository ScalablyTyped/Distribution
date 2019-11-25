package typings.atGrpcGrpcDashJs.buildSrcServerDashCallMod

import typings.atGrpcGrpcDashJs.Anon_Cancelled
import typings.atGrpcGrpcDashJs.Anon_Read
import typings.atGrpcGrpcDashJs.atGrpcGrpcDashJsStrings.data
import typings.atGrpcGrpcDashJs.buildSrcEventsMod.EmitterAugmentation1
import typings.atGrpcGrpcDashJs.buildSrcMakeDashClientMod.Deserialize
import typings.atGrpcGrpcDashJs.buildSrcMakeDashClientMod.Serialize
import typings.atGrpcGrpcDashJs.buildSrcMetadataMod.Metadata
import typings.node.Anon_End
import typings.node.Buffer
import typings.node.NodeJS.WritableStream
import typings.node.streamMod.Duplex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.node.NodeJS.EventEmitter because Already inherited
- typings.node.eventsMod.EventEmitter because Already inherited
- typings.node.NodeJS.WritableStream because var conflicts: writable. Inlined 
- typings.node.streamMod.internal because Already inherited
- typings.node.NodeJS.EventEmitter because Already inherited
- typings.node.eventsMod.EventEmitter because Already inherited
- typings.node.streamMod.Writable because Inheritance from two classes. Inlined _destroy, _destroy, _final, addListener_close, addListener_drain, addListener_error, addListener_finish, addListener_pipe, addListener_unpipe, cork, destroy, destroy, emit_close, emit_drain, emit_error, emit_finish, emit_pipe, emit_unpipe, on_close, on_drain, on_error, on_finish, on_pipe, on_unpipe, once_close, once_drain, once_error, once_finish, once_pipe, once_unpipe, prependListener_close, prependListener_drain, prependListener_error, prependListener_finish, prependListener_pipe, prependListener_unpipe, prependOnceListener_close, prependOnceListener_drain, prependOnceListener_error, prependOnceListener_finish, prependOnceListener_pipe, prependOnceListener_unpipe, removeListener_close, removeListener_drain, removeListener_error, removeListener_finish, removeListener_pipe, removeListener_unpipe, uncork
- typings.node.NodeJS.ReadableStream because Already inherited
- typings.node.streamMod.internal because Already inherited
- typings.atGrpcGrpcDashJs.buildSrcObjectDashStreamMod.IntermediateObjectWritable because Inheritance from two classes. Inlined 
- typings.node.streamMod.Readable because Already inherited
- typings.atGrpcGrpcDashJs.buildSrcObjectDashStreamMod.ObjectWritable because Inheritance from two classes. Inlined _write, write, write, write, write, setDefaultEncoding, end, end, end, end, end
- typings.atGrpcGrpcDashJs.buildSrcObjectDashStreamMod.IntermediateObjectReadable because var conflicts: destroyed, readable. Inlined  */ @JSImport("@grpc/grpc-js/build/src/server-call", "ServerDuplexStreamImpl")
@js.native
class ServerDuplexStreamImpl[RequestType, ResponseType] protected ()
  extends Duplex
     with Anon_Cancelled
     with Anon_Read[RequestType]
     with EmitterAugmentation1[data, RequestType] {
  def this(
    call: Http2ServerCallStream[RequestType, ResponseType],
    metadata: Metadata,
    serialize: Serialize[ResponseType],
    deserialize: Deserialize[RequestType]
  ) = this()
  var call: js.Any = js.native
  /* CompleteClass */
  override var cancelled: Boolean = js.native
  @JSName("deserialize")
  var deserialize_Original: Deserialize[RequestType] = js.native
  var metadata: Metadata = js.native
  @JSName("serialize")
  var serialize_Original: Serialize[ResponseType] = js.native
  var trailingMetadata: js.Any = js.native
  def _write(chunk: ResponseType, encoding: String, callback: js.Function): Unit = js.native
  /* CompleteClass */
  override def addListener(event: data, listener: js.Function1[RequestType, Unit]): this.type = js.native
  def deserialize(bytes: Buffer): RequestType = js.native
  /* CompleteClass */
  override def emit(event: data, arg1: RequestType): Boolean = js.native
  def end(chunk: ResponseType): Unit = js.native
  def end(chunk: ResponseType, cb: js.Function): Unit = js.native
  def end(chunk: ResponseType, encoding: js.Any): Unit = js.native
  def end(chunk: ResponseType, encoding: js.Any, cb: js.Function): Unit = js.native
  /* CompleteClass */
  override def getPeer(): String = js.native
  /* CompleteClass */
  override def on(event: data, listener: js.Function1[RequestType, Unit]): this.type = js.native
  /* CompleteClass */
  override def once(event: data, listener: js.Function1[RequestType, Unit]): this.type = js.native
  /* InferMemberOverrides */
  /* InferMemberOverrides */
  override def pipe[T /* <: WritableStream */](destination: T): T = js.native
  /* InferMemberOverrides */
  /* InferMemberOverrides */
  override def pipe[T /* <: WritableStream */](destination: T, options: Anon_End): T = js.native
  /* CompleteClass */
  override def prependListener(event: data, listener: js.Function1[RequestType, Unit]): this.type = js.native
  /* CompleteClass */
  override def prependOnceListener(event: data, listener: js.Function1[RequestType, Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def read(): RequestType with (String | Buffer) = js.native
  /* InferMemberOverrides */
  override def read(size: Double): RequestType with (String | Buffer) = js.native
  /* CompleteClass */
  override def removeListener(event: data, listener: js.Function1[RequestType, Unit]): this.type = js.native
  /* CompleteClass */
  override def sendMetadata(responseMetadata: Metadata): Unit = js.native
  def serialize(value: ResponseType): Buffer = js.native
  def write(chunk: ResponseType): Boolean = js.native
  def write(chunk: ResponseType, cb: js.Function): Boolean = js.native
  def write(chunk: ResponseType, encoding: js.Any): Boolean = js.native
  def write(chunk: ResponseType, encoding: js.Any, cb: js.Function): Boolean = js.native
}

