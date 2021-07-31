package typings.ionicCore

import typings.ionicCore.componentsMod.global.HTMLIonReorderElement
import typings.ionicCore.stencilPublicRuntimeMod.ComponentInterface
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reorderMod {
  
  @JSImport("@ionic/core/dist/types/components/reorder/reorder", "Reorder")
  @js.native
  class Reorder ()
    extends StObject
       with ComponentInterface {
    
    var el: HTMLIonReorderElement = js.native
    
    def onClick(ev: Event): Unit = js.native
    
    @JSName("render")
    def render_MReorder(): js.Any = js.native
  }
}
