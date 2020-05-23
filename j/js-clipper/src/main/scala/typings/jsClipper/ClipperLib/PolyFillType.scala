package typings.jsClipper.ClipperLib

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
  
}

