package typings.ionicCore

import typings.ionicCore.componentsMod._Global_.HTMLIonPopoverElement
import typings.ionicCore.ionicCoreStrings.ios
import typings.ionicCore.ionicCoreStrings.md
import typings.ionicCore.mod.ComponentProps
import typings.ionicCore.mod.ComponentRef
import typings.ionicCore.mod.FrameworkDelegate
import typings.ionicCore.oldAnimationAnimationInterfaceMod.Animation
import typings.ionicCore.overlaysInterfaceMod.OverlayEventDetail
import typings.ionicCore.overlaysInterfaceMod.OverlayInterface
import typings.ionicCore.stencilCoreMod.ComponentInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/core/dist/types/components/popover/popover", JSImport.Namespace)
@js.native
object popoverMod extends js.Object {
  @js.native
  class Popover ()
    extends ComponentInterface
       with OverlayInterface {
    @JSName("animation")
    var animation_Popover: js.UndefOr[Animation] = js.native
    /**
      * If `true`, the popover will be dismissed when the backdrop is clicked.
      */
    var backdropDismiss: Boolean = js.native
    /**
      * The component to display inside of the popover.
      */
    var component: ComponentRef = js.native
    /**
      * The data to pass to the popover component.
      */
    var componentProps: js.UndefOr[ComponentProps[Null]] = js.native
    /**
      * Additional classes to apply for custom CSS. If multiple classes are
      * provided they should be separated by spaces.
      */
    var cssClass: js.UndefOr[String | js.Array[String]] = js.native
    /** @internal */
    var delegate: js.UndefOr[FrameworkDelegate] = js.native
    @JSName("el")
    var el_Popover: HTMLIonPopoverElement = js.native
    /**
      * The event to pass to the popover animation.
      */
    var event: js.Any = js.native
    @JSName("mode")
    var mode_Popover: ios | md = js.native
    var onBackdropTap: js.Any = js.native
    var onDismiss: js.Any = js.native
    var onLifecycle: js.Any = js.native
    /**
      * If `true`, a backdrop will be displayed behind the popover.
      */
    var showBackdrop: Boolean = js.native
    /**
      * If `true`, the popover will be translucent.
      * Only applies when the mode is `"ios"` and the device supports
      * [`backdrop-filter`](https://developer.mozilla.org/en-US/docs/Web/CSS/backdrop-filter#Browser_compatibility).
      */
    var translucent: Boolean = js.native
    var usersElement: js.UndefOr[js.Any] = js.native
    /**
      * Returns a promise that resolves when the popover did dismiss.
      */
    def onDidDismiss(): js.Promise[OverlayEventDetail[_]] = js.native
    /**
      * Returns a promise that resolves when the popover will dismiss.
      */
    def onWillDismiss(): js.Promise[OverlayEventDetail[_]] = js.native
    @JSName("render")
    def render_MPopover(): js.Any = js.native
  }
  
}

