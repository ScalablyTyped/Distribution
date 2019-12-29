package typings.atJupyterlabNotebook.libWidgetMod.StaticNotebook

import typings.atJupyterlabCodeeditor.libMimetypeMod.IEditorMimeTypeService
import typings.atJupyterlabRendermime.libTokensMod.IRenderMimeRegistry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An options object for initializing a static notebook.
  */
trait IOptions extends js.Object {
  /**
    * A factory for creating content.
    */
  var contentFactory: js.UndefOr[IContentFactory] = js.undefined
  /**
    * A configuration object for the cell editor settings.
    */
  var editorConfig: js.UndefOr[IEditorConfig] = js.undefined
  /**
    * The language preference for the model.
    */
  var languagePreference: js.UndefOr[String] = js.undefined
  /**
    * The service used to look up mime types.
    */
  var mimeTypeService: IEditorMimeTypeService
  /**
    * A configuration object for notebook settings.
    */
  var notebookConfig: js.UndefOr[INotebookConfig] = js.undefined
  /**
    * The rendermime instance used by the widget.
    */
  var rendermime: IRenderMimeRegistry
}

object IOptions {
  @scala.inline
  def apply(
    mimeTypeService: IEditorMimeTypeService,
    rendermime: IRenderMimeRegistry,
    contentFactory: IContentFactory = null,
    editorConfig: IEditorConfig = null,
    languagePreference: String = null,
    notebookConfig: INotebookConfig = null
  ): IOptions = {
    val __obj = js.Dynamic.literal(mimeTypeService = mimeTypeService.asInstanceOf[js.Any], rendermime = rendermime.asInstanceOf[js.Any])
    if (contentFactory != null) __obj.updateDynamic("contentFactory")(contentFactory.asInstanceOf[js.Any])
    if (editorConfig != null) __obj.updateDynamic("editorConfig")(editorConfig.asInstanceOf[js.Any])
    if (languagePreference != null) __obj.updateDynamic("languagePreference")(languagePreference.asInstanceOf[js.Any])
    if (notebookConfig != null) __obj.updateDynamic("notebookConfig")(notebookConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions]
  }
}

