package typings.atIonicCore

import typings.atIonicCore.distTypesComponentsMod._Global_.HTMLIonToastElement
import typings.atIonicCore.distTypesComponentsToastToastDashInterfaceMod.ToastOptions
import typings.atIonicCore.distTypesStencilDotCoreMod.ComponentInterface
import typings.atIonicCore.distTypesUtilsOverlaysDashInterfaceMod.OverlayController
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/core/dist/types/components/toast-controller/toast-controller", JSImport.Namespace)
@js.native
object distTypesComponentsToastDashControllerToastDashControllerMod extends js.Object {
  @js.native
  class ToastController ()
    extends ComponentInterface
       with OverlayController {
    def create(options: ToastOptions): js.Promise[HTMLIonToastElement] = js.native
  }
  
}

