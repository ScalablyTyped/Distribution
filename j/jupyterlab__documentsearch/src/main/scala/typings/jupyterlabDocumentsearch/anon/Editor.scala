package typings.jupyterlabDocumentsearch.anon

import typings.jupyterlabCodemirror.mod.CodeMirrorEditor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Editor extends js.Object {
  var editor: CodeMirrorEditor
}

object Editor {
  @scala.inline
  def apply(editor: CodeMirrorEditor): Editor = {
    val __obj = js.Dynamic.literal(editor = editor.asInstanceOf[js.Any])
    __obj.asInstanceOf[Editor]
  }
}

