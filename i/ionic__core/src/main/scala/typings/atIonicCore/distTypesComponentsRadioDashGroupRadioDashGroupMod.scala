package typings.atIonicCore

import typings.atIonicCore.distTypesComponentsRadioDashGroupRadioDashGroupDashInterfaceMod.RadioGroupChangeEventDetail
import typings.atIonicCore.distTypesStencilDotCoreMod.ComponentInterface
import typings.atIonicCore.distTypesStencilDotCoreMod.EventEmitter
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/core/dist/types/components/radio-group/radio-group", JSImport.Namespace)
@js.native
object distTypesComponentsRadioDashGroupRadioDashGroupMod extends js.Object {
  @js.native
  class RadioGroup () extends ComponentInterface {
    /**
      * If `true`, the radios can be deselected.
      */
    var allowEmptySelection: Boolean = js.native
    var el: HTMLElement = js.native
    var getRadios: js.Any = js.native
    var inputId: js.Any = js.native
    /**
      * Emitted when the value has changed.
      */
    var ionChange: EventEmitter[RadioGroupChangeEventDetail] = js.native
    var labelId: js.Any = js.native
    var mutationO: js.UndefOr[js.Any] = js.native
    /**
      * The name of the control, which is submitted with the form data.
      */
    var name: String = js.native
    var onDeselect: js.Any = js.native
    var onSelect: js.Any = js.native
    var updateRadios: js.Any = js.native
    /**
      * the value of the radio group.
      */
    var value: js.UndefOr[js.Any | Null] = js.native
    @JSName("connectedCallback")
    def connectedCallback_MRadioGroup(): js.Promise[Unit] = js.native
    @JSName("disconnectedCallback")
    def disconnectedCallback_MRadioGroup(): Unit = js.native
    @JSName("render")
    def render_MRadioGroup(): js.Any = js.native
    def valueChanged(): Unit = js.native
    def valueChanged(value: js.Any): Unit = js.native
  }
  
}

