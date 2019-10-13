package typings.atIonicAngular

import typings.atAngularCore.atAngularCoreMod.ComponentFactoryResolver
import typings.atAngularCore.atAngularCoreMod.Injector
import typings.atIonicAngular.distProvidersAngularDashDelegateMod.AngularDelegate
import typings.atIonicAngular.distUtilOverlayMod.OverlayBaseController
import typings.atIonicCore.distTypesComponentsMod._Global_.HTMLIonPopoverElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/angular/dist/providers/popover-controller", JSImport.Namespace)
@js.native
object distProvidersPopoverDashControllerMod extends js.Object {
  @js.native
  class PopoverController protected ()
    extends OverlayBaseController[
          /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify PopoverOptions */ js.Any, 
          HTMLIonPopoverElement
        ] {
    def this(angularDelegate: AngularDelegate, resolver: ComponentFactoryResolver, injector: Injector) = this()
    var angularDelegate: js.Any = js.native
    var injector: js.Any = js.native
    var resolver: js.Any = js.native
  }
  
}

