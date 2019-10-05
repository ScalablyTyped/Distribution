package typings.jsDashClipper.ClipperLib

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
  
  /* 0 */ val esLeft: typings.jsDashClipper.ClipperLib.EdgeSide.esLeft with Double = js.native
  /* 1 */ val esRight: typings.jsDashClipper.ClipperLib.EdgeSide.esRight with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EdgeSide with Double] = js.native
}

