package typings.atIonicCore

import typings.atIonicCore.atIonicCoreStrings.full
import typings.atIonicCore.atIonicCoreStrings.inset
import typings.atIonicCore.atIonicCoreStrings.none
import typings.atIonicCore.distTypesStencilDotCoreMod.ComponentInterface
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/core/dist/types/components/list/list", JSImport.Namespace)
@js.native
object distTypesComponentsListListMod extends js.Object {
  @js.native
  class List () extends ComponentInterface {
    var el: HTMLElement = js.native
    /**
      * If `true`, the list will have margin around it and rounded corners.
      */
    var inset: Boolean = js.native
    /**
      * How the bottom border should be displayed on all items.
      */
    var lines: js.UndefOr[full | inset | none] = js.native
    /**
      * If `ion-item-sliding` are used inside the list, this method closes
      * any open sliding item.
      *
      * Returns `true` if an actual `ion-item-sliding` is closed.
      */
    def closeSlidingItems(): js.Promise[Boolean] = js.native
    @JSName("render")
    def render_MList(): js.Any = js.native
  }
  
}

