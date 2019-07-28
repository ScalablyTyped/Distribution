package typings.json2csv.json2csvMod

import typings.json2csv.jSON2CSVBaseMod.json2csvNs.Options
import typings.json2csv.jSON2CSVTransformMod.default
import typings.node.streamMod.TransformOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("json2csv", "Transform")
@js.native
// implements JSON2CSVBase<T>
class Transform[T] () extends default[T] {
  def this(opts: Options[T]) = this()
  def this(opts: Options[T], transformOpts: TransformOptions) = this()
}

