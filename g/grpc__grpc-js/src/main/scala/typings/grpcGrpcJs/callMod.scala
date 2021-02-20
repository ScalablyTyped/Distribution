package typings.grpcGrpcJs

import typings.grpcGrpcJs.callStreamMod.StatusObject
import typings.grpcGrpcJs.clientInterceptorsMod.InterceptingCallInterface
import typings.grpcGrpcJs.grpcGrpcJsStrings.close
import typings.grpcGrpcJs.grpcGrpcJsStrings.data
import typings.grpcGrpcJs.grpcGrpcJsStrings.drain
import typings.grpcGrpcJs.grpcGrpcJsStrings.end
import typings.grpcGrpcJs.grpcGrpcJsStrings.error
import typings.grpcGrpcJs.grpcGrpcJsStrings.finish
import typings.grpcGrpcJs.grpcGrpcJsStrings.metadata
import typings.grpcGrpcJs.grpcGrpcJsStrings.pause
import typings.grpcGrpcJs.grpcGrpcJsStrings.pipe
import typings.grpcGrpcJs.grpcGrpcJsStrings.readable
import typings.grpcGrpcJs.grpcGrpcJsStrings.resume
import typings.grpcGrpcJs.grpcGrpcJsStrings.status
import typings.grpcGrpcJs.grpcGrpcJsStrings.unpipe
import typings.grpcGrpcJs.metadataMod.Metadata
import typings.grpcGrpcJs.objectStreamMod.WriteCallback
import typings.node.Buffer
import typings.node.BufferEncoding
import typings.node.NodeJS.ReadableStream
import typings.node.NodeJS.WritableStream
import typings.node.anon.Chunk
import typings.node.anon.End
import typings.node.eventsMod.EventEmitter
import typings.node.eventsMod.EventEmitterOptions
import typings.node.streamMod.Duplex
import typings.node.streamMod.Readable
import typings.node.streamMod.ReadableOptions
import typings.node.streamMod.Writable
import typings.node.streamMod.WritableOptions
import typings.std.Error
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object callMod {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.grpcGrpcJs.callMod.ClientDuplexStream because var conflicts: _writev, destroyed, readable. Inlined serialize, call, cancel, getPeer, addListener_metadata, emit_metadata, on_metadata, once_metadata, prependListener_metadata, prependOnceListener_metadata, removeListener_metadata, addListener_status, emit_status, on_status, once_status, prependListener_status, prependOnceListener_status, removeListener_status, deserialize */ @JSImport("@grpc/grpc-js/build/src/call", "ClientDuplexStreamImpl")
  @js.native
  class ClientDuplexStreamImpl[RequestType, ResponseType] protected () extends Duplex {
    def this(
      serialize: js.Function1[/* value */ RequestType, Buffer],
      deserialize: js.Function1[/* chunk */ Buffer, ResponseType]
    ) = this()
    
    def _final(cb: js.Function): Unit = js.native
    
    def _write(chunk: RequestType, encoding: String, cb: WriteCallback): Unit = js.native
    
    @JSName("addListener")
    def addListener_metadata(event: metadata, listener: js.Function1[/* arg1 */ Metadata, Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_status(event: status, listener: js.Function1[/* arg1 */ StatusObject, Unit]): this.type = js.native
    
    var call: js.UndefOr[InterceptingCallInterface] = js.native
    
    def cancel(): Unit = js.native
    
    def deserialize(chunk: Buffer): ResponseType = js.native
    
    @JSName("emit")
    def emit_metadata(event: metadata, arg1: Metadata): Boolean = js.native
    @JSName("emit")
    def emit_status(event: status, arg1: StatusObject): Boolean = js.native
    
    def getPeer(): String = js.native
    
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
    
    @JSName("removeListener")
    def removeListener_metadata(event: metadata, listener: js.Function1[/* arg1 */ Metadata, Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_status(event: status, listener: js.Function1[/* arg1 */ StatusObject, Unit]): this.type = js.native
    
    def serialize(value: RequestType): Buffer = js.native
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.grpcGrpcJs.callMod.ClientReadableStream because var conflicts: destroyed, readable. Inlined deserialize, call, cancel, getPeer, addListener_metadata, emit_metadata, on_metadata, once_metadata, prependListener_metadata, prependOnceListener_metadata, removeListener_metadata, addListener_status, emit_status, on_status, once_status, prependListener_status, prependOnceListener_status, removeListener_status */ @JSImport("@grpc/grpc-js/build/src/call", "ClientReadableStreamImpl")
  @js.native
  class ClientReadableStreamImpl[ResponseType] protected () extends Readable {
    def this(deserialize: js.Function1[/* chunk */ Buffer, ResponseType]) = this()
    
    @JSName("addListener")
    def addListener_metadata(event: metadata, listener: js.Function1[/* arg1 */ Metadata, Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_status(event: status, listener: js.Function1[/* arg1 */ StatusObject, Unit]): this.type = js.native
    
    var call: js.UndefOr[InterceptingCallInterface] = js.native
    
    def cancel(): Unit = js.native
    
    def deserialize(chunk: Buffer): ResponseType = js.native
    
    @JSName("emit")
    def emit_metadata(event: metadata, arg1: Metadata): Boolean = js.native
    @JSName("emit")
    def emit_status(event: status, arg1: StatusObject): Boolean = js.native
    
    def getPeer(): String = js.native
    
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
    
    @JSName("removeListener")
    def removeListener_metadata(event: metadata, listener: js.Function1[/* arg1 */ Metadata, Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_status(event: status, listener: js.Function1[/* arg1 */ StatusObject, Unit]): this.type = js.native
  }
  
  @JSImport("@grpc/grpc-js/build/src/call", "ClientUnaryCallImpl")
  @js.native
  class ClientUnaryCallImpl ()
    extends EventEmitter
       with ClientUnaryCall {
    
    /* InferMemberOverrides */
    override def addListener(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    /* InferMemberOverrides */
    override def addListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    
    /* InferMemberOverrides */
    override def emit(event: String, args: js.Any*): Boolean = js.native
    /* InferMemberOverrides */
    override def emit(event: js.Symbol, args: js.Any*): Boolean = js.native
    
    /* InferMemberOverrides */
    override def eventNames(): js.Array[String | js.Symbol] = js.native
    
    /* InferMemberOverrides */
    override def getMaxListeners(): Double = js.native
    
    /* InferMemberOverrides */
    override def listenerCount(event: String): Double = js.native
    /* InferMemberOverrides */
    override def listenerCount(event: js.Symbol): Double = js.native
    
    /* InferMemberOverrides */
    override def listeners(event: String): js.Array[js.Function] = js.native
    /* InferMemberOverrides */
    override def listeners(event: js.Symbol): js.Array[js.Function] = js.native
    
    /* InferMemberOverrides */
    override def off(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    /* InferMemberOverrides */
    override def off(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    
    /* InferMemberOverrides */
    override def on(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    /* InferMemberOverrides */
    override def on(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    
    /* InferMemberOverrides */
    override def once(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    /* InferMemberOverrides */
    override def once(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    
    // Added in Node 6...
    /* InferMemberOverrides */
    override def prependListener(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    /* InferMemberOverrides */
    override def prependListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    
    /* InferMemberOverrides */
    override def prependOnceListener(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    /* InferMemberOverrides */
    override def prependOnceListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    
    /* InferMemberOverrides */
    override def rawListeners(event: String): js.Array[js.Function] = js.native
    /* InferMemberOverrides */
    override def rawListeners(event: js.Symbol): js.Array[js.Function] = js.native
    
    /* InferMemberOverrides */
    override def removeAllListeners(): this.type = js.native
    /* InferMemberOverrides */
    override def removeAllListeners(event: String): this.type = js.native
    /* InferMemberOverrides */
    override def removeAllListeners(event: js.Symbol): this.type = js.native
    
    /* InferMemberOverrides */
    override def removeListener(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    /* InferMemberOverrides */
    override def removeListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    
    /* InferMemberOverrides */
    override def setMaxListeners(n: Double): this.type = js.native
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.grpcGrpcJs.callMod.ClientWritableStream because var conflicts: _writev, destroyed, writable. Inlined serialize, call, cancel, getPeer, addListener_metadata, emit_metadata, on_metadata, once_metadata, prependListener_metadata, prependOnceListener_metadata, removeListener_metadata, addListener_status, emit_status, on_status, once_status, prependListener_status, prependOnceListener_status, removeListener_status */ @JSImport("@grpc/grpc-js/build/src/call", "ClientWritableStreamImpl")
  @js.native
  class ClientWritableStreamImpl[RequestType] protected () extends Writable {
    def this(serialize: js.Function1[/* value */ RequestType, Buffer]) = this()
    
    def _final(cb: js.Function): Unit = js.native
    
    def _write(chunk: RequestType, encoding: String, cb: WriteCallback): Unit = js.native
    
    @JSName("addListener")
    def addListener_metadata(event: metadata, listener: js.Function1[/* arg1 */ Metadata, Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_status(event: status, listener: js.Function1[/* arg1 */ StatusObject, Unit]): this.type = js.native
    
    var call: js.UndefOr[InterceptingCallInterface] = js.native
    
    def cancel(): Unit = js.native
    
    @JSName("emit")
    def emit_metadata(event: metadata, arg1: Metadata): Boolean = js.native
    @JSName("emit")
    def emit_status(event: status, arg1: StatusObject): Boolean = js.native
    
    def getPeer(): String = js.native
    
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
    
    @JSName("removeListener")
    def removeListener_metadata(event: metadata, listener: js.Function1[/* arg1 */ Metadata, Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_status(event: status, listener: js.Function1[/* arg1 */ StatusObject, Unit]): this.type = js.native
    
    def serialize(value: RequestType): Buffer = js.native
  }
  
  @JSImport("@grpc/grpc-js/build/src/call", "callErrorFromStatus")
  @js.native
  def callErrorFromStatus(status: StatusObject): ServiceError = js.native
  
  /* Inlined @grpc/grpc-js.@grpc/grpc-js/build/src/call.ClientWritableStream<RequestType> & @grpc/grpc-js.@grpc/grpc-js/build/src/call.ClientReadableStream<ResponseType> */
  @js.native
  trait ClientDuplexStream[RequestType, ResponseType] extends StObject {
    
    def _destroy(error: Null, callback: js.Function1[/* error */ js.UndefOr[Error | Null], Unit]): Unit = js.native
    def _destroy(error: Error, callback: js.Function1[/* error */ js.UndefOr[Error | Null], Unit]): Unit = js.native
    
    def _final(callback: js.Function1[/* error */ js.UndefOr[Error | Null], Unit]): Unit = js.native
    
    def _read(size: Double): Unit = js.native
    
    def _write(chunk: RequestType, encoding: String, callback: js.Function): Unit = js.native
    def _write(chunk: js.Any with RequestType, encoding: String, callback: js.Function): Unit = js.native
    def _write(
      chunk: js.Any,
      encoding: BufferEncoding,
      callback: js.Function1[/* error */ js.UndefOr[Error | Null], Unit]
    ): Unit = js.native
    
    var _writev: js.UndefOr[
        js.Function2[
          /* chunks */ js.Array[Chunk], 
          /* callback */ js.Function1[/* error */ js.UndefOr[Error | Null], Unit], 
          Unit
        ]
      ] = js.native
    
    def addListener(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    def addListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    /**
      * Event emitter
      * The defined events on documents including:
      * 1. close
      * 2. drain
      * 3. error
      * 4. finish
      * 5. pipe
      * 6. unpipe
      */
    @JSName("addListener")
    def addListener_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_data(event: data, listener: js.Function1[(/* chunk */ js.Any) | (/* arg1 */ ResponseType), Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_drain(event: drain, listener: js.Function0[Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_end(event: end, listener: js.Function0[Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_finish(event: finish, listener: js.Function0[Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_metadata(event: metadata, listener: js.Function1[/* arg1 */ Metadata, Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_pause(event: pause, listener: js.Function0[Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_pipe(event: pipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_readable(event: readable, listener: js.Function0[Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_resume(event: resume, listener: js.Function0[Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_status(event: status, listener: js.Function1[/* arg1 */ StatusObject, Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_unpipe(event: unpipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
    
    var call: js.UndefOr[InterceptingCallInterface] = js.native
    
    def cancel(): Unit = js.native
    
    def cork(): Unit = js.native
    
    def deserialize(chunk: Buffer): ResponseType = js.native
    
    def destroy(): Unit = js.native
    def destroy(error: Error): Unit = js.native
    
    var destroyed: Boolean = js.native
    
    def emit(event: String, args: js.Any*): Boolean = js.native
    def emit(event: js.Symbol, args: js.Any*): Boolean = js.native
    @JSName("emit")
    def emit_close(event: close): Boolean = js.native
    @JSName("emit")
    def emit_data(event: data, arg1: ResponseType): Boolean = js.native
    @JSName("emit")
    def emit_data(event: data, chunk: js.Any): Boolean = js.native
    @JSName("emit")
    def emit_drain(event: drain): Boolean = js.native
    @JSName("emit")
    def emit_end(event: end): Boolean = js.native
    @JSName("emit")
    def emit_error(event: error, err: Error): Boolean = js.native
    @JSName("emit")
    def emit_finish(event: finish): Boolean = js.native
    @JSName("emit")
    def emit_metadata(event: metadata, arg1: Metadata): Boolean = js.native
    @JSName("emit")
    def emit_pause(event: pause): Boolean = js.native
    @JSName("emit")
    def emit_pipe(event: pipe, src: Readable): Boolean = js.native
    @JSName("emit")
    def emit_readable(event: readable): Boolean = js.native
    @JSName("emit")
    def emit_resume(event: resume): Boolean = js.native
    @JSName("emit")
    def emit_status(event: status, arg1: StatusObject): Boolean = js.native
    @JSName("emit")
    def emit_unpipe(event: unpipe, src: Readable): Boolean = js.native
    
    def end(): Unit = js.native
    def end(cb: js.Function0[Unit]): Unit = js.native
    def end(chunk: RequestType): Unit = js.native
    def end(chunk: RequestType, cb: js.Function): Unit = js.native
    def end(chunk: RequestType, encoding: js.UndefOr[scala.Nothing], cb: js.Function): Unit = js.native
    def end(chunk: RequestType, encoding: js.Any): Unit = js.native
    def end(chunk: RequestType, encoding: js.Any, cb: js.Function): Unit = js.native
    def end(chunk: js.Any with RequestType, cb: js.Function): Unit = js.native
    def end(chunk: js.Any with RequestType, encoding: js.UndefOr[scala.Nothing], cb: js.Function): Unit = js.native
    def end(chunk: js.Any with RequestType, encoding: js.Any): Unit = js.native
    def end(chunk: js.Any with RequestType, encoding: js.Any, cb: js.Function): Unit = js.native
    def end(chunk: (js.Any with RequestType) | js.Any): Unit = js.native
    def end(chunk: js.Any, cb: js.Function0[Unit]): Unit = js.native
    def end(chunk: js.Any, encoding: BufferEncoding): Unit = js.native
    def end(chunk: js.Any, encoding: BufferEncoding, cb: js.Function0[Unit]): Unit = js.native
    def end(data: String): Unit = js.native
    def end(data: String, cb: js.Function0[Unit]): Unit = js.native
    def end(data: Uint8Array): Unit = js.native
    def end(data: Uint8Array, cb: js.Function0[Unit]): Unit = js.native
    def end(str: String, encoding: js.UndefOr[scala.Nothing], cb: js.Function0[Unit]): Unit = js.native
    def end(str: String, encoding: BufferEncoding): Unit = js.native
    def end(str: String, encoding: BufferEncoding, cb: js.Function0[Unit]): Unit = js.native
    
    def eventNames(): js.Array[String | js.Symbol] = js.native
    
    def getMaxListeners(): Double = js.native
    
    def getPeer(): String = js.native
    
    def isPaused(): Boolean = js.native
    
    def listenerCount(event: String): Double = js.native
    def listenerCount(event: js.Symbol): Double = js.native
    
    def listeners(event: String): js.Array[js.Function] = js.native
    def listeners(event: js.Symbol): js.Array[js.Function] = js.native
    
    def off(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    def off(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    
    def on(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    def on(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    @JSName("on")
    def on_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_data(event: data, listener: js.Function1[(/* chunk */ js.Any) | (/* arg1 */ ResponseType), Unit]): this.type = js.native
    @JSName("on")
    def on_drain(event: drain, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_end(event: end, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
    @JSName("on")
    def on_finish(event: finish, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_metadata(event: metadata, listener: js.Function1[/* arg1 */ Metadata, Unit]): this.type = js.native
    @JSName("on")
    def on_pause(event: pause, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_pipe(event: pipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
    @JSName("on")
    def on_readable(event: readable, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_resume(event: resume, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_status(event: status, listener: js.Function1[/* arg1 */ StatusObject, Unit]): this.type = js.native
    @JSName("on")
    def on_unpipe(event: unpipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
    
    def once(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    def once(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    @JSName("once")
    def once_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("once")
    def once_data(event: data, listener: js.Function1[(/* chunk */ js.Any) | (/* arg1 */ ResponseType), Unit]): this.type = js.native
    @JSName("once")
    def once_drain(event: drain, listener: js.Function0[Unit]): this.type = js.native
    @JSName("once")
    def once_end(event: end, listener: js.Function0[Unit]): this.type = js.native
    @JSName("once")
    def once_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
    @JSName("once")
    def once_finish(event: finish, listener: js.Function0[Unit]): this.type = js.native
    @JSName("once")
    def once_metadata(event: metadata, listener: js.Function1[/* arg1 */ Metadata, Unit]): this.type = js.native
    @JSName("once")
    def once_pause(event: pause, listener: js.Function0[Unit]): this.type = js.native
    @JSName("once")
    def once_pipe(event: pipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
    @JSName("once")
    def once_readable(event: readable, listener: js.Function0[Unit]): this.type = js.native
    @JSName("once")
    def once_resume(event: resume, listener: js.Function0[Unit]): this.type = js.native
    @JSName("once")
    def once_status(event: status, listener: js.Function1[/* arg1 */ StatusObject, Unit]): this.type = js.native
    @JSName("once")
    def once_unpipe(event: unpipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
    
    def pause(): this.type = js.native
    
    def pipe[T /* <: WritableStream */](destination: T): T = js.native
    def pipe[T /* <: WritableStream */](destination: T, options: End): T = js.native
    
    // Added in Node 6...
    def prependListener(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    def prependListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_data(event: data, listener: js.Function1[(/* chunk */ js.Any) | (/* arg1 */ ResponseType), Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_drain(event: drain, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_end(event: end, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_finish(event: finish, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_metadata(event: metadata, listener: js.Function1[/* arg1 */ Metadata, Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_pause(event: pause, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_pipe(event: pipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_readable(event: readable, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_resume(event: resume, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_status(event: status, listener: js.Function1[/* arg1 */ StatusObject, Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_unpipe(event: unpipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
    
    def prependOnceListener(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    def prependOnceListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_data(event: data, listener: js.Function1[(/* chunk */ js.Any) | (/* arg1 */ ResponseType), Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_drain(event: drain, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_end(event: end, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_finish(event: finish, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_metadata(event: metadata, listener: js.Function1[/* arg1 */ Metadata, Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_pause(event: pause, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_pipe(event: pipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_readable(event: readable, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_resume(event: resume, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_status(event: status, listener: js.Function1[/* arg1 */ StatusObject, Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_unpipe(event: unpipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
    
    def push(chunk: js.Any): Boolean = js.native
    def push(chunk: js.Any, encoding: BufferEncoding): Boolean = js.native
    
    def rawListeners(event: String): js.Array[js.Function] = js.native
    def rawListeners(event: js.Symbol): js.Array[js.Function] = js.native
    
    def read(): js.Any = js.native
    def read(size: Double): js.Any = js.native
    @JSName("read")
    def read_Intersection(): js.Any with ResponseType = js.native
    @JSName("read")
    def read_Intersection(size: Double): js.Any with ResponseType = js.native
    @JSName("read")
    def read_ResponseType(): ResponseType = js.native
    @JSName("read")
    def read_ResponseType(size: Double): ResponseType = js.native
    @JSName("read")
    def read_Union(): String | Buffer = js.native
    @JSName("read")
    def read_Union(size: Double): String | Buffer = js.native
    
    var readable: Boolean = js.native
    
    val readableEncoding: BufferEncoding | Null = js.native
    
    val readableEnded: Boolean = js.native
    
    val readableFlowing: Boolean | Null = js.native
    
    val readableHighWaterMark: Double = js.native
    
    val readableLength: Double = js.native
    
    val readableObjectMode: Boolean = js.native
    
    def removeAllListeners(): this.type = js.native
    def removeAllListeners(event: String): this.type = js.native
    def removeAllListeners(event: js.Symbol): this.type = js.native
    
    def removeListener(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    def removeListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_data(event: data, listener: js.Function1[(/* chunk */ js.Any) | (/* arg1 */ ResponseType), Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_drain(event: drain, listener: js.Function0[Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_end(event: end, listener: js.Function0[Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_finish(event: finish, listener: js.Function0[Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_metadata(event: metadata, listener: js.Function1[/* arg1 */ Metadata, Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_pause(event: pause, listener: js.Function0[Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_pipe(event: pipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_readable(event: readable, listener: js.Function0[Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_resume(event: resume, listener: js.Function0[Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_status(event: status, listener: js.Function1[/* arg1 */ StatusObject, Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_unpipe(event: unpipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
    
    def resume(): this.type = js.native
    
    def serialize(value: RequestType): Buffer = js.native
    
    def setDefaultEncoding(encoding: String): this.type = js.native
    def setDefaultEncoding(encoding: BufferEncoding): this.type = js.native
    
    def setEncoding(encoding: BufferEncoding): this.type = js.native
    
    def setMaxListeners(n: Double): this.type = js.native
    
    def uncork(): Unit = js.native
    
    def unpipe(): this.type = js.native
    def unpipe(destination: WritableStream): this.type = js.native
    
    def unshift(chunk: String): Unit = js.native
    def unshift(chunk: String, encoding: BufferEncoding): Unit = js.native
    def unshift(chunk: js.Any): Unit = js.native
    def unshift(chunk: js.Any, encoding: BufferEncoding): Unit = js.native
    def unshift(chunk: Uint8Array): Unit = js.native
    def unshift(chunk: Uint8Array, encoding: BufferEncoding): Unit = js.native
    
    def wrap(oldStream: ReadableStream): this.type = js.native
    
    val writable: Boolean = js.native
    
    val writableCorked: Double = js.native
    
    val writableEnded: Boolean = js.native
    
    val writableFinished: Boolean = js.native
    
    val writableHighWaterMark: Double = js.native
    
    val writableLength: Double = js.native
    
    val writableObjectMode: Boolean = js.native
    
    def write(buffer: String): Boolean = js.native
    def write(buffer: String, cb: js.Function1[/* err */ js.UndefOr[Error | Null], Unit]): Boolean = js.native
    def write(buffer: Uint8Array): Boolean = js.native
    def write(buffer: Uint8Array, cb: js.Function1[/* err */ js.UndefOr[Error | Null], Unit]): Boolean = js.native
    def write(chunk: RequestType): Boolean = js.native
    def write(chunk: RequestType, cb: js.Function): Boolean = js.native
    def write(chunk: RequestType, encoding: js.UndefOr[scala.Nothing], cb: js.Function): Boolean = js.native
    def write(chunk: RequestType, encoding: js.Any): Boolean = js.native
    def write(chunk: RequestType, encoding: js.Any, cb: js.Function): Boolean = js.native
    def write(chunk: js.Any with RequestType, encoding: js.UndefOr[scala.Nothing], cb: WriteCallback): Boolean = js.native
    def write(chunk: js.Any with RequestType, encoding: js.Any): Boolean = js.native
    def write(chunk: js.Any with RequestType, encoding: js.Any, cb: WriteCallback): Boolean = js.native
    def write(chunk: (js.Any with RequestType) | js.Any): Boolean = js.native
    def write(
      chunk: (js.Any with RequestType) | js.Any,
      cb: (js.Function1[/* error */ js.UndefOr[Error | Null], Unit]) | WriteCallback
    ): Boolean = js.native
    def write(chunk: js.Any, encoding: BufferEncoding): Boolean = js.native
    def write(
      chunk: js.Any,
      encoding: BufferEncoding,
      cb: js.Function1[/* error */ js.UndefOr[Error | Null], Unit]
    ): Boolean = js.native
    def write(
      str: String,
      encoding: js.UndefOr[scala.Nothing],
      cb: js.Function1[/* err */ js.UndefOr[Error | Null], Unit]
    ): Boolean = js.native
    def write(str: String, encoding: BufferEncoding): Boolean = js.native
    def write(str: String, encoding: BufferEncoding, cb: js.Function1[/* err */ js.UndefOr[Error | Null], Unit]): Boolean = js.native
  }
  
  /* Inlined {deserialize (chunk : node.Buffer): ResponseType} & @grpc/grpc-js.@grpc/grpc-js/build/src/call.SurfaceCall & @grpc/grpc-js.@grpc/grpc-js/build/src/object-stream.ObjectReadable<ResponseType> */
  @js.native
  trait ClientReadableStream[ResponseType] extends StObject {
    
    def _destroy(error: Null, callback: js.Function1[/* error */ js.UndefOr[Error | Null], Unit]): Unit = js.native
    def _destroy(error: Error, callback: js.Function1[/* error */ js.UndefOr[Error | Null], Unit]): Unit = js.native
    
    def _read(size: Double): Unit = js.native
    
    def addListener(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    def addListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    /**
      * Event emitter
      * The defined events on documents including:
      * 1. close
      * 2. data
      * 3. end
      * 4. error
      * 5. pause
      * 6. readable
      * 7. resume
      */
    @JSName("addListener")
    def addListener_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_data(event: data, listener: js.Function1[(/* chunk */ js.Any) | (/* arg1 */ ResponseType), Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_end(event: end, listener: js.Function0[Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_metadata(event: metadata, listener: js.Function1[/* arg1 */ Metadata, Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_pause(event: pause, listener: js.Function0[Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_readable(event: readable, listener: js.Function0[Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_resume(event: resume, listener: js.Function0[Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_status(event: status, listener: js.Function1[/* arg1 */ StatusObject, Unit]): this.type = js.native
    
    var call: js.UndefOr[InterceptingCallInterface] = js.native
    
    def cancel(): Unit = js.native
    
    def deserialize(chunk: Buffer): ResponseType = js.native
    
    def destroy(): Unit = js.native
    def destroy(error: Error): Unit = js.native
    
    var destroyed: Boolean = js.native
    
    def emit(event: String, args: js.Any*): Boolean = js.native
    def emit(event: js.Symbol, args: js.Any*): Boolean = js.native
    @JSName("emit")
    def emit_close(event: close): Boolean = js.native
    @JSName("emit")
    def emit_data(event: data, arg1: ResponseType): Boolean = js.native
    @JSName("emit")
    def emit_data(event: data, chunk: js.Any): Boolean = js.native
    @JSName("emit")
    def emit_end(event: end): Boolean = js.native
    @JSName("emit")
    def emit_error(event: error, err: Error): Boolean = js.native
    @JSName("emit")
    def emit_metadata(event: metadata, arg1: Metadata): Boolean = js.native
    @JSName("emit")
    def emit_pause(event: pause): Boolean = js.native
    @JSName("emit")
    def emit_readable(event: readable): Boolean = js.native
    @JSName("emit")
    def emit_resume(event: resume): Boolean = js.native
    @JSName("emit")
    def emit_status(event: status, arg1: StatusObject): Boolean = js.native
    
    def eventNames(): js.Array[String | js.Symbol] = js.native
    
    def getMaxListeners(): Double = js.native
    
    def getPeer(): String = js.native
    
    def isPaused(): Boolean = js.native
    
    def listenerCount(event: String): Double = js.native
    def listenerCount(event: js.Symbol): Double = js.native
    
    def listeners(event: String): js.Array[js.Function] = js.native
    def listeners(event: js.Symbol): js.Array[js.Function] = js.native
    
    def off(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    def off(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    
    def on(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    def on(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    @JSName("on")
    def on_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_data(event: data, listener: js.Function1[(/* chunk */ js.Any) | (/* arg1 */ ResponseType), Unit]): this.type = js.native
    @JSName("on")
    def on_end(event: end, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
    @JSName("on")
    def on_metadata(event: metadata, listener: js.Function1[/* arg1 */ Metadata, Unit]): this.type = js.native
    @JSName("on")
    def on_pause(event: pause, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_readable(event: readable, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_resume(event: resume, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_status(event: status, listener: js.Function1[/* arg1 */ StatusObject, Unit]): this.type = js.native
    
    def once(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    def once(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    @JSName("once")
    def once_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("once")
    def once_data(event: data, listener: js.Function1[(/* chunk */ js.Any) | (/* arg1 */ ResponseType), Unit]): this.type = js.native
    @JSName("once")
    def once_end(event: end, listener: js.Function0[Unit]): this.type = js.native
    @JSName("once")
    def once_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
    @JSName("once")
    def once_metadata(event: metadata, listener: js.Function1[/* arg1 */ Metadata, Unit]): this.type = js.native
    @JSName("once")
    def once_pause(event: pause, listener: js.Function0[Unit]): this.type = js.native
    @JSName("once")
    def once_readable(event: readable, listener: js.Function0[Unit]): this.type = js.native
    @JSName("once")
    def once_resume(event: resume, listener: js.Function0[Unit]): this.type = js.native
    @JSName("once")
    def once_status(event: status, listener: js.Function1[/* arg1 */ StatusObject, Unit]): this.type = js.native
    
    def pause(): this.type = js.native
    
    def pipe[T /* <: WritableStream */](destination: T): T = js.native
    def pipe[T /* <: WritableStream */](destination: T, options: End): T = js.native
    
    // Added in Node 6...
    def prependListener(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    def prependListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_data(event: data, listener: js.Function1[(/* chunk */ js.Any) | (/* arg1 */ ResponseType), Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_end(event: end, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_metadata(event: metadata, listener: js.Function1[/* arg1 */ Metadata, Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_pause(event: pause, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_readable(event: readable, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_resume(event: resume, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_status(event: status, listener: js.Function1[/* arg1 */ StatusObject, Unit]): this.type = js.native
    
    def prependOnceListener(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    def prependOnceListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_data(event: data, listener: js.Function1[(/* chunk */ js.Any) | (/* arg1 */ ResponseType), Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_end(event: end, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_metadata(event: metadata, listener: js.Function1[/* arg1 */ Metadata, Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_pause(event: pause, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_readable(event: readable, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_resume(event: resume, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_status(event: status, listener: js.Function1[/* arg1 */ StatusObject, Unit]): this.type = js.native
    
    def push(chunk: js.Any): Boolean = js.native
    def push(chunk: js.Any, encoding: BufferEncoding): Boolean = js.native
    
    def rawListeners(event: String): js.Array[js.Function] = js.native
    def rawListeners(event: js.Symbol): js.Array[js.Function] = js.native
    
    def read(): js.Any = js.native
    def read(size: Double): js.Any = js.native
    @JSName("read")
    def read_Intersection(): js.Any with ResponseType = js.native
    @JSName("read")
    def read_Intersection(size: Double): js.Any with ResponseType = js.native
    @JSName("read")
    def read_ResponseType(): ResponseType = js.native
    @JSName("read")
    def read_ResponseType(size: Double): ResponseType = js.native
    @JSName("read")
    def read_Union(): String | Buffer = js.native
    @JSName("read")
    def read_Union(size: Double): String | Buffer = js.native
    
    var readable: Boolean = js.native
    
    val readableEncoding: BufferEncoding | Null = js.native
    
    val readableEnded: Boolean = js.native
    
    val readableFlowing: Boolean | Null = js.native
    
    val readableHighWaterMark: Double = js.native
    
    val readableLength: Double = js.native
    
    val readableObjectMode: Boolean = js.native
    
    def removeAllListeners(): this.type = js.native
    def removeAllListeners(event: String): this.type = js.native
    def removeAllListeners(event: js.Symbol): this.type = js.native
    
    def removeListener(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    def removeListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_data(event: data, listener: js.Function1[(/* chunk */ js.Any) | (/* arg1 */ ResponseType), Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_end(event: end, listener: js.Function0[Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_metadata(event: metadata, listener: js.Function1[/* arg1 */ Metadata, Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_pause(event: pause, listener: js.Function0[Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_readable(event: readable, listener: js.Function0[Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_resume(event: resume, listener: js.Function0[Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_status(event: status, listener: js.Function1[/* arg1 */ StatusObject, Unit]): this.type = js.native
    
    def resume(): this.type = js.native
    
    def setEncoding(encoding: BufferEncoding): this.type = js.native
    
    def setMaxListeners(n: Double): this.type = js.native
    
    def unpipe(): this.type = js.native
    def unpipe(destination: WritableStream): this.type = js.native
    
    def unshift(chunk: String): Unit = js.native
    def unshift(chunk: String, encoding: BufferEncoding): Unit = js.native
    def unshift(chunk: js.Any): Unit = js.native
    def unshift(chunk: js.Any, encoding: BufferEncoding): Unit = js.native
    def unshift(chunk: Uint8Array): Unit = js.native
    def unshift(chunk: Uint8Array, encoding: BufferEncoding): Unit = js.native
    
    def wrap(oldStream: ReadableStream): this.type = js.native
  }
  
  /* Inlined @grpc/grpc-js.@grpc/grpc-js/build/src/call.SurfaceCall */
  @js.native
  trait ClientUnaryCall extends StObject {
    
    def addListener(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    def addListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_metadata(event: metadata, listener: js.Function1[/* arg1 */ Metadata, Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_status(event: status, listener: js.Function1[/* arg1 */ StatusObject, Unit]): this.type = js.native
    
    var call: js.UndefOr[InterceptingCallInterface] = js.native
    
    def cancel(): Unit = js.native
    
    def emit(event: String, args: js.Any*): Boolean = js.native
    def emit(event: js.Symbol, args: js.Any*): Boolean = js.native
    @JSName("emit")
    def emit_metadata(event: metadata, arg1: Metadata): Boolean = js.native
    @JSName("emit")
    def emit_status(event: status, arg1: StatusObject): Boolean = js.native
    
    def eventNames(): js.Array[String | js.Symbol] = js.native
    
    def getMaxListeners(): Double = js.native
    
    def getPeer(): String = js.native
    
    def listenerCount(event: String): Double = js.native
    def listenerCount(event: js.Symbol): Double = js.native
    
    def listeners(event: String): js.Array[js.Function] = js.native
    def listeners(event: js.Symbol): js.Array[js.Function] = js.native
    
    def off(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    def off(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    
    def on(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    def on(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    @JSName("on")
    def on_metadata(event: metadata, listener: js.Function1[/* arg1 */ Metadata, Unit]): this.type = js.native
    @JSName("on")
    def on_status(event: status, listener: js.Function1[/* arg1 */ StatusObject, Unit]): this.type = js.native
    
    def once(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    def once(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    @JSName("once")
    def once_metadata(event: metadata, listener: js.Function1[/* arg1 */ Metadata, Unit]): this.type = js.native
    @JSName("once")
    def once_status(event: status, listener: js.Function1[/* arg1 */ StatusObject, Unit]): this.type = js.native
    
    // Added in Node 6...
    def prependListener(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    def prependListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_metadata(event: metadata, listener: js.Function1[/* arg1 */ Metadata, Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_status(event: status, listener: js.Function1[/* arg1 */ StatusObject, Unit]): this.type = js.native
    
    def prependOnceListener(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    def prependOnceListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_metadata(event: metadata, listener: js.Function1[/* arg1 */ Metadata, Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_status(event: status, listener: js.Function1[/* arg1 */ StatusObject, Unit]): this.type = js.native
    
    def rawListeners(event: String): js.Array[js.Function] = js.native
    def rawListeners(event: js.Symbol): js.Array[js.Function] = js.native
    
    def removeAllListeners(): this.type = js.native
    def removeAllListeners(event: String): this.type = js.native
    def removeAllListeners(event: js.Symbol): this.type = js.native
    
    def removeListener(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    def removeListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_metadata(event: metadata, listener: js.Function1[/* arg1 */ Metadata, Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_status(event: status, listener: js.Function1[/* arg1 */ StatusObject, Unit]): this.type = js.native
    
    def setMaxListeners(n: Double): this.type = js.native
  }
  
  /* Inlined {serialize (value : RequestType): node.Buffer} & @grpc/grpc-js.@grpc/grpc-js/build/src/call.SurfaceCall & @grpc/grpc-js.@grpc/grpc-js/build/src/object-stream.ObjectWritable<RequestType> */
  @js.native
  trait ClientWritableStream[RequestType] extends StObject {
    
    def _destroy(error: Null, callback: js.Function1[/* error */ js.UndefOr[Error | Null], Unit]): Unit = js.native
    def _destroy(error: Error, callback: js.Function1[/* error */ js.UndefOr[Error | Null], Unit]): Unit = js.native
    
    def _final(callback: js.Function1[/* error */ js.UndefOr[Error | Null], Unit]): Unit = js.native
    
    def _write(chunk: RequestType, encoding: String, callback: js.Function): Unit = js.native
    def _write(chunk: js.Any with RequestType, encoding: String, callback: js.Function): Unit = js.native
    def _write(
      chunk: js.Any,
      encoding: BufferEncoding,
      callback: js.Function1[/* error */ js.UndefOr[Error | Null], Unit]
    ): Unit = js.native
    
    var _writev: js.UndefOr[
        js.Function2[
          /* chunks */ js.Array[Chunk], 
          /* callback */ js.Function1[/* error */ js.UndefOr[Error | Null], Unit], 
          Unit
        ]
      ] = js.native
    
    def addListener(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    def addListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    /**
      * Event emitter
      * The defined events on documents including:
      * 1. close
      * 2. drain
      * 3. error
      * 4. finish
      * 5. pipe
      * 6. unpipe
      */
    @JSName("addListener")
    def addListener_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_drain(event: drain, listener: js.Function0[Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_finish(event: finish, listener: js.Function0[Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_metadata(event: metadata, listener: js.Function1[/* arg1 */ Metadata, Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_pipe(event: pipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_status(event: status, listener: js.Function1[/* arg1 */ StatusObject, Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_unpipe(event: unpipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
    
    var call: js.UndefOr[InterceptingCallInterface] = js.native
    
    def cancel(): Unit = js.native
    
    def cork(): Unit = js.native
    
    def destroy(): Unit = js.native
    def destroy(error: Error): Unit = js.native
    
    var destroyed: Boolean = js.native
    
    def emit(event: String, args: js.Any*): Boolean = js.native
    def emit(event: js.Symbol, args: js.Any*): Boolean = js.native
    @JSName("emit")
    def emit_close(event: close): Boolean = js.native
    @JSName("emit")
    def emit_drain(event: drain): Boolean = js.native
    @JSName("emit")
    def emit_error(event: error, err: Error): Boolean = js.native
    @JSName("emit")
    def emit_finish(event: finish): Boolean = js.native
    @JSName("emit")
    def emit_metadata(event: metadata, arg1: Metadata): Boolean = js.native
    @JSName("emit")
    def emit_pipe(event: pipe, src: Readable): Boolean = js.native
    @JSName("emit")
    def emit_status(event: status, arg1: StatusObject): Boolean = js.native
    @JSName("emit")
    def emit_unpipe(event: unpipe, src: Readable): Boolean = js.native
    
    def end(): Unit = js.native
    def end(cb: js.Function0[Unit]): Unit = js.native
    def end(chunk: RequestType): Unit = js.native
    def end(chunk: RequestType, cb: js.Function): Unit = js.native
    def end(chunk: RequestType, encoding: js.UndefOr[scala.Nothing], cb: js.Function): Unit = js.native
    def end(chunk: RequestType, encoding: js.Any): Unit = js.native
    def end(chunk: RequestType, encoding: js.Any, cb: js.Function): Unit = js.native
    def end(chunk: js.Any with RequestType, cb: js.Function): Unit = js.native
    def end(chunk: js.Any with RequestType, encoding: js.UndefOr[scala.Nothing], cb: js.Function): Unit = js.native
    def end(chunk: js.Any with RequestType, encoding: js.Any): Unit = js.native
    def end(chunk: js.Any with RequestType, encoding: js.Any, cb: js.Function): Unit = js.native
    def end(chunk: (js.Any with RequestType) | js.Any): Unit = js.native
    def end(chunk: js.Any, cb: js.Function0[Unit]): Unit = js.native
    def end(chunk: js.Any, encoding: BufferEncoding): Unit = js.native
    def end(chunk: js.Any, encoding: BufferEncoding, cb: js.Function0[Unit]): Unit = js.native
    def end(data: String): Unit = js.native
    def end(data: String, cb: js.Function0[Unit]): Unit = js.native
    def end(data: Uint8Array): Unit = js.native
    def end(data: Uint8Array, cb: js.Function0[Unit]): Unit = js.native
    def end(str: String, encoding: js.UndefOr[scala.Nothing], cb: js.Function0[Unit]): Unit = js.native
    def end(str: String, encoding: BufferEncoding): Unit = js.native
    def end(str: String, encoding: BufferEncoding, cb: js.Function0[Unit]): Unit = js.native
    
    def eventNames(): js.Array[String | js.Symbol] = js.native
    
    def getMaxListeners(): Double = js.native
    
    def getPeer(): String = js.native
    
    def listenerCount(event: String): Double = js.native
    def listenerCount(event: js.Symbol): Double = js.native
    
    def listeners(event: String): js.Array[js.Function] = js.native
    def listeners(event: js.Symbol): js.Array[js.Function] = js.native
    
    def off(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    def off(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    
    def on(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    def on(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    @JSName("on")
    def on_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_drain(event: drain, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
    @JSName("on")
    def on_finish(event: finish, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_metadata(event: metadata, listener: js.Function1[/* arg1 */ Metadata, Unit]): this.type = js.native
    @JSName("on")
    def on_pipe(event: pipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
    @JSName("on")
    def on_status(event: status, listener: js.Function1[/* arg1 */ StatusObject, Unit]): this.type = js.native
    @JSName("on")
    def on_unpipe(event: unpipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
    
    def once(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    def once(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    @JSName("once")
    def once_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("once")
    def once_drain(event: drain, listener: js.Function0[Unit]): this.type = js.native
    @JSName("once")
    def once_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
    @JSName("once")
    def once_finish(event: finish, listener: js.Function0[Unit]): this.type = js.native
    @JSName("once")
    def once_metadata(event: metadata, listener: js.Function1[/* arg1 */ Metadata, Unit]): this.type = js.native
    @JSName("once")
    def once_pipe(event: pipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
    @JSName("once")
    def once_status(event: status, listener: js.Function1[/* arg1 */ StatusObject, Unit]): this.type = js.native
    @JSName("once")
    def once_unpipe(event: unpipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
    
    def pipe[T /* <: WritableStream */](destination: T): T = js.native
    def pipe[T /* <: WritableStream */](destination: T, options: End): T = js.native
    
    // Added in Node 6...
    def prependListener(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    def prependListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_drain(event: drain, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_finish(event: finish, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_metadata(event: metadata, listener: js.Function1[/* arg1 */ Metadata, Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_pipe(event: pipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_status(event: status, listener: js.Function1[/* arg1 */ StatusObject, Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_unpipe(event: unpipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
    
    def prependOnceListener(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    def prependOnceListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_drain(event: drain, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_finish(event: finish, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_metadata(event: metadata, listener: js.Function1[/* arg1 */ Metadata, Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_pipe(event: pipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_status(event: status, listener: js.Function1[/* arg1 */ StatusObject, Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_unpipe(event: unpipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
    
    def rawListeners(event: String): js.Array[js.Function] = js.native
    def rawListeners(event: js.Symbol): js.Array[js.Function] = js.native
    
    def removeAllListeners(): this.type = js.native
    def removeAllListeners(event: String): this.type = js.native
    def removeAllListeners(event: js.Symbol): this.type = js.native
    
    def removeListener(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    def removeListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_drain(event: drain, listener: js.Function0[Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_finish(event: finish, listener: js.Function0[Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_metadata(event: metadata, listener: js.Function1[/* arg1 */ Metadata, Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_pipe(event: pipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_status(event: status, listener: js.Function1[/* arg1 */ StatusObject, Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_unpipe(event: unpipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
    
    def serialize(value: RequestType): Buffer = js.native
    
    def setDefaultEncoding(encoding: String): this.type = js.native
    def setDefaultEncoding(encoding: BufferEncoding): this.type = js.native
    
    def setMaxListeners(n: Double): this.type = js.native
    
    def uncork(): Unit = js.native
    
    val writable: Boolean = js.native
    
    val writableCorked: Double = js.native
    
    val writableEnded: Boolean = js.native
    
    val writableFinished: Boolean = js.native
    
    val writableHighWaterMark: Double = js.native
    
    val writableLength: Double = js.native
    
    val writableObjectMode: Boolean = js.native
    
    def write(buffer: String): Boolean = js.native
    def write(buffer: String, cb: js.Function1[/* err */ js.UndefOr[Error | Null], Unit]): Boolean = js.native
    def write(buffer: Uint8Array): Boolean = js.native
    def write(buffer: Uint8Array, cb: js.Function1[/* err */ js.UndefOr[Error | Null], Unit]): Boolean = js.native
    def write(chunk: RequestType): Boolean = js.native
    def write(chunk: RequestType, cb: js.Function): Boolean = js.native
    def write(chunk: RequestType, encoding: js.UndefOr[scala.Nothing], cb: js.Function): Boolean = js.native
    def write(chunk: RequestType, encoding: js.Any): Boolean = js.native
    def write(chunk: RequestType, encoding: js.Any, cb: js.Function): Boolean = js.native
    def write(chunk: js.Any with RequestType, encoding: js.UndefOr[scala.Nothing], cb: WriteCallback): Boolean = js.native
    def write(chunk: js.Any with RequestType, encoding: js.Any): Boolean = js.native
    def write(chunk: js.Any with RequestType, encoding: js.Any, cb: WriteCallback): Boolean = js.native
    def write(chunk: (js.Any with RequestType) | js.Any): Boolean = js.native
    def write(
      chunk: (js.Any with RequestType) | js.Any,
      cb: (js.Function1[/* error */ js.UndefOr[Error | Null], Unit]) | WriteCallback
    ): Boolean = js.native
    def write(chunk: js.Any, encoding: BufferEncoding): Boolean = js.native
    def write(
      chunk: js.Any,
      encoding: BufferEncoding,
      cb: js.Function1[/* error */ js.UndefOr[Error | Null], Unit]
    ): Boolean = js.native
    def write(
      str: String,
      encoding: js.UndefOr[scala.Nothing],
      cb: js.Function1[/* err */ js.UndefOr[Error | Null], Unit]
    ): Boolean = js.native
    def write(str: String, encoding: BufferEncoding): Boolean = js.native
    def write(str: String, encoding: BufferEncoding, cb: js.Function1[/* err */ js.UndefOr[Error | Null], Unit]): Boolean = js.native
  }
  
  type ServiceError = StatusObject with Error
  
  /* Inlined {  call :@grpc/grpc-js.@grpc/grpc-js/build/src/client-interceptors.InterceptingCallInterface | undefined, cancel (): void, getPeer (): string} & @grpc/grpc-js.@grpc/grpc-js/build/src/events.EmitterAugmentation1<'metadata', @grpc/grpc-js.@grpc/grpc-js/build/src/metadata.Metadata> & @grpc/grpc-js.@grpc/grpc-js/build/src/events.EmitterAugmentation1<'status', @grpc/grpc-js.@grpc/grpc-js/build/src/call-stream.StatusObject> & node.events.EventEmitter */
  @js.native
  trait SurfaceCall extends StObject {
    
    def addListener(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    def addListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_metadata(event: metadata, listener: js.Function1[/* arg1 */ Metadata, Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_status(event: status, listener: js.Function1[/* arg1 */ StatusObject, Unit]): this.type = js.native
    
    var call: js.UndefOr[InterceptingCallInterface] = js.native
    
    def cancel(): Unit = js.native
    
    def emit(event: String, args: js.Any*): Boolean = js.native
    def emit(event: js.Symbol, args: js.Any*): Boolean = js.native
    @JSName("emit")
    def emit_metadata(event: metadata, arg1: Metadata): Boolean = js.native
    @JSName("emit")
    def emit_status(event: status, arg1: StatusObject): Boolean = js.native
    
    def eventNames(): js.Array[String | js.Symbol] = js.native
    
    def getMaxListeners(): Double = js.native
    
    def getPeer(): String = js.native
    
    def listenerCount(event: String): Double = js.native
    def listenerCount(event: js.Symbol): Double = js.native
    
    def listeners(event: String): js.Array[js.Function] = js.native
    def listeners(event: js.Symbol): js.Array[js.Function] = js.native
    
    def off(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    def off(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    
    def on(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    def on(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    @JSName("on")
    def on_metadata(event: metadata, listener: js.Function1[/* arg1 */ Metadata, Unit]): this.type = js.native
    @JSName("on")
    def on_status(event: status, listener: js.Function1[/* arg1 */ StatusObject, Unit]): this.type = js.native
    
    def once(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    def once(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    @JSName("once")
    def once_metadata(event: metadata, listener: js.Function1[/* arg1 */ Metadata, Unit]): this.type = js.native
    @JSName("once")
    def once_status(event: status, listener: js.Function1[/* arg1 */ StatusObject, Unit]): this.type = js.native
    
    // Added in Node 6...
    def prependListener(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    def prependListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_metadata(event: metadata, listener: js.Function1[/* arg1 */ Metadata, Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_status(event: status, listener: js.Function1[/* arg1 */ StatusObject, Unit]): this.type = js.native
    
    def prependOnceListener(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    def prependOnceListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_metadata(event: metadata, listener: js.Function1[/* arg1 */ Metadata, Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_status(event: status, listener: js.Function1[/* arg1 */ StatusObject, Unit]): this.type = js.native
    
    def rawListeners(event: String): js.Array[js.Function] = js.native
    def rawListeners(event: js.Symbol): js.Array[js.Function] = js.native
    
    def removeAllListeners(): this.type = js.native
    def removeAllListeners(event: String): this.type = js.native
    def removeAllListeners(event: js.Symbol): this.type = js.native
    
    def removeListener(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    def removeListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_metadata(event: metadata, listener: js.Function1[/* arg1 */ Metadata, Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_status(event: status, listener: js.Function1[/* arg1 */ StatusObject, Unit]): this.type = js.native
    
    def setMaxListeners(n: Double): this.type = js.native
  }
}
