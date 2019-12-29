package typings.atJupyterlabNotebook.atJupyterlabNotebookMod

import typings.atJupyterlabDocregistry.libDefaultMod.DocumentWidget.IOptions
import typings.atJupyterlabNotebook.libModelMod.INotebookModel
import typings.atPhosphorCoreutils.atPhosphorCoreutilsMod.Token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/notebook", "NotebookPanel")
@js.native
class NotebookPanel protected ()
  extends typings.atJupyterlabNotebook.libPanelMod.NotebookPanel {
  /**
    * Construct a new notebook panel.
    */
  def this(options: IOptions[typings.atJupyterlabNotebook.libWidgetMod.Notebook, INotebookModel]) = this()
}

@JSImport("@jupyterlab/notebook", "NotebookPanel")
@js.native
object NotebookPanel extends js.Object {
  /**
    * The default implementation of an `IContentFactory`.
    */
  @js.native
  class ContentFactory ()
    extends typings.atJupyterlabNotebook.libPanelMod.NotebookPanel.ContentFactory
  
  /**
    * The notebook renderer token.
    */
  val IContentFactory: Token[typings.atJupyterlabNotebook.libPanelMod.NotebookPanel.IContentFactory] = js.native
  /**
    * Default content factory for the notebook panel.
    */
  val defaultContentFactory: typings.atJupyterlabNotebook.libPanelMod.NotebookPanel.ContentFactory = js.native
}

