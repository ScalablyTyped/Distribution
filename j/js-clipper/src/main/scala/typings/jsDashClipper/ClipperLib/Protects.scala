package typings.jsDashClipper.ClipperLib

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
  
  /* 3 */ val ipBoth: typings.jsDashClipper.ClipperLib.Protects.ipBoth with Double = js.native
  /* 1 */ val ipLeft: typings.jsDashClipper.ClipperLib.Protects.ipLeft with Double = js.native
  /* 0 */ val ipNone: typings.jsDashClipper.ClipperLib.Protects.ipNone with Double = js.native
  /* 2 */ val ipRight: typings.jsDashClipper.ClipperLib.Protects.ipRight with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Protects with Double] = js.native
}

