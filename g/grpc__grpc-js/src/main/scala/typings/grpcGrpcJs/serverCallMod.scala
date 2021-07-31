package typings.grpcGrpcJs

import typings.grpcGrpcJs.callStreamMod.StatusObject
import typings.grpcGrpcJs.channelOptionsMod.ChannelOptions
import typings.grpcGrpcJs.constantsMod.Status
import typings.grpcGrpcJs.eventsMod.EmitterAugmentation1
import typings.grpcGrpcJs.grpcGrpcJsStrings.data
import typings.grpcGrpcJs.grpcGrpcJsStrings.drain
import typings.grpcGrpcJs.grpcGrpcJsStrings.finish
import typings.grpcGrpcJs.grpcGrpcJsStrings.pipe
import typings.grpcGrpcJs.grpcGrpcJsStrings.unpipe
import typings.grpcGrpcJs.makeClientMod.Deserialize
import typings.grpcGrpcJs.makeClientMod.Serialize
import typings.grpcGrpcJs.metadataMod.Metadata
import typings.grpcGrpcJs.objectStreamMod.ObjectReadable
import typings.grpcGrpcJs.objectStreamMod.WriteCallback
import typings.node.Buffer
import typings.node.BufferEncoding
import typings.node.NodeJS.ReadableStream
import typings.node.NodeJS.Timer
import typings.node.NodeJS.WritableStream
import typings.node.anon.Chunk
import typings.node.anon.End
import typings.node.childProcessMod.StdioNull
import typings.node.eventsMod.EventEmitter
import typings.node.eventsMod.EventEmitterOptions
import typings.node.http2Mod.IncomingHttpHeaders
import typings.node.http2Mod.ServerHttp2Stream
import typings.node.nodeStrings.close
import typings.node.nodeStrings.end
import typings.node.nodeStrings.error
import typings.node.nodeStrings.pause
import typings.node.nodeStrings.readable
import typings.node.nodeStrings.resume
import typings.node.streamMod.Duplex
import typings.node.streamMod.Readable
import typings.node.streamMod.ReadableOptions
import typings.node.streamMod.Writable
import typings.node.streamMod.WritableOptions
import typings.node.streamMod.internal
import typings.std.Error
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object serverCallMod {
  
  @JSImport("@grpc/grpc-js/build/src/server-call", "Http2ServerCallStream")
  @js.native
  class Http2ServerCallStream[RequestType, ResponseType] protected () extends EventEmitter {
    def this(stream: ServerHttp2Stream, handler: Handler[RequestType, ResponseType], options: ChannelOptions) = this()
    
    var bufferedMessages: js.Any = js.native
    
    var canPush: js.Any = js.native
    
    var cancelled: Boolean = js.native
    
    var checkCancelled: js.Any = js.native
    
    def consumeUnpushedMessages(readable: ServerDuplexStream[RequestType, ResponseType]): Boolean = js.native
    def consumeUnpushedMessages(readable: ServerReadableStream[RequestType, ResponseType]): Boolean = js.native
    
    var deadline: Timer = js.native
    
    def deserializeMessage(bytes: Buffer): RequestType = js.native
    
    def getPeer(): String = js.native
    
    var handler: js.Any = js.native
    
    var isPushPending: js.Any = js.native
    
    var maxReceiveMessageSize: js.Any = js.native
    
    var maxSendMessageSize: js.Any = js.native
    
    var messagesToPush: js.Any = js.native
    
    var metadataSent: js.Any = js.native
    
    var options: js.Any = js.native
    
    var pushMessage: js.Any = js.native
    
    var pushOrBufferMessage: js.Any = js.native
    
    def receiveMetadata(headers: IncomingHttpHeaders): js.UndefOr[Metadata] = js.native
    
    def receiveUnaryMessage(): js.Promise[RequestType] = js.native
    
    def resume(): Unit = js.native
    
    def sendError(error: ServerErrorResponse): Unit = js.native
    def sendError(error: ServerStatusResponse): Unit = js.native
    
    def sendMetadata(): Unit = js.native
    def sendMetadata(customMetadata: Metadata): Unit = js.native
    
    def sendStatus(statusObj: StatusObject): Unit = js.native
    
    def sendUnaryMessage(): js.Promise[Unit] = js.native
    def sendUnaryMessage(err: Null, value: ResponseType): js.Promise[Unit] = js.native
    def sendUnaryMessage(err: Null, value: ResponseType, metadata: Unit, flags: Double): js.Promise[Unit] = js.native
    def sendUnaryMessage(err: Null, value: ResponseType, metadata: Metadata): js.Promise[Unit] = js.native
    def sendUnaryMessage(err: Null, value: ResponseType, metadata: Metadata, flags: Double): js.Promise[Unit] = js.native
    def sendUnaryMessage(err: Null, value: Null, metadata: Unit, flags: Double): js.Promise[Unit] = js.native
    def sendUnaryMessage(err: Null, value: Null, metadata: Metadata): js.Promise[Unit] = js.native
    def sendUnaryMessage(err: Null, value: Null, metadata: Metadata, flags: Double): js.Promise[Unit] = js.native
    def sendUnaryMessage(err: ServerErrorResponse): js.Promise[Unit] = js.native
    def sendUnaryMessage(err: ServerErrorResponse, value: ResponseType): js.Promise[Unit] = js.native
    def sendUnaryMessage(err: ServerErrorResponse, value: ResponseType, metadata: Unit, flags: Double): js.Promise[Unit] = js.native
    def sendUnaryMessage(err: ServerErrorResponse, value: ResponseType, metadata: Metadata): js.Promise[Unit] = js.native
    def sendUnaryMessage(err: ServerErrorResponse, value: ResponseType, metadata: Metadata, flags: Double): js.Promise[Unit] = js.native
    def sendUnaryMessage(err: ServerErrorResponse, value: Null, metadata: Unit, flags: Double): js.Promise[Unit] = js.native
    def sendUnaryMessage(err: ServerErrorResponse, value: Null, metadata: Metadata): js.Promise[Unit] = js.native
    def sendUnaryMessage(err: ServerErrorResponse, value: Null, metadata: Metadata, flags: Double): js.Promise[Unit] = js.native
    def sendUnaryMessage(err: ServerStatusResponse): js.Promise[Unit] = js.native
    def sendUnaryMessage(err: ServerStatusResponse, value: ResponseType): js.Promise[Unit] = js.native
    def sendUnaryMessage(err: ServerStatusResponse, value: ResponseType, metadata: Unit, flags: Double): js.Promise[Unit] = js.native
    def sendUnaryMessage(err: ServerStatusResponse, value: ResponseType, metadata: Metadata): js.Promise[Unit] = js.native
    def sendUnaryMessage(err: ServerStatusResponse, value: ResponseType, metadata: Metadata, flags: Double): js.Promise[Unit] = js.native
    def sendUnaryMessage(err: ServerStatusResponse, value: Null, metadata: Unit, flags: Double): js.Promise[Unit] = js.native
    def sendUnaryMessage(err: ServerStatusResponse, value: Null, metadata: Metadata): js.Promise[Unit] = js.native
    def sendUnaryMessage(err: ServerStatusResponse, value: Null, metadata: Metadata, flags: Double): js.Promise[Unit] = js.native
    
    def serializeMessage(value: ResponseType): Buffer = js.native
    
    def setupReadable(readable: ServerDuplexStream[RequestType, ResponseType]): Unit = js.native
    def setupReadable(readable: ServerReadableStream[RequestType, ResponseType]): Unit = js.native
    
    def setupSurfaceCall(call: ServerSurfaceCall): Unit = js.native
    
    var stream: js.Any = js.native
    
    var wantTrailers: js.Any = js.native
    
    def write(chunk: Buffer): js.UndefOr[Boolean] = js.native
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.grpcGrpcJs.serverCallMod.ServerDuplexStream because var conflicts: _writev, destroyed, readable. Inlined cancelled, metadata, getPeer, sendMetadata */ @JSImport("@grpc/grpc-js/build/src/server-call", "ServerDuplexStreamImpl")
  @js.native
  class ServerDuplexStreamImpl[RequestType, ResponseType] protected () extends Duplex {
    def this(
      call: Http2ServerCallStream[RequestType, ResponseType],
      metadata: Metadata,
      serialize: Serialize[ResponseType],
      deserialize: Deserialize[RequestType]
    ) = this()
    
    var call: js.Any = js.native
    
    var cancelled: Boolean = js.native
    
    def deserialize(bytes: Buffer): RequestType = js.native
    @JSName("deserialize")
    var deserialize_Original: Deserialize[RequestType] = js.native
    
    def getPeer(): String = js.native
    
    var metadata: Metadata = js.native
    
    def sendMetadata(responseMetadata: Metadata): Unit = js.native
    
    def serialize(value: ResponseType): Buffer = js.native
    @JSName("serialize")
    var serialize_Original: Serialize[ResponseType] = js.native
    
    var trailingMetadata: js.Any = js.native
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.node.streamMod.Stream because Inheritance from two classes. Inlined 
  - typings.node.streamMod.Readable because Inheritance from two classes. Inlined destroyed, readableLength, readableEncoding, readableEnded, readableObjectMode, readableHighWaterMark, readableFlowing, _destroy, _destroy, _read, addListener_close, addListener_data, addListener_end, addListener_error, addListener_pause, addListener_readable, addListener_resume, destroy, destroy, emit_close, emit_data, emit_end, emit_error, emit_pause, emit_readable, emit_resume, on_close, on_data, on_end, on_error, on_pause, on_readable, on_resume, once_close, once_data, once_end, once_error, once_pause, once_readable, once_resume, prependListener_close, prependListener_data, prependListener_end, prependListener_error, prependListener_pause, prependListener_readable, prependListener_resume, prependOnceListener_close, prependOnceListener_data, prependOnceListener_end, prependOnceListener_error, prependOnceListener_pause, prependOnceListener_readable, prependOnceListener_resume, push, push, removeListener_close, removeListener_data, removeListener_end, removeListener_error, removeListener_pause, removeListener_readable, removeListener_resume, unshift, unshift, pipe, pipe
  - typings.grpcGrpcJs.objectStreamMod.IntermediateObjectReadable because Inheritance from two classes. Inlined 
  - typings.grpcGrpcJs.objectStreamMod.ObjectReadable because Inheritance from two classes. Inlined read, read */ @JSImport("@grpc/grpc-js/build/src/server-call", "ServerReadableStreamImpl")
  @js.native
  class ServerReadableStreamImpl[RequestType, ResponseType] protected ()
    extends ServerSurfaceCall
       with EmitterAugmentation1[data, RequestType]
       with ReadableStream
       with internal
       with StdioNull {
    def this(
      call: Http2ServerCallStream[RequestType, ResponseType],
      metadata: Metadata,
      deserialize: Deserialize[RequestType]
    ) = this()
    
    def _destroy(error: Null, callback: js.Function1[/* error */ js.UndefOr[Error | Null], Unit]): Unit = js.native
    def _destroy(error: Error, callback: js.Function1[/* error */ js.UndefOr[Error | Null], Unit]): Unit = js.native
    
    def _read(size: Double): Unit = js.native
    
    /* CompleteClass */
    override def addListener(event: data, listener: js.Function1[RequestType, Unit]): this.type = js.native
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
    def addListener_data(event: typings.node.nodeStrings.data, listener: js.Function1[/* chunk */ js.Any, Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_end(event: end, listener: js.Function0[Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_pause(event: pause, listener: js.Function0[Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_readable(event: readable, listener: js.Function0[Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_resume(event: resume, listener: js.Function0[Unit]): this.type = js.native
    
    var call: js.Any = js.native
    
    def deserialize(bytes: Buffer): RequestType = js.native
    @JSName("deserialize")
    var deserialize_Original: Deserialize[RequestType] = js.native
    
    def destroy(): Unit = js.native
    def destroy(error: Error): Unit = js.native
    
    var destroyed: Boolean = js.native
    
    /* CompleteClass */
    override def emit(event: data, arg1: RequestType): Boolean = js.native
    @JSName("emit")
    def emit_close(event: close): Boolean = js.native
    @JSName("emit")
    def emit_data(event: typings.node.nodeStrings.data, chunk: js.Any): Boolean = js.native
    @JSName("emit")
    def emit_end(event: end): Boolean = js.native
    @JSName("emit")
    def emit_error(event: error, err: Error): Boolean = js.native
    @JSName("emit")
    def emit_pause(event: pause): Boolean = js.native
    @JSName("emit")
    def emit_readable(event: readable): Boolean = js.native
    @JSName("emit")
    def emit_resume(event: resume): Boolean = js.native
    
    /* CompleteClass */
    override def on(event: data, listener: js.Function1[RequestType, Unit]): this.type = js.native
    @JSName("on")
    def on_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_data(event: typings.node.nodeStrings.data, listener: js.Function1[/* chunk */ js.Any, Unit]): this.type = js.native
    @JSName("on")
    def on_end(event: end, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
    @JSName("on")
    def on_pause(event: pause, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_readable(event: readable, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_resume(event: resume, listener: js.Function0[Unit]): this.type = js.native
    
    /* CompleteClass */
    override def once(event: data, listener: js.Function1[RequestType, Unit]): this.type = js.native
    @JSName("once")
    def once_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("once")
    def once_data(event: typings.node.nodeStrings.data, listener: js.Function1[/* chunk */ js.Any, Unit]): this.type = js.native
    @JSName("once")
    def once_end(event: end, listener: js.Function0[Unit]): this.type = js.native
    @JSName("once")
    def once_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
    @JSName("once")
    def once_pause(event: pause, listener: js.Function0[Unit]): this.type = js.native
    @JSName("once")
    def once_readable(event: readable, listener: js.Function0[Unit]): this.type = js.native
    @JSName("once")
    def once_resume(event: resume, listener: js.Function0[Unit]): this.type = js.native
    
    /* InferMemberOverrides */
    override def pipe[T /* <: WritableStream */](destination: T): T = js.native
    /* InferMemberOverrides */
    override def pipe[T /* <: WritableStream */](destination: T, options: End): T = js.native
    
    /* CompleteClass */
    override def prependListener(event: data, listener: js.Function1[RequestType, Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_data(event: typings.node.nodeStrings.data, listener: js.Function1[/* chunk */ js.Any, Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_end(event: end, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_pause(event: pause, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_readable(event: readable, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_resume(event: resume, listener: js.Function0[Unit]): this.type = js.native
    
    /* CompleteClass */
    override def prependOnceListener(event: data, listener: js.Function1[RequestType, Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_data(event: typings.node.nodeStrings.data, listener: js.Function1[/* chunk */ js.Any, Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_end(event: end, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_pause(event: pause, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_readable(event: readable, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_resume(event: resume, listener: js.Function0[Unit]): this.type = js.native
    
    def push(chunk: js.Any): Boolean = js.native
    def push(chunk: js.Any, encoding: BufferEncoding): Boolean = js.native
    
    val readableEncoding: BufferEncoding | Null = js.native
    
    val readableEnded: Boolean = js.native
    
    val readableFlowing: Boolean | Null = js.native
    
    val readableHighWaterMark: Double = js.native
    
    val readableLength: Double = js.native
    
    val readableObjectMode: Boolean = js.native
    
    /* CompleteClass */
    override def removeListener(event: data, listener: js.Function1[RequestType, Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_data(event: typings.node.nodeStrings.data, listener: js.Function1[/* chunk */ js.Any, Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_end(event: end, listener: js.Function0[Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_pause(event: pause, listener: js.Function0[Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_readable(event: readable, listener: js.Function0[Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_resume(event: resume, listener: js.Function0[Unit]): this.type = js.native
    
    def unshift(chunk: js.Any): Unit = js.native
    def unshift(chunk: js.Any, encoding: BufferEncoding): Unit = js.native
  }
  
  @JSImport("@grpc/grpc-js/build/src/server-call", "ServerUnaryCallImpl")
  @js.native
  class ServerUnaryCallImpl[RequestType, ResponseType] protected ()
    extends EventEmitter
       with ServerUnaryCall[RequestType, ResponseType] {
    def this(call: Http2ServerCallStream[RequestType, ResponseType], metadata: Metadata) = this()
    
    /* InferMemberOverrides */
    override def addListener(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    /* InferMemberOverrides */
    override def addListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    
    var call: js.Any = js.native
    
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
  - typings.grpcGrpcJs.serverCallMod.ServerWritableStream because var conflicts: _writev, destroyed, writable. Inlined cancelled, metadata, getPeer, sendMetadata, request */ @JSImport("@grpc/grpc-js/build/src/server-call", "ServerWritableStreamImpl")
  @js.native
  class ServerWritableStreamImpl[RequestType, ResponseType] protected () extends Writable {
    def this(
      call: Http2ServerCallStream[RequestType, ResponseType],
      metadata: Metadata,
      serialize: Serialize[ResponseType]
    ) = this()
    
    def _final(callback: js.Function): Unit = js.native
    
    def _write(chunk: ResponseType, encoding: String, callback: js.Function1[/* repeated */ js.Any, Unit]): Unit = js.native
    
    var call: js.Any = js.native
    
    var cancelled: Boolean = js.native
    
    def getPeer(): String = js.native
    
    var metadata: Metadata = js.native
    
    var request: Null | RequestType = js.native
    
    def sendMetadata(responseMetadata: Metadata): Unit = js.native
    
    def serialize(value: ResponseType): Buffer = js.native
    @JSName("serialize")
    var serialize_Original: Serialize[ResponseType] = js.native
    
    var trailingMetadata: js.Any = js.native
  }
  
  trait BidiStreamingHandler[RequestType, ResponseType]
    extends StObject
       with Handler[RequestType, ResponseType] {
    
    def deserialize(bytes: Buffer): RequestType
    @JSName("deserialize")
    var deserialize_Original: Deserialize[RequestType]
    
    def func(call: ServerDuplexStream[RequestType, ResponseType]): Unit
    @JSName("func")
    var func_Original: handleBidiStreamingCall[RequestType, ResponseType]
    
    var path: String
    
    def serialize(value: ResponseType): Buffer
    @JSName("serialize")
    var serialize_Original: Serialize[ResponseType]
    
    var `type`: HandlerType
  }
  object BidiStreamingHandler {
    
    @scala.inline
    def apply[RequestType, ResponseType](
      deserialize: /* bytes */ Buffer => RequestType,
      func: /* call */ ServerDuplexStream[RequestType, ResponseType] => Unit,
      path: String,
      serialize: ResponseType => Buffer,
      `type`: HandlerType
    ): BidiStreamingHandler[RequestType, ResponseType] = {
      val __obj = js.Dynamic.literal(deserialize = js.Any.fromFunction1(deserialize), func = js.Any.fromFunction1(func), path = path.asInstanceOf[js.Any], serialize = js.Any.fromFunction1(serialize))
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[BidiStreamingHandler[RequestType, ResponseType]]
    }
    
    @scala.inline
    implicit class BidiStreamingHandlerMutableBuilder[Self <: BidiStreamingHandler[?, ?], RequestType, ResponseType] (val x: Self & (BidiStreamingHandler[RequestType, ResponseType])) extends AnyVal {
      
      @scala.inline
      def setDeserialize(value: /* bytes */ Buffer => RequestType): Self = StObject.set(x, "deserialize", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFunc(value: /* call */ ServerDuplexStream[RequestType, ResponseType] => Unit): Self = StObject.set(x, "func", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSerialize(value: ResponseType => Buffer): Self = StObject.set(x, "serialize", js.Any.fromFunction1(value))
      
      @scala.inline
      def setType(value: HandlerType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait ClientStreamingHandler[RequestType, ResponseType]
    extends StObject
       with Handler[RequestType, ResponseType] {
    
    def deserialize(bytes: Buffer): RequestType
    @JSName("deserialize")
    var deserialize_Original: Deserialize[RequestType]
    
    def func(call: ServerReadableStream[RequestType, ResponseType], callback: sendUnaryData[ResponseType]): Unit
    @JSName("func")
    var func_Original: handleClientStreamingCall[RequestType, ResponseType]
    
    var path: String
    
    def serialize(value: ResponseType): Buffer
    @JSName("serialize")
    var serialize_Original: Serialize[ResponseType]
    
    var `type`: HandlerType
  }
  object ClientStreamingHandler {
    
    @scala.inline
    def apply[RequestType, ResponseType](
      deserialize: /* bytes */ Buffer => RequestType,
      func: (/* call */ ServerReadableStream[RequestType, ResponseType], /* callback */ sendUnaryData[ResponseType]) => Unit,
      path: String,
      serialize: ResponseType => Buffer,
      `type`: HandlerType
    ): ClientStreamingHandler[RequestType, ResponseType] = {
      val __obj = js.Dynamic.literal(deserialize = js.Any.fromFunction1(deserialize), func = js.Any.fromFunction2(func), path = path.asInstanceOf[js.Any], serialize = js.Any.fromFunction1(serialize))
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClientStreamingHandler[RequestType, ResponseType]]
    }
    
    @scala.inline
    implicit class ClientStreamingHandlerMutableBuilder[Self <: ClientStreamingHandler[?, ?], RequestType, ResponseType] (val x: Self & (ClientStreamingHandler[RequestType, ResponseType])) extends AnyVal {
      
      @scala.inline
      def setDeserialize(value: /* bytes */ Buffer => RequestType): Self = StObject.set(x, "deserialize", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFunc(
        value: (/* call */ ServerReadableStream[RequestType, ResponseType], /* callback */ sendUnaryData[ResponseType]) => Unit
      ): Self = StObject.set(x, "func", js.Any.fromFunction2(value))
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSerialize(value: ResponseType => Buffer): Self = StObject.set(x, "serialize", js.Any.fromFunction1(value))
      
      @scala.inline
      def setType(value: HandlerType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type HandleCall[RequestType, ResponseType] = (handleUnaryCall[RequestType, ResponseType]) | (handleClientStreamingCall[RequestType, ResponseType]) | (handleServerStreamingCall[RequestType, ResponseType]) | (handleBidiStreamingCall[RequestType, ResponseType])
  
  /* Rewritten from type alias, can be one of: 
    - typings.grpcGrpcJs.serverCallMod.UnaryHandler[RequestType, ResponseType]
    - typings.grpcGrpcJs.serverCallMod.ClientStreamingHandler[RequestType, ResponseType]
    - typings.grpcGrpcJs.serverCallMod.ServerStreamingHandler[RequestType, ResponseType]
    - typings.grpcGrpcJs.serverCallMod.BidiStreamingHandler[RequestType, ResponseType]
  */
  trait Handler[RequestType, ResponseType] extends StObject
  object Handler {
    
    @scala.inline
    def BidiStreamingHandler[RequestType, ResponseType](
      deserialize: /* bytes */ Buffer => RequestType,
      func: /* call */ ServerDuplexStream[RequestType, ResponseType] => Unit,
      path: String,
      serialize: ResponseType => Buffer,
      `type`: HandlerType
    ): typings.grpcGrpcJs.serverCallMod.BidiStreamingHandler[RequestType, ResponseType] = {
      val __obj = js.Dynamic.literal(deserialize = js.Any.fromFunction1(deserialize), func = js.Any.fromFunction1(func), path = path.asInstanceOf[js.Any], serialize = js.Any.fromFunction1(serialize))
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.grpcGrpcJs.serverCallMod.BidiStreamingHandler[RequestType, ResponseType]]
    }
    
    @scala.inline
    def ClientStreamingHandler[RequestType, ResponseType](
      deserialize: /* bytes */ Buffer => RequestType,
      func: (/* call */ ServerReadableStream[RequestType, ResponseType], /* callback */ sendUnaryData[ResponseType]) => Unit,
      path: String,
      serialize: ResponseType => Buffer,
      `type`: HandlerType
    ): typings.grpcGrpcJs.serverCallMod.ClientStreamingHandler[RequestType, ResponseType] = {
      val __obj = js.Dynamic.literal(deserialize = js.Any.fromFunction1(deserialize), func = js.Any.fromFunction2(func), path = path.asInstanceOf[js.Any], serialize = js.Any.fromFunction1(serialize))
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.grpcGrpcJs.serverCallMod.ClientStreamingHandler[RequestType, ResponseType]]
    }
    
    @scala.inline
    def ServerStreamingHandler[RequestType, ResponseType](
      deserialize: /* bytes */ Buffer => RequestType,
      func: /* call */ ServerWritableStream[RequestType, ResponseType] => Unit,
      path: String,
      serialize: ResponseType => Buffer,
      `type`: HandlerType
    ): typings.grpcGrpcJs.serverCallMod.ServerStreamingHandler[RequestType, ResponseType] = {
      val __obj = js.Dynamic.literal(deserialize = js.Any.fromFunction1(deserialize), func = js.Any.fromFunction1(func), path = path.asInstanceOf[js.Any], serialize = js.Any.fromFunction1(serialize))
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.grpcGrpcJs.serverCallMod.ServerStreamingHandler[RequestType, ResponseType]]
    }
    
    @scala.inline
    def UnaryHandler[RequestType, ResponseType](
      deserialize: /* bytes */ Buffer => RequestType,
      func: (/* call */ ServerUnaryCall[RequestType, ResponseType], /* callback */ sendUnaryData[ResponseType]) => Unit,
      path: String,
      serialize: ResponseType => Buffer,
      `type`: HandlerType
    ): typings.grpcGrpcJs.serverCallMod.UnaryHandler[RequestType, ResponseType] = {
      val __obj = js.Dynamic.literal(deserialize = js.Any.fromFunction1(deserialize), func = js.Any.fromFunction2(func), path = path.asInstanceOf[js.Any], serialize = js.Any.fromFunction1(serialize))
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.grpcGrpcJs.serverCallMod.UnaryHandler[RequestType, ResponseType]]
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.grpcGrpcJs.grpcGrpcJsStrings.bidi
    - typings.grpcGrpcJs.grpcGrpcJsStrings.clientStream
    - typings.grpcGrpcJs.grpcGrpcJsStrings.serverStream
    - typings.grpcGrpcJs.grpcGrpcJsStrings.unary
  */
  trait HandlerType extends StObject
  object HandlerType {
    
    @scala.inline
    def bidi: typings.grpcGrpcJs.grpcGrpcJsStrings.bidi = "bidi".asInstanceOf[typings.grpcGrpcJs.grpcGrpcJsStrings.bidi]
    
    @scala.inline
    def clientStream: typings.grpcGrpcJs.grpcGrpcJsStrings.clientStream = "clientStream".asInstanceOf[typings.grpcGrpcJs.grpcGrpcJsStrings.clientStream]
    
    @scala.inline
    def serverStream: typings.grpcGrpcJs.grpcGrpcJsStrings.serverStream = "serverStream".asInstanceOf[typings.grpcGrpcJs.grpcGrpcJsStrings.serverStream]
    
    @scala.inline
    def unary: typings.grpcGrpcJs.grpcGrpcJsStrings.unary = "unary".asInstanceOf[typings.grpcGrpcJs.grpcGrpcJsStrings.unary]
  }
  
  /* Inlined @grpc/grpc-js.@grpc/grpc-js/build/src/server-call.ServerSurfaceCall & @grpc/grpc-js.@grpc/grpc-js/build/src/object-stream.ObjectReadable<RequestType> & @grpc/grpc-js.@grpc/grpc-js/build/src/object-stream.ObjectWritable<ResponseType> & {end (metadata : @grpc/grpc-js.@grpc/grpc-js/build/src/metadata.Metadata | undefined): void} */
  @js.native
  trait ServerDuplexStream[RequestType, ResponseType] extends StObject {
    
    def _destroy(error: Null, callback: js.Function1[/* error */ js.UndefOr[Error | Null], Unit]): Unit = js.native
    def _destroy(error: Error, callback: js.Function1[/* error */ js.UndefOr[Error | Null], Unit]): Unit = js.native
    
    def _final(callback: js.Function1[/* error */ js.UndefOr[Error | Null], Unit]): Unit = js.native
    
    def _read(size: Double): Unit = js.native
    
    def _write(chunk: (js.Any & ResponseType) | ResponseType, encoding: String, callback: js.Function): Unit = js.native
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
      * 2. data
      * 3. end
      * 4. error
      * 5. pause
      * 6. readable
      * 7. resume
      */
    @JSName("addListener")
    def addListener_close(event: typings.grpcGrpcJs.grpcGrpcJsStrings.close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_data(event: data, listener: js.Function1[(/* chunk */ js.Any) | (/* arg1 */ RequestType), Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_drain(event: drain, listener: js.Function0[Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_end(event: typings.grpcGrpcJs.grpcGrpcJsStrings.end, listener: js.Function0[Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_error(event: typings.grpcGrpcJs.grpcGrpcJsStrings.error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_finish(event: finish, listener: js.Function0[Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_pause(event: typings.grpcGrpcJs.grpcGrpcJsStrings.pause, listener: js.Function0[Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_pipe(event: pipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_readable(event: typings.grpcGrpcJs.grpcGrpcJsStrings.readable, listener: js.Function0[Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_resume(event: typings.grpcGrpcJs.grpcGrpcJsStrings.resume, listener: js.Function0[Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_unpipe(event: unpipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
    
    var cancelled: Boolean = js.native
    
    def cork(): Unit = js.native
    
    def destroy(): Unit = js.native
    def destroy(error: Error): Unit = js.native
    
    var destroyed: Boolean = js.native
    
    def emit(event: String, args: js.Any*): Boolean = js.native
    def emit(event: js.Symbol, args: js.Any*): Boolean = js.native
    @JSName("emit")
    def emit_close(event: typings.grpcGrpcJs.grpcGrpcJsStrings.close): Boolean = js.native
    @JSName("emit")
    def emit_data(event: data, arg1: RequestType): Boolean = js.native
    @JSName("emit")
    def emit_data(event: data, chunk: js.Any): Boolean = js.native
    @JSName("emit")
    def emit_drain(event: drain): Boolean = js.native
    @JSName("emit")
    def emit_end(event: typings.grpcGrpcJs.grpcGrpcJsStrings.end): Boolean = js.native
    @JSName("emit")
    def emit_error(event: typings.grpcGrpcJs.grpcGrpcJsStrings.error, err: Error): Boolean = js.native
    @JSName("emit")
    def emit_finish(event: finish): Boolean = js.native
    @JSName("emit")
    def emit_pause(event: typings.grpcGrpcJs.grpcGrpcJsStrings.pause): Boolean = js.native
    @JSName("emit")
    def emit_pipe(event: pipe, src: Readable): Boolean = js.native
    @JSName("emit")
    def emit_readable(event: typings.grpcGrpcJs.grpcGrpcJsStrings.readable): Boolean = js.native
    @JSName("emit")
    def emit_resume(event: typings.grpcGrpcJs.grpcGrpcJsStrings.resume): Boolean = js.native
    @JSName("emit")
    def emit_unpipe(event: unpipe, src: Readable): Boolean = js.native
    
    def end(): Unit = js.native
    def end(cb: js.Function0[Unit]): Unit = js.native
    def end(chunk: (js.Any & ResponseType) | ResponseType): Unit = js.native
    def end(chunk: (js.Any & ResponseType) | ResponseType, cb: js.Function): Unit = js.native
    def end(chunk: (js.Any & ResponseType) | ResponseType, encoding: js.Any): Unit = js.native
    def end(chunk: (js.Any & ResponseType) | ResponseType, encoding: js.Any, cb: js.Function): Unit = js.native
    def end(chunk: (js.Any & ResponseType) | ResponseType, encoding: Unit, cb: js.Function): Unit = js.native
    def end(chunk: js.Any): Unit = js.native
    def end(chunk: js.Any, cb: js.Function0[Unit]): Unit = js.native
    def end(chunk: js.Any, encoding: BufferEncoding): Unit = js.native
    def end(chunk: js.Any, encoding: BufferEncoding, cb: js.Function0[Unit]): Unit = js.native
    def end(data: String): Unit = js.native
    def end(data: String, cb: js.Function0[Unit]): Unit = js.native
    def end(data: Uint8Array): Unit = js.native
    def end(data: Uint8Array, cb: js.Function0[Unit]): Unit = js.native
    def end(metadata: Metadata): Unit = js.native
    def end(str: String, encoding: Unit, cb: js.Function0[Unit]): Unit = js.native
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
    
    val metadata: Metadata = js.native
    
    def off(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    def off(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    
    def on(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    def on(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    @JSName("on")
    def on_close(event: typings.grpcGrpcJs.grpcGrpcJsStrings.close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_data(event: data, listener: js.Function1[(/* chunk */ js.Any) | (/* arg1 */ RequestType), Unit]): this.type = js.native
    @JSName("on")
    def on_drain(event: drain, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_end(event: typings.grpcGrpcJs.grpcGrpcJsStrings.end, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_error(event: typings.grpcGrpcJs.grpcGrpcJsStrings.error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
    @JSName("on")
    def on_finish(event: finish, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_pause(event: typings.grpcGrpcJs.grpcGrpcJsStrings.pause, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_pipe(event: pipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
    @JSName("on")
    def on_readable(event: typings.grpcGrpcJs.grpcGrpcJsStrings.readable, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_resume(event: typings.grpcGrpcJs.grpcGrpcJsStrings.resume, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_unpipe(event: unpipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
    
    def once(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    def once(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    @JSName("once")
    def once_close(event: typings.grpcGrpcJs.grpcGrpcJsStrings.close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("once")
    def once_data(event: data, listener: js.Function1[(/* chunk */ js.Any) | (/* arg1 */ RequestType), Unit]): this.type = js.native
    @JSName("once")
    def once_drain(event: drain, listener: js.Function0[Unit]): this.type = js.native
    @JSName("once")
    def once_end(event: typings.grpcGrpcJs.grpcGrpcJsStrings.end, listener: js.Function0[Unit]): this.type = js.native
    @JSName("once")
    def once_error(event: typings.grpcGrpcJs.grpcGrpcJsStrings.error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
    @JSName("once")
    def once_finish(event: finish, listener: js.Function0[Unit]): this.type = js.native
    @JSName("once")
    def once_pause(event: typings.grpcGrpcJs.grpcGrpcJsStrings.pause, listener: js.Function0[Unit]): this.type = js.native
    @JSName("once")
    def once_pipe(event: pipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
    @JSName("once")
    def once_readable(event: typings.grpcGrpcJs.grpcGrpcJsStrings.readable, listener: js.Function0[Unit]): this.type = js.native
    @JSName("once")
    def once_resume(event: typings.grpcGrpcJs.grpcGrpcJsStrings.resume, listener: js.Function0[Unit]): this.type = js.native
    @JSName("once")
    def once_unpipe(event: unpipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
    
    def pause(): this.type = js.native
    
    def pipe[T /* <: WritableStream */](destination: T): T = js.native
    def pipe[T /* <: WritableStream */](destination: T, options: End): T = js.native
    
    // Added in Node 6...
    def prependListener(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    def prependListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_close(event: typings.grpcGrpcJs.grpcGrpcJsStrings.close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_data(event: data, listener: js.Function1[(/* chunk */ js.Any) | (/* arg1 */ RequestType), Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_drain(event: drain, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_end(event: typings.grpcGrpcJs.grpcGrpcJsStrings.end, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_error(event: typings.grpcGrpcJs.grpcGrpcJsStrings.error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_finish(event: finish, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_pause(event: typings.grpcGrpcJs.grpcGrpcJsStrings.pause, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_pipe(event: pipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_readable(event: typings.grpcGrpcJs.grpcGrpcJsStrings.readable, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_resume(event: typings.grpcGrpcJs.grpcGrpcJsStrings.resume, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_unpipe(event: unpipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
    
    def prependOnceListener(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    def prependOnceListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_close(event: typings.grpcGrpcJs.grpcGrpcJsStrings.close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_data(event: data, listener: js.Function1[(/* chunk */ js.Any) | (/* arg1 */ RequestType), Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_drain(event: drain, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_end(event: typings.grpcGrpcJs.grpcGrpcJsStrings.end, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_error(event: typings.grpcGrpcJs.grpcGrpcJsStrings.error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_finish(event: finish, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_pause(event: typings.grpcGrpcJs.grpcGrpcJsStrings.pause, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_pipe(event: pipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_readable(event: typings.grpcGrpcJs.grpcGrpcJsStrings.readable, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_resume(event: typings.grpcGrpcJs.grpcGrpcJsStrings.resume, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_unpipe(event: unpipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
    
    def push(chunk: js.Any): Boolean = js.native
    def push(chunk: js.Any, encoding: BufferEncoding): Boolean = js.native
    
    def rawListeners(event: String): js.Array[js.Function] = js.native
    def rawListeners(event: js.Symbol): js.Array[js.Function] = js.native
    
    def read(): js.Any = js.native
    def read(size: Double): js.Any = js.native
    @JSName("read")
    def read_Intersection(): js.Any & RequestType = js.native
    @JSName("read")
    def read_Intersection(size: Double): js.Any & RequestType = js.native
    @JSName("read")
    def read_RequestType(): RequestType = js.native
    @JSName("read")
    def read_RequestType(size: Double): RequestType = js.native
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
    def removeListener_close(event: typings.grpcGrpcJs.grpcGrpcJsStrings.close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_data(event: data, listener: js.Function1[(/* chunk */ js.Any) | (/* arg1 */ RequestType), Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_drain(event: drain, listener: js.Function0[Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_end(event: typings.grpcGrpcJs.grpcGrpcJsStrings.end, listener: js.Function0[Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_error(event: typings.grpcGrpcJs.grpcGrpcJsStrings.error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_finish(event: finish, listener: js.Function0[Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_pause(event: typings.grpcGrpcJs.grpcGrpcJsStrings.pause, listener: js.Function0[Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_pipe(event: pipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_readable(event: typings.grpcGrpcJs.grpcGrpcJsStrings.readable, listener: js.Function0[Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_resume(event: typings.grpcGrpcJs.grpcGrpcJsStrings.resume, listener: js.Function0[Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_unpipe(event: unpipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
    
    def resume(): this.type = js.native
    
    def sendMetadata(responseMetadata: Metadata): Unit = js.native
    
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
    def write(chunk: ResponseType, cb: js.Function): Boolean = js.native
    def write(chunk: ResponseType, encoding: js.Any, cb: js.Function): Boolean = js.native
    def write(chunk: ResponseType, encoding: Unit, cb: js.Function): Boolean = js.native
    def write(chunk: js.Any & ResponseType, cb: WriteCallback): Boolean = js.native
    def write(chunk: js.Any & ResponseType, encoding: js.Any, cb: WriteCallback): Boolean = js.native
    def write(chunk: js.Any & ResponseType, encoding: Unit, cb: WriteCallback): Boolean = js.native
    def write(chunk: (js.Any & ResponseType) | ResponseType): Boolean = js.native
    def write(chunk: (js.Any & ResponseType) | ResponseType, encoding: js.Any): Boolean = js.native
    def write(chunk: js.Any): Boolean = js.native
    def write(chunk: js.Any, cb: js.Function1[/* error */ js.UndefOr[Error | Null], Unit]): Boolean = js.native
    def write(chunk: js.Any, encoding: BufferEncoding): Boolean = js.native
    def write(
      chunk: js.Any,
      encoding: BufferEncoding,
      cb: js.Function1[/* error */ js.UndefOr[Error | Null], Unit]
    ): Boolean = js.native
    def write(str: String, encoding: Unit, cb: js.Function1[/* err */ js.UndefOr[Error | Null], Unit]): Boolean = js.native
    def write(str: String, encoding: BufferEncoding): Boolean = js.native
    def write(str: String, encoding: BufferEncoding, cb: js.Function1[/* err */ js.UndefOr[Error | Null], Unit]): Boolean = js.native
  }
  
  /* Inlined @grpc/grpc-js.@grpc/grpc-js/build/src/server-call.ServerStatusResponse & std.Error */
  trait ServerErrorResponse extends StObject {
    
    var code: js.UndefOr[Status] = js.undefined
    
    var details: js.UndefOr[String] = js.undefined
    
    var message: String
    
    var metadata: js.UndefOr[Metadata] = js.undefined
    
    var name: String
    
    var stack: js.UndefOr[String] = js.undefined
  }
  object ServerErrorResponse {
    
    @scala.inline
    def apply(message: String, name: String): ServerErrorResponse = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[ServerErrorResponse]
    }
    
    @scala.inline
    implicit class ServerErrorResponseMutableBuilder[Self <: ServerErrorResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCode(value: Status): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
      
      @scala.inline
      def setDetails(value: String): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDetailsUndefined: Self = StObject.set(x, "details", js.undefined)
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetadata(value: Metadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStack(value: String): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStackUndefined: Self = StObject.set(x, "stack", js.undefined)
    }
  }
  
  type ServerReadableStream[RequestType, ResponseType] = ServerSurfaceCall & ObjectReadable[RequestType]
  
  /* Inlined std.Partial<@grpc/grpc-js.@grpc/grpc-js/build/src/call-stream.StatusObject> */
  trait ServerStatusResponse extends StObject {
    
    var code: js.UndefOr[Status] = js.undefined
    
    var details: js.UndefOr[String] = js.undefined
    
    var metadata: js.UndefOr[Metadata] = js.undefined
  }
  object ServerStatusResponse {
    
    @scala.inline
    def apply(): ServerStatusResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ServerStatusResponse]
    }
    
    @scala.inline
    implicit class ServerStatusResponseMutableBuilder[Self <: ServerStatusResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCode(value: Status): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
      
      @scala.inline
      def setDetails(value: String): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDetailsUndefined: Self = StObject.set(x, "details", js.undefined)
      
      @scala.inline
      def setMetadata(value: Metadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    }
  }
  
  trait ServerStreamingHandler[RequestType, ResponseType]
    extends StObject
       with Handler[RequestType, ResponseType] {
    
    def deserialize(bytes: Buffer): RequestType
    @JSName("deserialize")
    var deserialize_Original: Deserialize[RequestType]
    
    def func(call: ServerWritableStream[RequestType, ResponseType]): Unit
    @JSName("func")
    var func_Original: handleServerStreamingCall[RequestType, ResponseType]
    
    var path: String
    
    def serialize(value: ResponseType): Buffer
    @JSName("serialize")
    var serialize_Original: Serialize[ResponseType]
    
    var `type`: HandlerType
  }
  object ServerStreamingHandler {
    
    @scala.inline
    def apply[RequestType, ResponseType](
      deserialize: /* bytes */ Buffer => RequestType,
      func: /* call */ ServerWritableStream[RequestType, ResponseType] => Unit,
      path: String,
      serialize: ResponseType => Buffer,
      `type`: HandlerType
    ): ServerStreamingHandler[RequestType, ResponseType] = {
      val __obj = js.Dynamic.literal(deserialize = js.Any.fromFunction1(deserialize), func = js.Any.fromFunction1(func), path = path.asInstanceOf[js.Any], serialize = js.Any.fromFunction1(serialize))
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ServerStreamingHandler[RequestType, ResponseType]]
    }
    
    @scala.inline
    implicit class ServerStreamingHandlerMutableBuilder[Self <: ServerStreamingHandler[?, ?], RequestType, ResponseType] (val x: Self & (ServerStreamingHandler[RequestType, ResponseType])) extends AnyVal {
      
      @scala.inline
      def setDeserialize(value: /* bytes */ Buffer => RequestType): Self = StObject.set(x, "deserialize", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFunc(value: /* call */ ServerWritableStream[RequestType, ResponseType] => Unit): Self = StObject.set(x, "func", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSerialize(value: ResponseType => Buffer): Self = StObject.set(x, "serialize", js.Any.fromFunction1(value))
      
      @scala.inline
      def setType(value: HandlerType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ServerSurfaceCall extends EventEmitter {
    
    var cancelled: Boolean = js.native
    
    def getPeer(): String = js.native
    
    val metadata: Metadata = js.native
    
    def sendMetadata(responseMetadata: Metadata): Unit = js.native
  }
  
  /* Inlined @grpc/grpc-js.@grpc/grpc-js/build/src/server-call.ServerSurfaceCall & {  request :RequestType | null} */
  @js.native
  trait ServerUnaryCall[RequestType, ResponseType] extends StObject {
    
    def addListener(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    def addListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    
    var cancelled: Boolean = js.native
    
    def emit(event: String, args: js.Any*): Boolean = js.native
    def emit(event: js.Symbol, args: js.Any*): Boolean = js.native
    
    def eventNames(): js.Array[String | js.Symbol] = js.native
    
    def getMaxListeners(): Double = js.native
    
    def getPeer(): String = js.native
    
    def listenerCount(event: String): Double = js.native
    def listenerCount(event: js.Symbol): Double = js.native
    
    def listeners(event: String): js.Array[js.Function] = js.native
    def listeners(event: js.Symbol): js.Array[js.Function] = js.native
    
    val metadata: Metadata = js.native
    
    def off(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    def off(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    
    def on(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    def on(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    
    def once(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    def once(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    
    // Added in Node 6...
    def prependListener(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    def prependListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    
    def prependOnceListener(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    def prependOnceListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    
    def rawListeners(event: String): js.Array[js.Function] = js.native
    def rawListeners(event: js.Symbol): js.Array[js.Function] = js.native
    
    def removeAllListeners(): this.type = js.native
    def removeAllListeners(event: String): this.type = js.native
    def removeAllListeners(event: js.Symbol): this.type = js.native
    
    def removeListener(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    def removeListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    
    var request: RequestType | Null = js.native
    
    def sendMetadata(responseMetadata: Metadata): Unit = js.native
    
    def setMaxListeners(n: Double): this.type = js.native
  }
  
  /* Inlined @grpc/grpc-js.@grpc/grpc-js/build/src/server-call.ServerSurfaceCall & @grpc/grpc-js.@grpc/grpc-js/build/src/object-stream.ObjectWritable<ResponseType> & {  request :RequestType | null, end (metadata : @grpc/grpc-js.@grpc/grpc-js/build/src/metadata.Metadata | undefined): void} */
  @js.native
  trait ServerWritableStream[RequestType, ResponseType] extends StObject {
    
    def _destroy(error: Null, callback: js.Function1[/* error */ js.UndefOr[Error | Null], Unit]): Unit = js.native
    def _destroy(error: Error, callback: js.Function1[/* error */ js.UndefOr[Error | Null], Unit]): Unit = js.native
    
    def _final(callback: js.Function1[/* error */ js.UndefOr[Error | Null], Unit]): Unit = js.native
    
    def _write(chunk: (js.Any & ResponseType) | ResponseType, encoding: String, callback: js.Function): Unit = js.native
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
    def addListener_close(event: typings.grpcGrpcJs.grpcGrpcJsStrings.close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_drain(event: drain, listener: js.Function0[Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_error(event: typings.grpcGrpcJs.grpcGrpcJsStrings.error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_finish(event: finish, listener: js.Function0[Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_pipe(event: pipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_unpipe(event: unpipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
    
    var cancelled: Boolean = js.native
    
    def cork(): Unit = js.native
    
    def destroy(): Unit = js.native
    def destroy(error: Error): Unit = js.native
    
    var destroyed: Boolean = js.native
    
    def emit(event: String, args: js.Any*): Boolean = js.native
    def emit(event: js.Symbol, args: js.Any*): Boolean = js.native
    @JSName("emit")
    def emit_close(event: typings.grpcGrpcJs.grpcGrpcJsStrings.close): Boolean = js.native
    @JSName("emit")
    def emit_drain(event: drain): Boolean = js.native
    @JSName("emit")
    def emit_error(event: typings.grpcGrpcJs.grpcGrpcJsStrings.error, err: Error): Boolean = js.native
    @JSName("emit")
    def emit_finish(event: finish): Boolean = js.native
    @JSName("emit")
    def emit_pipe(event: pipe, src: Readable): Boolean = js.native
    @JSName("emit")
    def emit_unpipe(event: unpipe, src: Readable): Boolean = js.native
    
    def end(): Unit = js.native
    def end(cb: js.Function0[Unit]): Unit = js.native
    def end(chunk: (js.Any & ResponseType) | ResponseType): Unit = js.native
    def end(chunk: (js.Any & ResponseType) | ResponseType, cb: js.Function): Unit = js.native
    def end(chunk: (js.Any & ResponseType) | ResponseType, encoding: js.Any): Unit = js.native
    def end(chunk: (js.Any & ResponseType) | ResponseType, encoding: js.Any, cb: js.Function): Unit = js.native
    def end(chunk: (js.Any & ResponseType) | ResponseType, encoding: Unit, cb: js.Function): Unit = js.native
    def end(chunk: js.Any): Unit = js.native
    def end(chunk: js.Any, cb: js.Function0[Unit]): Unit = js.native
    def end(chunk: js.Any, encoding: BufferEncoding): Unit = js.native
    def end(chunk: js.Any, encoding: BufferEncoding, cb: js.Function0[Unit]): Unit = js.native
    def end(data: String): Unit = js.native
    def end(data: String, cb: js.Function0[Unit]): Unit = js.native
    def end(data: Uint8Array): Unit = js.native
    def end(data: Uint8Array, cb: js.Function0[Unit]): Unit = js.native
    def end(metadata: Metadata): Unit = js.native
    def end(str: String, encoding: Unit, cb: js.Function0[Unit]): Unit = js.native
    def end(str: String, encoding: BufferEncoding): Unit = js.native
    def end(str: String, encoding: BufferEncoding, cb: js.Function0[Unit]): Unit = js.native
    
    def eventNames(): js.Array[String | js.Symbol] = js.native
    
    def getMaxListeners(): Double = js.native
    
    def getPeer(): String = js.native
    
    def listenerCount(event: String): Double = js.native
    def listenerCount(event: js.Symbol): Double = js.native
    
    def listeners(event: String): js.Array[js.Function] = js.native
    def listeners(event: js.Symbol): js.Array[js.Function] = js.native
    
    val metadata: Metadata = js.native
    
    def off(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    def off(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    
    def on(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    def on(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    @JSName("on")
    def on_close(event: typings.grpcGrpcJs.grpcGrpcJsStrings.close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_drain(event: drain, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_error(event: typings.grpcGrpcJs.grpcGrpcJsStrings.error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
    @JSName("on")
    def on_finish(event: finish, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_pipe(event: pipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
    @JSName("on")
    def on_unpipe(event: unpipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
    
    def once(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    def once(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    @JSName("once")
    def once_close(event: typings.grpcGrpcJs.grpcGrpcJsStrings.close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("once")
    def once_drain(event: drain, listener: js.Function0[Unit]): this.type = js.native
    @JSName("once")
    def once_error(event: typings.grpcGrpcJs.grpcGrpcJsStrings.error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
    @JSName("once")
    def once_finish(event: finish, listener: js.Function0[Unit]): this.type = js.native
    @JSName("once")
    def once_pipe(event: pipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
    @JSName("once")
    def once_unpipe(event: unpipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
    
    def pipe[T /* <: WritableStream */](destination: T): T = js.native
    def pipe[T /* <: WritableStream */](destination: T, options: End): T = js.native
    
    // Added in Node 6...
    def prependListener(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    def prependListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_close(event: typings.grpcGrpcJs.grpcGrpcJsStrings.close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_drain(event: drain, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_error(event: typings.grpcGrpcJs.grpcGrpcJsStrings.error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_finish(event: finish, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_pipe(event: pipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_unpipe(event: unpipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
    
    def prependOnceListener(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    def prependOnceListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_close(event: typings.grpcGrpcJs.grpcGrpcJsStrings.close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_drain(event: drain, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_error(event: typings.grpcGrpcJs.grpcGrpcJsStrings.error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_finish(event: finish, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_pipe(event: pipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
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
    def removeListener_close(event: typings.grpcGrpcJs.grpcGrpcJsStrings.close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_drain(event: drain, listener: js.Function0[Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_error(event: typings.grpcGrpcJs.grpcGrpcJsStrings.error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_finish(event: finish, listener: js.Function0[Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_pipe(event: pipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_unpipe(event: unpipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
    
    var request: RequestType | Null = js.native
    
    def sendMetadata(responseMetadata: Metadata): Unit = js.native
    
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
    def write(chunk: ResponseType, cb: js.Function): Boolean = js.native
    def write(chunk: ResponseType, encoding: js.Any, cb: js.Function): Boolean = js.native
    def write(chunk: ResponseType, encoding: Unit, cb: js.Function): Boolean = js.native
    def write(chunk: js.Any & ResponseType, cb: WriteCallback): Boolean = js.native
    def write(chunk: js.Any & ResponseType, encoding: js.Any, cb: WriteCallback): Boolean = js.native
    def write(chunk: js.Any & ResponseType, encoding: Unit, cb: WriteCallback): Boolean = js.native
    def write(chunk: (js.Any & ResponseType) | ResponseType): Boolean = js.native
    def write(chunk: (js.Any & ResponseType) | ResponseType, encoding: js.Any): Boolean = js.native
    def write(chunk: js.Any): Boolean = js.native
    def write(chunk: js.Any, cb: js.Function1[/* error */ js.UndefOr[Error | Null], Unit]): Boolean = js.native
    def write(chunk: js.Any, encoding: BufferEncoding): Boolean = js.native
    def write(
      chunk: js.Any,
      encoding: BufferEncoding,
      cb: js.Function1[/* error */ js.UndefOr[Error | Null], Unit]
    ): Boolean = js.native
    def write(str: String, encoding: Unit, cb: js.Function1[/* err */ js.UndefOr[Error | Null], Unit]): Boolean = js.native
    def write(str: String, encoding: BufferEncoding): Boolean = js.native
    def write(str: String, encoding: BufferEncoding, cb: js.Function1[/* err */ js.UndefOr[Error | Null], Unit]): Boolean = js.native
  }
  
  trait UnaryHandler[RequestType, ResponseType]
    extends StObject
       with Handler[RequestType, ResponseType] {
    
    def deserialize(bytes: Buffer): RequestType
    @JSName("deserialize")
    var deserialize_Original: Deserialize[RequestType]
    
    def func(call: ServerUnaryCall[RequestType, ResponseType], callback: sendUnaryData[ResponseType]): Unit
    @JSName("func")
    var func_Original: handleUnaryCall[RequestType, ResponseType]
    
    var path: String
    
    def serialize(value: ResponseType): Buffer
    @JSName("serialize")
    var serialize_Original: Serialize[ResponseType]
    
    var `type`: HandlerType
  }
  object UnaryHandler {
    
    @scala.inline
    def apply[RequestType, ResponseType](
      deserialize: /* bytes */ Buffer => RequestType,
      func: (/* call */ ServerUnaryCall[RequestType, ResponseType], /* callback */ sendUnaryData[ResponseType]) => Unit,
      path: String,
      serialize: ResponseType => Buffer,
      `type`: HandlerType
    ): UnaryHandler[RequestType, ResponseType] = {
      val __obj = js.Dynamic.literal(deserialize = js.Any.fromFunction1(deserialize), func = js.Any.fromFunction2(func), path = path.asInstanceOf[js.Any], serialize = js.Any.fromFunction1(serialize))
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[UnaryHandler[RequestType, ResponseType]]
    }
    
    @scala.inline
    implicit class UnaryHandlerMutableBuilder[Self <: UnaryHandler[?, ?], RequestType, ResponseType] (val x: Self & (UnaryHandler[RequestType, ResponseType])) extends AnyVal {
      
      @scala.inline
      def setDeserialize(value: /* bytes */ Buffer => RequestType): Self = StObject.set(x, "deserialize", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFunc(
        value: (/* call */ ServerUnaryCall[RequestType, ResponseType], /* callback */ sendUnaryData[ResponseType]) => Unit
      ): Self = StObject.set(x, "func", js.Any.fromFunction2(value))
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSerialize(value: ResponseType => Buffer): Self = StObject.set(x, "serialize", js.Any.fromFunction1(value))
      
      @scala.inline
      def setType(value: HandlerType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type handleBidiStreamingCall[RequestType, ResponseType] = js.Function1[/* call */ ServerDuplexStream[RequestType, ResponseType], Unit]
  
  type handleClientStreamingCall[RequestType, ResponseType] = js.Function2[
    /* call */ ServerReadableStream[RequestType, ResponseType], 
    /* callback */ sendUnaryData[ResponseType], 
    Unit
  ]
  
  type handleServerStreamingCall[RequestType, ResponseType] = js.Function1[/* call */ ServerWritableStream[RequestType, ResponseType], Unit]
  
  type handleUnaryCall[RequestType, ResponseType] = js.Function2[
    /* call */ ServerUnaryCall[RequestType, ResponseType], 
    /* callback */ sendUnaryData[ResponseType], 
    Unit
  ]
  
  type sendUnaryData[ResponseType] = js.Function4[
    /* error */ ServerErrorResponse | ServerStatusResponse | Null, 
    /* value */ ResponseType | Null, 
    /* trailer */ js.UndefOr[Metadata], 
    /* flags */ js.UndefOr[Double], 
    Unit
  ]
}
