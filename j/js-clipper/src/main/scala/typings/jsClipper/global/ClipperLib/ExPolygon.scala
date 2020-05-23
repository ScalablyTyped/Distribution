package typings.jsClipper.global.ClipperLib

import typings.std.ArrayLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ClipperLib.ExPolygon")
@js.native
class ExPolygon ()
  extends typings.jsClipper.ClipperLib.ExPolygon {
  /* CompleteClass */
  override var holes: ArrayLike[ArrayLike[typings.jsClipper.ClipperLib.IntPoint]] = js.native
  /* CompleteClass */
  override var outer: ArrayLike[typings.jsClipper.ClipperLib.IntPoint] = js.native
}

