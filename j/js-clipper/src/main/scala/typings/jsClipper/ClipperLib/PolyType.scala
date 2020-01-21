package typings.jsClipper.ClipperLib

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PolyType extends js.Object

@JSGlobal("ClipperLib.PolyType")
@js.native
object PolyType extends js.Object {
  @js.native
  sealed trait ptClip extends PolyType
  
  @js.native
  sealed trait ptSubject extends PolyType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PolyType with Double] = js.native
  /* 1 */ @js.native
  object ptClip extends TopLevel[ptClip with Double]
  
  /* 0 */ @js.native
  object ptSubject extends TopLevel[ptSubject with Double]
  
}

