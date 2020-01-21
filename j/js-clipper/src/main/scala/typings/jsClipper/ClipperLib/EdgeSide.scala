package typings.jsClipper.ClipperLib

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EdgeSide extends js.Object

@JSGlobal("ClipperLib.EdgeSide")
@js.native
object EdgeSide extends js.Object {
  @js.native
  sealed trait esLeft extends EdgeSide
  
  @js.native
  sealed trait esRight extends EdgeSide
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EdgeSide with Double] = js.native
  /* 0 */ @js.native
  object esLeft extends TopLevel[esLeft with Double]
  
  /* 1 */ @js.native
  object esRight extends TopLevel[esRight with Double]
  
}

