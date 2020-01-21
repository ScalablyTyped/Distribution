package typings.ionicCore

import typings.ionicCore.actionSheetInterfaceMod.ActionSheetOptions
import typings.ionicCore.componentsMod._Global_.HTMLIonActionSheetElement
import typings.ionicCore.overlaysInterfaceMod.OverlayController
import typings.ionicCore.stencilCoreMod.ComponentInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/core/dist/types/components/action-sheet-controller/action-sheet-controller", JSImport.Namespace)
@js.native
object actionSheetControllerMod extends js.Object {
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

