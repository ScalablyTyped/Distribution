package typings
package atJupyterlabCodeeditorLib.libJsoneditorMod.JSONEditorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The options used to initialize a json editor.
  */
trait IOptions extends js.Object {
  /**
    * Whether the title should be collapsible. Defaults to `false`.
    */
  var collapsible: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The editor factory used by the editor.
    */
  var editorFactory: atJupyterlabCodeeditorLib.libEditorMod.CodeEditorNs.Factory
  /**
    * The title of the editor. Defaults to an empty string.
    */
  var title: js.UndefOr[java.lang.String] = js.undefined
}

object IOptions {
  @scala.inline
  def apply(
    editorFactory: atJupyterlabCodeeditorLib.libEditorMod.CodeEditorNs.Factory,
    collapsible: js.UndefOr[scala.Boolean] = js.undefined,
    title: java.lang.String = null
  ): IOptions = {
    val __obj = js.Dynamic.literal(editorFactory = editorFactory)
    if (!js.isUndefined(collapsible)) __obj.updateDynamic("collapsible")(collapsible)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[IOptions]
  }
}

