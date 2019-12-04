package typings.atIonicCore

import typings.atIonicCore.atIonicCoreMod.Side
import typings.atIonicCore.distTypesStencilDotCoreMod.ComponentInterface
import typings.atIonicCore.distTypesStencilDotCoreMod.EventEmitter
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/core/dist/types/components/item-options/item-options", JSImport.Namespace)
@js.native
object distTypesComponentsItemDashOptionsItemDashOptionsMod extends js.Object {
  @js.native
  class ItemOptions () extends ComponentInterface {
    var el: HTMLElement = js.native
    /**
      * Emitted when the item has been fully swiped.
      */
    var ionSwipe: EventEmitter[_] = js.native
    /**
      * The side the option button should be on. Possible values: `"start"` and `"end"`. If you have multiple `ion-item-options`, a side must be provided for each.
      *
      */
    var side: Side = js.native
    /** @internal */
    def fireSwipeEvent(): js.Promise[Unit] = js.native
    @JSName("render")
    def render_MItemOptions(): js.Any = js.native
  }
  
}

