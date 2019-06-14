package typings
package jsDashClipperLib.ClipperLibNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Direction extends js.Object

@JSGlobal("ClipperLib.Direction")
@js.native
object Direction extends js.Object {
  @js.native
  sealed trait dLeftToRight
    extends jsDashClipperLib.ClipperLibNs.Direction
  
  @js.native
  sealed trait dRightToLeft
    extends jsDashClipperLib.ClipperLibNs.Direction
  
  /* 1 */ val dLeftToRight: dLeftToRight with scala.Double = js.native
  /* 0 */ val dRightToLeft: dRightToLeft with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[jsDashClipperLib.ClipperLibNs.Direction with scala.Double] = js.native
}

