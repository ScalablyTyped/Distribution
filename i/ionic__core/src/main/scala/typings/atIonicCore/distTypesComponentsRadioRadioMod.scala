package typings.atIonicCore

import typings.atIonicCore.atIonicCoreMod.Color
import typings.atIonicCore.atIonicCoreMod.StyleEventDetail
import typings.atIonicCore.distTypesComponentsRadioDashGroupRadioDashGroupDashInterfaceMod.RadioChangeEventDetail
import typings.atIonicCore.distTypesStencilDotCoreMod.ComponentInterface
import typings.atIonicCore.distTypesStencilDotCoreMod.EventEmitter
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/core/dist/types/components/radio/radio", JSImport.Namespace)
@js.native
object distTypesComponentsRadioRadioMod extends js.Object {
  @js.native
  class Radio () extends ComponentInterface {
    /**
      * If `true`, the radio is selected.
      */
    var checked: Boolean = js.native
    /**
      * The color to use from your application's color palette.
      * Default options are: `"primary"`, `"secondary"`, `"tertiary"`, `"success"`, `"warning"`, `"danger"`, `"light"`, `"medium"`, and `"dark"`.
      * For more information on colors, see [theming](/docs/theming/basics).
      */
    var color: js.UndefOr[Color] = js.native
    /**
      * If `true`, the user cannot interact with the radio.
      */
    var disabled: Boolean = js.native
    var el: HTMLElement = js.native
    var emitStyle: js.Any = js.native
    var inputId: js.Any = js.native
    /**
      * Emitted when the radio button loses focus.
      */
    var ionBlur: EventEmitter[Unit] = js.native
    /**
      * Emitted when checked radio button is selected.
      * @internal
      */
    var ionDeselect: EventEmitter[RadioChangeEventDetail] = js.native
    /**
      * Emitted when the radio button has focus.
      */
    var ionFocus: EventEmitter[Unit] = js.native
    /**
      * Emitted when the radio button is selected.
      */
    var ionSelect: EventEmitter[RadioChangeEventDetail] = js.native
    /**
      * Emitted when the styles change.
      * @internal
      */
    var ionStyle: EventEmitter[StyleEventDetail] = js.native
    /**
      * The name of the control, which is submitted with the form data.
      */
    var name: String = js.native
    var onBlur: js.Any = js.native
    var onClick: js.Any = js.native
    var onFocus: js.Any = js.native
    /**
      * the value of the radio.
      */
    var value: js.UndefOr[js.Any | Null] = js.native
    def checkedChanged(isChecked: Boolean): Unit = js.native
    def colorChanged(): Unit = js.native
    @JSName("componentWillLoad")
    def componentWillLoad_MRadio(): Unit = js.native
    def disabledChanged(): Unit = js.native
    @JSName("render")
    def render_MRadio(): js.Any = js.native
  }
  
}

