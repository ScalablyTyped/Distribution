package typings.jupyterlabNotebook.panelMod.NotebookPanel

import typings.jupyterlabNotebook.widgetMod.StaticNotebook.IEditorConfig
import typings.jupyterlabNotebook.widgetMod.StaticNotebook.INotebookConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Notebook config interface for NotebookPanel
  */
@js.native
trait IConfig extends js.Object {
  
  /**
    * A config object for cell editors
    */
  var editorConfig: IEditorConfig = js.native
  
  /**
    * Whether to shut down the kernel when closing the panel or not
    */
  var kernelShutdown: Boolean = js.native
  
  /**
    * A config object for notebook widget
    */
  var notebookConfig: INotebookConfig = js.native
}
object IConfig {
  
  @scala.inline
  def apply(editorConfig: IEditorConfig, kernelShutdown: Boolean, notebookConfig: INotebookConfig): IConfig = {
    val __obj = js.Dynamic.literal(editorConfig = editorConfig.asInstanceOf[js.Any], kernelShutdown = kernelShutdown.asInstanceOf[js.Any], notebookConfig = notebookConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[IConfig]
  }
  
  @scala.inline
  implicit class IConfigOps[Self <: IConfig] (val x: Self) extends AnyVal {
    
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
    def setEditorConfig(value: IEditorConfig): Self = this.set("editorConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKernelShutdown(value: Boolean): Self = this.set("kernelShutdown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotebookConfig(value: INotebookConfig): Self = this.set("notebookConfig", value.asInstanceOf[js.Any])
  }
}
