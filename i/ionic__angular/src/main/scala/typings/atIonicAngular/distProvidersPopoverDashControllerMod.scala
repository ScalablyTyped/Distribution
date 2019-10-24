package typings.atIonicAngular

import typings.atAngularCore.atAngularCoreMod.ComponentFactoryResolver
import typings.atAngularCore.atAngularCoreMod.Injector
import typings.atIonicAngular.distProvidersAngularDashDelegateMod.AngularDelegate
import typings.atIonicAngular.distUtilOverlayMod.OverlayBaseController
import typings.atIonicCore.distTypesComponentsMod._Global_.HTMLIonPopoverElement
import typings.atIonicCore.distTypesComponentsPopoverPopoverDashInterfaceMod.PopoverOptions
import typings.atIonicCore.distTypesInterfaceMod.ComponentRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/angular/dist/providers/popover-controller", JSImport.Namespace)
@js.native
object distProvidersPopoverDashControllerMod extends js.Object {
  @js.native
  class PopoverController protected () extends OverlayBaseController[PopoverOptions[ComponentRef], HTMLIonPopoverElement] {
    def this(angularDelegate: AngularDelegate, resolver: ComponentFactoryResolver, injector: Injector) = this()
    var angularDelegate: js.Any = js.native
    var injector: js.Any = js.native
    var resolver: js.Any = js.native
  }
  
}

