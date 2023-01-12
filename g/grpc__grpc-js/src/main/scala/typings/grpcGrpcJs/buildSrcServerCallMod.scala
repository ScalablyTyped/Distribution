package typings.grpcGrpcJs

import typings.grpcGrpcJs.anon.End
import typings.grpcGrpcJs.anon.PartialServerStatusRespon
import typings.grpcGrpcJs.anon.Request
import typings.grpcGrpcJs.anon.`0`
import typings.grpcGrpcJs.buildSrcCallStreamMod.Deadline
import typings.grpcGrpcJs.buildSrcCallStreamMod.PartialStatusObject
import typings.grpcGrpcJs.buildSrcChannelOptionsMod.ChannelOptions
import typings.grpcGrpcJs.buildSrcConstantsMod.Status
import typings.grpcGrpcJs.buildSrcEventsMod.EmitterAugmentation1
import typings.grpcGrpcJs.buildSrcMakeClientMod.Deserialize
import typings.grpcGrpcJs.buildSrcMakeClientMod.Serialize
import typings.grpcGrpcJs.buildSrcMetadataMod.Metadata
import typings.grpcGrpcJs.buildSrcObjectStreamMod.ObjectReadable
import typings.grpcGrpcJs.buildSrcObjectStreamMod.ObjectWritable
import typings.grpcGrpcJs.grpcGrpcJsStrings.data
import typings.node.NodeJS.ReadableStream
import typings.node.NodeJS.WritableStream
import typings.node.anon.Chunk
import typings.node.bufferMod.global.Buffer
import typings.node.bufferMod.global.BufferEncoding
import typings.node.eventsMod.EventEmitter
import typings.node.http2Mod.IncomingHttpHeaders
import typings.node.http2Mod.ServerHttp2Stream
import typings.node.nodeStrings.close
import typings.node.nodeStrings.drain
import typings.node.nodeStrings.end
import typings.node.nodeStrings.error
import typings.node.nodeStrings.finish
import typings.node.nodeStrings.pause
import typings.node.nodeStrings.pipe
import typings.node.nodeStrings.readable
import typings.node.nodeStrings.resume
import typings.node.nodeStrings.unpipe
import typings.node.streamMod.Duplex
import typings.node.streamMod.Readable
import typings.node.timersMod.global.NodeJS.Timer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcServerCallMod {
  
  @JSImport("@grpc/grpc-js/build/src/server-call", "Http2ServerCallStream")
  @js.native
  open class Http2ServerCallStream[RequestType, ResponseType] protected () extends EventEmitter {
    def this(stream: ServerHttp2Stream, handler: Handler[RequestType, ResponseType], options: ChannelOptions) = this()
    
    /* private */ var bufferedMessages: Any = js.native
    
    /* private */ var canPush: Any = js.native
    
    var cancelled: Boolean = js.native
    
    /* private */ var checkCancelled: Any = js.native
    
    def consumeUnpushedMessages(readable: ServerDuplexStream[RequestType, ResponseType]): Boolean = js.native
    def consumeUnpushedMessages(readable: ServerReadableStream[RequestType, ResponseType]): Boolean = js.native
    
    /* private */ var deadline: Any = js.native
    
    var deadlineTimer: Timer | Null = js.native
    
    def deserializeMessage(bytes: Buffer): RequestType = js.native
    
    def getDeadline(): Deadline = js.native
    
    /* private */ var getDecompressedMessage: Any = js.native
    
    def getPath(): String = js.native
    
    def getPeer(): String = js.native
    
    /* private */ var handler: Any = js.native
    
    /* private */ var isPushPending: Any = js.native
    
    /* private */ var maxReceiveMessageSize: Any = js.native
    
    /* private */ var maxSendMessageSize: Any = js.native
    
    /* private */ var messagesToPush: Any = js.native
    
    /* private */ var metadataSent: Any = js.native
    
    /* private */ var options: Any = js.native
    
    /* private */ var pushMessage: Any = js.native
    
    /* private */ var pushOrBufferMessage: Any = js.native
    
    def receiveMetadata(headers: IncomingHttpHeaders): Metadata = js.native
    
    def receiveUnaryMessage(
      encoding: String,
      next: js.Function2[
          /* err */ PartialServerStatusRespon | Null, 
          /* request */ js.UndefOr[RequestType], 
          Unit
        ]
    ): Unit = js.native
    
    def resume(): Unit = js.native
    
    /* private */ var safeDeserializeMessage: Any = js.native
    
    def sendError(error: ServerErrorResponse): Unit = js.native
    def sendError(error: ServerStatusResponse): Unit = js.native
    
    def sendMetadata(): Unit = js.native
    def sendMetadata(customMetadata: Metadata): Unit = js.native
    
    def sendStatus(statusObj: PartialStatusObject): Unit = js.native
    
    def sendUnaryMessage(
      err: ServerErrorResponse | ServerStatusResponse | Null,
      value: js.UndefOr[ResponseType | Null],
      metadata: js.UndefOr[Metadata | Null],
      flags: js.UndefOr[Double]
    ): js.Promise[Unit] = js.native
    
    def serializeMessage(value: ResponseType): Buffer = js.native
    
    def setupReadable(readable: ServerDuplexStream[RequestType, ResponseType], encoding: String): Unit = js.native
    def setupReadable(readable: ServerReadableStream[RequestType, ResponseType], encoding: String): Unit = js.native
    
    def setupSurfaceCall(call: ServerSurfaceCall): Unit = js.native
    
    /* private */ var statusSent: Any = js.native
    
    /* private */ var stream: Any = js.native
    
    /* private */ var wantTrailers: Any = js.native
    
    def write(chunk: Buffer): js.UndefOr[Boolean] = js.native
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.node.NodeJS.WritableStream because var conflicts: writable. Inlined 
  - typings.node.streamMod.Writable because Inheritance from two classes. Inlined _final, addListener_drain, addListener_finish, addListener_pipe, addListener_unpipe, cork, emit_drain, emit_finish, emit_pipe, emit_unpipe, on_drain, on_finish, on_pipe, on_unpipe, once_drain, once_finish, once_pipe, once_unpipe, prependListener_drain, prependListener_finish, prependListener_pipe, prependListener_unpipe, prependOnceListener_drain, prependOnceListener_finish, prependOnceListener_pipe, prependOnceListener_unpipe, removeListener_drain, removeListener_finish, removeListener_pipe, removeListener_unpipe, uncork
  - typings.node.streamMod.Readable because Inheritance from two classes. Inlined destroyed, readableDidRead, readableAborted, _construct, readableLength, readableEncoding, readableEnded, readableObjectMode, readableHighWaterMark, readableFlowing, _destroy, _destroy, _read, addListener_close, addListener_data, addListener_end, addListener_error, addListener_pause, addListener_readable, addListener_resume, destroy, destroy, emit_close, emit_data, emit_end, emit_error, emit_pause, emit_readable, emit_resume, on_close, on_data, on_end, on_error, on_pause, on_readable, on_resume, once_close, once_data, once_end, once_error, once_pause, once_readable, once_resume, prependListener_close, prependListener_data, prependListener_end, prependListener_error, prependListener_pause, prependListener_readable, prependListener_resume, prependOnceListener_close, prependOnceListener_data, prependOnceListener_end, prependOnceListener_error, prependOnceListener_pause, prependOnceListener_readable, prependOnceListener_resume, push, push, removeListener_close, removeListener_data, removeListener_end, removeListener_error, removeListener_pause, removeListener_readable, removeListener_resume, unshift, unshift
  - typings.grpcGrpcJs.buildSrcObjectStreamMod.IntermediateObjectWritable because Inheritance from two classes. Inlined 
  - typings.grpcGrpcJs.buildSrcObjectStreamMod.IntermediateObjectReadable because Inheritance from two classes. Inlined 
  - typings.node.eventsMod.EventEmitter because Inheritance from two classes. Inlined 
  - typings.grpcGrpcJs.buildSrcObjectStreamMod.ObjectWritable because Inheritance from two classes. Inlined _write, write, write, write, write, write, setDefaultEncoding, end, end, end, end, end, end
  - typings.grpcGrpcJs.buildSrcObjectStreamMod.ObjectReadable because Inheritance from two classes. Inlined read, read
  - typings.grpcGrpcJs.buildSrcServerCallMod.ServerSurfaceCall because Inheritance from two classes. Inlined cancelled, metadata, getPeer, sendMetadata, getDeadline, getPath */ @JSImport("@grpc/grpc-js/build/src/server-call", "ServerDuplexStreamImpl")
  @js.native
  open class ServerDuplexStreamImpl[RequestType, ResponseType] protected ()
    extends Duplex
       with `0`
       with EmitterAugmentation1[data, RequestType]
       with typings.node.eventsMod.global.NodeJS.EventEmitter
       with ReadableStream {
    def this(
      call: Http2ServerCallStream[RequestType, ResponseType],
      metadata: Metadata,
      serialize: Serialize[ResponseType],
      deserialize: Deserialize[RequestType],
      encoding: String
    ) = this()
    
    var _construct: js.UndefOr[
        js.Function1[/* callback */ js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit], Unit]
      ] = js.native
    
    def _read(size: Double): Unit = js.native
    
    def _write(chunk: ResponseType, encoding: String, callback: js.Function): Unit = js.native
    
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
    def addListener_data(event: typings.node.nodeStrings.data, listener: js.Function1[/* chunk */ Any, Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_drain(event: drain, listener: js.Function0[Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_end(event: end, listener: js.Function0[Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_finish(event: finish, listener: js.Function0[Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_pause(event: pause, listener: js.Function0[Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_pipe(event: pipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_readable(event: readable, listener: js.Function0[Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_resume(event: resume, listener: js.Function0[Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_unpipe(event: unpipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
    
    /* private */ var call: Any = js.native
    
    var cancelled: Boolean = js.native
    
    def deserialize(bytes: Buffer): RequestType = js.native
    @JSName("deserialize")
    var deserialize_Original: Deserialize[RequestType] = js.native
    
    /**
      * Destroy the stream. Optionally emit an `'error'` event, and emit a `'close'`event (unless `emitClose` is set to `false`). After this call, the readable
      * stream will release any internal resources and subsequent calls to `push()`will be ignored.
      *
      * Once `destroy()` has been called any further calls will be a no-op and no
      * further errors except from `_destroy()` may be emitted as `'error'`.
      *
      * Implementors should not override this method, but instead implement `readable._destroy()`.
      * @since v8.0.0
      * @param error Error which will be passed as payload in `'error'` event
      */
    def destroy(): this.type = js.native
    def destroy(error: js.Error): this.type = js.native
    
    /**
      * Is `true` after `readable.destroy()` has been called.
      * @since v8.0.0
      */
    var destroyed: Boolean = js.native
    
    /* CompleteClass */
    override def emit(event: data, arg1: RequestType): Boolean = js.native
    @JSName("emit")
    def emit_close(event: close): Boolean = js.native
    @JSName("emit")
    def emit_data(event: typings.node.nodeStrings.data, chunk: Any): Boolean = js.native
    @JSName("emit")
    def emit_drain(event: drain): Boolean = js.native
    @JSName("emit")
    def emit_end(event: end): Boolean = js.native
    @JSName("emit")
    def emit_error(event: error, err: js.Error): Boolean = js.native
    @JSName("emit")
    def emit_finish(event: finish): Boolean = js.native
    @JSName("emit")
    def emit_pause(event: pause): Boolean = js.native
    @JSName("emit")
    def emit_pipe(event: pipe, src: Readable): Boolean = js.native
    @JSName("emit")
    def emit_readable(event: readable): Boolean = js.native
    @JSName("emit")
    def emit_resume(event: resume): Boolean = js.native
    @JSName("emit")
    def emit_unpipe(event: unpipe, src: Readable): Boolean = js.native
    
    /* InferMemberOverrides */
    override def end(): this.type & Unit = js.native
    def end(chunk: ResponseType, cb: js.Function): /* import warning: importer.ImportType#apply Failed type conversion: std.ReturnType<{None (): this, None (cb : (): void): this, None (chunk : any): this, None (chunk : any, cb : (): void): this, None (chunk : any, encoding : node.buffer.<global>.BufferEncoding): this, None (chunk : any, encoding : node.buffer.<global>.BufferEncoding, cb : (): void): this, None (data : string): this, None (data : std.Uint8Array): this, None (data : string, cb : (): void): this, None (data : std.Uint8Array, cb : (): void): this, None (str : string, encoding : node.buffer.<global>.BufferEncoding): this, None (str : string, encoding : node.buffer.<global>.BufferEncoding, cb : (): void): this, None (str : string, encoding : undefined, cb : (): void): this}> extends node.stream.Writable ? this : void */ js.Any = js.native
    def end(chunk: ResponseType, encoding: Any): /* import warning: importer.ImportType#apply Failed type conversion: std.ReturnType<{None (): this, None (cb : (): void): this, None (chunk : any): this, None (chunk : any, cb : (): void): this, None (chunk : any, encoding : node.buffer.<global>.BufferEncoding): this, None (chunk : any, encoding : node.buffer.<global>.BufferEncoding, cb : (): void): this, None (data : string): this, None (data : std.Uint8Array): this, None (data : string, cb : (): void): this, None (data : std.Uint8Array, cb : (): void): this, None (str : string, encoding : node.buffer.<global>.BufferEncoding): this, None (str : string, encoding : node.buffer.<global>.BufferEncoding, cb : (): void): this, None (str : string, encoding : undefined, cb : (): void): this}> extends node.stream.Writable ? this : void */ js.Any = js.native
    def end(chunk: ResponseType, encoding: Any, cb: js.Function): /* import warning: importer.ImportType#apply Failed type conversion: std.ReturnType<{None (): this, None (cb : (): void): this, None (chunk : any): this, None (chunk : any, cb : (): void): this, None (chunk : any, encoding : node.buffer.<global>.BufferEncoding): this, None (chunk : any, encoding : node.buffer.<global>.BufferEncoding, cb : (): void): this, None (data : string): this, None (data : std.Uint8Array): this, None (data : string, cb : (): void): this, None (data : std.Uint8Array, cb : (): void): this, None (str : string, encoding : node.buffer.<global>.BufferEncoding): this, None (str : string, encoding : node.buffer.<global>.BufferEncoding, cb : (): void): this, None (str : string, encoding : undefined, cb : (): void): this}> extends node.stream.Writable ? this : void */ js.Any = js.native
    def end(chunk: ResponseType, encoding: Unit, cb: js.Function): /* import warning: importer.ImportType#apply Failed type conversion: std.ReturnType<{None (): this, None (cb : (): void): this, None (chunk : any): this, None (chunk : any, cb : (): void): this, None (chunk : any, encoding : node.buffer.<global>.BufferEncoding): this, None (chunk : any, encoding : node.buffer.<global>.BufferEncoding, cb : (): void): this, None (data : string): this, None (data : std.Uint8Array): this, None (data : string, cb : (): void): this, None (data : std.Uint8Array, cb : (): void): this, None (str : string, encoding : node.buffer.<global>.BufferEncoding): this, None (str : string, encoding : node.buffer.<global>.BufferEncoding, cb : (): void): this, None (str : string, encoding : undefined, cb : (): void): this}> extends node.stream.Writable ? this : void */ js.Any = js.native
    @JSName("end")
    def end_This(): this.type = js.native
    @JSName("end")
    def end_This(metadata: Any): this.type = js.native
    
    def getDeadline(): Deadline = js.native
    
    def getPath(): String = js.native
    
    def getPeer(): String = js.native
    
    var metadata: Metadata = js.native
    
    /* CompleteClass */
    override def on(event: data, listener: js.Function1[RequestType, Unit]): this.type = js.native
    @JSName("on")
    def on_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_data(event: typings.node.nodeStrings.data, listener: js.Function1[/* chunk */ Any, Unit]): this.type = js.native
    @JSName("on")
    def on_drain(event: drain, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_end(event: end, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
    @JSName("on")
    def on_finish(event: finish, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_pause(event: pause, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_pipe(event: pipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
    @JSName("on")
    def on_readable(event: readable, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_resume(event: resume, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_unpipe(event: unpipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
    
    /* CompleteClass */
    override def once(event: data, listener: js.Function1[RequestType, Unit]): this.type = js.native
    @JSName("once")
    def once_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("once")
    def once_data(event: typings.node.nodeStrings.data, listener: js.Function1[/* chunk */ Any, Unit]): this.type = js.native
    @JSName("once")
    def once_drain(event: drain, listener: js.Function0[Unit]): this.type = js.native
    @JSName("once")
    def once_end(event: end, listener: js.Function0[Unit]): this.type = js.native
    @JSName("once")
    def once_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
    @JSName("once")
    def once_finish(event: finish, listener: js.Function0[Unit]): this.type = js.native
    @JSName("once")
    def once_pause(event: pause, listener: js.Function0[Unit]): this.type = js.native
    @JSName("once")
    def once_pipe(event: pipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
    @JSName("once")
    def once_readable(event: readable, listener: js.Function0[Unit]): this.type = js.native
    @JSName("once")
    def once_resume(event: resume, listener: js.Function0[Unit]): this.type = js.native
    @JSName("once")
    def once_unpipe(event: unpipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
    
    /* CompleteClass */
    override def prependListener(event: data, listener: js.Function1[RequestType, Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_data(event: typings.node.nodeStrings.data, listener: js.Function1[/* chunk */ Any, Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_drain(event: drain, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_end(event: end, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_finish(event: finish, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_pause(event: pause, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_pipe(event: pipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_readable(event: readable, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_resume(event: resume, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_unpipe(event: unpipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
    
    /* CompleteClass */
    override def prependOnceListener(event: data, listener: js.Function1[RequestType, Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_data(event: typings.node.nodeStrings.data, listener: js.Function1[/* chunk */ Any, Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_drain(event: drain, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_end(event: end, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_finish(event: finish, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_pause(event: pause, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_pipe(event: pipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_readable(event: readable, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_resume(event: resume, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_unpipe(event: unpipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
    
    def push(chunk: Any): Boolean = js.native
    def push(chunk: Any, encoding: BufferEncoding): Boolean = js.native
    
    /**
      * Returns whether the stream was destroyed or errored before emitting `'end'`.
      * @since v16.8.0
      * @experimental
      */
    val readableAborted: Boolean = js.native
    
    /**
      * Returns whether `'data'` has been emitted.
      * @since v16.7.0, v14.18.0
      * @experimental
      */
    val readableDidRead: Boolean = js.native
    
    /**
      * Getter for the property `encoding` of a given `Readable` stream. The `encoding`property can be set using the `readable.setEncoding()` method.
      * @since v12.7.0
      */
    val readableEncoding: BufferEncoding | Null = js.native
    
    /**
      * Becomes `true` when `'end'` event is emitted.
      * @since v12.9.0
      */
    val readableEnded: Boolean = js.native
    
    /**
      * This property reflects the current state of a `Readable` stream as described
      * in the `Three states` section.
      * @since v9.4.0
      */
    val readableFlowing: Boolean | Null = js.native
    
    /**
      * Returns the value of `highWaterMark` passed when creating this `Readable`.
      * @since v9.3.0
      */
    val readableHighWaterMark: Double = js.native
    
    /**
      * This property contains the number of bytes (or objects) in the queue
      * ready to be read. The value provides introspection data regarding
      * the status of the `highWaterMark`.
      * @since v9.4.0
      */
    val readableLength: Double = js.native
    
    /**
      * Getter for the property `objectMode` of a given `Readable` stream.
      * @since v12.3.0
      */
    val readableObjectMode: Boolean = js.native
    
    /* CompleteClass */
    override def removeListener(event: data, listener: js.Function1[RequestType, Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_data(event: typings.node.nodeStrings.data, listener: js.Function1[/* chunk */ Any, Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_drain(event: drain, listener: js.Function0[Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_end(event: end, listener: js.Function0[Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_finish(event: finish, listener: js.Function0[Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_pause(event: pause, listener: js.Function0[Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_pipe(event: pipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_readable(event: readable, listener: js.Function0[Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_resume(event: resume, listener: js.Function0[Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_unpipe(event: unpipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
    
    def sendMetadata(responseMetadata: Metadata): Unit = js.native
    
    def serialize(value: ResponseType): Buffer = js.native
    @JSName("serialize")
    var serialize_Original: Serialize[ResponseType] = js.native
    
    def setDefaultEncoding(encoding: String): this.type = js.native
    
    /* private */ var trailingMetadata: Any = js.native
    
    /**
      * Passing `chunk` as `null` signals the end of the stream (EOF) and behaves the
      * same as `readable.push(null)`, after which no more data can be written. The EOF
      * signal is put at the end of the buffer and any buffered data will still be
      * flushed.
      *
      * The `readable.unshift()` method pushes a chunk of data back into the internal
      * buffer. This is useful in certain situations where a stream is being consumed by
      * code that needs to "un-consume" some amount of data that it has optimistically
      * pulled out of the source, so that the data can be passed on to some other party.
      *
      * The `stream.unshift(chunk)` method cannot be called after the `'end'` event
      * has been emitted or a runtime error will be thrown.
      *
      * Developers using `stream.unshift()` often should consider switching to
      * use of a `Transform` stream instead. See the `API for stream implementers` section for more information.
      *
      * ```js
      * // Pull off a header delimited by \n\n.
      * // Use unshift() if we get too much.
      * // Call the callback with (error, header, stream).
      * const { StringDecoder } = require('string_decoder');
      * function parseHeader(stream, callback) {
      *   stream.on('error', callback);
      *   stream.on('readable', onReadable);
      *   const decoder = new StringDecoder('utf8');
      *   let header = '';
      *   function onReadable() {
      *     let chunk;
      *     while (null !== (chunk = stream.read())) {
      *       const str = decoder.write(chunk);
      *       if (str.includes('\n\n')) {
      *         // Found the header boundary.
      *         const split = str.split(/\n\n/);
      *         header += split.shift();
      *         const remaining = split.join('\n\n');
      *         const buf = Buffer.from(remaining, 'utf8');
      *         stream.removeListener('error', callback);
      *         // Remove the 'readable' listener before unshifting.
      *         stream.removeListener('readable', onReadable);
      *         if (buf.length)
      *           stream.unshift(buf);
      *         // Now the body of the message can be read from the stream.
      *         callback(null, header, stream);
      *         return;
      *       }
      *       // Still reading the header.
      *       header += str;
      *     }
      *   }
      * }
      * ```
      *
      * Unlike {@link push}, `stream.unshift(chunk)` will not
      * end the reading process by resetting the internal reading state of the stream.
      * This can cause unexpected results if `readable.unshift()` is called during a
      * read (i.e. from within a {@link _read} implementation on a
      * custom stream). Following the call to `readable.unshift()` with an immediate {@link push} will reset the reading state appropriately,
      * however it is best to simply avoid calling `readable.unshift()` while in the
      * process of performing a read.
      * @since v0.9.11
      * @param chunk Chunk of data to unshift onto the read queue. For streams not operating in object mode, `chunk` must be a string, `Buffer`, `Uint8Array` or `null`. For object mode
      * streams, `chunk` may be any JavaScript value.
      * @param encoding Encoding of string chunks. Must be a valid `Buffer` encoding, such as `'utf8'` or `'ascii'`.
      */
    def unshift(chunk: Any): Unit = js.native
    def unshift(chunk: Any, encoding: BufferEncoding): Unit = js.native
    
    def write(chunk: ResponseType, cb: js.Function): Boolean = js.native
    def write(chunk: ResponseType, encoding: Any): Boolean = js.native
    def write(chunk: ResponseType, encoding: Any, cb: js.Function): Boolean = js.native
    def write(chunk: ResponseType, encoding: Unit, cb: js.Function): Boolean = js.native
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.node.streamMod.Readable because Inheritance from two classes. Inlined destroyed, readableDidRead, readableAborted, _construct, errored, readableLength, readableEncoding, readableEnded, closed, readableObjectMode, readableHighWaterMark, readableFlowing, _destroy, _destroy, _read, addListener_close, addListener_data, addListener_end, addListener_error, addListener_pause, addListener_readable, addListener_resume, destroy, destroy, emit_close, emit_data, emit_end, emit_error, emit_pause, emit_readable, emit_resume, on_close, on_data, on_end, on_error, on_pause, on_readable, on_resume, once_close, once_data, once_end, once_error, once_pause, once_readable, once_resume, prependListener_close, prependListener_data, prependListener_end, prependListener_error, prependListener_pause, prependListener_readable, prependListener_resume, prependOnceListener_close, prependOnceListener_data, prependOnceListener_end, prependOnceListener_error, prependOnceListener_pause, prependOnceListener_readable, prependOnceListener_resume, push, push, removeListener_close, removeListener_data, removeListener_end, removeListener_error, removeListener_pause, removeListener_readable, removeListener_resume, unshift, unshift
  - typings.grpcGrpcJs.buildSrcObjectStreamMod.IntermediateObjectReadable because Inheritance from two classes. Inlined 
  - typings.grpcGrpcJs.buildSrcObjectStreamMod.ObjectReadable because Inheritance from two classes. Inlined read, read */ @JSImport("@grpc/grpc-js/build/src/server-call", "ServerReadableStreamImpl")
  @js.native
  open class ServerReadableStreamImpl[RequestType, ResponseType] protected ()
    extends ServerSurfaceCall
       with EmitterAugmentation1[data, RequestType]
       with ReadableStream {
    def this(
      call: Http2ServerCallStream[RequestType, ResponseType],
      metadata: Metadata,
      deserialize: Deserialize[RequestType],
      encoding: String
    ) = this()
    
    var _construct: js.UndefOr[
        js.Function1[/* callback */ js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit], Unit]
      ] = js.native
    
    def _destroy(error: js.Error, callback: js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit]): Unit = js.native
    def _destroy(error: Null, callback: js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit]): Unit = js.native
    
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
    def addListener_data(event: typings.node.nodeStrings.data, listener: js.Function1[/* chunk */ Any, Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_end(event: end, listener: js.Function0[Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_pause(event: pause, listener: js.Function0[Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_readable(event: readable, listener: js.Function0[Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_resume(event: resume, listener: js.Function0[Unit]): this.type = js.native
    
    /* private */ var call: Any = js.native
    
    /**
      * Is true after 'close' has been emitted.
      * @since v18.0.0
      */
    val closed: Boolean = js.native
    
    def deserialize(bytes: Buffer): RequestType = js.native
    @JSName("deserialize")
    var deserialize_Original: Deserialize[RequestType] = js.native
    
    /**
      * Destroy the stream. Optionally emit an `'error'` event, and emit a `'close'`event (unless `emitClose` is set to `false`). After this call, the readable
      * stream will release any internal resources and subsequent calls to `push()`will be ignored.
      *
      * Once `destroy()` has been called any further calls will be a no-op and no
      * further errors except from `_destroy()` may be emitted as `'error'`.
      *
      * Implementors should not override this method, but instead implement `readable._destroy()`.
      * @since v8.0.0
      * @param error Error which will be passed as payload in `'error'` event
      */
    def destroy(): this.type = js.native
    def destroy(error: js.Error): this.type = js.native
    
    /**
      * Is `true` after `readable.destroy()` has been called.
      * @since v8.0.0
      */
    var destroyed: Boolean = js.native
    
    /* CompleteClass */
    override def emit(event: data, arg1: RequestType): Boolean = js.native
    @JSName("emit")
    def emit_close(event: close): Boolean = js.native
    @JSName("emit")
    def emit_data(event: typings.node.nodeStrings.data, chunk: Any): Boolean = js.native
    @JSName("emit")
    def emit_end(event: end): Boolean = js.native
    @JSName("emit")
    def emit_error(event: error, err: js.Error): Boolean = js.native
    @JSName("emit")
    def emit_pause(event: pause): Boolean = js.native
    @JSName("emit")
    def emit_readable(event: readable): Boolean = js.native
    @JSName("emit")
    def emit_resume(event: resume): Boolean = js.native
    
    /**
      * Returns error if the stream has been destroyed with an error.
      * @since v18.0.0
      */
    val errored: js.Error | Null = js.native
    
    /* CompleteClass */
    override def on(event: data, listener: js.Function1[RequestType, Unit]): this.type = js.native
    @JSName("on")
    def on_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_data(event: typings.node.nodeStrings.data, listener: js.Function1[/* chunk */ Any, Unit]): this.type = js.native
    @JSName("on")
    def on_end(event: end, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
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
    def once_data(event: typings.node.nodeStrings.data, listener: js.Function1[/* chunk */ Any, Unit]): this.type = js.native
    @JSName("once")
    def once_end(event: end, listener: js.Function0[Unit]): this.type = js.native
    @JSName("once")
    def once_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
    @JSName("once")
    def once_pause(event: pause, listener: js.Function0[Unit]): this.type = js.native
    @JSName("once")
    def once_readable(event: readable, listener: js.Function0[Unit]): this.type = js.native
    @JSName("once")
    def once_resume(event: resume, listener: js.Function0[Unit]): this.type = js.native
    
    /* CompleteClass */
    override def prependListener(event: data, listener: js.Function1[RequestType, Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_data(event: typings.node.nodeStrings.data, listener: js.Function1[/* chunk */ Any, Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_end(event: end, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
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
    def prependOnceListener_data(event: typings.node.nodeStrings.data, listener: js.Function1[/* chunk */ Any, Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_end(event: end, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_pause(event: pause, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_readable(event: readable, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_resume(event: resume, listener: js.Function0[Unit]): this.type = js.native
    
    def push(chunk: Any): Boolean = js.native
    def push(chunk: Any, encoding: BufferEncoding): Boolean = js.native
    
    /**
      * Returns whether the stream was destroyed or errored before emitting `'end'`.
      * @since v16.8.0
      * @experimental
      */
    val readableAborted: Boolean = js.native
    
    /**
      * Returns whether `'data'` has been emitted.
      * @since v16.7.0, v14.18.0
      * @experimental
      */
    val readableDidRead: Boolean = js.native
    
    /**
      * Getter for the property `encoding` of a given `Readable` stream. The `encoding`property can be set using the `readable.setEncoding()` method.
      * @since v12.7.0
      */
    val readableEncoding: BufferEncoding | Null = js.native
    
    /**
      * Becomes `true` when `'end'` event is emitted.
      * @since v12.9.0
      */
    val readableEnded: Boolean = js.native
    
    /**
      * This property reflects the current state of a `Readable` stream as described
      * in the `Three states` section.
      * @since v9.4.0
      */
    val readableFlowing: Boolean | Null = js.native
    
    /**
      * Returns the value of `highWaterMark` passed when creating this `Readable`.
      * @since v9.3.0
      */
    val readableHighWaterMark: Double = js.native
    
    /**
      * This property contains the number of bytes (or objects) in the queue
      * ready to be read. The value provides introspection data regarding
      * the status of the `highWaterMark`.
      * @since v9.4.0
      */
    val readableLength: Double = js.native
    
    /**
      * Getter for the property `objectMode` of a given `Readable` stream.
      * @since v12.3.0
      */
    val readableObjectMode: Boolean = js.native
    
    /* CompleteClass */
    override def removeListener(event: data, listener: js.Function1[RequestType, Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_data(event: typings.node.nodeStrings.data, listener: js.Function1[/* chunk */ Any, Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_end(event: end, listener: js.Function0[Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_pause(event: pause, listener: js.Function0[Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_readable(event: readable, listener: js.Function0[Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_resume(event: resume, listener: js.Function0[Unit]): this.type = js.native
    
    /**
      * Passing `chunk` as `null` signals the end of the stream (EOF) and behaves the
      * same as `readable.push(null)`, after which no more data can be written. The EOF
      * signal is put at the end of the buffer and any buffered data will still be
      * flushed.
      *
      * The `readable.unshift()` method pushes a chunk of data back into the internal
      * buffer. This is useful in certain situations where a stream is being consumed by
      * code that needs to "un-consume" some amount of data that it has optimistically
      * pulled out of the source, so that the data can be passed on to some other party.
      *
      * The `stream.unshift(chunk)` method cannot be called after the `'end'` event
      * has been emitted or a runtime error will be thrown.
      *
      * Developers using `stream.unshift()` often should consider switching to
      * use of a `Transform` stream instead. See the `API for stream implementers` section for more information.
      *
      * ```js
      * // Pull off a header delimited by \n\n.
      * // Use unshift() if we get too much.
      * // Call the callback with (error, header, stream).
      * const { StringDecoder } = require('string_decoder');
      * function parseHeader(stream, callback) {
      *   stream.on('error', callback);
      *   stream.on('readable', onReadable);
      *   const decoder = new StringDecoder('utf8');
      *   let header = '';
      *   function onReadable() {
      *     let chunk;
      *     while (null !== (chunk = stream.read())) {
      *       const str = decoder.write(chunk);
      *       if (str.includes('\n\n')) {
      *         // Found the header boundary.
      *         const split = str.split(/\n\n/);
      *         header += split.shift();
      *         const remaining = split.join('\n\n');
      *         const buf = Buffer.from(remaining, 'utf8');
      *         stream.removeListener('error', callback);
      *         // Remove the 'readable' listener before unshifting.
      *         stream.removeListener('readable', onReadable);
      *         if (buf.length)
      *           stream.unshift(buf);
      *         // Now the body of the message can be read from the stream.
      *         callback(null, header, stream);
      *         return;
      *       }
      *       // Still reading the header.
      *       header += str;
      *     }
      *   }
      * }
      * ```
      *
      * Unlike {@link push}, `stream.unshift(chunk)` will not
      * end the reading process by resetting the internal reading state of the stream.
      * This can cause unexpected results if `readable.unshift()` is called during a
      * read (i.e. from within a {@link _read} implementation on a
      * custom stream). Following the call to `readable.unshift()` with an immediate {@link push} will reset the reading state appropriately,
      * however it is best to simply avoid calling `readable.unshift()` while in the
      * process of performing a read.
      * @since v0.9.11
      * @param chunk Chunk of data to unshift onto the read queue. For streams not operating in object mode, `chunk` must be a string, `Buffer`, `Uint8Array` or `null`. For object mode
      * streams, `chunk` may be any JavaScript value.
      * @param encoding Encoding of string chunks. Must be a valid `Buffer` encoding, such as `'utf8'` or `'ascii'`.
      */
    def unshift(chunk: Any): Unit = js.native
    def unshift(chunk: Any, encoding: BufferEncoding): Unit = js.native
  }
  
  @JSImport("@grpc/grpc-js/build/src/server-call", "ServerUnaryCallImpl")
  @js.native
  open class ServerUnaryCallImpl[RequestType, ResponseType] protected ()
    extends ServerSurfaceCall
       with Request[RequestType] {
    def this(call: Http2ServerCallStream[RequestType, ResponseType], metadata: Metadata, request: RequestType) = this()
    
    /* private */ var call: Any = js.native
    
    /* CompleteClass */
    var request: RequestType = js.native
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.node.streamMod.Writable because Inheritance from two classes. Inlined destroyed, writableObjectMode, writableHighWaterMark, _writev, _construct, errored, writableLength, writableCorked, closed, writableEnded, writableNeedDrain, writableFinished, _destroy, _destroy, _final, addListener_close, addListener_drain, addListener_error, addListener_finish, addListener_pipe, addListener_unpipe, cork, destroy, destroy, emit_close, emit_drain, emit_error, emit_finish, emit_pipe, emit_unpipe, on_close, on_drain, on_error, on_finish, on_pipe, on_unpipe, once_close, once_drain, once_error, once_finish, once_pipe, once_unpipe, prependListener_close, prependListener_drain, prependListener_error, prependListener_finish, prependListener_pipe, prependListener_unpipe, prependOnceListener_close, prependOnceListener_drain, prependOnceListener_error, prependOnceListener_finish, prependOnceListener_pipe, prependOnceListener_unpipe, removeListener_close, removeListener_drain, removeListener_error, removeListener_finish, removeListener_pipe, removeListener_unpipe, uncork
  - typings.grpcGrpcJs.buildSrcObjectStreamMod.IntermediateObjectWritable because Inheritance from two classes. Inlined 
  - typings.grpcGrpcJs.buildSrcObjectStreamMod.ObjectWritable because Inheritance from two classes. Inlined _write, write, write, write, write, write, setDefaultEncoding, end, end, end, end, end, end */ @JSImport("@grpc/grpc-js/build/src/server-call", "ServerWritableStreamImpl")
  @js.native
  open class ServerWritableStreamImpl[RequestType, ResponseType] protected ()
    extends ServerSurfaceCall
       with End[RequestType]
       with WritableStream {
    def this(
      call: Http2ServerCallStream[RequestType, ResponseType],
      metadata: Metadata,
      serialize: Serialize[ResponseType],
      request: RequestType
    ) = this()
    
    var _construct: js.UndefOr[
        js.Function1[/* callback */ js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit], Unit]
      ] = js.native
    
    def _destroy(error: js.Error, callback: js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit]): Unit = js.native
    def _destroy(error: Null, callback: js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit]): Unit = js.native
    
    def _final(callback: js.Function): Unit = js.native
    def _final(callback: js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit]): Unit = js.native
    
    def _write(chunk: ResponseType, encoding: String, callback: js.Function): Unit = js.native
    def _write(chunk: ResponseType, encoding: String, callback: js.Function1[/* repeated */ Any, Unit]): Unit = js.native
    
    var _writev: js.UndefOr[
        js.Function2[
          /* chunks */ js.Array[Chunk], 
          /* callback */ js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit], 
          Unit
        ]
      ] = js.native
    
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
    def addListener_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_finish(event: finish, listener: js.Function0[Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_pipe(event: pipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_unpipe(event: unpipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
    
    /* private */ var call: Any = js.native
    
    /**
      * Is true after 'close' has been emitted.
      * @since v18.0.0
      */
    val closed: Boolean = js.native
    
    /**
      * The `writable.cork()` method forces all written data to be buffered in memory.
      * The buffered data will be flushed when either the {@link uncork} or {@link end} methods are called.
      *
      * The primary intent of `writable.cork()` is to accommodate a situation in which
      * several small chunks are written to the stream in rapid succession. Instead of
      * immediately forwarding them to the underlying destination, `writable.cork()`buffers all the chunks until `writable.uncork()` is called, which will pass them
      * all to `writable._writev()`, if present. This prevents a head-of-line blocking
      * situation where data is being buffered while waiting for the first small chunk
      * to be processed. However, use of `writable.cork()` without implementing`writable._writev()` may have an adverse effect on throughput.
      *
      * See also: `writable.uncork()`, `writable._writev()`.
      * @since v0.11.2
      */
    def cork(): Unit = js.native
    
    /**
      * Destroy the stream. Optionally emit an `'error'` event, and emit a `'close'`event (unless `emitClose` is set to `false`). After this call, the writable
      * stream has ended and subsequent calls to `write()` or `end()` will result in
      * an `ERR_STREAM_DESTROYED` error.
      * This is a destructive and immediate way to destroy a stream. Previous calls to`write()` may not have drained, and may trigger an `ERR_STREAM_DESTROYED` error.
      * Use `end()` instead of destroy if data should flush before close, or wait for
      * the `'drain'` event before destroying the stream.
      *
      * Once `destroy()` has been called any further calls will be a no-op and no
      * further errors except from `_destroy()` may be emitted as `'error'`.
      *
      * Implementors should not override this method,
      * but instead implement `writable._destroy()`.
      * @since v8.0.0
      * @param error Optional, an error to emit with `'error'` event.
      */
    def destroy(): this.type = js.native
    def destroy(error: js.Error): this.type = js.native
    
    /**
      * Is `true` after `writable.destroy()` has been called.
      * @since v8.0.0
      */
    var destroyed: Boolean = js.native
    
    @JSName("emit")
    def emit_close(event: close): Boolean = js.native
    @JSName("emit")
    def emit_drain(event: drain): Boolean = js.native
    @JSName("emit")
    def emit_error(event: error, err: js.Error): Boolean = js.native
    @JSName("emit")
    def emit_finish(event: finish): Boolean = js.native
    @JSName("emit")
    def emit_pipe(event: pipe, src: Readable): Boolean = js.native
    @JSName("emit")
    def emit_unpipe(event: unpipe, src: Readable): Boolean = js.native
    
    /* InferMemberOverrides */
    override def end(): Unit & this.type = js.native
    def end(chunk: ResponseType): /* import warning: importer.ImportType#apply Failed type conversion: std.ReturnType<{None (): this, None (cb : (): void): this, None (chunk : any): this, None (chunk : any, cb : (): void): this, None (chunk : any, encoding : node.buffer.<global>.BufferEncoding): this, None (chunk : any, encoding : node.buffer.<global>.BufferEncoding, cb : (): void): this, None (data : string): this, None (data : std.Uint8Array): this, None (data : string, cb : (): void): this, None (data : std.Uint8Array, cb : (): void): this, None (str : string, encoding : node.buffer.<global>.BufferEncoding): this, None (str : string, encoding : node.buffer.<global>.BufferEncoding, cb : (): void): this, None (str : string, encoding : undefined, cb : (): void): this}> extends node.stream.Writable ? this : void */ js.Any = js.native
    def end(chunk: ResponseType, cb: js.Function): /* import warning: importer.ImportType#apply Failed type conversion: std.ReturnType<{None (): this, None (cb : (): void): this, None (chunk : any): this, None (chunk : any, cb : (): void): this, None (chunk : any, encoding : node.buffer.<global>.BufferEncoding): this, None (chunk : any, encoding : node.buffer.<global>.BufferEncoding, cb : (): void): this, None (data : string): this, None (data : std.Uint8Array): this, None (data : string, cb : (): void): this, None (data : std.Uint8Array, cb : (): void): this, None (str : string, encoding : node.buffer.<global>.BufferEncoding): this, None (str : string, encoding : node.buffer.<global>.BufferEncoding, cb : (): void): this, None (str : string, encoding : undefined, cb : (): void): this}> extends node.stream.Writable ? this : void */ js.Any = js.native
    def end(chunk: ResponseType, encoding: Any): /* import warning: importer.ImportType#apply Failed type conversion: std.ReturnType<{None (): this, None (cb : (): void): this, None (chunk : any): this, None (chunk : any, cb : (): void): this, None (chunk : any, encoding : node.buffer.<global>.BufferEncoding): this, None (chunk : any, encoding : node.buffer.<global>.BufferEncoding, cb : (): void): this, None (data : string): this, None (data : std.Uint8Array): this, None (data : string, cb : (): void): this, None (data : std.Uint8Array, cb : (): void): this, None (str : string, encoding : node.buffer.<global>.BufferEncoding): this, None (str : string, encoding : node.buffer.<global>.BufferEncoding, cb : (): void): this, None (str : string, encoding : undefined, cb : (): void): this}> extends node.stream.Writable ? this : void */ js.Any = js.native
    def end(chunk: ResponseType, encoding: Any, cb: js.Function): /* import warning: importer.ImportType#apply Failed type conversion: std.ReturnType<{None (): this, None (cb : (): void): this, None (chunk : any): this, None (chunk : any, cb : (): void): this, None (chunk : any, encoding : node.buffer.<global>.BufferEncoding): this, None (chunk : any, encoding : node.buffer.<global>.BufferEncoding, cb : (): void): this, None (data : string): this, None (data : std.Uint8Array): this, None (data : string, cb : (): void): this, None (data : std.Uint8Array, cb : (): void): this, None (str : string, encoding : node.buffer.<global>.BufferEncoding): this, None (str : string, encoding : node.buffer.<global>.BufferEncoding, cb : (): void): this, None (str : string, encoding : undefined, cb : (): void): this}> extends node.stream.Writable ? this : void */ js.Any = js.native
    def end(chunk: ResponseType, encoding: Unit, cb: js.Function): /* import warning: importer.ImportType#apply Failed type conversion: std.ReturnType<{None (): this, None (cb : (): void): this, None (chunk : any): this, None (chunk : any, cb : (): void): this, None (chunk : any, encoding : node.buffer.<global>.BufferEncoding): this, None (chunk : any, encoding : node.buffer.<global>.BufferEncoding, cb : (): void): this, None (data : string): this, None (data : std.Uint8Array): this, None (data : string, cb : (): void): this, None (data : std.Uint8Array, cb : (): void): this, None (str : string, encoding : node.buffer.<global>.BufferEncoding): this, None (str : string, encoding : node.buffer.<global>.BufferEncoding, cb : (): void): this, None (str : string, encoding : undefined, cb : (): void): this}> extends node.stream.Writable ? this : void */ js.Any = js.native
    @JSName("end")
    def end_This(): this.type = js.native
    @JSName("end")
    def end_This(metadata: Any): this.type = js.native
    
    /**
      * Returns error if the stream has been destroyed with an error.
      * @since v18.0.0
      */
    val errored: js.Error | Null = js.native
    
    @JSName("on")
    def on_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_drain(event: drain, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
    @JSName("on")
    def on_finish(event: finish, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_pipe(event: pipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
    @JSName("on")
    def on_unpipe(event: unpipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
    
    @JSName("once")
    def once_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("once")
    def once_drain(event: drain, listener: js.Function0[Unit]): this.type = js.native
    @JSName("once")
    def once_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
    @JSName("once")
    def once_finish(event: finish, listener: js.Function0[Unit]): this.type = js.native
    @JSName("once")
    def once_pipe(event: pipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
    @JSName("once")
    def once_unpipe(event: unpipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
    
    @JSName("prependListener")
    def prependListener_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_drain(event: drain, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_finish(event: finish, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_pipe(event: pipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_unpipe(event: unpipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
    
    @JSName("prependOnceListener")
    def prependOnceListener_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_drain(event: drain, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_finish(event: finish, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_pipe(event: pipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_unpipe(event: unpipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
    
    @JSName("removeListener")
    def removeListener_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_drain(event: drain, listener: js.Function0[Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_finish(event: finish, listener: js.Function0[Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_pipe(event: pipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_unpipe(event: unpipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
    
    def serialize(value: ResponseType): Buffer = js.native
    @JSName("serialize")
    var serialize_Original: Serialize[ResponseType] = js.native
    
    def setDefaultEncoding(encoding: String): this.type = js.native
    
    /* private */ var trailingMetadata: Any = js.native
    
    /**
      * The `writable.uncork()` method flushes all data buffered since {@link cork} was called.
      *
      * When using `writable.cork()` and `writable.uncork()` to manage the buffering
      * of writes to a stream, defer calls to `writable.uncork()` using`process.nextTick()`. Doing so allows batching of all`writable.write()` calls that occur within a given Node.js event
      * loop phase.
      *
      * ```js
      * stream.cork();
      * stream.write('some ');
      * stream.write('data ');
      * process.nextTick(() => stream.uncork());
      * ```
      *
      * If the `writable.cork()` method is called multiple times on a stream, the
      * same number of calls to `writable.uncork()` must be called to flush the buffered
      * data.
      *
      * ```js
      * stream.cork();
      * stream.write('some ');
      * stream.cork();
      * stream.write('data ');
      * process.nextTick(() => {
      *   stream.uncork();
      *   // The data will not be flushed until uncork() is called a second time.
      *   stream.uncork();
      * });
      * ```
      *
      * See also: `writable.cork()`.
      * @since v0.11.2
      */
    def uncork(): Unit = js.native
    
    /**
      * Number of times `writable.uncork()` needs to be
      * called in order to fully uncork the stream.
      * @since v13.2.0, v12.16.0
      */
    val writableCorked: Double = js.native
    
    /**
      * Is `true` after `writable.end()` has been called. This property
      * does not indicate whether the data has been flushed, for this use `writable.writableFinished` instead.
      * @since v12.9.0
      */
    val writableEnded: Boolean = js.native
    
    /**
      * Is set to `true` immediately before the `'finish'` event is emitted.
      * @since v12.6.0
      */
    val writableFinished: Boolean = js.native
    
    /**
      * Return the value of `highWaterMark` passed when creating this `Writable`.
      * @since v9.3.0
      */
    val writableHighWaterMark: Double = js.native
    
    /**
      * This property contains the number of bytes (or objects) in the queue
      * ready to be written. The value provides introspection data regarding
      * the status of the `highWaterMark`.
      * @since v9.4.0
      */
    val writableLength: Double = js.native
    
    /**
      * Is `true` if the stream's buffer has been full and stream will emit 'drain'.
      * @since v15.2.0, v14.17.0
      */
    val writableNeedDrain: Boolean = js.native
    
    /**
      * Getter for the property `objectMode` of a given `Writable` stream.
      * @since v12.3.0
      */
    val writableObjectMode: Boolean = js.native
    
    def write(chunk: ResponseType): Boolean = js.native
    def write(chunk: ResponseType, cb: js.Function): Boolean = js.native
    def write(chunk: ResponseType, encoding: Any): Boolean = js.native
    def write(chunk: ResponseType, encoding: Any, cb: js.Function): Boolean = js.native
    def write(chunk: ResponseType, encoding: Unit, cb: js.Function): Boolean = js.native
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
    
    inline def apply[RequestType, ResponseType](
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
    implicit open class MutableBuilder[Self <: BidiStreamingHandler[?, ?], RequestType, ResponseType] (val x: Self & (BidiStreamingHandler[RequestType, ResponseType])) extends AnyVal {
      
      inline def setDeserialize(value: /* bytes */ Buffer => RequestType): Self = StObject.set(x, "deserialize", js.Any.fromFunction1(value))
      
      inline def setFunc(value: /* call */ ServerDuplexStream[RequestType, ResponseType] => Unit): Self = StObject.set(x, "func", js.Any.fromFunction1(value))
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setSerialize(value: ResponseType => Buffer): Self = StObject.set(x, "serialize", js.Any.fromFunction1(value))
      
      inline def setType(value: HandlerType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
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
    
    inline def apply[RequestType, ResponseType](
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
    implicit open class MutableBuilder[Self <: ClientStreamingHandler[?, ?], RequestType, ResponseType] (val x: Self & (ClientStreamingHandler[RequestType, ResponseType])) extends AnyVal {
      
      inline def setDeserialize(value: /* bytes */ Buffer => RequestType): Self = StObject.set(x, "deserialize", js.Any.fromFunction1(value))
      
      inline def setFunc(
        value: (/* call */ ServerReadableStream[RequestType, ResponseType], /* callback */ sendUnaryData[ResponseType]) => Unit
      ): Self = StObject.set(x, "func", js.Any.fromFunction2(value))
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setSerialize(value: ResponseType => Buffer): Self = StObject.set(x, "serialize", js.Any.fromFunction1(value))
      
      inline def setType(value: HandlerType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type HandleCall[RequestType, ResponseType] = (handleUnaryCall[RequestType, ResponseType]) | (handleClientStreamingCall[RequestType, ResponseType]) | (handleServerStreamingCall[RequestType, ResponseType]) | (handleBidiStreamingCall[RequestType, ResponseType])
  
  /* Rewritten from type alias, can be one of: 
    - typings.grpcGrpcJs.buildSrcServerCallMod.UnaryHandler[RequestType, ResponseType]
    - typings.grpcGrpcJs.buildSrcServerCallMod.ClientStreamingHandler[RequestType, ResponseType]
    - typings.grpcGrpcJs.buildSrcServerCallMod.ServerStreamingHandler[RequestType, ResponseType]
    - typings.grpcGrpcJs.buildSrcServerCallMod.BidiStreamingHandler[RequestType, ResponseType]
  */
  trait Handler[RequestType, ResponseType] extends StObject
  object Handler {
    
    inline def BidiStreamingHandler[RequestType, ResponseType](
      deserialize: /* bytes */ Buffer => RequestType,
      func: /* call */ ServerDuplexStream[RequestType, ResponseType] => Unit,
      path: String,
      serialize: ResponseType => Buffer,
      `type`: HandlerType
    ): typings.grpcGrpcJs.buildSrcServerCallMod.BidiStreamingHandler[RequestType, ResponseType] = {
      val __obj = js.Dynamic.literal(deserialize = js.Any.fromFunction1(deserialize), func = js.Any.fromFunction1(func), path = path.asInstanceOf[js.Any], serialize = js.Any.fromFunction1(serialize))
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.grpcGrpcJs.buildSrcServerCallMod.BidiStreamingHandler[RequestType, ResponseType]]
    }
    
    inline def ClientStreamingHandler[RequestType, ResponseType](
      deserialize: /* bytes */ Buffer => RequestType,
      func: (/* call */ ServerReadableStream[RequestType, ResponseType], /* callback */ sendUnaryData[ResponseType]) => Unit,
      path: String,
      serialize: ResponseType => Buffer,
      `type`: HandlerType
    ): typings.grpcGrpcJs.buildSrcServerCallMod.ClientStreamingHandler[RequestType, ResponseType] = {
      val __obj = js.Dynamic.literal(deserialize = js.Any.fromFunction1(deserialize), func = js.Any.fromFunction2(func), path = path.asInstanceOf[js.Any], serialize = js.Any.fromFunction1(serialize))
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.grpcGrpcJs.buildSrcServerCallMod.ClientStreamingHandler[RequestType, ResponseType]]
    }
    
    inline def ServerStreamingHandler[RequestType, ResponseType](
      deserialize: /* bytes */ Buffer => RequestType,
      func: /* call */ ServerWritableStream[RequestType, ResponseType] => Unit,
      path: String,
      serialize: ResponseType => Buffer,
      `type`: HandlerType
    ): typings.grpcGrpcJs.buildSrcServerCallMod.ServerStreamingHandler[RequestType, ResponseType] = {
      val __obj = js.Dynamic.literal(deserialize = js.Any.fromFunction1(deserialize), func = js.Any.fromFunction1(func), path = path.asInstanceOf[js.Any], serialize = js.Any.fromFunction1(serialize))
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.grpcGrpcJs.buildSrcServerCallMod.ServerStreamingHandler[RequestType, ResponseType]]
    }
    
    inline def UnaryHandler[RequestType, ResponseType](
      deserialize: /* bytes */ Buffer => RequestType,
      func: (/* call */ ServerUnaryCall[RequestType, ResponseType], /* callback */ sendUnaryData[ResponseType]) => Unit,
      path: String,
      serialize: ResponseType => Buffer,
      `type`: HandlerType
    ): typings.grpcGrpcJs.buildSrcServerCallMod.UnaryHandler[RequestType, ResponseType] = {
      val __obj = js.Dynamic.literal(deserialize = js.Any.fromFunction1(deserialize), func = js.Any.fromFunction2(func), path = path.asInstanceOf[js.Any], serialize = js.Any.fromFunction1(serialize))
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.grpcGrpcJs.buildSrcServerCallMod.UnaryHandler[RequestType, ResponseType]]
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
    
    inline def bidi: typings.grpcGrpcJs.grpcGrpcJsStrings.bidi = "bidi".asInstanceOf[typings.grpcGrpcJs.grpcGrpcJsStrings.bidi]
    
    inline def clientStream: typings.grpcGrpcJs.grpcGrpcJsStrings.clientStream = "clientStream".asInstanceOf[typings.grpcGrpcJs.grpcGrpcJsStrings.clientStream]
    
    inline def serverStream: typings.grpcGrpcJs.grpcGrpcJsStrings.serverStream = "serverStream".asInstanceOf[typings.grpcGrpcJs.grpcGrpcJsStrings.serverStream]
    
    inline def unary: typings.grpcGrpcJs.grpcGrpcJsStrings.unary = "unary".asInstanceOf[typings.grpcGrpcJs.grpcGrpcJsStrings.unary]
  }
  
  type ServerDuplexStream[RequestType, ResponseType] = ServerSurfaceCall & ObjectReadable[RequestType] & ObjectWritable[ResponseType] & `0`
  
  /* Inlined @grpc/grpc-js.@grpc/grpc-js/build/src/server-call.ServerStatusResponse & std.Error */
  trait ServerErrorResponse extends StObject {
    
    /* standard es2022.error */
    var cause: js.UndefOr[Any] = js.undefined
    
    var code: js.UndefOr[Status] = js.undefined
    
    var details: js.UndefOr[String] = js.undefined
    
    /* standard es5 */
    var message: String
    
    var metadata: js.UndefOr[Metadata] = js.undefined
    
    /* standard es5 */
    var name: String
    
    /* standard es5 */
    var stack: js.UndefOr[String] = js.undefined
  }
  object ServerErrorResponse {
    
    inline def apply(message: String, name: String): ServerErrorResponse = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[ServerErrorResponse]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ServerErrorResponse] (val x: Self) extends AnyVal {
      
      inline def setCause(value: Any): Self = StObject.set(x, "cause", value.asInstanceOf[js.Any])
      
      inline def setCauseUndefined: Self = StObject.set(x, "cause", js.undefined)
      
      inline def setCode(value: Status): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
      
      inline def setDetails(value: String): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
      
      inline def setDetailsUndefined: Self = StObject.set(x, "details", js.undefined)
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMetadata(value: Metadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setStack(value: String): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
      
      inline def setStackUndefined: Self = StObject.set(x, "stack", js.undefined)
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
    
    inline def apply(): ServerStatusResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ServerStatusResponse]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ServerStatusResponse] (val x: Self) extends AnyVal {
      
      inline def setCode(value: Status): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
      
      inline def setDetails(value: String): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
      
      inline def setDetailsUndefined: Self = StObject.set(x, "details", js.undefined)
      
      inline def setMetadata(value: Metadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
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
    
    inline def apply[RequestType, ResponseType](
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
    implicit open class MutableBuilder[Self <: ServerStreamingHandler[?, ?], RequestType, ResponseType] (val x: Self & (ServerStreamingHandler[RequestType, ResponseType])) extends AnyVal {
      
      inline def setDeserialize(value: /* bytes */ Buffer => RequestType): Self = StObject.set(x, "deserialize", js.Any.fromFunction1(value))
      
      inline def setFunc(value: /* call */ ServerWritableStream[RequestType, ResponseType] => Unit): Self = StObject.set(x, "func", js.Any.fromFunction1(value))
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setSerialize(value: ResponseType => Buffer): Self = StObject.set(x, "serialize", js.Any.fromFunction1(value))
      
      inline def setType(value: HandlerType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ServerSurfaceCall extends EventEmitter {
    
    var cancelled: Boolean = js.native
    
    def getDeadline(): Deadline = js.native
    
    def getPath(): String = js.native
    
    def getPeer(): String = js.native
    
    val metadata: Metadata = js.native
    
    def sendMetadata(responseMetadata: Metadata): Unit = js.native
  }
  
  type ServerUnaryCall[RequestType, ResponseType] = ServerSurfaceCall & Request[RequestType]
  
  type ServerWritableStream[RequestType, ResponseType] = ServerSurfaceCall & ObjectWritable[ResponseType] & End[RequestType]
  
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
    
    inline def apply[RequestType, ResponseType](
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
    implicit open class MutableBuilder[Self <: UnaryHandler[?, ?], RequestType, ResponseType] (val x: Self & (UnaryHandler[RequestType, ResponseType])) extends AnyVal {
      
      inline def setDeserialize(value: /* bytes */ Buffer => RequestType): Self = StObject.set(x, "deserialize", js.Any.fromFunction1(value))
      
      inline def setFunc(
        value: (/* call */ ServerUnaryCall[RequestType, ResponseType], /* callback */ sendUnaryData[ResponseType]) => Unit
      ): Self = StObject.set(x, "func", js.Any.fromFunction2(value))
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setSerialize(value: ResponseType => Buffer): Self = StObject.set(x, "serialize", js.Any.fromFunction1(value))
      
      inline def setType(value: HandlerType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
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
    /* value */ js.UndefOr[ResponseType | Null], 
    /* trailer */ js.UndefOr[Metadata], 
    /* flags */ js.UndefOr[Double], 
    Unit
  ]
}
