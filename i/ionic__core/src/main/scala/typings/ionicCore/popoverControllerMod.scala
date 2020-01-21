package typings.ionicCore

import typings.ionicCore.componentsMod._Global_.HTMLIonPopoverElement
import typings.ionicCore.mod.ComponentRef
import typings.ionicCore.overlaysInterfaceMod.OverlayController
import typings.ionicCore.popoverInterfaceMod.PopoverOptions
import typings.ionicCore.stencilCoreMod.ComponentInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/core/dist/types/components/popover-controller/popover-controller", JSImport.Namespace)
@js.native
object popoverControllerMod extends js.Object {
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

