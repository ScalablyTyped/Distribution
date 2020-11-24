package typings.jupyterlabCells.widgetMod.Cell

import typings.jupyterlabCodeeditor.editorMod.CodeEditor.Factory
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The default implementation of an `IContentFactory`.
  *
  * This includes a CodeMirror editor factory to make it easy to use out of the box.
  */
@JSImport("@jupyterlab/cells/lib/widget", "Cell.ContentFactory")
@js.native
/**
  * Create a content factory for a cell.
  */
class ContentFactory_ () extends IContentFactory {
  def this(options: typings.jupyterlabCells.widgetMod.Cell.ContentFactory.IOptions) = this()
  
  var _editorFactory: js.Any = js.native
  
  /**
    * The readonly editor factory that create code editors
    */
  @JSName("editorFactory")
  def editorFactory_MContentFactory_ : Factory = js.native
}
