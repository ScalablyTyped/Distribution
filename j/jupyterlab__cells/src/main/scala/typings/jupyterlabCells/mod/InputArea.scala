package typings.jupyterlabCells.mod

import typings.jupyterlabCells.inputareaMod.InputArea.IOptions
import typings.jupyterlabCodeeditor.editorMod.CodeEditor.Factory
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jupyterlab/cells", "InputArea")
@js.native
class InputArea protected ()
  extends typings.jupyterlabCells.inputareaMod.InputArea {
  /**
    * Construct an input area widget.
    */
  def this(options: IOptions) = this()
}
@JSImport("@jupyterlab/cells", "InputArea")
@js.native
object InputArea extends js.Object {
  
  /**
    * The default `ContentFactory` instance.
    */
  val defaultContentFactory: typings.jupyterlabCells.inputareaMod.InputArea.ContentFactory = js.native
  
  /**
    * The default editor factory singleton based on CodeMirror.
    */
  val defaultEditorFactory: Factory = js.native
  
  /**
    * Default implementation of `IContentFactory`.
    *
    * This defaults to using an `editorFactory` based on CodeMirror.
    */
  @js.native
  /**
    * Construct a `ContentFactory`.
    */
  class ContentFactory ()
    extends typings.jupyterlabCells.inputareaMod.InputArea.ContentFactory {
    def this(options: typings.jupyterlabCells.inputareaMod.InputArea.ContentFactory.IOptions) = this()
  }
  /**
    * A namespace for the input area content factory.
    */
  @js.native
  object ContentFactory extends js.Object
}
