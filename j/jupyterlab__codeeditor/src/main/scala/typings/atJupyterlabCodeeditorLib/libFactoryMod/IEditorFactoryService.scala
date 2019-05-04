package typings
package atJupyterlabCodeeditorLib.libFactoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEditorFactoryService extends js.Object {
  /**
    * Create a new editor for a full document.
    */
  def newDocumentEditor(options: atJupyterlabCodeeditorLib.libEditorMod.CodeEditorNs.IOptions): atJupyterlabCodeeditorLib.libEditorMod.CodeEditorNs.IEditor
  /**
    * Create a new editor for inline code.
    */
  def newInlineEditor(options: atJupyterlabCodeeditorLib.libEditorMod.CodeEditorNs.IOptions): atJupyterlabCodeeditorLib.libEditorMod.CodeEditorNs.IEditor
}

object IEditorFactoryService {
  @scala.inline
  def apply(
    newDocumentEditor: atJupyterlabCodeeditorLib.libEditorMod.CodeEditorNs.IOptions => atJupyterlabCodeeditorLib.libEditorMod.CodeEditorNs.IEditor,
    newInlineEditor: atJupyterlabCodeeditorLib.libEditorMod.CodeEditorNs.IOptions => atJupyterlabCodeeditorLib.libEditorMod.CodeEditorNs.IEditor
  ): IEditorFactoryService = {
    val __obj = js.Dynamic.literal(newDocumentEditor = js.Any.fromFunction1(newDocumentEditor), newInlineEditor = js.Any.fromFunction1(newInlineEditor))
  
    __obj.asInstanceOf[IEditorFactoryService]
  }
}

