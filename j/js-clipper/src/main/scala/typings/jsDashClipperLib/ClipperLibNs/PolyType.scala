package typings
package jsDashClipperLib.ClipperLibNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PolyType extends js.Object

@JSGlobal("ClipperLib.PolyType")
@js.native
object PolyType extends js.Object {
  @js.native
  sealed trait ptClip
    extends jsDashClipperLib.ClipperLibNs.PolyType
  
  @js.native
  sealed trait ptSubject
    extends jsDashClipperLib.ClipperLibNs.PolyType
  
  /* 1 */ val ptClip: ptClip with scala.Double = js.native
  /* 0 */ val ptSubject: ptSubject with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[jsDashClipperLib.ClipperLibNs.PolyType with scala.Double] = js.native
}

