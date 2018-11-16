package typings
package jqueryDotFancytreeLib.FancytreeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FancytreeSelectMode extends js.Object

@JSGlobal("Fancytree.FancytreeSelectMode")
@js.native
object FancytreeSelectMode extends js.Object {
  @js.native
  sealed trait multi
    extends jqueryDotFancytreeLib.FancytreeNs.FancytreeSelectMode
  
  @js.native
  sealed trait mutlti_hier
    extends jqueryDotFancytreeLib.FancytreeNs.FancytreeSelectMode
  
  @js.native
  sealed trait single
    extends jqueryDotFancytreeLib.FancytreeNs.FancytreeSelectMode
  
  /* 2 */ val multi: multi with scala.Double = js.native
  /* 3 */ val mutlti_hier: mutlti_hier with scala.Double = js.native
  /* 1 */ val single: single with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[jqueryDotFancytreeLib.FancytreeNs.FancytreeSelectMode with scala.Double] = js.native
}

