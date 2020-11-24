package typings.jupyterlabCodeeditor.factoryMod

import typings.jupyterlabCodeeditor.editorMod.CodeEditor.IEditor
import typings.jupyterlabCodeeditor.editorMod.CodeEditor.IOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IEditorFactoryService extends js.Object {
  
  /**
    * Create a new editor for a full document.
    */
  def newDocumentEditor(options: IOptions): IEditor = js.native
  
  /**
    * Create a new editor for inline code.
    */
  def newInlineEditor(options: IOptions): IEditor = js.native
}
object IEditorFactoryService {
  
  @scala.inline
  def apply(newDocumentEditor: IOptions => IEditor, newInlineEditor: IOptions => IEditor): IEditorFactoryService = {
    val __obj = js.Dynamic.literal(newDocumentEditor = js.Any.fromFunction1(newDocumentEditor), newInlineEditor = js.Any.fromFunction1(newInlineEditor))
    __obj.asInstanceOf[IEditorFactoryService]
  }
  
  @scala.inline
  implicit class IEditorFactoryServiceOps[Self <: IEditorFactoryService] (val x: Self) extends AnyVal {
    
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
    def setNewDocumentEditor(value: IOptions => IEditor): Self = this.set("newDocumentEditor", js.Any.fromFunction1(value))
    
    @scala.inline
    def setNewInlineEditor(value: IOptions => IEditor): Self = this.set("newInlineEditor", js.Any.fromFunction1(value))
  }
}
