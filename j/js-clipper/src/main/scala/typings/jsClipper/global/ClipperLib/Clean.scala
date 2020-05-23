package typings.jsClipper.global.ClipperLib

import typings.std.ArrayLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ClipperLib.Clean")
@js.native
object Clean extends js.Object {
  def apply(
    polygon: ArrayLike[
      ArrayLike[typings.jsClipper.ClipperLib.IntPoint] | typings.jsClipper.ClipperLib.IntPoint
    ],
    delta: Double
  ): ArrayLike[
    ArrayLike[typings.jsClipper.ClipperLib.IntPoint] | typings.jsClipper.ClipperLib.IntPoint
  ] = js.native
}

