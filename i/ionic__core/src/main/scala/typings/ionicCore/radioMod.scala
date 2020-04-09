package typings.ionicCore

import typings.ionicCore.mod.Color
import typings.ionicCore.mod.StyleEventDetail
import typings.ionicCore.stencilPublicRuntimeMod.ComponentInterface
import typings.ionicCore.stencilPublicRuntimeMod.EventEmitter
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/core/dist/types/components/radio/radio", JSImport.Namespace)
@js.native
object radioMod extends js.Object {
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
    var inputId: js.Any = js.native
    /**
      * Emitted when the radio button loses focus.
      */
    var ionBlur: EventEmitter[Unit] = js.native
    /**
      * Emitted when the radio button has focus.
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
    var onFocus: js.Any = js.native
    var radioGroup: js.Any = js.native
    var updateState: js.Any = js.native
    /**
      * the value of the radio.
      */
    var value: js.UndefOr[js.Any | Null] = js.native
    @JSName("componentWillLoad")
    def componentWillLoad_MRadio(): Unit = js.native
    @JSName("connectedCallback")
    def connectedCallback_MRadio(): Unit = js.native
    @JSName("disconnectedCallback")
    def disconnectedCallback_MRadio(): Unit = js.native
    def emitStyle(): Unit = js.native
    @JSName("render")
    def render_MRadio(): js.Any = js.native
  }
  
}

