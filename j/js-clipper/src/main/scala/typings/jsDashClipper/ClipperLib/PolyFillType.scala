package typings.jsDashClipper.ClipperLib

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PolyFillType with Double] = js.native
  /* 0 */ @js.native
  object pftEvenOdd extends TopLevel[pftEvenOdd with Double]
  
  /* 3 */ @js.native
  object pftNegative extends TopLevel[pftNegative with Double]
  
  /* 1 */ @js.native
  object pftNonZero extends TopLevel[pftNonZero with Double]
  
  /* 2 */ @js.native
  object pftPositive extends TopLevel[pftPositive with Double]
  
}

