package typings.ionicCore

import typings.ionicCore.stencilPublicRuntimeMod.ComponentInterface
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object skeletonTextMod {
  
  @JSImport("@ionic/core/dist/types/components/skeleton-text/skeleton-text", "SkeletonText")
  @js.native
  class SkeletonText ()
    extends StObject
       with ComponentInterface {
    
    /**
      * If `true`, the skeleton text will animate.
      */
    var animated: Boolean = js.native
    
    var el: HTMLElement = js.native
    
    @JSName("render")
    def render_MSkeletonText(): js.Any = js.native
  }
}
