package typings.ionicAngular

import typings.angularCore.mod.ComponentFactoryResolver
import typings.angularCore.mod.Injector
import typings.ionicAngular.angularDelegateMod.AngularDelegate
import typings.ionicAngular.overlayMod.OverlayBaseController
import typings.ionicCore.componentsMod.global.HTMLIonModalElement
import typings.ionicCore.mod.ComponentRef
import typings.ionicCore.modalInterfaceMod.ModalOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modalControllerMod {
  
  @JSImport("@ionic/angular/providers/modal-controller", "ModalController")
  @js.native
  class ModalController protected () extends OverlayBaseController[ModalOptions[ComponentRef], HTMLIonModalElement] {
    def this(angularDelegate: AngularDelegate, resolver: ComponentFactoryResolver, injector: Injector) = this()
    
    /* private */ var angularDelegate: js.Any = js.native
    
    /* private */ var injector: js.Any = js.native
    
    /* private */ var resolver: js.Any = js.native
  }
}
