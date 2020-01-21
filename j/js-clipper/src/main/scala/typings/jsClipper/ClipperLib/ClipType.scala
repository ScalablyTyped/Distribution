package typings.jsClipper.ClipperLib

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ClipType with Double] = js.native
  /* 2 */ @js.native
  object ctDifference extends TopLevel[ctDifference with Double]
  
  /* 0 */ @js.native
  object ctIntersection extends TopLevel[ctIntersection with Double]
  
  /* 1 */ @js.native
  object ctUnion extends TopLevel[ctUnion with Double]
  
  /* 3 */ @js.native
  object ctXor extends TopLevel[ctXor with Double]
  
}

