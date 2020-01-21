package typings.jsClipper.ClipperLib

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Direction extends js.Object

@JSGlobal("ClipperLib.Direction")
@js.native
object Direction extends js.Object {
  @js.native
  sealed trait dLeftToRight extends Direction
  
  @js.native
  sealed trait dRightToLeft extends Direction
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Direction with Double] = js.native
  /* 1 */ @js.native
  object dLeftToRight extends TopLevel[dLeftToRight with Double]
  
  /* 0 */ @js.native
  object dRightToLeft extends TopLevel[dRightToLeft with Double]
  
}

