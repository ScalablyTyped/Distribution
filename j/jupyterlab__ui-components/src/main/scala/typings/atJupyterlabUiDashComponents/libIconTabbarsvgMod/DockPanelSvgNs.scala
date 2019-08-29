package typings.atJupyterlabUiDashComponents.libIconTabbarsvgMod

import typings.atJupyterlabUiDashComponents.libStyleIconMod.IconKindType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/ui-components/lib/icon/tabbarsvg", "DockPanelSvg")
@js.native
object DockPanelSvgNs extends js.Object {
  trait IOptions
    extends typings.atPhosphorWidgets.libDockpanelMod.DockPanelNs.IOptions {
    /**
      * The kind of icon this dock panel widget should render.
      * Adds preset styling to the icons.
      */
    var kind: js.UndefOr[IconKindType] = js.undefined
  }
  
  /**
    * A modified implementation of the DockPanel Renderer.
    */
  @js.native
  class Renderer ()
    extends typings.atPhosphorWidgets.atPhosphorWidgetsMod.DockPanelNs.Renderer {
    def this(kind: IconKindType) = this()
    var _kind: IconKindType = js.native
  }
  
}

