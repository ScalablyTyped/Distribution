package typings
package jqueryDashCropboxLib.jQueryCropBoxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ShowControls extends js.Object

@JSGlobal("jQueryCropBox.ShowControls")
@js.native
object ShowControls extends js.Object {
  @js.native
  sealed trait always
    extends jqueryDashCropboxLib.jQueryCropBoxNs.ShowControls
  
  @js.native
  sealed trait auto
    extends jqueryDashCropboxLib.jQueryCropBoxNs.ShowControls
  
  @js.native
  sealed trait hover
    extends jqueryDashCropboxLib.jQueryCropBoxNs.ShowControls
  
  @js.native
  sealed trait never
    extends jqueryDashCropboxLib.jQueryCropBoxNs.ShowControls
  
  /* 1 */ val always: always with scala.Double = js.native
  /* 3 */ val auto: auto with scala.Double = js.native
  /* 2 */ val hover: hover with scala.Double = js.native
  /* 0 */ val never: never with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[jqueryDashCropboxLib.jQueryCropBoxNs.ShowControls with scala.Double] = js.native
}

