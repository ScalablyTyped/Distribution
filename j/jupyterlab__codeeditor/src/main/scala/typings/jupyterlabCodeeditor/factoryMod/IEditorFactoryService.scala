package typings.jupyterlabCodeeditor.factoryMod

import typings.jupyterlabCodeeditor.editorMod.CodeEditor.IEditor
import typings.jupyterlabCodeeditor.editorMod.CodeEditor.IOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEditorFactoryService extends js.Object {
  /**
    * Create a new editor for a full document.
    */
  def newDocumentEditor(options: IOptions): IEditor
  /**
    * Create a new editor for inline code.
    */
  def newInlineEditor(options: IOptions): IEditor
}

object IEditorFactoryService {
  @scala.inline
  def apply(newDocumentEditor: IOptions => IEditor, newInlineEditor: IOptions => IEditor): IEditorFactoryService = {
    val __obj = js.Dynamic.literal(newDocumentEditor = js.Any.fromFunction1(newDocumentEditor), newInlineEditor = js.Any.fromFunction1(newInlineEditor))
    __obj.asInstanceOf[IEditorFactoryService]
  }
}

