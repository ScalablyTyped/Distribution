package typings.atJupyterlabCells.libInputareaMod.InputArea

import typings.atJupyterlabCells.libInputareaMod.IInputPrompt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An input area widget content factory.
  *
  * The content factory is used to create children in a way
  * that can be customized.
  */
trait IContentFactory extends js.Object {
  /**
    * The editor factory we need to include in `CodeEditorWratter.IOptions`.
    *
    * This is a separate readonly attribute rather than a factory method as we need
    * to pass it around.
    */
  val editorFactory: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify CodeEditor.Factory */ js.Any
  /**
    * Create an input prompt.
    */
  def createInputPrompt(): IInputPrompt
}

object IContentFactory {
  @scala.inline
  def apply(
    createInputPrompt: () => IInputPrompt,
    editorFactory: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify CodeEditor.Factory */ js.Any
  ): IContentFactory = {
    val __obj = js.Dynamic.literal(createInputPrompt = js.Any.fromFunction0(createInputPrompt), editorFactory = editorFactory)
  
    __obj.asInstanceOf[IContentFactory]
  }
}

