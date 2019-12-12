package typings.jsDashClipper.ClipperLib

import org.scalablytyped.runtime.TopLevel
import typings.jsDashClipper.ClipperLib.JoinType.jtMiter
import typings.jsDashClipper.ClipperLib.JoinType.jtRound
import typings.jsDashClipper.ClipperLib.JoinType.jtSquare
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait JoinType extends js.Object

@JSGlobal("ClipperLib.JoinType")
@js.native
object JoinType extends js.Object {
  @js.native
  sealed trait jtMiter extends JoinType
  
  @js.native
  sealed trait jtRound extends JoinType
  
  @js.native
  sealed trait jtSquare extends JoinType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[JoinType with Double] = js.native
  /* 2 */ @js.native
  object jtMiter extends TopLevel[jtMiter with Double]
  
  /* 1 */ @js.native
  object jtRound extends TopLevel[jtRound with Double]
  
  /* 0 */ @js.native
  object jtSquare extends TopLevel[jtSquare with Double]
  
}

