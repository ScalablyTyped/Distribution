package typings.json2csv.jSON2CSVAsyncParserMod

import typings.node.streamMod.Readable
import typings.node.streamMod.Transform
import typings.node.streamMod.Writable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JSON2CSVAsyncParser[T]
  extends typings.json2csv.jSON2CSVBaseMod.default[T] {
  var input: Transform = js.native
  var processor: Writable = js.native
  var transform: typings.json2csv.jSON2CSVTransformMod.default[T] = js.native
  def fromInput(input: Readable): JSON2CSVAsyncParser[T] = js.native
  def promise(): js.Promise[String] = js.native
  def throughTransform(transform: Transform): JSON2CSVAsyncParser[T] = js.native
  def toOutput(output: Writable): JSON2CSVAsyncParser[T] = js.native
}

