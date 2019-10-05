package typings.atJupyterlabApplication.libLabMod

import typings.atJupyterlabApplication.libFrontendMod.JupyterFrontEnd
import typings.atJupyterlabApplication.libFrontendMod.JupyterFrontEnd.IPaths
import typings.atJupyterlabApplication.libLabMod.JupyterLab.IInfo
import typings.atJupyterlabApplication.libLabMod.JupyterLab.IOptions
import typings.atJupyterlabApplication.libLabMod.JupyterLab.IPluginModule
import typings.atJupyterlabApplication.libShellMod.ILabShell
import typings.atJupyterlabApplication.libStatusMod.LabStatus
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/application/lib/lab", "JupyterLab")
@js.native
/**
  * Construct a new JupyterLab object.
  */
class JupyterLab_ () extends JupyterFrontEnd[ILabShell] {
  def this(options: IOptions) = this()
  var _info: js.Any = js.native
  var _paths: js.Any = js.native
  /**
    * The JupyterLab application information dictionary.
    */
  val info: IInfo = js.native
  /**
    * The JupyterLab application paths dictionary.
    */
  val paths: IPaths = js.native
  /**
    * A list of all errors encountered when registering plugins.
    */
  val registerPluginErrors: js.Array[Error] = js.native
  /**
    * The application busy and dirty status signals and flags.
    */
  val status: LabStatus = js.native
  /**
    * Register plugins from a plugin module.
    *
    * @param mod - The plugin module to register.
    */
  def registerPluginModule(mod: IPluginModule): Unit = js.native
  /**
    * Register the plugins from multiple plugin modules.
    *
    * @param mods - The plugin modules to register.
    */
  def registerPluginModules(mods: js.Array[IPluginModule]): Unit = js.native
}

