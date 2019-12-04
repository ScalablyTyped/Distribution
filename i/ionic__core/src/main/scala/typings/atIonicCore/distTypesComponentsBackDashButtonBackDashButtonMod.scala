package typings.atIonicCore

import typings.atIonicCore.atIonicCoreMod.Color
import typings.atIonicCore.atIonicCoreStrings.button
import typings.atIonicCore.atIonicCoreStrings.reset
import typings.atIonicCore.atIonicCoreStrings.submit
import typings.atIonicCore.distTypesStencilDotCoreMod.ComponentInterface
import typings.atIonicCore.distTypesUtilsElementDashInterfaceMod.ButtonInterface
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/core/dist/types/components/back-button/back-button", JSImport.Namespace)
@js.native
object distTypesComponentsBackDashButtonBackDashButtonMod extends js.Object {
  @js.native
  class BackButton ()
    extends ComponentInterface
       with ButtonInterface {
    val backButtonIcon: js.Any = js.native
    val backButtonText: js.Any = js.native
    /**
      * The color to use from your application's color palette.
      * Default options are: `"primary"`, `"secondary"`, `"tertiary"`, `"success"`, `"warning"`, `"danger"`, `"light"`, `"medium"`, and `"dark"`.
      * For more information on colors, see [theming](/docs/theming/basics).
      */
    var color: js.UndefOr[Color] = js.native
    /**
      * The url to navigate back to by default when there is no history.
      */
    var defaultHref: js.UndefOr[String] = js.native
    /* CompleteClass */
    override var disabled: Boolean = js.native
    var el: HTMLElement = js.native
    val hasIconOnly: js.Any = js.native
    /**
      * The icon name to use for the back button.
      */
    var icon: js.UndefOr[String | Null] = js.native
    var mode: js.Any = js.native
    var onClick: js.Any = js.native
    val rippleType: js.Any = js.native
    /**
      * The text to display in the back button.
      */
    var text: js.UndefOr[String | Null] = js.native
    /* CompleteClass */
    override var `type`: submit | reset | button = js.native
    @JSName("render")
    def render_MBackButton(): js.Any = js.native
  }
  
}

