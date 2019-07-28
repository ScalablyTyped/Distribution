package typings.atJupyterlabInspector.atJupyterlabInspectorMod

import typings.atJupyterlabInspector.libInspectorMod.InspectorPanelNs.IOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/inspector", "InspectorPanel")
@js.native
/**
  * Construct an inspector.
  */
class InspectorPanel ()
  extends typings.atJupyterlabInspector.libInspectorMod.InspectorPanel {
  def this(options: IOptions) = this()
}

/* static members */
@JSImport("@jupyterlab/inspector", "InspectorPanel")
@js.native
object InspectorPanel extends js.Object {
  /**
    * Generate content widget from string
    */
  var _generateContentWidget: js.Any = js.native
}

