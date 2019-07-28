package typings.json2csv.jSON2CSVTransformMod

import typings.json2csv.jSON2CSVBaseMod.json2csvNs.Options
import typings.node.streamMod.TransformOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("json2csv/JSON2CSVTransform", JSImport.Default)
@js.native
// implements JSON2CSVBase<T>
class default[T] () extends JSON2CSVTransform[T] {
  def this(opts: Options[T]) = this()
  def this(opts: Options[T], transformOpts: TransformOptions) = this()
}

