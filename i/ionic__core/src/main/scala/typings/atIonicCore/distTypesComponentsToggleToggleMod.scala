package typings.atIonicCore

import typings.atIonicCore.atIonicCoreMod.Color
import typings.atIonicCore.atIonicCoreMod.StyleEventDetail
import typings.atIonicCore.distTypesComponentsToggleToggleDashInterfaceMod.ToggleChangeEventDetail
import typings.atIonicCore.distTypesStencilDotCoreMod.ComponentInterface
import typings.atIonicCore.distTypesStencilDotCoreMod.EventEmitter
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/core/dist/types/components/toggle/toggle", JSImport.Namespace)
@js.native
object distTypesComponentsToggleToggleMod extends js.Object {
  @js.native
  class Toggle () extends ComponentInterface {
    var activated: Boolean = js.native
    var buttonEl: js.UndefOr[js.Any] = js.native
    /**
      * If `true`, the toggle is selected.
      */
    var checked: Boolean = js.native
    /**
      * The color to use from your application's color palette.
      * Default options are: `"primary"`, `"secondary"`, `"tertiary"`, `"success"`, `"warning"`, `"danger"`, `"light"`, `"medium"`, and `"dark"`.
      * For more information on colors, see [theming](/docs/theming/basics).
      */
    var color: js.UndefOr[Color] = js.native
    /**
      * If `true`, the user cannot interact with the toggle.
      */
    var disabled: Boolean = js.native
    var el: HTMLElement = js.native
    var emitStyle: js.Any = js.native
    var gesture: js.UndefOr[js.Any] = js.native
    var getValue: js.Any = js.native
    var inputId: js.Any = js.native
    /**
      * Emitted when the toggle loses focus.
      */
    var ionBlur: EventEmitter[Unit] = js.native
    /**
      * Emitted when the value property has changed.
      */
    var ionChange: EventEmitter[ToggleChangeEventDetail] = js.native
    /**
      * Emitted when the toggle has focus.
      */
    var ionFocus: EventEmitter[Unit] = js.native
    /**
      * Emitted when the styles change.
      * @internal
      */
    var ionStyle: EventEmitter[StyleEventDetail] = js.native
    var lastDrag: js.Any = js.native
    /**
      * The name of the control, which is submitted with the form data.
      */
    var name: String = js.native
    var onBlur: js.Any = js.native
    var onClick: js.Any = js.native
    var onEnd: js.Any = js.native
    var onFocus: js.Any = js.native
    var onMove: js.Any = js.native
    var onStart: js.Any = js.native
    var setFocus: js.Any = js.native
    /**
      * The value of the toggle does not mean if it's checked or not, use the `checked`
      * property for that.
      *
      * The value of a toggle is analogous to the value of a `<input type="checkbox">`,
      * it's only used when the toggle participates in a native `<form>`.
      */
    var value: js.UndefOr[String | Null] = js.native
    def checkedChanged(isChecked: Boolean): Unit = js.native
    @JSName("componentWillLoad")
    def componentWillLoad_MToggle(): Unit = js.native
    @JSName("connectedCallback")
    def connectedCallback_MToggle(): js.Promise[Unit] = js.native
    def disabledChanged(): Unit = js.native
    @JSName("disconnectedCallback")
    def disconnectedCallback_MToggle(): Unit = js.native
    @JSName("render")
    def render_MToggle(): js.Any = js.native
  }
  
}

