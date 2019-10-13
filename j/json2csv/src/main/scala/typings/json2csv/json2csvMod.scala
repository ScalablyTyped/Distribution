package typings.json2csv

import typings.json2csv.jSON2CSVAsyncParserMod.default
import typings.json2csv.jSON2CSVBaseMod.json2csv.Options
import typings.json2csv.jSON2CSVParserMod.JSON2CSVParser
import typings.node.streamMod.Readable
import typings.node.streamMod.TransformOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("json2csv", JSImport.Namespace)
@js.native
object json2csvMod extends js.Object {
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
    extends typings.json2csv.jSON2CSVTransformMod.default[T] {
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
}

