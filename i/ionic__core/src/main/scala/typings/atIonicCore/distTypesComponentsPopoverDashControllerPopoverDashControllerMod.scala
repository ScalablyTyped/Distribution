package typings.atIonicCore

import typings.atIonicCore.atIonicCoreMod.ComponentRef
import typings.atIonicCore.distTypesComponentsMod._Global_.HTMLIonPopoverElement
import typings.atIonicCore.distTypesComponentsPopoverPopoverDashInterfaceMod.PopoverOptions
import typings.atIonicCore.distTypesStencilDotCoreMod.ComponentInterface
import typings.atIonicCore.distTypesUtilsOverlaysDashInterfaceMod.OverlayController
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/core/dist/types/components/popover-controller/popover-controller", JSImport.Namespace)
@js.native
object distTypesComponentsPopoverDashControllerPopoverDashControllerMod extends js.Object {
  @js.native
  class PopoverController ()
    extends ComponentInterface
       with OverlayController {
    /**
      * Create a popover overlay with popover options.
      *
      * @param options The options to use to create the popover.
      */
    def create[T /* <: ComponentRef */](options: PopoverOptions[T]): js.Promise[HTMLIonPopoverElement] = js.native
  }
  
}

