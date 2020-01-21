package typings.jsClipper.ClipperLib

import typings.std.ArrayLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ClipperLib.ExPolygon")
@js.native
class ExPolygon () extends js.Object {
  var holes: ArrayLike[ArrayLike[IntPoint]] = js.native
  var outer: ArrayLike[IntPoint] = js.native
}

