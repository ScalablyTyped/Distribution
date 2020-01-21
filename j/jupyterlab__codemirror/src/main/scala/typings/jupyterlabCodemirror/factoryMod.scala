package typings.jupyterlabCodemirror

import typings.jupyterlabCodeeditor.editorMod.CodeEditor.IEditor
import typings.jupyterlabCodeeditor.editorMod.CodeEditor.IOptions
import typings.jupyterlabCodeeditor.factoryMod.IEditorFactoryService
import typings.jupyterlabCodemirror.editorMod.CodeMirrorEditor.IConfig
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/codemirror/lib/factory", JSImport.Namespace)
@js.native
object factoryMod extends js.Object {
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

