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
  
  val dLeftToRight: dLeftToRight with java.lang.String = js.native
  val dRightToLeft: dRightToLeft with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[jsDashClipperLib.ClipperLibNs.Direction with java.lang.String] = js.native
}

