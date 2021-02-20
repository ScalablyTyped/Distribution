package typings.json2csv

import typings.json2csv.baseMod.Json2CsvTransform
import typings.json2csv.flattenMod.FlattenOptions
import typings.json2csv.json2csvasyncparserMod.default
import typings.json2csv.json2csvbaseMod.json2csv.Options
import typings.json2csv.unwindMod.UnwindOptions
import typings.node.streamMod.Readable
import typings.node.streamMod.TransformOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("json2csv", "AsyncParser")
  @js.native
  class AsyncParser[T] () extends default[T] {
    def this(opts: Options[T]) = this()
    def this(opts: js.UndefOr[scala.Nothing], transformOpts: TransformOptions) = this()
    def this(opts: Options[T], transformOpts: TransformOptions) = this()
  }
  
  @JSImport("json2csv", "Parser")
  @js.native
  class Parser[T] ()
    extends typings.json2csv.json2csvparserMod.default[T]
  
  @JSImport("json2csv", "Transform")
  @js.native
  // implements JSON2CSVBase<T>
  class Transform[T] ()
    extends typings.json2csv.json2csvtransformMod.default[T] {
    def this(opts: Options[T]) = this()
    def this(opts: js.UndefOr[scala.Nothing], transformOpts: TransformOptions) = this()
    def this(opts: Options[T], transformOpts: TransformOptions) = this()
  }
  
  @JSImport("json2csv", "parse")
  @js.native
  def parse[T](data: T): String = js.native
  @JSImport("json2csv", "parse")
  @js.native
  def parse[T](data: T, opts: Options[T]): String = js.native
  @JSImport("json2csv", "parse")
  @js.native
  def parse[T](data: js.Array[T]): String = js.native
  @JSImport("json2csv", "parse")
  @js.native
  def parse[T](data: js.Array[T], opts: Options[T]): String = js.native
  
  @JSImport("json2csv", "parseAsync")
  @js.native
  def parseAsync[T](data: T): js.Promise[String] = js.native
  @JSImport("json2csv", "parseAsync")
  @js.native
  def parseAsync[T](data: T, opts: js.UndefOr[scala.Nothing], transformOpts: TransformOptions): js.Promise[String] = js.native
  @JSImport("json2csv", "parseAsync")
  @js.native
  def parseAsync[T](data: T, opts: Options[T]): js.Promise[String] = js.native
  @JSImport("json2csv", "parseAsync")
  @js.native
  def parseAsync[T](data: T, opts: Options[T], transformOpts: TransformOptions): js.Promise[String] = js.native
  @JSImport("json2csv", "parseAsync")
  @js.native
  def parseAsync[T](data: js.Array[T]): js.Promise[String] = js.native
  @JSImport("json2csv", "parseAsync")
  @js.native
  def parseAsync[T](data: js.Array[T], opts: js.UndefOr[scala.Nothing], transformOpts: TransformOptions): js.Promise[String] = js.native
  @JSImport("json2csv", "parseAsync")
  @js.native
  def parseAsync[T](data: js.Array[T], opts: Options[T]): js.Promise[String] = js.native
  @JSImport("json2csv", "parseAsync")
  @js.native
  def parseAsync[T](data: js.Array[T], opts: Options[T], transformOpts: TransformOptions): js.Promise[String] = js.native
  @JSImport("json2csv", "parseAsync")
  @js.native
  def parseAsync[T](data: Readable): js.Promise[String] = js.native
  @JSImport("json2csv", "parseAsync")
  @js.native
  def parseAsync[T](data: Readable, opts: js.UndefOr[scala.Nothing], transformOpts: TransformOptions): js.Promise[String] = js.native
  @JSImport("json2csv", "parseAsync")
  @js.native
  def parseAsync[T](data: Readable, opts: Options[T]): js.Promise[String] = js.native
  @JSImport("json2csv", "parseAsync")
  @js.native
  def parseAsync[T](data: Readable, opts: Options[T], transformOpts: TransformOptions): js.Promise[String] = js.native
  
  object transforms {
    
    @JSImport("json2csv", "transforms.flatten")
    @js.native
    def flatten(): Json2CsvTransform[_, _] = js.native
    @JSImport("json2csv", "transforms.flatten")
    @js.native
    def flatten(options: FlattenOptions): Json2CsvTransform[_, _] = js.native
    
    @JSImport("json2csv", "transforms.unwind")
    @js.native
    def unwind(): Json2CsvTransform[_, js.Array[_]] = js.native
    @JSImport("json2csv", "transforms.unwind")
    @js.native
    def unwind(options: UnwindOptions): Json2CsvTransform[_, js.Array[_]] = js.native
  }
}
