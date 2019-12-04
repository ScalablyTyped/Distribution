package typings.atIonicCore

import typings.atIonicCore.atIonicCoreMod.ComponentProps
import typings.atIonicCore.atIonicCoreMod.ComponentRef
import typings.atIonicCore.atIonicCoreMod.FrameworkDelegate
import typings.atIonicCore.atIonicCoreStrings.ios
import typings.atIonicCore.atIonicCoreStrings.md
import typings.atIonicCore.distTypesComponentsMod._Global_.HTMLIonModalElement
import typings.atIonicCore.distTypesStencilDotCoreMod.ComponentInterface
import typings.atIonicCore.distTypesUtilsAnimationOldDashAnimationAnimationDashInterfaceMod.Animation
import typings.atIonicCore.distTypesUtilsOverlaysDashInterfaceMod.OverlayEventDetail
import typings.atIonicCore.distTypesUtilsOverlaysDashInterfaceMod.OverlayInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/core/dist/types/components/modal/modal", JSImport.Namespace)
@js.native
object distTypesComponentsModalModalMod extends js.Object {
  @js.native
  class Modal ()
    extends ComponentInterface
       with OverlayInterface {
    @JSName("animation")
    var animation_Modal: js.UndefOr[Animation] = js.native
    /**
      * If `true`, the modal will be dismissed when the backdrop is clicked.
      */
    var backdropDismiss: Boolean = js.native
    /**
      * The component to display inside of the modal.
      */
    var component: ComponentRef = js.native
    /**
      * The data to pass to the modal component.
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
    var el_Modal: HTMLIonModalElement = js.native
    @JSName("mode")
    var mode_Modal: ios | md = js.native
    var onBackdropTap: js.Any = js.native
    var onDismiss: js.Any = js.native
    var onLifecycle: js.Any = js.native
    /**
      * If `true`, a backdrop will be displayed behind the modal.
      */
    var showBackdrop: Boolean = js.native
    var usersElement: js.UndefOr[js.Any] = js.native
    /**
      * Returns a promise that resolves when the modal did dismiss.
      */
    def onDidDismiss(): js.Promise[OverlayEventDetail[_]] = js.native
    /**
      * Returns a promise that resolves when the modal will dismiss.
      */
    def onWillDismiss(): js.Promise[OverlayEventDetail[_]] = js.native
    @JSName("render")
    def render_MModal(): js.Any = js.native
  }
  
}

