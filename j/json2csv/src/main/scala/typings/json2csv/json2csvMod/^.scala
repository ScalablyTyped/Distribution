package typings.json2csv.json2csvMod

import typings.json2csv.jSON2CSVBaseMod.json2csvNs.Options
import typings.node.streamMod.Readable
import typings.node.streamMod.TransformOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("json2csv", JSImport.Namespace)
@js.native
object ^ extends js.Object {
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

