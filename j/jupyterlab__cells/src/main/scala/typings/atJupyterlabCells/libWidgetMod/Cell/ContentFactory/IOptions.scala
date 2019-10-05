package typings.atJupyterlabCells.libWidgetMod.Cell.ContentFactory

import typings.atJupyterlabCodeeditor.libEditorMod.CodeEditor.Factory
import typings.atJupyterlabCodeeditor.libEditorMod.CodeEditor.IEditor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options for the content factory.
  */
trait IOptions extends js.Object {
  /**
    * The editor factory used by the content factory.
    *
    * If this is not passed, a default CodeMirror editor factory
    * will be used.
    */
  var editorFactory: js.UndefOr[Factory] = js.undefined
}

object IOptions {
  @scala.inline
  def apply(
    editorFactory: /* options */ typings.atJupyterlabCodeeditor.libEditorMod.CodeEditor.IOptions => IEditor = null
  ): IOptions = {
    val __obj = js.Dynamic.literal()
    if (editorFactory != null) __obj.updateDynamic("editorFactory")(js.Any.fromFunction1(editorFactory))
    __obj.asInstanceOf[IOptions]
  }
}

