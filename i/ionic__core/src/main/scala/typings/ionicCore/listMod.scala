package typings.ionicCore

import typings.ionicCore.ionicCoreStrings.full
import typings.ionicCore.ionicCoreStrings.inset
import typings.ionicCore.ionicCoreStrings.none
import typings.ionicCore.stencilPublicRuntimeMod.ComponentInterface
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object listMod {
  
  @JSImport("@ionic/core/dist/types/components/list/list", "List")
  @js.native
  class List () extends ComponentInterface {
    
    /**
      * If `ion-item-sliding` are used inside the list, this method closes
      * any open sliding item.
      *
      * Returns `true` if an actual `ion-item-sliding` is closed.
      */
    def closeSlidingItems(): js.Promise[Boolean] = js.native
    
    var el: HTMLElement = js.native
    
    /**
      * If `true`, the list will have margin around it and rounded corners.
      */
    var inset: Boolean = js.native
    
    /**
      * How the bottom border should be displayed on all items.
      */
    var lines: js.UndefOr[full | inset | none] = js.native
    
    @JSName("render")
    def render_MList(): js.Any = js.native
  }
}
