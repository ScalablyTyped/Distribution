package typings.jsDashClipper.ClipperLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PolyFillType extends js.Object

@JSGlobal("ClipperLib.PolyFillType")
@js.native
object PolyFillType extends js.Object {
  @js.native
  sealed trait pftEvenOdd extends PolyFillType
  
  @js.native
  sealed trait pftNegative extends PolyFillType
  
  @js.native
  sealed trait pftNonZero extends PolyFillType
  
  @js.native
  sealed trait pftPositive extends PolyFillType
  
  /* 0 */ val pftEvenOdd: typings.jsDashClipper.ClipperLib.PolyFillType.pftEvenOdd with Double = js.native
  /* 3 */ val pftNegative: typings.jsDashClipper.ClipperLib.PolyFillType.pftNegative with Double = js.native
  /* 1 */ val pftNonZero: typings.jsDashClipper.ClipperLib.PolyFillType.pftNonZero with Double = js.native
  /* 2 */ val pftPositive: typings.jsDashClipper.ClipperLib.PolyFillType.pftPositive with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PolyFillType with Double] = js.native
}

