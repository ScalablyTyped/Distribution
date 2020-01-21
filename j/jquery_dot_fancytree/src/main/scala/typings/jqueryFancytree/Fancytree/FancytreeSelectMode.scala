package typings.jqueryFancytree.Fancytree

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FancytreeSelectMode extends js.Object

@JSGlobal("Fancytree.FancytreeSelectMode")
@js.native
object FancytreeSelectMode extends js.Object {
  @js.native
  sealed trait multi extends FancytreeSelectMode
  
  @js.native
  sealed trait mutlti_hier extends FancytreeSelectMode
  
  @js.native
  sealed trait single extends FancytreeSelectMode
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FancytreeSelectMode with Double] = js.native
  /* 2 */ @js.native
  object multi extends TopLevel[multi with Double]
  
  /* 3 */ @js.native
  object mutlti_hier extends TopLevel[mutlti_hier with Double]
  
  /* 1 */ @js.native
  object single extends TopLevel[single with Double]
  
}

