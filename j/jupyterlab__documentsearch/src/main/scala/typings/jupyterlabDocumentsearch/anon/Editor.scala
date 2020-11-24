package typings.jupyterlabDocumentsearch.anon

import typings.jupyterlabCodemirror.mod.CodeMirrorEditor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Editor extends js.Object {
  
  var editor: CodeMirrorEditor = js.native
}
object Editor {
  
  @scala.inline
  def apply(editor: CodeMirrorEditor): Editor = {
    val __obj = js.Dynamic.literal(editor = editor.asInstanceOf[js.Any])
    __obj.asInstanceOf[Editor]
  }
  
  @scala.inline
  implicit class EditorOps[Self <: Editor] (val x: Self) extends AnyVal {
    
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
    def setEditor(value: CodeMirrorEditor): Self = this.set("editor", value.asInstanceOf[js.Any])
  }
}
