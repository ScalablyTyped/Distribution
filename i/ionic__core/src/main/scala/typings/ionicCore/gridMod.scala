package typings.ionicCore

import typings.ionicCore.stencilPublicRuntimeMod.ComponentInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gridMod {
  
  @JSImport("@ionic/core/dist/types/components/grid/grid", "Grid")
  @js.native
  class Grid ()
    extends StObject
       with ComponentInterface {
    
    /**
      * If `true`, the grid will have a fixed width based on the screen size.
      */
    var fixed: Boolean = js.native
    
    @JSName("render")
    def render_MGrid(): js.Any = js.native
  }
}
