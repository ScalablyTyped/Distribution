package typings.jsClipper.ClipperLib

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
  
}

