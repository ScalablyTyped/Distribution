package typings.atJupyterlabCodemirror

import typings.atJupyterlabCodeeditor.libEditorMod.CodeEditor.IEditor
import typings.atJupyterlabCodeeditor.libEditorMod.CodeEditor.IOptions
import typings.atJupyterlabCodeeditor.libFactoryMod.IEditorFactoryService
import typings.atJupyterlabCodemirror.libEditorMod.CodeMirrorEditor.IConfig
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/codemirror/lib/factory", JSImport.Namespace)
@js.native
object libFactoryMod extends js.Object {
  @js.native
  /**
    * Construct an IEditorFactoryService for CodeMirrorEditors.
    */
  class CodeMirrorEditorFactory () extends IEditorFactoryService {
    def this(defaults: Partial[IConfig]) = this()
    var documentCodeMirrorConfig: Partial[IConfig] = js.native
    var inlineCodeMirrorConfig: Partial[IConfig] = js.native
    /**
      * Create a new editor for a full document.
      */
    /* CompleteClass */
    override def newDocumentEditor(options: IOptions): IEditor = js.native
    /**
      * Create a new editor for inline code.
      */
    /* CompleteClass */
    override def newInlineEditor(options: IOptions): IEditor = js.native
  }
  
}

