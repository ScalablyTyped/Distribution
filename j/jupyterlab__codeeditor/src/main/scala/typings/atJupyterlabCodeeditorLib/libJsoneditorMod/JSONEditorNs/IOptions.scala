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
    * The editor factory used by the editor.
    */
  @JSName("editorFactory")
  var editorFactory_Original: atJupyterlabCodeeditorLib.libEditorMod.CodeEditorNs.Factory = js.native
  /**
    * The editor factory used by the editor.
    */
  def editorFactory(options: atJupyterlabCodeeditorLib.libEditorMod.CodeEditorNs.IOptions): atJupyterlabCodeeditorLib.libEditorMod.CodeEditorNs.IEditor = js.native
}

