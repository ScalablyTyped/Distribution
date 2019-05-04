package typings
package atJupyterlabCodemirrorLib.libFactoryMod

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
  def this(defaults: stdLib.Partial[atJupyterlabCodemirrorLib.libEditorMod.CodeMirrorEditorNs.IConfig]) = this()
  var documentCodeMirrorConfig: stdLib.Partial[atJupyterlabCodemirrorLib.libEditorMod.CodeMirrorEditorNs.IConfig] = js.native
  var inlineCodeMirrorConfig: stdLib.Partial[atJupyterlabCodemirrorLib.libEditorMod.CodeMirrorEditorNs.IConfig] = js.native
  /**
    * Create a new editor for a full document.
    */
  def newDocumentEditor(
    options: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify CodeEditor.IOptions */ js.Any
  ): atJupyterlabCodemirrorLib.libEditorMod.CodeMirrorEditor = js.native
  /**
    * Create a new editor for inline code.
    */
  def newInlineEditor(
    options: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify CodeEditor.IOptions */ js.Any
  ): atJupyterlabCodemirrorLib.libEditorMod.CodeMirrorEditor = js.native
}

