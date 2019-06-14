package typings
package jsDashClipperLib.ClipperLibNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EdgeSide extends js.Object

@JSGlobal("ClipperLib.EdgeSide")
@js.native
object EdgeSide extends js.Object {
  @js.native
  sealed trait esLeft
    extends jsDashClipperLib.ClipperLibNs.EdgeSide
  
  @js.native
  sealed trait esRight
    extends jsDashClipperLib.ClipperLibNs.EdgeSide
  
  /* 0 */ val esLeft: esLeft with scala.Double = js.native
  /* 1 */ val esRight: esRight with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[jsDashClipperLib.ClipperLibNs.EdgeSide with scala.Double] = js.native
}

