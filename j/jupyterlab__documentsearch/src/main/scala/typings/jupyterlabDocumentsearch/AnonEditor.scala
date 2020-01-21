package typings.jupyterlabDocumentsearch

import typings.jupyterlabCodemirror.mod.CodeMirrorEditor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEditor extends js.Object {
  var editor: CodeMirrorEditor
}

object AnonEditor {
  @scala.inline
  def apply(editor: CodeMirrorEditor): AnonEditor = {
    val __obj = js.Dynamic.literal(editor = editor.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonEditor]
  }
}

