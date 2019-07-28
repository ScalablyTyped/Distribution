package typings.jqueryDotFancytree.FancytreeNs

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
  
  /* 2 */ val multi: typings.jqueryDotFancytree.FancytreeNs.FancytreeSelectMode.multi with Double = js.native
  /* 3 */ val mutlti_hier: typings.jqueryDotFancytree.FancytreeNs.FancytreeSelectMode.mutlti_hier with Double = js.native
  /* 1 */ val single: typings.jqueryDotFancytree.FancytreeNs.FancytreeSelectMode.single with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FancytreeSelectMode with Double] = js.native
}

