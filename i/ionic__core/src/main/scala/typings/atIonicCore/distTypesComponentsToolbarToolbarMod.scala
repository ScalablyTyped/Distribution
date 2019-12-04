package typings.atIonicCore

import typings.atIonicCore.atIonicCoreMod.Color
import typings.atIonicCore.atIonicCoreMod.StyleEventDetail
import typings.atIonicCore.distTypesComponentsMod._Global_.HTMLIonToolbarElement
import typings.atIonicCore.distTypesStencilDotCoreMod.ComponentInterface
import typings.std.CustomEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/core/dist/types/components/toolbar/toolbar", JSImport.Namespace)
@js.native
object distTypesComponentsToolbarToolbarMod extends js.Object {
  @js.native
  class Toolbar () extends ComponentInterface {
    var childrenStyles: js.Any = js.native
    /**
      * The color to use from your application's color palette.
      * Default options are: `"primary"`, `"secondary"`, `"tertiary"`, `"success"`, `"warning"`, `"danger"`, `"light"`, `"medium"`, and `"dark"`.
      * For more information on colors, see [theming](/docs/theming/basics).
      */
    var color: js.UndefOr[Color] = js.native
    var el: HTMLIonToolbarElement = js.native
    def childrenStyle(ev: CustomEvent[StyleEventDetail]): Unit = js.native
    @JSName("componentWillLoad")
    def componentWillLoad_MToolbar(): Unit = js.native
    @JSName("render")
    def render_MToolbar(): js.Any = js.native
  }
  
}

