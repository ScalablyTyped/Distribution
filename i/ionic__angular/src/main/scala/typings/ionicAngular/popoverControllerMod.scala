package typings.ionicAngular

import typings.angularCore.mod.ComponentFactoryResolver
import typings.angularCore.mod.Injector
import typings.ionicAngular.angularDelegateMod.AngularDelegate
import typings.ionicAngular.overlayMod.OverlayBaseController
import typings.ionicCore.componentsMod.global.HTMLIonPopoverElement
import typings.ionicCore.mod.ComponentRef
import typings.ionicCore.popoverInterfaceMod.PopoverOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object popoverControllerMod {
  
  @JSImport("@ionic/angular/providers/popover-controller", "PopoverController")
  @js.native
  class PopoverController protected () extends OverlayBaseController[PopoverOptions[ComponentRef], HTMLIonPopoverElement] {
    def this(angularDelegate: AngularDelegate, resolver: ComponentFactoryResolver, injector: Injector) = this()
    
    var angularDelegate: js.Any = js.native
    
    var injector: js.Any = js.native
    
    var resolver: js.Any = js.native
  }
}
