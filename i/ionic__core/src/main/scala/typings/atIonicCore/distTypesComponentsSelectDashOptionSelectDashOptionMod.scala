package typings.atIonicCore

import typings.atIonicCore.distTypesStencilDotCoreMod.ComponentInterface
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/core/dist/types/components/select-option/select-option", JSImport.Namespace)
@js.native
object distTypesComponentsSelectDashOptionSelectDashOptionMod extends js.Object {
  @js.native
  class SelectOption () extends ComponentInterface {
    /**
      * If `true`, the user cannot interact with the select option.
      */
    var disabled: Boolean = js.native
    var el: HTMLElement = js.native
    var inputId: js.Any = js.native
    /**
      * If `true`, the element is selected.
      */
    var selected: Boolean = js.native
    /**
      * The text value of the option.
      */
    var value: js.UndefOr[js.Any | Null] = js.native
    @JSName("render")
    def render_MSelectOption(): js.Any = js.native
  }
  
}

