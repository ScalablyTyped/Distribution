package typings.jqueryDashCropbox.jQueryCropBox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ShowControls extends js.Object

@JSGlobal("jQueryCropBox.ShowControls")
@js.native
object ShowControls extends js.Object {
  @js.native
  sealed trait always extends ShowControls
  
  @js.native
  sealed trait auto extends ShowControls
  
  @js.native
  sealed trait hover extends ShowControls
  
  @js.native
  sealed trait never extends ShowControls
  
  /* 1 */ val always: typings.jqueryDashCropbox.jQueryCropBox.ShowControls.always with Double = js.native
  /* 3 */ val auto: typings.jqueryDashCropbox.jQueryCropBox.ShowControls.auto with Double = js.native
  /* 2 */ val hover: typings.jqueryDashCropbox.jQueryCropBox.ShowControls.hover with Double = js.native
  /* 0 */ val never: typings.jqueryDashCropbox.jQueryCropBox.ShowControls.never with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ShowControls with Double] = js.native
}

