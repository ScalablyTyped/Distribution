package typings.atIonicCore

import typings.atIonicCore.distTypesComponentsActionDashSheetActionDashSheetDashInterfaceMod.ActionSheetOptions
import typings.atIonicCore.distTypesComponentsMod._Global_.HTMLIonActionSheetElement
import typings.atIonicCore.distTypesStencilDotCoreMod.ComponentInterface
import typings.atIonicCore.distTypesUtilsOverlaysDashInterfaceMod.OverlayController
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/core/dist/types/components/action-sheet-controller/action-sheet-controller", JSImport.Namespace)
@js.native
object distTypesComponentsActionDashSheetDashControllerActionDashSheetDashControllerMod extends js.Object {
  @js.native
  class ActionSheetController ()
    extends ComponentInterface
       with OverlayController {
    /**
      * Create an action sheet overlay with action sheet options.
      *
      * @param options The options to use to create the action sheet.
      */
    def create(options: ActionSheetOptions): js.Promise[HTMLIonActionSheetElement] = js.native
  }
  
}

