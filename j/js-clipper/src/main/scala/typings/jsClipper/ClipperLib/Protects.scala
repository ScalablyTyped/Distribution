package typings.jsClipper.ClipperLib

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Protects with Double] = js.native
  /* 3 */ @js.native
  object ipBoth extends TopLevel[ipBoth with Double]
  
  /* 1 */ @js.native
  object ipLeft extends TopLevel[ipLeft with Double]
  
  /* 0 */ @js.native
  object ipNone extends TopLevel[ipNone with Double]
  
  /* 2 */ @js.native
  object ipRight extends TopLevel[ipRight with Double]
  
}

