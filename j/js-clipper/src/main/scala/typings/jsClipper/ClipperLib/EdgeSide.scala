package typings.jsClipper.ClipperLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EdgeSide extends js.Object

@JSGlobal("ClipperLib.EdgeSide")
@js.native
object EdgeSide extends js.Object {
  @js.native
  sealed trait esLeft extends EdgeSide
  
  @js.native
  sealed trait esRight extends EdgeSide
  
}

