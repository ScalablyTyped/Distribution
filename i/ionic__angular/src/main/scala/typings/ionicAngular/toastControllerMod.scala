package typings.ionicAngular

import typings.ionicAngular.overlayMod.OverlayBaseController
import typings.ionicCore.componentsMod.global.HTMLIonToastElement
import typings.ionicCore.toastInterfaceMod.ToastOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/angular/providers/toast-controller", JSImport.Namespace)
@js.native
object toastControllerMod extends js.Object {
  @js.native
  class ToastController () extends OverlayBaseController[ToastOptions, HTMLIonToastElement]
  
}

