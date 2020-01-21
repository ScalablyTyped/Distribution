package typings.jupyterlabNotebook.notebooktoolsMod.NotebookTools.MetadataEditorTool

import typings.jupyterlabCodeeditor.editorMod.CodeEditor.Factory
import typings.jupyterlabCodeeditor.editorMod.CodeEditor.IEditor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The options used to initialize a metadata editor tool.
  */
trait IOptions extends js.Object {
  /**
    * Initial collapse state, defaults to true.
    */
  var collapsed: js.UndefOr[Boolean] = js.undefined
  /**
    * The editor factory used by the tool.
    */
  var editorFactory: Factory
  /**
    * The label for the JSON editor
    */
  var label: js.UndefOr[String] = js.undefined
}

object IOptions {
  @scala.inline
  def apply(
    editorFactory: /* options */ typings.jupyterlabCodeeditor.editorMod.CodeEditor.IOptions => IEditor,
    collapsed: js.UndefOr[Boolean] = js.undefined,
    label: String = null
  ): IOptions = {
    val __obj = js.Dynamic.literal(editorFactory = js.Any.fromFunction1(editorFactory))
    if (!js.isUndefined(collapsed)) __obj.updateDynamic("collapsed")(collapsed.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions]
  }
}

