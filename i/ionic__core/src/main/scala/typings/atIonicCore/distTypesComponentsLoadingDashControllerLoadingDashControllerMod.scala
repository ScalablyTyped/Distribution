package typings.atIonicCore

import typings.atIonicCore.distTypesComponentsLoadingLoadingDashInterfaceMod.LoadingOptions
import typings.atIonicCore.distTypesComponentsMod._Global_.HTMLIonLoadingElement
import typings.atIonicCore.distTypesStencilDotCoreMod.ComponentInterface
import typings.atIonicCore.distTypesUtilsOverlaysDashInterfaceMod.OverlayController
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/core/dist/types/components/loading-controller/loading-controller", JSImport.Namespace)
@js.native
object distTypesComponentsLoadingDashControllerLoadingDashControllerMod extends js.Object {
  @js.native
  class LoadingController ()
    extends ComponentInterface
       with OverlayController {
    def create(options: LoadingOptions): js.Promise[HTMLIonLoadingElement] = js.native
  }
  
}

