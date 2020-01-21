package typings.jupyterlabFileeditor.widgetMod.FileEditor

import typings.jupyterlabCodeeditor.editorMod.CodeEditor.Factory
import typings.jupyterlabCodeeditor.editorMod.CodeEditor.IEditor
import typings.jupyterlabCodeeditor.mimetypeMod.IEditorMimeTypeService
import typings.jupyterlabDocregistry.registryMod.DocumentRegistry.CodeContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The options used to create an editor widget.
  */
trait IOptions extends js.Object {
  /**
    * The document context associated with the editor.
    */
  var context: CodeContext
  /**
    * A code editor factory.
    */
  var factory: Factory
  /**
    * The mime type service for the editor.
    */
  var mimeTypeService: IEditorMimeTypeService
}

object IOptions {
  @scala.inline
  def apply(
    context: CodeContext,
    factory: /* options */ typings.jupyterlabCodeeditor.editorMod.CodeEditor.IOptions => IEditor,
    mimeTypeService: IEditorMimeTypeService
  ): IOptions = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], factory = js.Any.fromFunction1(factory), mimeTypeService = mimeTypeService.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IOptions]
  }
}

