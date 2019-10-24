package typings.atJupyterlabCodemirror

import typings.atJupyterlabCodemirror.libEditorMod.CodeMirrorEditor
import typings.atJupyterlabCodemirror.libEditorMod.CodeMirrorEditor.IConfig
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/codemirror/lib/factory", JSImport.Namespace)
@js.native
object libFactoryMod extends js.Object {
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: QualifyReferences.resolveTypeRef many Couldn't qualify IEditorFactoryService * / any */ @js.native
  /**
    * Construct an IEditorFactoryService for CodeMirrorEditors.
    */
  class CodeMirrorEditorFactory () extends js.Object {
    def this(defaults: Partial[IConfig]) = this()
    var documentCodeMirrorConfig: Partial[IConfig] = js.native
    var inlineCodeMirrorConfig: Partial[IConfig] = js.native
    /**
      * Create a new editor for a full document.
      */
    def newDocumentEditor(
      options: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify CodeEditor.IOptions */ js.Any
    ): CodeMirrorEditor = js.native
    /**
      * Create a new editor for inline code.
      */
    def newInlineEditor(
      options: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify CodeEditor.IOptions */ js.Any
    ): CodeMirrorEditor = js.native
  }
  
}

