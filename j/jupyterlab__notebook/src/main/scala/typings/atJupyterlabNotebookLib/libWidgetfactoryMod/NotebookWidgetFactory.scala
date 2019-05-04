package typings
package atJupyterlabNotebookLib.libWidgetfactoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/notebook/lib/widgetfactory", "NotebookWidgetFactory")
@js.native
class NotebookWidgetFactory protected ()
  extends atJupyterlabDocregistryLib.atJupyterlabDocregistryMod.ABCWidgetFactory[
      atJupyterlabNotebookLib.libPanelMod.NotebookPanel, 
      atJupyterlabNotebookLib.libModelMod.INotebookModel
    ] {
  /**
    * Construct a new notebook widget factory.
    *
    * @param options - The options used to construct the factory.
    */
  def this(options: atJupyterlabNotebookLib.libWidgetfactoryMod.NotebookWidgetFactoryNs.IOptions[atJupyterlabNotebookLib.libPanelMod.NotebookPanel]) = this()
  var _editorConfig: js.Any = js.native
  /**
    * The content factory used by the widget factory.
    */
  val contentFactory: atJupyterlabNotebookLib.libPanelMod.NotebookPanelNs.IContentFactory = js.native
  /**
    * A configuration object for cell editor settings.
    */
  var editorConfig: atJupyterlabNotebookLib.libWidgetMod.StaticNotebookNs.IEditorConfig = js.native
  /**
    * The service used to look up mime types.
    */
  val mimeTypeService: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify IEditorMimeTypeService */ js.Any = js.native
  val rendermime: atJupyterlabRendermimeLib.atJupyterlabRendermimeMod.RenderMimeRegistry = js.native
  /**
    * Create a new widget.
    *
    * #### Notes
    * The factory will start the appropriate kernel and populate
    * the default toolbar items using `ToolbarItems.populateDefaults`.
    */
  /* protected */ def createNewWidget(
    context: atJupyterlabDocregistryLib.libRegistryMod.DocumentRegistryNs.IContext[atJupyterlabNotebookLib.libModelMod.INotebookModel]
  ): atJupyterlabNotebookLib.libPanelMod.NotebookPanel = js.native
}

