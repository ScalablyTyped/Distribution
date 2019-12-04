package typings.atIonicCore

import typings.atIonicCore.atIonicCoreMod.Color
import typings.atIonicCore.atIonicCoreStrings.button
import typings.atIonicCore.atIonicCoreStrings.reset
import typings.atIonicCore.atIonicCoreStrings.submit
import typings.atIonicCore.distTypesStencilDotCoreMod.ComponentInterface
import typings.atIonicCore.distTypesUtilsElementDashInterfaceMod.ButtonInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/core/dist/types/components/menu-button/menu-button", JSImport.Namespace)
@js.native
object distTypesComponentsMenuDashButtonMenuDashButtonMod extends js.Object {
  @js.native
  class MenuButton ()
    extends ComponentInterface
       with ButtonInterface {
    /**
      * Automatically hides the menu button when the corresponding menu is not active
      */
    var autoHide: Boolean = js.native
    /**
      * The color to use from your application's color palette.
      * Default options are: `"primary"`, `"secondary"`, `"tertiary"`, `"success"`, `"warning"`, `"danger"`, `"light"`, `"medium"`, and `"dark"`.
      * For more information on colors, see [theming](/docs/theming/basics).
      */
    var color: js.UndefOr[Color] = js.native
    /* CompleteClass */
    override var disabled: Boolean = js.native
    /**
      * Optional property that maps to a Menu's `menuId` prop. Can also be `start` or `end` for the menu side. This is used to find the correct menu to toggle
      */
    var menu: js.UndefOr[String] = js.native
    var onClick: js.Any = js.native
    /* CompleteClass */
    override var `type`: submit | reset | button = js.native
    var visible: Boolean = js.native
    @JSName("componentDidLoad")
    def componentDidLoad_MMenuButton(): Unit = js.native
    @JSName("render")
    def render_MMenuButton(): js.Any = js.native
    def visibilityChanged(): js.Promise[Unit] = js.native
  }
  
}

