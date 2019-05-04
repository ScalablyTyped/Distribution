package typings
package atJupyterlabCodeeditorLib.libJsoneditorMod.JSONEditorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The options used to initialize a json editor.
  */
@js.native
trait IOptions extends js.Object {
  /**
    * Whether the title should be collapsible. Defaults to `false`.
    */
  var collapsible: js.UndefOr[scala.Boolean] = js.native
  /**
    * The editor factory used by the editor.
    */
  @JSName("editorFactory")
  var editorFactory_Original: atJupyterlabCodeeditorLib.libEditorMod.CodeEditorNs.Factory = js.native
  /**
    * The title of the editor. Defaults to an empty string.
    */
  var title: js.UndefOr[java.lang.String] = js.native
  /**
    * The editor factory used by the editor.
    */
  def editorFactory(options: atJupyterlabCodeeditorLib.libEditorMod.CodeEditorNs.IOptions): atJupyterlabCodeeditorLib.libEditorMod.CodeEditorNs.IEditor = js.native
}

