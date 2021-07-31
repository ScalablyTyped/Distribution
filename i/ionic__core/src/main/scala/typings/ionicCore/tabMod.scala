package typings.ionicCore

import typings.ionicCore.componentsMod.global.HTMLIonTabElement
import typings.ionicCore.mod.ComponentRef
import typings.ionicCore.mod.FrameworkDelegate
import typings.ionicCore.stencilPublicRuntimeMod.ComponentInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tabMod {
  
  @JSImport("@ionic/core/dist/types/components/tab/tab", "Tab")
  @js.native
  class Tab ()
    extends StObject
       with ComponentInterface {
    
    /** @internal */
    var active: Boolean = js.native
    
    def changeActive(isActive: Boolean): Unit = js.native
    
    /**
      * The component to display inside of the tab.
      */
    var component: js.UndefOr[ComponentRef] = js.native
    
    @JSName("componentWillLoad")
    def componentWillLoad_MTab(): js.Promise[Unit] = js.native
    
    /** @internal */
    var delegate: js.UndefOr[FrameworkDelegate] = js.native
    
    var el: HTMLIonTabElement = js.native
    
    var loaded: js.Any = js.native
    
    var prepareLazyLoaded: js.Any = js.native
    
    @JSName("render")
    def render_MTab(): js.Any = js.native
    
    /** Set the active component for the tab */
    def setActive(): js.Promise[Unit] = js.native
    
    /**
      * A tab id must be provided for each `ion-tab`. It's used internally to reference
      * the selected tab or by the router to switch between them.
      */
    var tab: String = js.native
  }
}
