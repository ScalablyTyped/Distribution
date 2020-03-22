package typings.jupyterlabFileeditor.tabspacestatusMod.TabSpaceStatus

import typings.jupyterlabApputils.vdomMod.VDomModel
import typings.jupyterlabCodeeditor.editorMod.CodeEditor.IConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A VDomModel for the TabSpace status item.
  */
@JSImport("@jupyterlab/fileeditor/lib/tabspacestatus", "TabSpaceStatus.Model")
@js.native
class Model () extends VDomModel {
  var _config: js.Any = js.native
  var _triggerChange: js.Any = js.native
  def config(): js.Any = js.native
  def config(`val`: IConfig): js.Any = js.native
  /**
    * The editor config from the settings system.
    */
  @JSName("config")
  def config_Union(): IConfig | Null = js.native
}

