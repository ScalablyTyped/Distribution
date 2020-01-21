package typings.ionicAngular

import typings.ionicAngular.overlayMod.OverlayBaseController
import typings.ionicCore.alertInterfaceMod.AlertOptions
import typings.ionicCore.componentsMod._Global_.HTMLIonAlertElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/angular/dist/providers/alert-controller", JSImport.Namespace)
@js.native
object alertControllerMod extends js.Object {
  @js.native
  class AlertController () extends OverlayBaseController[AlertOptions, HTMLIonAlertElement]
  
}

