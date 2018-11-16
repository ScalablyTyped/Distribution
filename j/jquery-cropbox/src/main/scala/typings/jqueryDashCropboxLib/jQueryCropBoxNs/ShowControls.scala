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
  
  val always: always with java.lang.String = js.native
  val auto: auto with java.lang.String = js.native
  val hover: hover with java.lang.String = js.native
  val never: never with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[jqueryDashCropboxLib.jQueryCropBoxNs.ShowControls with java.lang.String] = js.native
}

