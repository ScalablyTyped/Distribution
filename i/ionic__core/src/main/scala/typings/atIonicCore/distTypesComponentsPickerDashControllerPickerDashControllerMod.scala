package typings.atIonicCore

import typings.atIonicCore.distTypesComponentsMod._Global_.HTMLIonPickerElement
import typings.atIonicCore.distTypesComponentsPickerPickerDashInterfaceMod.PickerOptions
import typings.atIonicCore.distTypesStencilDotCoreMod.ComponentInterface
import typings.atIonicCore.distTypesUtilsOverlaysDashInterfaceMod.OverlayController
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/core/dist/types/components/picker-controller/picker-controller", JSImport.Namespace)
@js.native
object distTypesComponentsPickerDashControllerPickerDashControllerMod extends js.Object {
  @js.native
  class PickerController ()
    extends ComponentInterface
       with OverlayController {
    /**
      * Create a picker overlay with picker options.
      *
      * @param options The options to use to create the picker.
      */
    def create(options: PickerOptions): js.Promise[HTMLIonPickerElement] = js.native
  }
  
}

