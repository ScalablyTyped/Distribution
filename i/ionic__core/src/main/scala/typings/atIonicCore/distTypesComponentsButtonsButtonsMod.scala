package typings.atIonicCore

import typings.atIonicCore.distTypesStencilDotCoreMod.ComponentInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/core/dist/types/components/buttons/buttons", JSImport.Namespace)
@js.native
object distTypesComponentsButtonsButtonsMod extends js.Object {
  @js.native
  class Buttons () extends ComponentInterface {
    /**
      * If true, buttons will disappear when its
      * parent toolbar has fully collapsed if the toolbar
      * is not the first toolbar. If the toolbar is the
      * first toolbar, the buttons will be hidden and will
      * only be shown once all toolbars have fully collapsed.
      *
      * Only applies in `ios` mode with `collapse` set to
      * `true` on `ion-header`.
      *
      * Typically used for [Collapsible Large Titles](https://ionicframework.com/docs/api/title#collapsible-large-titles)
      */
    var collapse: Boolean = js.native
    @JSName("render")
    def render_MButtons(): js.Any = js.native
  }
  
}

