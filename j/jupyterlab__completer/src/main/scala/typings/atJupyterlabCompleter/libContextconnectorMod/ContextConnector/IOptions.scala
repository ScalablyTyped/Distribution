package typings.atJupyterlabCompleter.libContextconnectorMod.ContextConnector

import typings.atJupyterlabCodeeditor.libEditorMod.CodeEditor.IEditor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The instantiation options for cell completion handlers.
  */
trait IOptions extends js.Object {
  /**
    * The session used by the context connector.
    */
  var editor: IEditor
}

object IOptions {
  @scala.inline
  def apply(editor: IEditor): IOptions = {
    val __obj = js.Dynamic.literal(editor = editor)
  
    __obj.asInstanceOf[IOptions]
  }
}

