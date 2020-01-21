package typings.ionicCore

import typings.ionicCore.stencilCoreMod.ComponentInterface
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/core/dist/types/components/skeleton-text/skeleton-text", JSImport.Namespace)
@js.native
object skeletonTextMod extends js.Object {
  @js.native
  class SkeletonText () extends ComponentInterface {
    /**
      * If `true`, the skeleton text will animate.
      */
    var animated: Boolean = js.native
    var el: HTMLElement = js.native
    /**
      * @deprecated Use CSS instead. The width of the skeleton text. If supplied, it will override the CSS style.
      */
    var width: js.UndefOr[String] = js.native
    def calculateWidth(): js.UndefOr[AnonStyle] = js.native
    @JSName("render")
    def render_MSkeletonText(): js.Any = js.native
  }
  
}

