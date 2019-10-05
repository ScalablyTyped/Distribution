package typings.jsDashClipper.ClipperLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ClipType extends js.Object

@JSGlobal("ClipperLib.ClipType")
@js.native
object ClipType extends js.Object {
  @js.native
  sealed trait ctDifference extends ClipType
  
  @js.native
  sealed trait ctIntersection extends ClipType
  
  @js.native
  sealed trait ctUnion extends ClipType
  
  @js.native
  sealed trait ctXor extends ClipType
  
  /* 2 */ val ctDifference: typings.jsDashClipper.ClipperLib.ClipType.ctDifference with Double = js.native
  /* 0 */ val ctIntersection: typings.jsDashClipper.ClipperLib.ClipType.ctIntersection with Double = js.native
  /* 1 */ val ctUnion: typings.jsDashClipper.ClipperLib.ClipType.ctUnion with Double = js.native
  /* 3 */ val ctXor: typings.jsDashClipper.ClipperLib.ClipType.ctXor with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ClipType with Double] = js.native
}

