package typings.jsClipper.ClipperLib

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
  
}

