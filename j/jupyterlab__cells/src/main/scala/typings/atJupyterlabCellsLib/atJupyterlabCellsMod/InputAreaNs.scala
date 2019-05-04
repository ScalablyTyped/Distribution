package typings
package atJupyterlabCellsLib.atJupyterlabCellsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/cells", "InputArea")
@js.native
object InputAreaNs extends js.Object {
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
    extends atJupyterlabCellsLib.libInputareaMod.InputAreaNs.ContentFactory {
    def this(options: atJupyterlabCellsLib.libInputareaMod.InputAreaNs.ContentFactoryNs.IOptions) = this()
  }
  
  /**
    * The default `ContentFactory` instance.
    */
  val defaultContentFactory: atJupyterlabCellsLib.libInputareaMod.InputAreaNs.ContentFactory = js.native
  /**
    * The default editor factory singleton based on CodeMirror.
    */
  val defaultEditorFactory: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify CodeEditor.Factory */ js.Any = js.native
  /**
    * A namespace for the input area content factory.
    */
  @JSName("ContentFactory")
  @js.native
  object ContentFactoryNs extends js.Object
  
}

