package typings
package jsDashClipperLib.ClipperLibNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PolyFillType extends js.Object

@JSGlobal("ClipperLib.PolyFillType")
@js.native
object PolyFillType extends js.Object {
  @js.native
  sealed trait pftEvenOdd
    extends jsDashClipperLib.ClipperLibNs.PolyFillType
  
  @js.native
  sealed trait pftNegative
    extends jsDashClipperLib.ClipperLibNs.PolyFillType
  
  @js.native
  sealed trait pftNonZero
    extends jsDashClipperLib.ClipperLibNs.PolyFillType
  
  @js.native
  sealed trait pftPositive
    extends jsDashClipperLib.ClipperLibNs.PolyFillType
  
  /* 0 */ val pftEvenOdd: pftEvenOdd with scala.Double = js.native
  /* 3 */ val pftNegative: pftNegative with scala.Double = js.native
  /* 1 */ val pftNonZero: pftNonZero with scala.Double = js.native
  /* 2 */ val pftPositive: pftPositive with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[jsDashClipperLib.ClipperLibNs.PolyFillType with scala.Double] = js.native
}

