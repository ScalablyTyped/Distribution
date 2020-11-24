package typings.ionicCore

import typings.ionicCore.stencilPublicRuntimeMod.ComponentInterface
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ionic/core/dist/types/components/app/app", JSImport.Namespace)
@js.native
object appMod extends js.Object {
  
  @js.native
  class App () extends ComponentInterface {
    
    @JSName("componentDidLoad")
    def componentDidLoad_MApp(): Unit = js.native
    
    var el: HTMLElement = js.native
    
    @JSName("render")
    def render_MApp(): js.Any = js.native
  }
}
