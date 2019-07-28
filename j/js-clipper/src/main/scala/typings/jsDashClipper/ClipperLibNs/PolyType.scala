package typings.jsDashClipper.ClipperLibNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PolyType extends js.Object

@JSGlobal("ClipperLib.PolyType")
@js.native
object PolyType extends js.Object {
  @js.native
  sealed trait ptClip extends PolyType
  
  @js.native
  sealed trait ptSubject extends PolyType
  
  /* 1 */ val ptClip: typings.jsDashClipper.ClipperLibNs.PolyType.ptClip with Double = js.native
  /* 0 */ val ptSubject: typings.jsDashClipper.ClipperLibNs.PolyType.ptSubject with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PolyType with Double] = js.native
}

