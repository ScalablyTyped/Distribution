package typings.jsClipper.ClipperLib

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
  
}

