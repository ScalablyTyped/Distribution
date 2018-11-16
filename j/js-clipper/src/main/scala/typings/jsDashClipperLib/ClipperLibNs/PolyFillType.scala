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
  
  val pftEvenOdd: pftEvenOdd with java.lang.String = js.native
  val pftNegative: pftNegative with java.lang.String = js.native
  val pftNonZero: pftNonZero with java.lang.String = js.native
  val pftPositive: pftPositive with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[jsDashClipperLib.ClipperLibNs.PolyFillType with java.lang.String] = js.native
}

