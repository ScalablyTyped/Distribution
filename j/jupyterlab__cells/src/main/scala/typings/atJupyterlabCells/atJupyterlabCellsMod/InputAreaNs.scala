package typings.atJupyterlabCells.atJupyterlabCellsMod

import typings.atJupyterlabCells.libInputareaMod.InputAreaNs.ContentFactoryNs.IOptions
import typings.atJupyterlabCodeeditor.libEditorMod.CodeEditorNs.Factory
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
    extends typings.atJupyterlabCells.libInputareaMod.InputAreaNs.ContentFactory {
    def this(options: IOptions) = this()
  }
  
  /**
    * The default `ContentFactory` instance.
    */
  val defaultContentFactory: typings.atJupyterlabCells.libInputareaMod.InputAreaNs.ContentFactory = js.native
  /**
    * The default editor factory singleton based on CodeMirror.
    */
  val defaultEditorFactory: Factory = js.native
  /**
    * A namespace for the input area content factory.
    */
  @JSName("ContentFactory")
  @js.native
  object ContentFactoryNs extends js.Object
  
}

