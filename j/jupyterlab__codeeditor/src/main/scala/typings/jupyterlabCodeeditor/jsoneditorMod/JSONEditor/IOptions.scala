package typings.jupyterlabCodeeditor.jsoneditorMod.JSONEditor

import typings.jupyterlabCodeeditor.editorMod.CodeEditor.Factory
import typings.jupyterlabCodeeditor.editorMod.CodeEditor.IEditor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The options used to initialize a json editor.
  */
trait IOptions extends js.Object {
  /**
    * The editor factory used by the editor.
    */
  var editorFactory: Factory
}

object IOptions {
  @scala.inline
  def apply(editorFactory: /* options */ typings.jupyterlabCodeeditor.editorMod.CodeEditor.IOptions => IEditor): IOptions = {
    val __obj = js.Dynamic.literal(editorFactory = js.Any.fromFunction1(editorFactory))
  
    __obj.asInstanceOf[IOptions]
  }
}

