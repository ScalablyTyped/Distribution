package typings.atJupyterlabCodeeditor.libJsoneditorMod.JSONEditorNs

import typings.atJupyterlabCodeeditor.libEditorMod.CodeEditorNs.Factory
import typings.atJupyterlabCodeeditor.libEditorMod.CodeEditorNs.IEditor
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
  var editorFactory_Original: Factory = js.native
  /**
    * The editor factory used by the editor.
    */
  def editorFactory(options: typings.atJupyterlabCodeeditor.libEditorMod.CodeEditorNs.IOptions): IEditor = js.native
}

