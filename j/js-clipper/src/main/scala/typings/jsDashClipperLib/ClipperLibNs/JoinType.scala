package typings
package jsDashClipperLib.ClipperLibNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait JoinType extends js.Object

@JSGlobal("ClipperLib.JoinType")
@js.native
object JoinType extends js.Object {
  @js.native
  sealed trait jtMiter
    extends jsDashClipperLib.ClipperLibNs.JoinType
  
  @js.native
  sealed trait jtRound
    extends jsDashClipperLib.ClipperLibNs.JoinType
  
  @js.native
  sealed trait jtSquare
    extends jsDashClipperLib.ClipperLibNs.JoinType
  
  /* 2 */ val jtMiter: jtMiter with scala.Double = js.native
  /* 1 */ val jtRound: jtRound with scala.Double = js.native
  /* 0 */ val jtSquare: jtSquare with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[jsDashClipperLib.ClipperLibNs.JoinType with scala.Double] = js.native
}

