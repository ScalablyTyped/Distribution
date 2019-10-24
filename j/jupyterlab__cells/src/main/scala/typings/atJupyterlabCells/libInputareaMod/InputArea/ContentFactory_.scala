package typings.atJupyterlabCells.libInputareaMod.InputArea

import typings.atJupyterlabCells.libInputareaMod.IInputPrompt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def this(options: typings.atJupyterlabCells.libInputareaMod.InputArea.ContentFactory.IOptions) = this()
  var _editor: js.Any = js.native
  /**
    * The editor factory we need to include in `CodeEditorWratter.IOptions`.
    *
    * This is a separate readonly attribute rather than a factory method as we need
    * to pass it around.
    */
  /* CompleteClass */
  override val editorFactory: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify CodeEditor.Factory */ js.Any = js.native
  /**
    * Create an input prompt.
    */
  /* CompleteClass */
  override def createInputPrompt(): IInputPrompt = js.native
}

