package typings.ionicCore

import typings.ionicCore.anon.Visible
import typings.ionicCore.stencilPublicRuntimeMod.ComponentInterface
import typings.ionicCore.stencilPublicRuntimeMod.EventEmitter
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object splitPaneMod {
  
  @JSImport("@ionic/core/dist/types/components/split-pane/split-pane", "SplitPane")
  @js.native
  class SplitPane () extends ComponentInterface {
    
    @JSName("connectedCallback")
    def connectedCallback_MSplitPane(): Unit = js.native
    
    /**
      * The content `id` of the split-pane's main content.
      */
    var contentId: js.UndefOr[String] = js.native
    
    /**
      * If `true`, the split pane will be hidden.
      */
    var disabled: Boolean = js.native
    
    @JSName("disconnectedCallback")
    def disconnectedCallback_MSplitPane(): Unit = js.native
    
    var el: HTMLElement = js.native
    
    /**
      * Expression to be called when the split-pane visibility has changed
      */
    var ionSplitPaneVisible: EventEmitter[Visible] = js.native
    
    var isPane: js.Any = js.native
    
    @JSName("render")
    def render_MSplitPane(): js.Any = js.native
    
    var rmL: js.Any = js.native
    
    var styleChildren: js.Any = js.native
    
    /* protected */ def updateState(): Unit = js.native
    
    var visible: Boolean = js.native
    
    def visibleChanged(visible: Boolean): Unit = js.native
    
    /**
      * When the split-pane should be shown.
      * Can be a CSS media query expression, or a shortcut expression.
      * Can also be a boolean expression.
      */
    var when: String | Boolean = js.native
  }
}
