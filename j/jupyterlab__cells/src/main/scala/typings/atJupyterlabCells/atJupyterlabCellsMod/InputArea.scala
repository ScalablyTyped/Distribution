package typings.atJupyterlabCells.atJupyterlabCellsMod

import typings.atJupyterlabCells.libInputareaMod.InputArea.IOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/cells", "InputArea")
@js.native
class InputArea protected ()
  extends typings.atJupyterlabCells.libInputareaMod.InputArea {
  /**
    * Construct an input area widget.
    */
  def this(options: IOptions) = this()
}

@JSImport("@jupyterlab/cells", "InputArea")
@js.native
object InputArea extends js.Object {
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
    extends typings.atJupyterlabCells.libInputareaMod.InputArea.ContentFactory {
    def this(options: typings.atJupyterlabCells.libInputareaMod.InputArea.ContentFactory.IOptions) = this()
  }
  
  /**
    * The default `ContentFactory` instance.
    */
  val defaultContentFactory: typings.atJupyterlabCells.libInputareaMod.InputArea.ContentFactory = js.native
  /**
    * The default editor factory singleton based on CodeMirror.
    */
  val defaultEditorFactory: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify CodeEditor.Factory */ js.Any = js.native
  /**
    * A namespace for the input area content factory.
    */
  @js.native
  object ContentFactory extends js.Object
  
}

