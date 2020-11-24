package typings.jupyterlabApplication.labMod.JupyterLab

import typings.jupyterlabApplication.frontendMod.JupyterFrontEndPlugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The interface for a module that exports a plugin or plugins as
  * the default value.
  */
@js.native
trait IPluginModule extends js.Object {
  
  /**
    * The default export.
    */
  var default: JupyterFrontEndPlugin[_] | js.Array[JupyterFrontEndPlugin[_]] = js.native
}
object IPluginModule {
  
  @scala.inline
  def apply(default: JupyterFrontEndPlugin[_] | js.Array[JupyterFrontEndPlugin[_]]): IPluginModule = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPluginModule]
  }
  
  @scala.inline
  implicit class IPluginModuleOps[Self <: IPluginModule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDefaultVarargs(value: JupyterFrontEndPlugin[js.Any]*): Self = this.set("default", js.Array(value :_*))
    
    @scala.inline
    def setDefault(value: JupyterFrontEndPlugin[_] | js.Array[JupyterFrontEndPlugin[_]]): Self = this.set("default", value.asInstanceOf[js.Any])
  }
}
