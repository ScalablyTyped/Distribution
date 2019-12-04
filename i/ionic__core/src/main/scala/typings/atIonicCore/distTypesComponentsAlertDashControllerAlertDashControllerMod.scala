package typings.atIonicCore

import typings.atIonicCore.distTypesComponentsAlertAlertDashInterfaceMod.AlertOptions
import typings.atIonicCore.distTypesComponentsMod._Global_.HTMLIonAlertElement
import typings.atIonicCore.distTypesStencilDotCoreMod.ComponentInterface
import typings.atIonicCore.distTypesUtilsOverlaysDashInterfaceMod.OverlayController
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/core/dist/types/components/alert-controller/alert-controller", JSImport.Namespace)
@js.native
object distTypesComponentsAlertDashControllerAlertDashControllerMod extends js.Object {
  @js.native
  class AlertController ()
    extends ComponentInterface
       with OverlayController {
    /**
      * Create an alert overlay with alert options.
      *
      * @param options The options to use to create the alert.
      */
    def create(options: AlertOptions): js.Promise[HTMLIonAlertElement] = js.native
  }
  
}

