package typings.atIonicCore

import typings.atIonicCore.atIonicCoreMod.ComponentRef
import typings.atIonicCore.distTypesComponentsMod._Global_.HTMLIonModalElement
import typings.atIonicCore.distTypesComponentsModalModalDashInterfaceMod.ModalOptions
import typings.atIonicCore.distTypesStencilDotCoreMod.ComponentInterface
import typings.atIonicCore.distTypesUtilsOverlaysDashInterfaceMod.OverlayController
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/core/dist/types/components/modal-controller/modal-controller", JSImport.Namespace)
@js.native
object distTypesComponentsModalDashControllerModalDashControllerMod extends js.Object {
  @js.native
  class ModalController ()
    extends ComponentInterface
       with OverlayController {
    /**
      * Create a modal overlay with modal options.
      *
      * @param options The options to use to create the modal.
      */
    def create[T /* <: ComponentRef */](options: ModalOptions[T]): js.Promise[HTMLIonModalElement] = js.native
  }
  
}

