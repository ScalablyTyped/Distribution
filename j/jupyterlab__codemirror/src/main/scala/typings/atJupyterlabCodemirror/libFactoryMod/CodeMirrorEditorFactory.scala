package typings.atJupyterlabCodemirror.libFactoryMod

import typings.atJupyterlabCodemirror.libEditorMod.CodeMirrorEditor
import typings.atJupyterlabCodemirror.libEditorMod.CodeMirrorEditorNs.IConfig
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped any */ @JSImport("@jupyterlab/codemirror/lib/factory", "CodeMirrorEditorFactory")
@js.native
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

