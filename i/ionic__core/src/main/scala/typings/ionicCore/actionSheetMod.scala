package typings.ionicCore

import typings.ionicCore.actionSheetInterfaceMod.ActionSheetButton
import typings.ionicCore.componentsMod.global.HTMLIonActionSheetElement
import typings.ionicCore.overlaysInterfaceMod.OverlayEventDetail
import typings.ionicCore.overlaysInterfaceMod.OverlayInterface
import typings.ionicCore.stencilPublicRuntimeMod.ComponentInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/core/dist/types/components/action-sheet/action-sheet", JSImport.Namespace)
@js.native
object actionSheetMod extends js.Object {
  @js.native
  class ActionSheet ()
    extends ComponentInterface
       with OverlayInterface {
    var animation: js.UndefOr[js.Any] = js.native
    /**
      * If `true`, the action sheet will be dismissed when the backdrop is clicked.
      */
    var backdropDismiss: Boolean = js.native
    var buttonClick: js.Any = js.native
    /**
      * An array of buttons for the action sheet.
      */
    var buttons: js.Array[ActionSheetButton | String] = js.native
    var callButtonHandler: js.Any = js.native
    /**
      * Additional classes to apply for custom CSS. If multiple classes are
      * provided they should be separated by spaces.
      */
    var cssClass: js.UndefOr[String | js.Array[String]] = js.native
    var dispatchCancelHandler: js.Any = js.native
    @JSName("el")
    var el_ActionSheet: HTMLIonActionSheetElement = js.native
    var gesture: js.UndefOr[js.Any] = js.native
    var getButtons: js.Any = js.native
    var groupEl: js.UndefOr[js.Any] = js.native
    /**
      * Title for the action sheet.
      */
    var header: js.UndefOr[String] = js.native
    var onBackdropTap: js.Any = js.native
    /**
      * Subtitle for the action sheet.
      */
    var subHeader: js.UndefOr[String] = js.native
    /**
      * If `true`, the action sheet will be translucent.
      * Only applies when the mode is `"ios"` and the device supports
      * [`backdrop-filter`](https://developer.mozilla.org/en-US/docs/Web/CSS/backdrop-filter#Browser_compatibility).
      */
    var translucent: Boolean = js.native
    var wrapperEl: js.UndefOr[js.Any] = js.native
    @JSName("componentDidLoad")
    def componentDidLoad_MActionSheet(): Unit = js.native
    def componentDidUnload(): Unit = js.native
    /**
      * Returns a promise that resolves when the action sheet did dismiss.
      */
    def onDidDismiss[T](): js.Promise[OverlayEventDetail[T]] = js.native
    /**
      * Returns a promise that resolves when the action sheet will dismiss.
      *
      */
    def onWillDismiss[T](): js.Promise[OverlayEventDetail[T]] = js.native
    @JSName("render")
    def render_MActionSheet(): js.Any = js.native
  }
  
}

