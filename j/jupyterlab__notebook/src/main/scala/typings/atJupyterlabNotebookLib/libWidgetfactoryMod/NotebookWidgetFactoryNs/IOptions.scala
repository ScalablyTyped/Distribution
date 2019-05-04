package typings
package atJupyterlabNotebookLib.libWidgetfactoryMod.NotebookWidgetFactoryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The options used to construct a `NotebookWidgetFactory`.
  */
trait IOptions[T /* <: atJupyterlabNotebookLib.libPanelMod.NotebookPanel */]
  extends atJupyterlabDocregistryLib.libRegistryMod.DocumentRegistryNs.IWidgetFactoryOptions[T] {
  /**
    * A notebook panel content factory.
    */
  var contentFactory: atJupyterlabNotebookLib.libPanelMod.NotebookPanelNs.IContentFactory
  /**
    * The notebook cell editor configuration.
    */
  var editorConfig: js.UndefOr[atJupyterlabNotebookLib.libWidgetMod.StaticNotebookNs.IEditorConfig] = js.undefined
  /**
    * The service used to look up mime types.
    */
  var mimeTypeService: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify IEditorMimeTypeService */ js.Any
  var rendermime: atJupyterlabRendermimeLib.atJupyterlabRendermimeMod.RenderMimeRegistry
}

object IOptions {
  @scala.inline
  def apply[T /* <: atJupyterlabNotebookLib.libPanelMod.NotebookPanel */](
    contentFactory: atJupyterlabNotebookLib.libPanelMod.NotebookPanelNs.IContentFactory,
    fileTypes: js.Array[java.lang.String],
    mimeTypeService: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify IEditorMimeTypeService */ js.Any,
    name: java.lang.String,
    rendermime: atJupyterlabRendermimeLib.atJupyterlabRendermimeMod.RenderMimeRegistry,
    canStartKernel: js.UndefOr[scala.Boolean] = js.undefined,
    defaultFor: js.Array[java.lang.String] = null,
    defaultRendered: js.Array[java.lang.String] = null,
    editorConfig: atJupyterlabNotebookLib.libWidgetMod.StaticNotebookNs.IEditorConfig = null,
    modelName: java.lang.String = null,
    preferKernel: js.UndefOr[scala.Boolean] = js.undefined,
    readOnly: js.UndefOr[scala.Boolean] = js.undefined,
    toolbarFactory: T => js.Array[atJupyterlabDocregistryLib.libRegistryMod.DocumentRegistryNs.IToolbarItem] = null
  ): IOptions[T] = {
    val __obj = js.Dynamic.literal(contentFactory = contentFactory, fileTypes = fileTypes, mimeTypeService = mimeTypeService, name = name, rendermime = rendermime)
    if (!js.isUndefined(canStartKernel)) __obj.updateDynamic("canStartKernel")(canStartKernel)
    if (defaultFor != null) __obj.updateDynamic("defaultFor")(defaultFor)
    if (defaultRendered != null) __obj.updateDynamic("defaultRendered")(defaultRendered)
    if (editorConfig != null) __obj.updateDynamic("editorConfig")(editorConfig)
    if (modelName != null) __obj.updateDynamic("modelName")(modelName)
    if (!js.isUndefined(preferKernel)) __obj.updateDynamic("preferKernel")(preferKernel)
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly)
    if (toolbarFactory != null) __obj.updateDynamic("toolbarFactory")(js.Any.fromFunction1(toolbarFactory))
    __obj.asInstanceOf[IOptions[T]]
  }
}

