package typings.ionicCore

import typings.ionicCore.selectPopoverInterfaceMod.SelectPopoverOption
import typings.ionicCore.stencilCoreMod.ComponentInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/core/dist/types/components/select-popover/select-popover", JSImport.Namespace)
@js.native
object selectPopoverMod extends js.Object {
  @js.native
  class SelectPopover () extends ComponentInterface {
    /** Header text for the popover */
    var header: js.UndefOr[String] = js.native
    /** Text for popover body */
    var message: js.UndefOr[String] = js.native
    /** Array of options for the popover */
    var options: js.Array[SelectPopoverOption] = js.native
    /** Subheader text for the popover */
    var subHeader: js.UndefOr[String] = js.native
    def onSelect(ev: js.Any): Unit = js.native
    @JSName("render")
    def render_MSelectPopover(): js.Any = js.native
  }
  
}

