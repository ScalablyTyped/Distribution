package typings.jupyterlabFileeditor.tabspacestatusMod.TabSpaceStatus

import typings.jupyterlabApputils.vdomMod.VDomModel
import typings.jupyterlabCodeeditor.editorMod.CodeEditor.IConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A VDomModel for the TabSpace status item.
  */
@JSImport("@jupyterlab/fileeditor/lib/tabspacestatus", "TabSpaceStatus.Model")
@js.native
class Model () extends VDomModel {
  
  var _config: js.Any = js.native
  
  var _triggerChange: js.Any = js.native
  
  /**
    * The editor config from the settings system.
    */
  def config: IConfig | Null = js.native
  def config_=(`val`: IConfig | Null): Unit = js.native
}
