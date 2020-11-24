package typings.jupyterlabFileeditor.widgetMod.FileEditor

import typings.jupyterlabCodeeditor.editorMod.CodeEditor.Factory
import typings.jupyterlabCodeeditor.editorMod.CodeEditor.IEditor
import typings.jupyterlabCodeeditor.mimetypeMod.IEditorMimeTypeService
import typings.jupyterlabDocregistry.registryMod.DocumentRegistry.CodeContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The options used to create an editor widget.
  */
@js.native
trait IOptions extends js.Object {
  
  /**
    * The document context associated with the editor.
    */
  var context: CodeContext = js.native
  
  /**
    * A code editor factory.
    */
  var factory: Factory = js.native
  
  /**
    * The mime type service for the editor.
    */
  var mimeTypeService: IEditorMimeTypeService = js.native
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
  
  @scala.inline
  implicit class IOptionsOps[Self <: IOptions] (val x: Self) extends AnyVal {
    
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
    def setContext(value: CodeContext): Self = this.set("context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFactory(value: /* options */ typings.jupyterlabCodeeditor.editorMod.CodeEditor.IOptions => IEditor): Self = this.set("factory", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMimeTypeService(value: IEditorMimeTypeService): Self = this.set("mimeTypeService", value.asInstanceOf[js.Any])
  }
}
