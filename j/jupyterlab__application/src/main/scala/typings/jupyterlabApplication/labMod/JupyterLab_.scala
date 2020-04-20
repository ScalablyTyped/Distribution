package typings.jupyterlabApplication.labMod

import typings.jupyterlabApplication.frontendMod.JupyterFrontEnd
import typings.jupyterlabApplication.frontendMod.JupyterFrontEnd.IPaths
import typings.jupyterlabApplication.labMod.JupyterLab.IInfo
import typings.jupyterlabApplication.labMod.JupyterLab.IOptions
import typings.jupyterlabApplication.labMod.JupyterLab.IPluginModule
import typings.jupyterlabApplication.shellMod.ILabShell
import typings.jupyterlabApplication.statusMod.LabStatus
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
    * A list of all errors encountered when registering plugins.
    */
  val registerPluginErrors: js.Array[Error] = js.native
  /**
    * The application busy and dirty status signals and flags.
    */
  val status: LabStatus = js.native
  /**
    * The JupyterLab application information dictionary.
    */
  def info: IInfo = js.native
  /**
    * The JupyterLab application paths dictionary.
    */
  def paths: IPaths = js.native
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

