package typings.jupyterlabNotebook.panelMod.NotebookPanel

import typings.jupyterlabNotebook.widgetMod.StaticNotebook.IEditorConfig
import typings.jupyterlabNotebook.widgetMod.StaticNotebook.INotebookConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Notebook config interface for NotebookPanel
  */
trait IConfig extends js.Object {
  /**
    * A config object for cell editors
    */
  var editorConfig: IEditorConfig
  /**
    * Whether to shut down the kernel when closing the panel or not
    */
  var kernelShutdown: Boolean
  /**
    * A config object for notebook widget
    */
  var notebookConfig: INotebookConfig
}

object IConfig {
  @scala.inline
  def apply(editorConfig: IEditorConfig, kernelShutdown: Boolean, notebookConfig: INotebookConfig): IConfig = {
    val __obj = js.Dynamic.literal(editorConfig = editorConfig.asInstanceOf[js.Any], kernelShutdown = kernelShutdown.asInstanceOf[js.Any], notebookConfig = notebookConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[IConfig]
  }
}

