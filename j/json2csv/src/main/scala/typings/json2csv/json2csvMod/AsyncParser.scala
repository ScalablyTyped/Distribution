package typings.json2csv.json2csvMod

import typings.json2csv.jSON2CSVAsyncParserMod.default
import typings.json2csv.jSON2CSVBaseMod.json2csvNs.Options
import typings.node.streamMod.TransformOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("json2csv", "AsyncParser")
@js.native
class AsyncParser[T] () extends default[T] {
  def this(opts: Options[T]) = this()
  def this(opts: Options[T], transformOpts: TransformOptions) = this()
}

