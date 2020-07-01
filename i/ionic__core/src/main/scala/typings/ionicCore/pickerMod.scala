package typings.ionicCore

import typings.ionicCore.componentsMod.global.HTMLIonPickerElement
import typings.ionicCore.overlaysInterfaceMod.OverlayEventDetail
import typings.ionicCore.overlaysInterfaceMod.OverlayInterface
import typings.ionicCore.pickerInterfaceMod.PickerButton
import typings.ionicCore.pickerInterfaceMod.PickerColumn
import typings.ionicCore.stencilPublicRuntimeMod.ComponentInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/core/dist/types/components/picker/picker", JSImport.Namespace)
@js.native
object pickerMod extends js.Object {
  @js.native
  class Picker ()
    extends ComponentInterface
       with OverlayInterface {
    /**
      * If `true`, the picker will be dismissed when the backdrop is clicked.
      */
    var backdropDismiss: Boolean = js.native
    var buttonClick: js.Any = js.native
    /**
      * Array of buttons to be displayed at the top of the picker.
      */
    var buttons: js.Array[PickerButton] = js.native
    var callButtonHandler: js.Any = js.native
    /**
      * Array of columns to be displayed in the picker.
      */
    var columns: js.Array[PickerColumn] = js.native
    /**
      * Additional classes to apply for custom CSS. If multiple classes are
      * provided they should be separated by spaces.
      */
    var cssClass: js.UndefOr[String | js.Array[String]] = js.native
    var dispatchCancelHandler: js.Any = js.native
    /**
      * Number of milliseconds to wait before dismissing the picker.
      */
    var duration: Double = js.native
    var durationTimeout: js.Any = js.native
    @JSName("el")
    var el_Picker: HTMLIonPickerElement = js.native
    var getSelected: js.Any = js.native
    var onBackdropTap: js.Any = js.native
    /**
      * If `true`, a backdrop will be displayed behind the picker.
      */
    var showBackdrop: Boolean = js.native
    /**
      * Get the column that matches the specified name.
      *
      * @param name The name of the column.
      */
    def getColumn(name: String): js.Promise[js.UndefOr[PickerColumn]] = js.native
    /**
      * Returns a promise that resolves when the picker did dismiss.
      */
    def onDidDismiss[T](): js.Promise[OverlayEventDetail[T]] = js.native
    /**
      * Returns a promise that resolves when the picker will dismiss.
      */
    def onWillDismiss[T](): js.Promise[OverlayEventDetail[T]] = js.native
    @JSName("render")
    def render_MPicker(): js.Any = js.native
  }
  
}

