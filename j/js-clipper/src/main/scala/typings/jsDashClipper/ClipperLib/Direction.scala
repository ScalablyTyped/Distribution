package typings.jsDashClipper.ClipperLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Direction extends js.Object

@JSGlobal("ClipperLib.Direction")
@js.native
object Direction extends js.Object {
  @js.native
  sealed trait dLeftToRight extends Direction
  
  @js.native
  sealed trait dRightToLeft extends Direction
  
  /* 1 */ val dLeftToRight: typings.jsDashClipper.ClipperLib.Direction.dLeftToRight with Double = js.native
  /* 0 */ val dRightToLeft: typings.jsDashClipper.ClipperLib.Direction.dRightToLeft with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Direction with Double] = js.native
}

