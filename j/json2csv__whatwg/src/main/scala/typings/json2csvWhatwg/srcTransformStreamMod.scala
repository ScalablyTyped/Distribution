package typings.json2csvWhatwg

import typings.json2csvPlainjs.srcStreamParserMod.AsyncOptions
import typings.json2csvPlainjs.srcStreamParserMod.Options
import typings.std.QueuingStrategy
import typings.std.ReadableStream
import typings.std.TransformStream
import typings.std.WritableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcTransformStreamMod {
  
  @JSImport("@json2csv/whatwg/src/TransformStream", JSImport.Default)
  @js.native
  open class default[I, O] ()
    extends StObject
       with TransformStream[Any, Any] {
    def this(opts: Options) = this()
    def this(opts: Unit, asyncOpts: AsyncOptions) = this()
    def this(opts: Options, asyncOpts: AsyncOptions) = this()
    def this(opts: Unit, asyncOpts: Unit, writableStrategy: QueuingStrategy[I]) = this()
    def this(opts: Unit, asyncOpts: AsyncOptions, writableStrategy: QueuingStrategy[I]) = this()
    def this(opts: Options, asyncOpts: Unit, writableStrategy: QueuingStrategy[I]) = this()
    def this(opts: Options, asyncOpts: AsyncOptions, writableStrategy: QueuingStrategy[I]) = this()
    def this(opts: Unit, asyncOpts: Unit, writableStrategy: Unit, readableStrategy: QueuingStrategy[O]) = this()
    def this(
      opts: Unit,
      asyncOpts: Unit,
      writableStrategy: QueuingStrategy[I],
      readableStrategy: QueuingStrategy[O]
    ) = this()
    def this(opts: Unit, asyncOpts: AsyncOptions, writableStrategy: Unit, readableStrategy: QueuingStrategy[O]) = this()
    def this(
      opts: Unit,
      asyncOpts: AsyncOptions,
      writableStrategy: QueuingStrategy[I],
      readableStrategy: QueuingStrategy[O]
    ) = this()
    def this(opts: Options, asyncOpts: Unit, writableStrategy: Unit, readableStrategy: QueuingStrategy[O]) = this()
    def this(
      opts: Options,
      asyncOpts: Unit,
      writableStrategy: QueuingStrategy[I],
      readableStrategy: QueuingStrategy[O]
    ) = this()
    def this(
      opts: Options,
      asyncOpts: AsyncOptions,
      writableStrategy: Unit,
      readableStrategy: QueuingStrategy[O]
    ) = this()
    def this(
      opts: Options,
      asyncOpts: AsyncOptions,
      writableStrategy: QueuingStrategy[I],
      readableStrategy: QueuingStrategy[O]
    ) = this()
    
    /* standard dom */
    /* CompleteClass */
    override val readable: ReadableStream[Any] = js.native
    
    /* standard dom */
    /* CompleteClass */
    override val writable: WritableStream[Any] = js.native
  }
  
  type JSON2CSVWHATWGTransformStream[I, O] = TransformStream[Any, Any]
}
