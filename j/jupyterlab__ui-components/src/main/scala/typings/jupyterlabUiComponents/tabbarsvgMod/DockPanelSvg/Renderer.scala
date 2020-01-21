package typings.jupyterlabUiComponents.tabbarsvgMod.DockPanelSvg

import typings.jupyterlabUiComponents.styleIconMod.IconKindType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A modified implementation of the DockPanel Renderer.
  */
@JSImport("@jupyterlab/ui-components/lib/icon/tabbarsvg", "DockPanelSvg.Renderer")
@js.native
class Renderer ()
  extends typings.phosphorWidgets.dockpanelMod.DockPanel.Renderer {
  def this(kind: IconKindType) = this()
  var _kind: IconKindType = js.native
}

