package typings.ionicCore

import typings.ionicCore.mod.Side
import typings.ionicCore.stencilPublicRuntimeMod.ComponentInterface
import typings.ionicCore.stencilPublicRuntimeMod.EventEmitter
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ionic/core/dist/types/components/item-options/item-options", JSImport.Namespace)
@js.native
object itemOptionsMod extends js.Object {
  
  @js.native
  class ItemOptions () extends ComponentInterface {
    
    var el: HTMLElement = js.native
    
    /** @internal */
    def fireSwipeEvent(): js.Promise[Unit] = js.native
    
    /**
      * Emitted when the item has been fully swiped.
      */
    var ionSwipe: EventEmitter[_] = js.native
    
    @JSName("render")
    def render_MItemOptions(): js.Any = js.native
    
    /**
      * The side the option button should be on. Possible values: `"start"` and `"end"`. If you have multiple `ion-item-options`, a side must be provided for each.
      *
      */
    var side: Side = js.native
  }
}
