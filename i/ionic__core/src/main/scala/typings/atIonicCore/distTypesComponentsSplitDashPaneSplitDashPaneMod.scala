package typings.atIonicCore

import typings.atIonicCore.distTypesStencilDotCoreMod.ComponentInterface
import typings.atIonicCore.distTypesStencilDotCoreMod.EventEmitter
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/core/dist/types/components/split-pane/split-pane", JSImport.Namespace)
@js.native
object distTypesComponentsSplitDashPaneSplitDashPaneMod extends js.Object {
  @js.native
  class SplitPane () extends ComponentInterface {
    /**
      * The content `id` of the split-pane's main content.
      * This property can be used instead of the `[main]` attribute to select the `main`
      * content of the split-pane.
      */
    var contentId: js.UndefOr[String] = js.native
    /**
      * If `true`, the split pane will be hidden.
      */
    var disabled: Boolean = js.native
    var el: HTMLElement = js.native
    /**
      * Expression to be called when the split-pane visibility has changed
      */
    var ionSplitPaneVisible: EventEmitter[Anon_Visible] = js.native
    var isPane: js.Any = js.native
    var rmL: js.Any = js.native
    var styleChildren: js.Any = js.native
    var visible: Boolean = js.native
    /**
      * When the split-pane should be shown.
      * Can be a CSS media query expression, or a shortcut expression.
      * Can also be a boolean expression.
      */
    var when: String | Boolean = js.native
    @JSName("componentWillLoad")
    def componentWillLoad_MSplitPane(): Unit = js.native
    @JSName("connectedCallback")
    def connectedCallback_MSplitPane(): Unit = js.native
    @JSName("disconnectedCallback")
    def disconnectedCallback_MSplitPane(): Unit = js.native
    @JSName("render")
    def render_MSplitPane(): js.Any = js.native
    /* protected */ def updateState(): Unit = js.native
    def visibleChanged(visible: Boolean): Unit = js.native
  }
  
}

