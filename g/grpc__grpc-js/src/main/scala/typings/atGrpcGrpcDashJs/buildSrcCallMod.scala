package typings.atGrpcGrpcDashJs

import typings.atGrpcGrpcDashJs.atGrpcGrpcDashJsStrings.data
import typings.atGrpcGrpcDashJs.atGrpcGrpcDashJsStrings.metadata
import typings.atGrpcGrpcDashJs.atGrpcGrpcDashJsStrings.status
import typings.atGrpcGrpcDashJs.buildSrcCallDashStreamMod.Call
import typings.atGrpcGrpcDashJs.buildSrcCallDashStreamMod.StatusObject
import typings.atGrpcGrpcDashJs.buildSrcEventsMod.EmitterAugmentation1
import typings.atGrpcGrpcDashJs.buildSrcMetadataMod.Metadata
import typings.atGrpcGrpcDashJs.buildSrcObjectDashStreamMod.IntermediateObjectReadable
import typings.atGrpcGrpcDashJs.buildSrcObjectDashStreamMod.ObjectReadable
import typings.atGrpcGrpcDashJs.buildSrcObjectDashStreamMod.ObjectWritable
import typings.node.Anon_End
import typings.node.Buffer
import typings.node.NodeJS.WritableStream
import typings.node.eventsMod.EventEmitter
import typings.node.streamMod.Duplex
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@grpc/grpc-js/build/src/call", JSImport.Namespace)
@js.native
object buildSrcCallMod extends js.Object {
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
  - typings.atGrpcGrpcDashJs.buildSrcObjectDashStreamMod.ObjectWritable because Inheritance from two classes. Inlined _write, write, write, write, write, setDefaultEncoding, end, end, end, end, end */ @js.native
  class ClientDuplexStreamImpl[RequestType, ResponseType] protected ()
    extends Duplex
       with Anon_Serialize[RequestType]
       with Anon_Chunk[ResponseType]
       with Anon_Read[ResponseType]
       with Anon_Cancel
       with EmitterAugmentation1[metadata | status | data, Metadata | ResponseType | StatusObject] {
    def this(
      call: Call,
      serialize: js.Function1[/* value */ RequestType, Buffer],
      deserialize: js.Function1[/* chunk */ Buffer, ResponseType]
    ) = this()
    val call: js.Any = js.native
    def _final(cb: js.Function): Unit = js.native
    def _write(chunk: RequestType, encoding: String, cb: js.Function): Unit = js.native
    /* CompleteClass */
    override def addListener(
      event: metadata | status | data,
      listener: js.Function1[Metadata | ResponseType | StatusObject, Unit]
    ): this.type = js.native
    /* CompleteClass */
    override def cancel(): Unit = js.native
    /* CompleteClass */
    override def deserialize(chunk: Buffer): ResponseType = js.native
    /* CompleteClass */
    override def emit(event: metadata | status | data, arg1: Metadata | ResponseType | StatusObject): Boolean = js.native
    def end(chunk: RequestType): Unit = js.native
    def end(chunk: RequestType, cb: js.Function): Unit = js.native
    def end(chunk: RequestType, encoding: js.Any): Unit = js.native
    def end(chunk: RequestType, encoding: js.Any, cb: js.Function): Unit = js.native
    /* CompleteClass */
    override def getPeer(): String = js.native
    /* CompleteClass */
    override def on(
      event: metadata | status | data,
      listener: js.Function1[Metadata | ResponseType | StatusObject, Unit]
    ): this.type = js.native
    /* CompleteClass */
    override def once(
      event: metadata | status | data,
      listener: js.Function1[Metadata | ResponseType | StatusObject, Unit]
    ): this.type = js.native
    /* InferMemberOverrides */
    override def pipe[T /* <: WritableStream */](destination: T): T = js.native
    /* InferMemberOverrides */
    override def pipe[T /* <: WritableStream */](destination: T, options: Anon_End): T = js.native
    /* CompleteClass */
    override def prependListener(
      event: metadata | status | data,
      listener: js.Function1[Metadata | ResponseType | StatusObject, Unit]
    ): this.type = js.native
    /* CompleteClass */
    override def prependOnceListener(
      event: metadata | status | data,
      listener: js.Function1[Metadata | ResponseType | StatusObject, Unit]
    ): this.type = js.native
    /* InferMemberOverrides */
    override def read(): ResponseType with (String | Buffer) = js.native
    /* InferMemberOverrides */
    override def read(size: Double): ResponseType with (String | Buffer) = js.native
    /* CompleteClass */
    override def removeListener(
      event: metadata | status | data,
      listener: js.Function1[Metadata | ResponseType | StatusObject, Unit]
    ): this.type = js.native
    /* CompleteClass */
    override def serialize(value: RequestType): Buffer = js.native
    def write(chunk: RequestType): Boolean = js.native
    def write(chunk: RequestType, cb: js.Function): Boolean = js.native
    def write(chunk: RequestType, encoding: js.Any): Boolean = js.native
    def write(chunk: RequestType, encoding: js.Any, cb: js.Function): Boolean = js.native
  }
  
  @js.native
  class ClientReadableStreamImpl[ResponseType] protected ()
    extends IntermediateObjectReadable[ResponseType]
       with Anon_Chunk[ResponseType]
       with Anon_Cancel
       with Anon_Read[ResponseType]
       with EmitterAugmentation1[metadata | status | data, Metadata | ResponseType | StatusObject] {
    def this(call: Call, deserialize: js.Function1[/* chunk */ Buffer, ResponseType]) = this()
    val call: js.Any = js.native
    /* CompleteClass */
    override def addListener(
      event: metadata | status | data,
      listener: js.Function1[Metadata | ResponseType | StatusObject, Unit]
    ): this.type = js.native
    /* CompleteClass */
    override def cancel(): Unit = js.native
    /* CompleteClass */
    override def deserialize(chunk: Buffer): ResponseType = js.native
    /* CompleteClass */
    override def emit(event: metadata | status | data, arg1: Metadata | ResponseType | StatusObject): Boolean = js.native
    /* CompleteClass */
    override def getPeer(): String = js.native
    /* CompleteClass */
    override def on(
      event: metadata | status | data,
      listener: js.Function1[Metadata | ResponseType | StatusObject, Unit]
    ): this.type = js.native
    /* CompleteClass */
    override def once(
      event: metadata | status | data,
      listener: js.Function1[Metadata | ResponseType | StatusObject, Unit]
    ): this.type = js.native
    /* InferMemberOverrides */
    override def pipe[T /* <: WritableStream */](destination: T): T = js.native
    /* InferMemberOverrides */
    override def pipe[T /* <: WritableStream */](destination: T, options: Anon_End): T = js.native
    /* CompleteClass */
    override def prependListener(
      event: metadata | status | data,
      listener: js.Function1[Metadata | ResponseType | StatusObject, Unit]
    ): this.type = js.native
    /* CompleteClass */
    override def prependOnceListener(
      event: metadata | status | data,
      listener: js.Function1[Metadata | ResponseType | StatusObject, Unit]
    ): this.type = js.native
    /* InferMemberOverrides */
    override def read(): ResponseType with (String | Buffer) = js.native
    /* InferMemberOverrides */
    override def read(size: Double): ResponseType with (String | Buffer) = js.native
    /* CompleteClass */
    override def removeListener(
      event: metadata | status | data,
      listener: js.Function1[Metadata | ResponseType | StatusObject, Unit]
    ): this.type = js.native
  }
  
  @js.native
  class ClientUnaryCallImpl protected ()
    extends EventEmitter
       with Anon_Cancel
       with EmitterAugmentation1[metadata | status, Metadata | StatusObject] {
    def this(call: Call) = this()
    val call: js.Any = js.native
    /* CompleteClass */
    override def addListener(event: metadata | status, listener: js.Function1[Metadata | StatusObject, Unit]): this.type = js.native
    /* CompleteClass */
    override def cancel(): Unit = js.native
    /* CompleteClass */
    override def emit(event: metadata | status, arg1: Metadata | StatusObject): Boolean = js.native
    /* CompleteClass */
    override def getPeer(): String = js.native
    /* CompleteClass */
    override def on(event: metadata | status, listener: js.Function1[Metadata | StatusObject, Unit]): this.type = js.native
    /* CompleteClass */
    override def once(event: metadata | status, listener: js.Function1[Metadata | StatusObject, Unit]): this.type = js.native
    /* CompleteClass */
    override def prependListener(event: metadata | status, listener: js.Function1[Metadata | StatusObject, Unit]): this.type = js.native
    /* CompleteClass */
    override def prependOnceListener(event: metadata | status, listener: js.Function1[Metadata | StatusObject, Unit]): this.type = js.native
    /* CompleteClass */
    override def removeListener(event: metadata | status, listener: js.Function1[Metadata | StatusObject, Unit]): this.type = js.native
  }
  
  @js.native
  class ClientWritableStreamImpl[RequestType] protected ()
    extends ObjectWritable[RequestType]
       with Anon_Serialize[RequestType]
       with Anon_Cancel
       with EmitterAugmentation1[metadata | status, Metadata | StatusObject] {
    def this(call: Call, serialize: js.Function1[/* value */ RequestType, Buffer]) = this()
    val call: js.Any = js.native
    def _final(cb: js.Function): Unit = js.native
    /* CompleteClass */
    override def addListener(event: metadata | status, listener: js.Function1[Metadata | StatusObject, Unit]): this.type = js.native
    /* CompleteClass */
    override def cancel(): Unit = js.native
    /* CompleteClass */
    override def emit(event: metadata | status, arg1: Metadata | StatusObject): Boolean = js.native
    /* CompleteClass */
    override def getPeer(): String = js.native
    /* CompleteClass */
    override def on(event: metadata | status, listener: js.Function1[Metadata | StatusObject, Unit]): this.type = js.native
    /* CompleteClass */
    override def once(event: metadata | status, listener: js.Function1[Metadata | StatusObject, Unit]): this.type = js.native
    /* CompleteClass */
    override def prependListener(event: metadata | status, listener: js.Function1[Metadata | StatusObject, Unit]): this.type = js.native
    /* CompleteClass */
    override def prependOnceListener(event: metadata | status, listener: js.Function1[Metadata | StatusObject, Unit]): this.type = js.native
    /* CompleteClass */
    override def removeListener(event: metadata | status, listener: js.Function1[Metadata | StatusObject, Unit]): this.type = js.native
    /* CompleteClass */
    override def serialize(value: RequestType): Buffer = js.native
  }
  
  def callErrorFromStatus(status: StatusObject): ServiceError = js.native
  type ClientDuplexStream[RequestType, ResponseType] = ClientWritableStream[RequestType] with ClientReadableStream[ResponseType]
  type ClientReadableStream[ResponseType] = Anon_Chunk[ResponseType] with SurfaceCall with ObjectReadable[ResponseType]
  type ClientUnaryCall = SurfaceCall
  type ClientWritableStream[RequestType] = Anon_Serialize[RequestType] with SurfaceCall with ObjectWritable[RequestType]
  type ServiceError = StatusObject with Error
  type SurfaceCall = Anon_Cancel with (EmitterAugmentation1[metadata, Metadata]) with (EmitterAugmentation1[status, StatusObject]) with EventEmitter
}

