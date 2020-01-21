package typings.ionicCore

import typings.ionicCore.componentsMod._Global_.HTMLIonToastElement
import typings.ionicCore.overlaysInterfaceMod.OverlayController
import typings.ionicCore.stencilCoreMod.ComponentInterface
import typings.ionicCore.toastInterfaceMod.ToastOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/core/dist/types/components/toast-controller/toast-controller", JSImport.Namespace)
@js.native
object toastControllerMod extends js.Object {
  @js.native
  class ToastController ()
    extends ComponentInterface
       with OverlayController {
    def create(options: ToastOptions): js.Promise[HTMLIonToastElement] = js.native
  }
  
}

