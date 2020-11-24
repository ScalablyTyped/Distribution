package typings.jupyterlabCells.inputareaMod.InputArea

import typings.jupyterlabCodeeditor.editorMod.CodeEditor.Factory
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Default implementation of `IContentFactory`.
  *
  * This defaults to using an `editorFactory` based on CodeMirror.
  */
@JSImport("@jupyterlab/cells/lib/inputarea", "InputArea.ContentFactory")
@js.native
/**
  * Construct a `ContentFactory`.
  */
class ContentFactory_ () extends IContentFactory {
  def this(options: typings.jupyterlabCells.inputareaMod.InputArea.ContentFactory.IOptions) = this()
  
  var _editor: js.Any = js.native
  
  /**
    * Return the `CodeEditor.Factory` being used.
    */
  @JSName("editorFactory")
  def editorFactory_MContentFactory_ : Factory = js.native
}
