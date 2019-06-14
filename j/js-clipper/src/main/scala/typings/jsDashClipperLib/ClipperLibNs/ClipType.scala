package typings
package jsDashClipperLib.ClipperLibNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ClipType extends js.Object

@JSGlobal("ClipperLib.ClipType")
@js.native
object ClipType extends js.Object {
  @js.native
  sealed trait ctDifference
    extends jsDashClipperLib.ClipperLibNs.ClipType
  
  @js.native
  sealed trait ctIntersection
    extends jsDashClipperLib.ClipperLibNs.ClipType
  
  @js.native
  sealed trait ctUnion
    extends jsDashClipperLib.ClipperLibNs.ClipType
  
  @js.native
  sealed trait ctXor
    extends jsDashClipperLib.ClipperLibNs.ClipType
  
  /* 2 */ val ctDifference: ctDifference with scala.Double = js.native
  /* 0 */ val ctIntersection: ctIntersection with scala.Double = js.native
  /* 1 */ val ctUnion: ctUnion with scala.Double = js.native
  /* 3 */ val ctXor: ctXor with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[jsDashClipperLib.ClipperLibNs.ClipType with scala.Double] = js.native
}

