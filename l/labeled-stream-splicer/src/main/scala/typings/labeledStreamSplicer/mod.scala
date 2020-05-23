package typings.labeledStreamSplicer

import typings.labeledStreamSplicer.labeledStreamSplicerStrings.close
import typings.node.BufferEncoding
import typings.node.NodeJS.ReadWriteStream
import typings.node.NodeJS.ReadableStream
import typings.node.NodeJS.WritableStream
import typings.node.anon.Chunk
import typings.node.streamMod.TransformOptions
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("labeled-stream-splicer", JSImport.Namespace)
@js.native
object mod extends js.Object {
  /* Inlined parent std.Omit<node.stream.Duplex, 'push' | 'unshift'> */
  @js.native
  trait splicer extends js.Object {
    @JSName("_destroy")
    var _destroy_Original: js.Function2[/* error */ Error, /* callback */ js.Function1[/* error */ Error | Null, Unit], Unit] = js.native
    @JSName("_final")
    var _final_Original: js.Function1[/* callback */ js.Function1[/* error */ js.UndefOr[Error | Null], Unit], Unit] = js.native
    @JSName("_read")
    var _read_Original: js.Function1[/* size */ Double, Unit] = js.native
    @JSName("_write")
    var _write_Original: js.Function3[
        /* chunk */ js.Any, 
        /* encoding */ BufferEncoding, 
        /* callback */ js.Function1[/* error */ js.UndefOr[Error | Null], Unit], 
        Unit
      ] = js.native
    var _writev: js.UndefOr[
        js.Function2[
          /* chunks */ js.Array[Chunk], 
          /* callback */ js.Function1[/* error */ js.UndefOr[Error | Null], Unit], 
          Unit
        ]
      ] = js.native
    @JSName("addListener")
    var addListener_Original: js.Function2[close, /* listener */ js.Function0[Unit], this.type] = js.native
    @JSName("constructor")
    var constructor_Original: js.Function0[js.Any] = js.native
    @JSName("cork")
    var cork_Original: js.Function0[Unit] = js.native
    var defaultMaxListeners: js.UndefOr[js.Any] = js.native
    @JSName("destroy")
    var destroy_Original: js.Function0[Unit] = js.native
    var destroyed: Boolean = js.native
    @JSName("emit")
    var emit_Original: js.Function1[close, Boolean] = js.native
    @JSName("end")
    var end_Original: js.Function0[Unit] = js.native
    var errorMonitor: js.UndefOr[js.Any] = js.native
    @JSName("eventNames")
    var eventNames_Original: js.Function0[js.Array[String | js.Symbol]] = js.native
    var from: js.UndefOr[js.Any] = js.native
    @JSName("getMaxListeners")
    var getMaxListeners_Original: js.Function0[Double] = js.native
    @JSName("isPaused")
    var isPaused_Original: js.Function0[Boolean] = js.native
    val length: Double = js.native
    @JSName("listenerCount")
    var listenerCount_Original: js.Function1[/* type */ String, Double] = js.native
    @JSName("listeners")
    var listeners_Original: js.Function1[/* event */ String, js.Array[js.Function]] = js.native
    @JSName("off")
    var off_Original: js.Function2[
        /* event */ String, 
        /* listener */ js.Function1[/* repeated */ js.Any, Unit], 
        this.type
      ] = js.native
    @JSName("on")
    var on_Original: js.Function2[close, /* listener */ js.Function0[Unit], this.type] = js.native
    @JSName("once")
    var once_Original: js.Function2[close, /* listener */ js.Function0[Unit], this.type] = js.native
    @JSName("pause")
    var pause_Original: js.Function0[this.type] = js.native
    @JSName("pipe")
    var pipe_Original: js.Function1[/* destination */ WritableStream, WritableStream] = js.native
    @JSName("prependListener")
    var prependListener_Original: js.Function2[close, /* listener */ js.Function0[Unit], this.type] = js.native
    @JSName("prependOnceListener")
    var prependOnceListener_Original: js.Function2[close, /* listener */ js.Function0[Unit], this.type] = js.native
    @JSName("rawListeners")
    var rawListeners_Original: js.Function1[/* event */ String, js.Array[js.Function]] = js.native
    @JSName("read")
    var read_Original: js.Function0[_] = js.native
    var readable: Boolean = js.native
    var readableHighWaterMark: Double = js.native
    var readableLength: Double = js.native
    var readableObjectMode: Boolean = js.native
    @JSName("removeAllListeners")
    var removeAllListeners_Original: js.Function0[this.type] = js.native
    @JSName("removeListener")
    var removeListener_Original: js.Function2[close, /* listener */ js.Function0[Unit], this.type] = js.native
    @JSName("resume")
    var resume_Original: js.Function0[this.type] = js.native
    @JSName("setDefaultEncoding")
    var setDefaultEncoding_Original: js.Function1[/* encoding */ BufferEncoding, this.type] = js.native
    @JSName("setEncoding")
    var setEncoding_Original: js.Function1[/* encoding */ BufferEncoding, this.type] = js.native
    @JSName("setMaxListeners")
    var setMaxListeners_Original: js.Function1[/* n */ Double, this.type] = js.native
    @JSName("uncork")
    var uncork_Original: js.Function0[Unit] = js.native
    @JSName("unpipe")
    var unpipe_Original: js.Function0[this.type] = js.native
    @JSName("wrap")
    var wrap_Original: js.Function1[/* oldStream */ ReadableStream, this.type] = js.native
    var writable: Boolean = js.native
    var writableCorked: Double = js.native
    var writableEnded: Boolean = js.native
    var writableFinished: Boolean = js.native
    var writableHighWaterMark: Double = js.native
    var writableLength: Double = js.native
    var writableObjectMode: Boolean = js.native
    @JSName("write")
    var write_Original: js.Function1[/* chunk */ js.Any, Boolean] = js.native
    def _destroy(error: Error, callback: js.Function1[/* error */ Error | Null, Unit]): Unit = js.native
    def _final(callback: js.Function1[/* error */ js.UndefOr[Error | Null], Unit]): Unit = js.native
    def _read(size: Double): Unit = js.native
    def _write(
      chunk: js.Any,
      encoding: BufferEncoding,
      callback: js.Function1[/* error */ js.UndefOr[Error | Null], Unit]
    ): Unit = js.native
    @JSName("addListener")
    def addListener_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    def cork(): Unit = js.native
    def destroy(): Unit = js.native
    @JSName("emit")
    def emit_close(event: close): Boolean = js.native
    def end(): Unit = js.native
    def eventNames(): js.Array[String | js.Symbol] = js.native
    def get(index: Index): js.UndefOr[Stream] = js.native
    def getMaxListeners(): Double = js.native
    def indexOf(labelOrStream: String): Double = js.native
    def indexOf(labelOrStream: Stream): Double = js.native
    def isPaused(): Boolean = js.native
    def listenerCount(`type`: String): Double = js.native
    def listeners(event: String): js.Array[js.Function] = js.native
    def off(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    @JSName("on")
    def on_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("once")
    def once_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    def pause(): this.type = js.native
    def pipe[T /* <: WritableStream */](destination: T): T = js.native
    def pop(): js.UndefOr[Stream] = js.native
    @JSName("prependListener")
    def prependListener_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    def push(stream: Stream*): Double = js.native
    def rawListeners(event: String): js.Array[js.Function] = js.native
    def read(): js.Any = js.native
    def removeAllListeners(): this.type = js.native
    @JSName("removeListener")
    def removeListener_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    def resume(): this.type = js.native
    def setDefaultEncoding(encoding: BufferEncoding): this.type = js.native
    def setEncoding(encoding: BufferEncoding): this.type = js.native
    def setMaxListeners(n: Double): this.type = js.native
    def shift(): js.UndefOr[Stream] = js.native
    def splice(index: Index, howMany: Double, stream: Stream*): js.Array[Stream] = js.native
    def uncork(): Unit = js.native
    def unpipe(): this.type = js.native
    def unshift(stream: Stream*): Double = js.native
    def wrap(oldStream: ReadableStream): this.type = js.native
    def write(chunk: js.Any): Boolean = js.native
  }
  
  def apply(): splicer = js.native
  def apply(streams: LabeledStreamList): splicer = js.native
  def apply(streams: LabeledStreamList, opts: TransformOptions): splicer = js.native
  def obj(): splicer = js.native
  def obj(streams: LabeledStreamList): splicer = js.native
  def obj(streams: LabeledStreamList, opts: TransformOptions): splicer = js.native
  type Index = Double | String
  type LabeledStreamList = js.Array[String | Stream | js.Array[Stream]]
  type Stream = ReadableStream | WritableStream | ReadWriteStream
}

