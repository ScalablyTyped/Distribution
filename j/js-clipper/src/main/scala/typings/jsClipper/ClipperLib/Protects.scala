package typings.jsClipper.ClipperLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Protects extends js.Object

@JSGlobal("ClipperLib.Protects")
@js.native
object Protects extends js.Object {
  @js.native
  sealed trait ipBoth extends Protects
  
  @js.native
  sealed trait ipLeft extends Protects
  
  @js.native
  sealed trait ipNone extends Protects
  
  @js.native
  sealed trait ipRight extends Protects
  
}

