package typings.json2csvWhatwg

import typings.json2csvPlainjs.srcStreamParserMod.AsyncOptions
import typings.json2csvPlainjs.srcStreamParserMod.Options
import typings.node.nodeColonstreamMod.Stream
import typings.std.QueuingStrategy
import typings.std.ReadableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcAsyncParserMod {
  
  @JSImport("@json2csv/whatwg/src/AsyncParser", JSImport.Default)
  @js.native
  open class default[I, O] ()
    extends StObject
       with JSON2CSVNodeAsyncParser[I, O] {
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
  }
  
  @js.native
  trait JSON2CSVNodeAsyncParser[I, O] extends StObject {
    
    // asyncOpts isn't optional since it's set to `{}` when nothing is passed
    var asyncOpts: AsyncOptions = js.native
    
    var opts: js.UndefOr[Options] = js.native
    
    def parse(data: String): ReadableStream[typings.json2csvWhatwg.srcTransformStreamMod.default[Any, Any]] = js.native
    def parse(data: js.Object): ReadableStream[typings.json2csvWhatwg.srcTransformStreamMod.default[Any, Any]] = js.native
    def parse(data: Stream): ReadableStream[typings.json2csvWhatwg.srcTransformStreamMod.default[Any, Any]] = js.native
    
    var readableStrategy: js.UndefOr[QueuingStrategy[O]] = js.native
    
    var writableStrategy: js.UndefOr[QueuingStrategy[I]] = js.native
  }
}
