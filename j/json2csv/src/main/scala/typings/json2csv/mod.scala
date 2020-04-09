package typings.json2csv

import typings.json2csv.baseMod.Json2CsvTransform
import typings.json2csv.flattenMod.FlattenOptions
import typings.json2csv.json2csvasyncparserMod.default
import typings.json2csv.json2csvbaseMod.json2csv.Options
import typings.json2csv.json2csvparserMod.JSON2CSVParser
import typings.json2csv.unwindMod.UnwindOptions
import typings.node.streamMod.Readable
import typings.node.streamMod.TransformOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("json2csv", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class AsyncParser[T] () extends default[T] {
    def this(opts: Options[T]) = this()
    def this(opts: Options[T], transformOpts: TransformOptions) = this()
  }
  
  @js.native
  class Parser[T] () extends JSON2CSVParser[T]
  
  @js.native
  // implements JSON2CSVBase<T>
  class Transform[T] ()
    extends typings.json2csv.json2csvtransformMod.default[T] {
    def this(opts: Options[T]) = this()
    def this(opts: Options[T], transformOpts: TransformOptions) = this()
  }
  
  def parse[T](data: T): String = js.native
  def parse[T](data: T, opts: Options[T]): String = js.native
  def parse[T](data: js.Array[T]): String = js.native
  def parse[T](data: js.Array[T], opts: Options[T]): String = js.native
  def parseAsync[T](data: T): js.Promise[String] = js.native
  def parseAsync[T](data: T, opts: Options[T]): js.Promise[String] = js.native
  def parseAsync[T](data: T, opts: Options[T], transformOpts: TransformOptions): js.Promise[String] = js.native
  def parseAsync[T](data: js.Array[T]): js.Promise[String] = js.native
  def parseAsync[T](data: js.Array[T], opts: Options[T]): js.Promise[String] = js.native
  def parseAsync[T](data: js.Array[T], opts: Options[T], transformOpts: TransformOptions): js.Promise[String] = js.native
  def parseAsync[T](data: Readable): js.Promise[String] = js.native
  def parseAsync[T](data: Readable, opts: Options[T]): js.Promise[String] = js.native
  def parseAsync[T](data: Readable, opts: Options[T], transformOpts: TransformOptions): js.Promise[String] = js.native
  @js.native
  object transforms extends js.Object {
    def flatten(): Json2CsvTransform[_, _] = js.native
    def flatten(options: FlattenOptions): Json2CsvTransform[_, _] = js.native
    def unwind(): Json2CsvTransform[_, js.Array[_]] = js.native
    def unwind(options: UnwindOptions): Json2CsvTransform[_, js.Array[_]] = js.native
  }
  
}

