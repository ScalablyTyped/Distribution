package typings.json2csv.jSON2CSVAsyncParserMod

import typings.json2csv.jSON2CSVBaseMod.json2csvNs.Options
import typings.node.streamMod.TransformOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("json2csv/JSON2CSVAsyncParser", JSImport.Default)
@js.native
class default[T] () extends JSON2CSVAsyncParser[T] {
  def this(opts: Options[T]) = this()
  def this(opts: Options[T], transformOpts: TransformOptions) = this()
}

