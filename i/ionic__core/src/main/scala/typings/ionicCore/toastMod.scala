package typings.ionicCore

import typings.ionicCore.componentsMod._Global_.HTMLIonToastElement
import typings.ionicCore.ionicCoreStrings.bottom
import typings.ionicCore.ionicCoreStrings.end
import typings.ionicCore.ionicCoreStrings.ios
import typings.ionicCore.ionicCoreStrings.md
import typings.ionicCore.ionicCoreStrings.middle
import typings.ionicCore.ionicCoreStrings.start
import typings.ionicCore.ionicCoreStrings.top
import typings.ionicCore.mod.Color
import typings.ionicCore.oldAnimationAnimationInterfaceMod.Animation
import typings.ionicCore.overlaysInterfaceMod.OverlayEventDetail
import typings.ionicCore.overlaysInterfaceMod.OverlayInterface
import typings.ionicCore.stencilCoreMod.ComponentInterface
import typings.ionicCore.toastInterfaceMod.ToastButton
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/core/dist/types/components/toast/toast", JSImport.Namespace)
@js.native
object toastMod extends js.Object {
  @js.native
  class Toast ()
    extends ComponentInterface
       with OverlayInterface {
    @JSName("animation")
    var animation_Toast: js.UndefOr[Animation] = js.native
    var buttonClick: js.Any = js.native
    /**
      * An array of buttons for the toast.
      */
    var buttons: js.UndefOr[js.Array[ToastButton | String]] = js.native
    var callButtonHandler: js.Any = js.native
    /**
      * @deprecated Use `buttons` instead. Text to display in the close button.
      */
    var closeButtonText: js.UndefOr[String] = js.native
    /**
      * The color to use from your application's color palette.
      * Default options are: `"primary"`, `"secondary"`, `"tertiary"`, `"success"`, `"warning"`, `"danger"`, `"light"`, `"medium"`, and `"dark"`.
      * For more information on colors, see [theming](/docs/theming/basics).
      */
    var color: js.UndefOr[Color] = js.native
    /**
      * Additional classes to apply for custom CSS. If multiple classes are
      * provided they should be separated by spaces.
      */
    var cssClass: js.UndefOr[String | js.Array[String]] = js.native
    /**
      * How many milliseconds to wait before hiding the toast. By default, it will show
      * until `dismiss()` is called.
      */
    var duration: Double = js.native
    var durationTimeout: js.Any = js.native
    @JSName("el")
    var el_Toast: HTMLIonToastElement = js.native
    var getButtons: js.Any = js.native
    /**
      * Header to be shown in the toast.
      */
    var header: js.UndefOr[String] = js.native
    /**
      * Message to be shown in the toast.
      */
    var message: js.UndefOr[String] = js.native
    @JSName("mode")
    var mode_Toast: ios | md = js.native
    /**
      * The position of the toast on the screen.
      */
    var position: top | bottom | middle = js.native
    /**
      * @deprecated Use `buttons` instead. If `true`, the close button will be displayed.
      */
    var showCloseButton: Boolean = js.native
    /**
      * If `true`, the toast will be translucent.
      * Only applies when the mode is `"ios"` and the device supports
      * [`backdrop-filter`](https://developer.mozilla.org/en-US/docs/Web/CSS/backdrop-filter#Browser_compatibility).
      */
    var translucent: Boolean = js.native
    /**
      * Returns a promise that resolves when the toast did dismiss.
      */
    def onDidDismiss(): js.Promise[OverlayEventDetail[_]] = js.native
    /**
      * Returns a promise that resolves when the toast will dismiss.
      */
    def onWillDismiss(): js.Promise[OverlayEventDetail[_]] = js.native
    @JSName("renderButtons")
    def renderButtons_end(buttons: js.Array[ToastButton], side: end): js.Any = js.native
    @JSName("renderButtons")
    def renderButtons_start(buttons: js.Array[ToastButton], side: start): js.Any = js.native
    @JSName("render")
    def render_MToast(): js.Any = js.native
  }
  
}

