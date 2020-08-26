package typings.ionicCore

import typings.ionicCore.checkboxInterfaceMod.CheckboxChangeEventDetail
import typings.ionicCore.mod.Color
import typings.ionicCore.mod.StyleEventDetail
import typings.ionicCore.stencilPublicRuntimeMod.ComponentInterface
import typings.ionicCore.stencilPublicRuntimeMod.EventEmitter
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/core/dist/types/components/checkbox/checkbox", JSImport.Namespace)
@js.native
object checkboxMod extends js.Object {
  @js.native
  class Checkbox () extends ComponentInterface {
    var buttonEl: js.Any = js.native
    /**
      * If `true`, the checkbox is selected.
      */
    var checked: Boolean = js.native
    /**
      * The color to use from your application's color palette.
      * Default options are: `"primary"`, `"secondary"`, `"tertiary"`, `"success"`, `"warning"`, `"danger"`, `"light"`, `"medium"`, and `"dark"`.
      * For more information on colors, see [theming](/docs/theming/basics).
      */
    var color: js.UndefOr[Color] = js.native
    /**
      * If `true`, the user cannot interact with the checkbox.
      */
    var disabled: Boolean = js.native
    var el: HTMLElement = js.native
    var emitStyle: js.Any = js.native
    /**
      * If `true`, the checkbox will visually appear as indeterminate.
      */
    var indeterminate: Boolean = js.native
    var inputId: js.Any = js.native
    /**
      * Emitted when the toggle loses focus.
      */
    var ionBlur: EventEmitter[Unit] = js.native
    /**
      * Emitted when the checked property has changed.
      */
    var ionChange: EventEmitter[CheckboxChangeEventDetail] = js.native
    /**
      * Emitted when the toggle has focus.
      */
    var ionFocus: EventEmitter[Unit] = js.native
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
    var setFocus: js.Any = js.native
    /**
      * The value of the toggle does not mean if it's checked or not, use the `checked`
      * property for that.
      *
      * The value of a toggle is analogous to the value of a `<input type="checkbox">`,
      * it's only used when the toggle participates in a native `<form>`.
      */
    var value: String = js.native
    def checkedChanged(isChecked: Boolean): Unit = js.native
    @JSName("componentWillLoad")
    def componentWillLoad_MCheckbox(): Unit = js.native
    def disabledChanged(): Unit = js.native
    @JSName("render")
    def render_MCheckbox(): js.Any = js.native
  }
  
}

