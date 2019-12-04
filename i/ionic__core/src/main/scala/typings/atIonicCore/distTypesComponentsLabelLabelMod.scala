package typings.atIonicCore

import typings.atIonicCore.atIonicCoreMod.Color
import typings.atIonicCore.atIonicCoreMod.StyleEventDetail
import typings.atIonicCore.atIonicCoreStrings.fixed
import typings.atIonicCore.atIonicCoreStrings.floating
import typings.atIonicCore.atIonicCoreStrings.stacked
import typings.atIonicCore.distTypesStencilDotCoreMod.ComponentInterface
import typings.atIonicCore.distTypesStencilDotCoreMod.EventEmitter
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/core/dist/types/components/label/label", JSImport.Namespace)
@js.native
object distTypesComponentsLabelLabelMod extends js.Object {
  @js.native
  class Label () extends ComponentInterface {
    /**
      * The color to use from your application's color palette.
      * Default options are: `"primary"`, `"secondary"`, `"tertiary"`, `"success"`, `"warning"`, `"danger"`, `"light"`, `"medium"`, and `"dark"`.
      * For more information on colors, see [theming](/docs/theming/basics).
      */
    var color: js.UndefOr[Color] = js.native
    var el: HTMLElement = js.native
    var emitStyle: js.Any = js.native
    /**
      * Emitted when the styles change.
      * @internal
      */
    var ionStyle: EventEmitter[StyleEventDetail] = js.native
    var noAnimate: Boolean = js.native
    /**
      * The position determines where and how the label behaves inside an item.
      */
    var position: js.UndefOr[fixed | stacked | floating] = js.native
    @JSName("componentDidLoad")
    def componentDidLoad_MLabel(): Unit = js.native
    @JSName("componentWillLoad")
    def componentWillLoad_MLabel(): Unit = js.native
    def positionChanged(): Unit = js.native
    @JSName("render")
    def render_MLabel(): js.Any = js.native
  }
  
}

