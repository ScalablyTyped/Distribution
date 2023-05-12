package typings.grpcGrpcJs

import typings.grpcGrpcJs.anon.Deserialize
import typings.grpcGrpcJs.anon.Serialize
import typings.grpcGrpcJs.buildSrcCallInterfaceMod.StatusObject
import typings.grpcGrpcJs.buildSrcClientInterceptorsMod.InterceptingCallInterface
import typings.grpcGrpcJs.buildSrcConstantsMod.Status
import typings.grpcGrpcJs.buildSrcEventsMod.EmitterAugmentation1
import typings.grpcGrpcJs.buildSrcMetadataMod.Metadata
import typings.grpcGrpcJs.buildSrcObjectStreamMod.ObjectReadable
import typings.grpcGrpcJs.buildSrcObjectStreamMod.ObjectWritable
import typings.grpcGrpcJs.buildSrcObjectStreamMod.WriteCallback
import typings.grpcGrpcJs.grpcGrpcJsStrings.metadata
import typings.grpcGrpcJs.grpcGrpcJsStrings.status
import typings.node.NodeJS.ReadableStream
import typings.node.NodeJS.WritableStream
import typings.node.anon.Chunk
import typings.node.bufferMod.global.Buffer
import typings.node.bufferMod.global.BufferEncoding
import typings.node.eventsMod.global.NodeJS.EventEmitter
import typings.node.nodeStrings.close
import typings.node.nodeStrings.data
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
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcCallMod {
  
  @JSImport("@grpc/grpc-js/build/src/call", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.node.NodeJS.WritableStream because var conflicts: writable. Inlined 
  - typings.node.streamMod.Readable because Inheritance from two classes. Inlined readableDidRead, readableAborted, readableLength, readableEncoding, readableEnded, readableObjectMode, readableHighWaterMark, readableFlowing, _read, addListener_data, addListener_end, addListener_pause, addListener_readable, addListener_resume, emit_data, emit_end, emit_pause, emit_readable, emit_resume, on_data, on_end, on_pause, on_readable, on_resume, once_data, once_end, once_pause, once_readable, once_resume, prependListener_data, prependListener_end, prependListener_pause, prependListener_readable, prependListener_resume, prependOnceListener_data, prependOnceListener_end, prependOnceListener_pause, prependOnceListener_readable, prependOnceListener_resume, push, push, removeListener_data, removeListener_end, removeListener_pause, removeListener_readable, removeListener_resume, unshift, unshift
  - typings.node.streamMod.Writable because Inheritance from two classes. Inlined destroyed, _construct, _destroy, _destroy, _final, addListener_close, addListener_drain, addListener_error, addListener_finish, addListener_pipe, addListener_unpipe, cork, destroy, destroy, emit_close, emit_drain, emit_error, emit_finish, emit_pipe, emit_unpipe, on_close, on_drain, on_error, on_finish, on_pipe, on_unpipe, once_close, once_drain, once_error, once_finish, once_pipe, once_unpipe, prependListener_close, prependListener_drain, prependListener_error, prependListener_finish, prependListener_pipe, prependListener_unpipe, prependOnceListener_close, prependOnceListener_drain, prependOnceListener_error, prependOnceListener_finish, prependOnceListener_pipe, prependOnceListener_unpipe, removeListener_close, removeListener_drain, removeListener_error, removeListener_finish, removeListener_pipe, removeListener_unpipe, uncork
  - typings.grpcGrpcJs.buildSrcObjectStreamMod.IntermediateObjectReadable because Inheritance from two classes. Inlined 
  - typings.grpcGrpcJs.buildSrcEventsMod.EmitterAugmentation1 because Already inherited
  - typings.grpcGrpcJs.buildSrcObjectStreamMod.IntermediateObjectWritable because Inheritance from two classes. Inlined 
  - typings.node.eventsMod.EventEmitter because Inheritance from two classes. Inlined 
  - typings.grpcGrpcJs.buildSrcObjectStreamMod.ObjectReadable because Inheritance from two classes. Inlined read, read
  - typings.grpcGrpcJs.buildSrcObjectStreamMod.ObjectWritable because Inheritance from two classes. Inlined _write, write, write, write, write, write, setDefaultEncoding, end, end, end, end, end, end
  - typings.grpcGrpcJs.buildSrcCallMod.SurfaceCall because Inheritance from two classes. Inlined call, cancel, getPeer */ @JSImport("@grpc/grpc-js/build/src/call", "ClientDuplexStreamImpl")
  @js.native
  open class ClientDuplexStreamImpl[RequestType, ResponseType] protected ()
    extends Duplex
       with Serialize[RequestType]
       with Deserialize[ResponseType]
       with EmitterAugmentation1[metadata | status, Metadata | StatusObject]
       with EventEmitter
       with ReadableStream {
    def this(
      serialize: js.Function1[/* value */ RequestType, Buffer],
      deserialize: js.Function1[/* chunk */ Buffer, ResponseType]
    ) = this()
    
    var _construct: js.UndefOr[
        js.Function1[/* callback */ js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit], Unit]
      ] = js.native
    
    def _final(cb: js.Function): Unit = js.native
    
    def _read(_size: Double): Unit = js.native
    
    def _write(chunk: RequestType, encoding: String, callback: js.Function): Unit = js.native
    def _write(chunk: RequestType, encoding: String, cb: WriteCallback): Unit = js.native
    
    /* CompleteClass */
    override def addListener(event: metadata | status, listener: js.Function1[Metadata | StatusObject, Unit]): this.type = js.native
    /* InferMemberOverrides */
    override def addListener(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    /* InferMemberOverrides */
    override def addListener(event: js.Symbol, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    
    var call: js.UndefOr[InterceptingCallInterface] = js.native
    
    def cancel(): Unit = js.native
    
    /* CompleteClass */
    override def deserialize(chunk: Buffer): ResponseType = js.native
    
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
    
    /* CompleteClass */
    override def emit(event: metadata | status, arg1: Metadata | StatusObject): Boolean = js.native
    /* InferMemberOverrides */
    override def emit(event: String, args: Any*): Boolean = js.native
    /* InferMemberOverrides */
    override def emit(event: js.Symbol, args: Any*): Boolean = js.native
    
    def end(chunk: RequestType, cb: js.Function): /* import warning: importer.ImportType#apply Failed type conversion: std.ReturnType<{None (): this, None (cb : (): void): this, None (chunk : any): this, None (chunk : any, cb : (): void): this, None (chunk : any, encoding : node.buffer.<global>.BufferEncoding): this, None (chunk : any, encoding : node.buffer.<global>.BufferEncoding, cb : (): void): this, None (data : string): this, None (data : std.Uint8Array): this, None (data : string, cb : (): void): this, None (data : std.Uint8Array, cb : (): void): this, None (str : string, encoding : node.buffer.<global>.BufferEncoding): this, None (str : string, encoding : node.buffer.<global>.BufferEncoding, cb : (): void): this, None (str : string, encoding : undefined, cb : (): void): this}> extends node.stream.Writable ? this : void */ js.Any = js.native
    def end(chunk: RequestType, encoding: Any): /* import warning: importer.ImportType#apply Failed type conversion: std.ReturnType<{None (): this, None (cb : (): void): this, None (chunk : any): this, None (chunk : any, cb : (): void): this, None (chunk : any, encoding : node.buffer.<global>.BufferEncoding): this, None (chunk : any, encoding : node.buffer.<global>.BufferEncoding, cb : (): void): this, None (data : string): this, None (data : std.Uint8Array): this, None (data : string, cb : (): void): this, None (data : std.Uint8Array, cb : (): void): this, None (str : string, encoding : node.buffer.<global>.BufferEncoding): this, None (str : string, encoding : node.buffer.<global>.BufferEncoding, cb : (): void): this, None (str : string, encoding : undefined, cb : (): void): this}> extends node.stream.Writable ? this : void */ js.Any = js.native
    def end(chunk: RequestType, encoding: Any, cb: js.Function): /* import warning: importer.ImportType#apply Failed type conversion: std.ReturnType<{None (): this, None (cb : (): void): this, None (chunk : any): this, None (chunk : any, cb : (): void): this, None (chunk : any, encoding : node.buffer.<global>.BufferEncoding): this, None (chunk : any, encoding : node.buffer.<global>.BufferEncoding, cb : (): void): this, None (data : string): this, None (data : std.Uint8Array): this, None (data : string, cb : (): void): this, None (data : std.Uint8Array, cb : (): void): this, None (str : string, encoding : node.buffer.<global>.BufferEncoding): this, None (str : string, encoding : node.buffer.<global>.BufferEncoding, cb : (): void): this, None (str : string, encoding : undefined, cb : (): void): this}> extends node.stream.Writable ? this : void */ js.Any = js.native
    def end(chunk: RequestType, encoding: Unit, cb: js.Function): /* import warning: importer.ImportType#apply Failed type conversion: std.ReturnType<{None (): this, None (cb : (): void): this, None (chunk : any): this, None (chunk : any, cb : (): void): this, None (chunk : any, encoding : node.buffer.<global>.BufferEncoding): this, None (chunk : any, encoding : node.buffer.<global>.BufferEncoding, cb : (): void): this, None (data : string): this, None (data : std.Uint8Array): this, None (data : string, cb : (): void): this, None (data : std.Uint8Array, cb : (): void): this, None (str : string, encoding : node.buffer.<global>.BufferEncoding): this, None (str : string, encoding : node.buffer.<global>.BufferEncoding, cb : (): void): this, None (str : string, encoding : undefined, cb : (): void): this}> extends node.stream.Writable ? this : void */ js.Any = js.native
    
    def getPeer(): String = js.native
    
    /* CompleteClass */
    override def on(event: metadata | status, listener: js.Function1[Metadata | StatusObject, Unit]): this.type = js.native
    /* InferMemberOverrides */
    override def on(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    /* InferMemberOverrides */
    override def on(event: js.Symbol, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    
    /* CompleteClass */
    override def once(event: metadata | status, listener: js.Function1[Metadata | StatusObject, Unit]): this.type = js.native
    /* InferMemberOverrides */
    override def once(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    /* InferMemberOverrides */
    override def once(event: js.Symbol, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    
    /* CompleteClass */
    override def prependListener(event: metadata | status, listener: js.Function1[Metadata | StatusObject, Unit]): this.type = js.native
    /* InferMemberOverrides */
    override def prependListener(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    /* InferMemberOverrides */
    override def prependListener(event: js.Symbol, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    
    /* CompleteClass */
    override def prependOnceListener(event: metadata | status, listener: js.Function1[Metadata | StatusObject, Unit]): this.type = js.native
    /* InferMemberOverrides */
    override def prependOnceListener(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    /* InferMemberOverrides */
    override def prependOnceListener(event: js.Symbol, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    
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
    override def removeListener(event: metadata | status, listener: js.Function1[Metadata | StatusObject, Unit]): this.type = js.native
    /* InferMemberOverrides */
    override def removeListener(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    /* InferMemberOverrides */
    override def removeListener(event: js.Symbol, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    
    /* CompleteClass */
    override def serialize(value: RequestType): Buffer = js.native
    
    def setDefaultEncoding(encoding: String): this.type = js.native
    
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
      * const { StringDecoder } = require('node:string_decoder');
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
      * @param chunk Chunk of data to unshift onto the read queue. For streams not operating in object mode, `chunk` must be a string, `Buffer`, `Uint8Array`, or `null`. For object mode
      * streams, `chunk` may be any JavaScript value.
      * @param encoding Encoding of string chunks. Must be a valid `Buffer` encoding, such as `'utf8'` or `'ascii'`.
      */
    def unshift(chunk: Any): Unit = js.native
    def unshift(chunk: Any, encoding: BufferEncoding): Unit = js.native
    
    def write(chunk: RequestType, cb: js.Function): Boolean = js.native
    def write(chunk: RequestType, encoding: Any): Boolean = js.native
    def write(chunk: RequestType, encoding: Any, cb: js.Function): Boolean = js.native
    def write(chunk: RequestType, encoding: Unit, cb: js.Function): Boolean = js.native
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.node.streamMod.Readable because Inheritance from two classes. Inlined destroyed, readableDidRead, readableAborted, _construct, errored, readableLength, readableEncoding, readableEnded, closed, readableObjectMode, readableHighWaterMark, readableFlowing, _destroy, _destroy, _read, addListener_close, addListener_data, addListener_end, addListener_error, addListener_pause, addListener_readable, addListener_resume, destroy, destroy, emit_close, emit_data, emit_end, emit_error, emit_pause, emit_readable, emit_resume, on_close, on_data, on_end, on_error, on_pause, on_readable, on_resume, once_close, once_data, once_end, once_error, once_pause, once_readable, once_resume, prependListener_close, prependListener_data, prependListener_end, prependListener_error, prependListener_pause, prependListener_readable, prependListener_resume, prependOnceListener_close, prependOnceListener_data, prependOnceListener_end, prependOnceListener_error, prependOnceListener_pause, prependOnceListener_readable, prependOnceListener_resume, push, push, removeListener_close, removeListener_data, removeListener_end, removeListener_error, removeListener_pause, removeListener_readable, removeListener_resume, unshift, unshift
  - typings.grpcGrpcJs.buildSrcObjectStreamMod.IntermediateObjectReadable because Inheritance from two classes. Inlined 
  - typings.grpcGrpcJs.buildSrcEventsMod.EmitterAugmentation1 because Already inherited
  - typings.grpcGrpcJs.buildSrcObjectStreamMod.ObjectReadable because Inheritance from two classes. Inlined read, read */ @JSImport("@grpc/grpc-js/build/src/call", "ClientReadableStreamImpl")
  @js.native
  open class ClientReadableStreamImpl[ResponseType] protected ()
    extends SurfaceCall
       with Deserialize[ResponseType]
       with ReadableStream {
    def this(deserialize: js.Function1[/* chunk */ Buffer, ResponseType]) = this()
    
    var _construct: js.UndefOr[
        js.Function1[/* callback */ js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit], Unit]
      ] = js.native
    
    def _destroy(error: js.Error, callback: js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit]): Unit = js.native
    def _destroy(error: Null, callback: js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit]): Unit = js.native
    
    def _read(_size: Double): Unit = js.native
    
    /* CompleteClass */
    override def addListener(event: metadata | status, listener: js.Function1[Metadata | StatusObject, Unit]): this.type = js.native
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
    def addListener_data(event: data, listener: js.Function1[/* chunk */ Any, Unit]): this.type = js.native
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
    
    /**
      * Is `true` after `'close'` has been emitted.
      * @since v18.0.0
      */
    val closed: Boolean = js.native
    
    /* CompleteClass */
    override def deserialize(chunk: Buffer): ResponseType = js.native
    
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
    override def emit(event: metadata | status, arg1: Metadata | StatusObject): Boolean = js.native
    @JSName("emit")
    def emit_close(event: close): Boolean = js.native
    @JSName("emit")
    def emit_data(event: data, chunk: Any): Boolean = js.native
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
    override def on(event: metadata | status, listener: js.Function1[Metadata | StatusObject, Unit]): this.type = js.native
    @JSName("on")
    def on_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_data(event: data, listener: js.Function1[/* chunk */ Any, Unit]): this.type = js.native
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
    override def once(event: metadata | status, listener: js.Function1[Metadata | StatusObject, Unit]): this.type = js.native
    @JSName("once")
    def once_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("once")
    def once_data(event: data, listener: js.Function1[/* chunk */ Any, Unit]): this.type = js.native
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
    override def prependListener(event: metadata | status, listener: js.Function1[Metadata | StatusObject, Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_data(event: data, listener: js.Function1[/* chunk */ Any, Unit]): this.type = js.native
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
    override def prependOnceListener(event: metadata | status, listener: js.Function1[Metadata | StatusObject, Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_data(event: data, listener: js.Function1[/* chunk */ Any, Unit]): this.type = js.native
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
    override def removeListener(event: metadata | status, listener: js.Function1[Metadata | StatusObject, Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_data(event: data, listener: js.Function1[/* chunk */ Any, Unit]): this.type = js.native
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
      * const { StringDecoder } = require('node:string_decoder');
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
      * @param chunk Chunk of data to unshift onto the read queue. For streams not operating in object mode, `chunk` must be a string, `Buffer`, `Uint8Array`, or `null`. For object mode
      * streams, `chunk` may be any JavaScript value.
      * @param encoding Encoding of string chunks. Must be a valid `Buffer` encoding, such as `'utf8'` or `'ascii'`.
      */
    def unshift(chunk: Any): Unit = js.native
    def unshift(chunk: Any, encoding: BufferEncoding): Unit = js.native
  }
  
  @JSImport("@grpc/grpc-js/build/src/call", "ClientUnaryCallImpl")
  @js.native
  open class ClientUnaryCallImpl () extends SurfaceCall {
    
    /* CompleteClass */
    override def addListener(event: metadata | status, listener: js.Function1[Metadata | StatusObject, Unit]): this.type = js.native
    
    /* CompleteClass */
    override def emit(event: metadata | status, arg1: Metadata | StatusObject): Boolean = js.native
    
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
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.node.streamMod.Writable because Inheritance from two classes. Inlined destroyed, writableObjectMode, writableHighWaterMark, _writev, _construct, errored, writableLength, writableCorked, closed, writableEnded, writableNeedDrain, writableFinished, _destroy, _destroy, _final, addListener_close, addListener_drain, addListener_error, addListener_finish, addListener_pipe, addListener_unpipe, cork, destroy, destroy, emit_close, emit_drain, emit_error, emit_finish, emit_pipe, emit_unpipe, on_close, on_drain, on_error, on_finish, on_pipe, on_unpipe, once_close, once_drain, once_error, once_finish, once_pipe, once_unpipe, prependListener_close, prependListener_drain, prependListener_error, prependListener_finish, prependListener_pipe, prependListener_unpipe, prependOnceListener_close, prependOnceListener_drain, prependOnceListener_error, prependOnceListener_finish, prependOnceListener_pipe, prependOnceListener_unpipe, removeListener_close, removeListener_drain, removeListener_error, removeListener_finish, removeListener_pipe, removeListener_unpipe, uncork
  - typings.grpcGrpcJs.buildSrcObjectStreamMod.IntermediateObjectWritable because Inheritance from two classes. Inlined 
  - typings.grpcGrpcJs.buildSrcObjectStreamMod.ObjectWritable because Inheritance from two classes. Inlined _write, write, write, write, write, write, setDefaultEncoding, end, end, end, end, end, end */ @JSImport("@grpc/grpc-js/build/src/call", "ClientWritableStreamImpl")
  @js.native
  open class ClientWritableStreamImpl[RequestType] protected ()
    extends SurfaceCall
       with Serialize[RequestType]
       with WritableStream {
    def this(serialize: js.Function1[/* value */ RequestType, Buffer]) = this()
    
    var _construct: js.UndefOr[
        js.Function1[/* callback */ js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit], Unit]
      ] = js.native
    
    def _destroy(error: js.Error, callback: js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit]): Unit = js.native
    def _destroy(error: Null, callback: js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit]): Unit = js.native
    
    def _final(callback: js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit]): Unit = js.native
    def _final(cb: js.Function): Unit = js.native
    
    def _write(chunk: RequestType, encoding: String, callback: js.Function): Unit = js.native
    def _write(chunk: RequestType, encoding: String, cb: WriteCallback): Unit = js.native
    
    var _writev: js.UndefOr[
        js.Function2[
          /* chunks */ js.Array[Chunk], 
          /* callback */ js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit], 
          Unit
        ]
      ] = js.native
    
    /* CompleteClass */
    override def addListener(event: metadata | status, listener: js.Function1[Metadata | StatusObject, Unit]): this.type = js.native
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
    
    /**
      * Is `true` after `'close'` has been emitted.
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
    
    /* CompleteClass */
    override def emit(event: metadata | status, arg1: Metadata | StatusObject): Boolean = js.native
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
    
    def end(chunk: RequestType): /* import warning: importer.ImportType#apply Failed type conversion: std.ReturnType<{None (): this, None (cb : (): void): this, None (chunk : any): this, None (chunk : any, cb : (): void): this, None (chunk : any, encoding : node.buffer.<global>.BufferEncoding): this, None (chunk : any, encoding : node.buffer.<global>.BufferEncoding, cb : (): void): this, None (data : string): this, None (data : std.Uint8Array): this, None (data : string, cb : (): void): this, None (data : std.Uint8Array, cb : (): void): this, None (str : string, encoding : node.buffer.<global>.BufferEncoding): this, None (str : string, encoding : node.buffer.<global>.BufferEncoding, cb : (): void): this, None (str : string, encoding : undefined, cb : (): void): this}> extends node.stream.Writable ? this : void */ js.Any = js.native
    def end(chunk: RequestType, cb: js.Function): /* import warning: importer.ImportType#apply Failed type conversion: std.ReturnType<{None (): this, None (cb : (): void): this, None (chunk : any): this, None (chunk : any, cb : (): void): this, None (chunk : any, encoding : node.buffer.<global>.BufferEncoding): this, None (chunk : any, encoding : node.buffer.<global>.BufferEncoding, cb : (): void): this, None (data : string): this, None (data : std.Uint8Array): this, None (data : string, cb : (): void): this, None (data : std.Uint8Array, cb : (): void): this, None (str : string, encoding : node.buffer.<global>.BufferEncoding): this, None (str : string, encoding : node.buffer.<global>.BufferEncoding, cb : (): void): this, None (str : string, encoding : undefined, cb : (): void): this}> extends node.stream.Writable ? this : void */ js.Any = js.native
    def end(chunk: RequestType, encoding: Any): /* import warning: importer.ImportType#apply Failed type conversion: std.ReturnType<{None (): this, None (cb : (): void): this, None (chunk : any): this, None (chunk : any, cb : (): void): this, None (chunk : any, encoding : node.buffer.<global>.BufferEncoding): this, None (chunk : any, encoding : node.buffer.<global>.BufferEncoding, cb : (): void): this, None (data : string): this, None (data : std.Uint8Array): this, None (data : string, cb : (): void): this, None (data : std.Uint8Array, cb : (): void): this, None (str : string, encoding : node.buffer.<global>.BufferEncoding): this, None (str : string, encoding : node.buffer.<global>.BufferEncoding, cb : (): void): this, None (str : string, encoding : undefined, cb : (): void): this}> extends node.stream.Writable ? this : void */ js.Any = js.native
    def end(chunk: RequestType, encoding: Any, cb: js.Function): /* import warning: importer.ImportType#apply Failed type conversion: std.ReturnType<{None (): this, None (cb : (): void): this, None (chunk : any): this, None (chunk : any, cb : (): void): this, None (chunk : any, encoding : node.buffer.<global>.BufferEncoding): this, None (chunk : any, encoding : node.buffer.<global>.BufferEncoding, cb : (): void): this, None (data : string): this, None (data : std.Uint8Array): this, None (data : string, cb : (): void): this, None (data : std.Uint8Array, cb : (): void): this, None (str : string, encoding : node.buffer.<global>.BufferEncoding): this, None (str : string, encoding : node.buffer.<global>.BufferEncoding, cb : (): void): this, None (str : string, encoding : undefined, cb : (): void): this}> extends node.stream.Writable ? this : void */ js.Any = js.native
    def end(chunk: RequestType, encoding: Unit, cb: js.Function): /* import warning: importer.ImportType#apply Failed type conversion: std.ReturnType<{None (): this, None (cb : (): void): this, None (chunk : any): this, None (chunk : any, cb : (): void): this, None (chunk : any, encoding : node.buffer.<global>.BufferEncoding): this, None (chunk : any, encoding : node.buffer.<global>.BufferEncoding, cb : (): void): this, None (data : string): this, None (data : std.Uint8Array): this, None (data : string, cb : (): void): this, None (data : std.Uint8Array, cb : (): void): this, None (str : string, encoding : node.buffer.<global>.BufferEncoding): this, None (str : string, encoding : node.buffer.<global>.BufferEncoding, cb : (): void): this, None (str : string, encoding : undefined, cb : (): void): this}> extends node.stream.Writable ? this : void */ js.Any = js.native
    
    /**
      * Returns error if the stream has been destroyed with an error.
      * @since v18.0.0
      */
    val errored: js.Error | Null = js.native
    
    /* CompleteClass */
    override def on(event: metadata | status, listener: js.Function1[Metadata | StatusObject, Unit]): this.type = js.native
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
    
    /* CompleteClass */
    override def once(event: metadata | status, listener: js.Function1[Metadata | StatusObject, Unit]): this.type = js.native
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
    
    /* CompleteClass */
    override def prependListener(event: metadata | status, listener: js.Function1[Metadata | StatusObject, Unit]): this.type = js.native
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
    
    /* CompleteClass */
    override def prependOnceListener(event: metadata | status, listener: js.Function1[Metadata | StatusObject, Unit]): this.type = js.native
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
    
    /* CompleteClass */
    override def removeListener(event: metadata | status, listener: js.Function1[Metadata | StatusObject, Unit]): this.type = js.native
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
    
    /* CompleteClass */
    override def serialize(value: RequestType): Buffer = js.native
    
    def setDefaultEncoding(encoding: String): this.type = js.native
    
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
      * Is `true` if the stream's buffer has been full and stream will emit `'drain'`.
      * @since v15.2.0, v14.17.0
      */
    val writableNeedDrain: Boolean = js.native
    
    /**
      * Getter for the property `objectMode` of a given `Writable` stream.
      * @since v12.3.0
      */
    val writableObjectMode: Boolean = js.native
    
    def write(chunk: RequestType): Boolean = js.native
    def write(chunk: RequestType, cb: js.Function): Boolean = js.native
    def write(chunk: RequestType, encoding: Any): Boolean = js.native
    def write(chunk: RequestType, encoding: Any, cb: js.Function): Boolean = js.native
    def write(chunk: RequestType, encoding: Unit, cb: js.Function): Boolean = js.native
  }
  
  inline def callErrorFromStatus(status: StatusObject, callerStack: String): ServiceError = (^.asInstanceOf[js.Dynamic].applyDynamic("callErrorFromStatus")(status.asInstanceOf[js.Any], callerStack.asInstanceOf[js.Any])).asInstanceOf[ServiceError]
  
  type ClientDuplexStream[RequestType, ResponseType] = ClientWritableStream[RequestType] & ClientReadableStream[ResponseType]
  
  type ClientReadableStream[ResponseType] = Deserialize[ResponseType] & SurfaceCall & ObjectReadable[ResponseType]
  
  type ClientUnaryCall = SurfaceCall
  
  type ClientWritableStream[RequestType] = Serialize[RequestType] & SurfaceCall & ObjectWritable[RequestType]
  
  trait ServiceError
    extends StObject
       with StatusObject
       with Error
  object ServiceError {
    
    inline def apply(code: Status, details: String, message: String, metadata: Metadata, name: String): ServiceError = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[ServiceError]
    }
  }
  
  @js.native
  trait SurfaceCall
    extends typings.node.eventsMod.EventEmitter
       with EmitterAugmentation1[metadata | status, Metadata | StatusObject] {
    
    var call: js.UndefOr[InterceptingCallInterface] = js.native
    
    def cancel(): Unit = js.native
    
    def getPeer(): String = js.native
  }
}
