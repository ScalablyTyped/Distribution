package typings.ionicCore

import typings.ionicCore.componentsMod._Global_.HTMLIonLoadingElement
import typings.ionicCore.loadingInterfaceMod.LoadingOptions
import typings.ionicCore.overlaysInterfaceMod.OverlayController
import typings.ionicCore.stencilCoreMod.ComponentInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/core/dist/types/components/loading-controller/loading-controller", JSImport.Namespace)
@js.native
object loadingControllerMod extends js.Object {
  @js.native
  class LoadingController ()
    extends ComponentInterface
       with OverlayController {
    def create(options: LoadingOptions): js.Promise[HTMLIonLoadingElement] = js.native
  }
  
}

