package typings.ionicAngular

import typings.angularCore.mod.ComponentFactoryResolver
import typings.angularCore.mod.Injector
import typings.ionicAngular.angularDelegateMod.AngularDelegate
import typings.ionicAngular.overlayMod.OverlayBaseController
import typings.ionicCore.componentsMod._Global_.HTMLIonModalElement
import typings.ionicCore.mod.ComponentRef
import typings.ionicCore.modalInterfaceMod.ModalOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/angular/dist/providers/modal-controller", JSImport.Namespace)
@js.native
object modalControllerMod extends js.Object {
  @js.native
  class ModalController protected () extends OverlayBaseController[ModalOptions[ComponentRef], HTMLIonModalElement] {
    def this(angularDelegate: AngularDelegate, resolver: ComponentFactoryResolver, injector: Injector) = this()
    var angularDelegate: js.Any = js.native
    var injector: js.Any = js.native
    var resolver: js.Any = js.native
  }
  
}

