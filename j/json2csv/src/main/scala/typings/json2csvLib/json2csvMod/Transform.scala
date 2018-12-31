package typings
package json2csvLib.json2csvMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("json2csv", "Transform")
@js.native
// implements JSON2CSVBase<T>
class Transform[T] ()
  extends json2csvLib.json2csvtransformMod.default[T] {
  def this(opts: json2csvLib.json2csvbaseMod.json2csvNs.Options[T]) = this()
  def this(opts: json2csvLib.json2csvbaseMod.json2csvNs.Options[T], transformOpts: nodeLib.streamMod.internalNs.TransformOptions) = this()
}

