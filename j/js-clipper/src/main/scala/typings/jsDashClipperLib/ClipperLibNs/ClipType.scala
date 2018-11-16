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
  
  val ctDifference: ctDifference with java.lang.String = js.native
  val ctIntersection: ctIntersection with java.lang.String = js.native
  val ctUnion: ctUnion with java.lang.String = js.native
  val ctXor: ctXor with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[jsDashClipperLib.ClipperLibNs.ClipType with java.lang.String] = js.native
}

