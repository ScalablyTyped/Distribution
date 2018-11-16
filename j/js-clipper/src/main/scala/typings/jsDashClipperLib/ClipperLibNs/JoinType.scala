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
  
  val jtMiter: jtMiter with java.lang.String = js.native
  val jtRound: jtRound with java.lang.String = js.native
  val jtSquare: jtSquare with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[jsDashClipperLib.ClipperLibNs.JoinType with java.lang.String] = js.native
}

