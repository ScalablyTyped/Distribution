package typings.ionicCore

import typings.ionicCore.stencilCoreMod.ComponentInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/core/dist/types/components/grid/grid", JSImport.Namespace)
@js.native
object gridMod extends js.Object {
  @js.native
  class Grid () extends ComponentInterface {
    /**
      * If `true`, the grid will have a fixed width based on the screen size.
      */
    var fixed: Boolean = js.native
    @JSName("render")
    def render_MGrid(): js.Any = js.native
  }
  
}

