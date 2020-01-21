package typings.jupyterlabCells.inputareaMod.InputArea

import typings.jupyterlabCells.inputareaMod.IInputPrompt
import typings.jupyterlabCodeeditor.editorMod.CodeEditor.Factory
import typings.jupyterlabCodeeditor.editorMod.CodeEditor.IEditor
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
  val editorFactory: Factory
  /**
    * Create an input prompt.
    */
  def createInputPrompt(): IInputPrompt
}

object IContentFactory {
  @scala.inline
  def apply(
    createInputPrompt: () => IInputPrompt,
    editorFactory: /* options */ typings.jupyterlabCodeeditor.editorMod.CodeEditor.IOptions => IEditor
  ): IContentFactory = {
    val __obj = js.Dynamic.literal(createInputPrompt = js.Any.fromFunction0(createInputPrompt), editorFactory = js.Any.fromFunction1(editorFactory))
  
    __obj.asInstanceOf[IContentFactory]
  }
}

