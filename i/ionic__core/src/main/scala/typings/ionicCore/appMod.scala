package typings.ionicCore

import typings.ionicCore.stencilPublicRuntimeMod.ComponentInterface
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object appMod {
  
  @JSImport("@ionic/core/dist/types/components/app/app", "App")
  @js.native
  class App ()
    extends StObject
       with ComponentInterface {
    
    @JSName("componentDidLoad")
    def componentDidLoad_MApp(): Unit = js.native
    
    var el: HTMLElement = js.native
    
    @JSName("render")
    def render_MApp(): js.Any = js.native
  }
}
