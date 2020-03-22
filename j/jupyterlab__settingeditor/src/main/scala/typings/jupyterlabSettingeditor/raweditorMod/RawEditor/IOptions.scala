package typings.jupyterlabSettingeditor.raweditorMod.RawEditor

import typings.jupyterlabCodeeditor.editorMod.CodeEditor.Factory
import typings.jupyterlabCodeeditor.editorMod.CodeEditor.IEditor
import typings.jupyterlabRendermime.tokensMod.IRenderMimeRegistry
import typings.jupyterlabSettingregistry.tokensMod.ISettingRegistry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The instantiation options for a raw editor.
  */
trait IOptions extends js.Object {
  /**
    * The toolbar commands and registry for the setting editor toolbar.
    */
  var commands: ICommandBundle
  /**
    * The editor factory used by the raw editor.
    */
  var editorFactory: Factory
  /**
    * The setting registry used by the editor.
    */
  var registry: ISettingRegistry
  /**
    * The optional MIME renderer to use for rendering debug messages.
    */
  var rendermime: js.UndefOr[IRenderMimeRegistry] = js.undefined
  /**
    * A function the raw editor calls on save errors.
    */
  def onSaveError(reason: js.Any): Unit
}

object IOptions {
  @scala.inline
  def apply(
    commands: ICommandBundle,
    editorFactory: /* options */ typings.jupyterlabCodeeditor.editorMod.CodeEditor.IOptions => IEditor,
    onSaveError: js.Any => Unit,
    registry: ISettingRegistry,
    rendermime: IRenderMimeRegistry = null
  ): IOptions = {
    val __obj = js.Dynamic.literal(commands = commands.asInstanceOf[js.Any], editorFactory = js.Any.fromFunction1(editorFactory), onSaveError = js.Any.fromFunction1(onSaveError), registry = registry.asInstanceOf[js.Any])
    if (rendermime != null) __obj.updateDynamic("rendermime")(rendermime.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions]
  }
}

