package typings.atJupyterlabApplication.libLabMod.JupyterLab

import typings.atJupyterlabApplication.libFrontendMod.JupyterFrontEndPlugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The interface for a module that exports a plugin or plugins as
  * the default value.
  */
trait IPluginModule extends js.Object {
  /**
    * The default export.
    */
  var default: JupyterFrontEndPlugin[_] | js.Array[JupyterFrontEndPlugin[_]]
}

object IPluginModule {
  @scala.inline
  def apply(default: JupyterFrontEndPlugin[_] | js.Array[JupyterFrontEndPlugin[_]]): IPluginModule = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IPluginModule]
  }
}

