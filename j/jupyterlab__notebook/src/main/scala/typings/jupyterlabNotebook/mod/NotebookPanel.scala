package typings.jupyterlabNotebook.mod

import typings.jupyterlabDocregistry.defaultMod.DocumentWidget.IOptions
import typings.jupyterlabNotebook.modelMod.INotebookModel
import typings.luminoCoreutils.mod.Token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jupyterlab/notebook", "NotebookPanel")
@js.native
class NotebookPanel protected ()
  extends typings.jupyterlabNotebook.panelMod.NotebookPanel {
  /**
    * Construct a new notebook panel.
    */
  def this(options: IOptions[typings.jupyterlabNotebook.widgetMod.Notebook, INotebookModel]) = this()
}
@JSImport("@jupyterlab/notebook", "NotebookPanel")
@js.native
object NotebookPanel extends js.Object {
  
  /**
    * The notebook renderer token.
    */
  val IContentFactory: Token[typings.jupyterlabNotebook.panelMod.NotebookPanel.IContentFactory] = js.native
  
  /**
    * Default content factory for the notebook panel.
    */
  val defaultContentFactory: typings.jupyterlabNotebook.panelMod.NotebookPanel.ContentFactory = js.native
  
  /**
    * The default implementation of an `IContentFactory`.
    */
  @js.native
  class ContentFactory ()
    extends typings.jupyterlabNotebook.panelMod.NotebookPanel.ContentFactory
}
