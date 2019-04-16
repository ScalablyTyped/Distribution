package typings
package json2csvLib.jSON2CSVAsyncParserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JSON2CSVAsyncParser[T]
  extends json2csvLib.jSON2CSVBaseMod.default[T] {
  var input: nodeLib.streamMod.Transform = js.native
  var processor: nodeLib.streamMod.Writable = js.native
  var transform: json2csvLib.jSON2CSVTransformMod.default[T] = js.native
  def fromInput(input: nodeLib.streamMod.Readable): JSON2CSVAsyncParser[T] = js.native
  def promise(): js.Promise[java.lang.String] = js.native
  def throughTransform(transform: nodeLib.streamMod.Transform): JSON2CSVAsyncParser[T] = js.native
  def toOutput(output: nodeLib.streamMod.Writable): JSON2CSVAsyncParser[T] = js.native
}

