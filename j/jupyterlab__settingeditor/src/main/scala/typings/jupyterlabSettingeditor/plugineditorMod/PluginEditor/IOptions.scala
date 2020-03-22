package typings.jupyterlabSettingeditor.plugineditorMod.PluginEditor

import typings.jupyterlabCodeeditor.editorMod.CodeEditor.Factory
import typings.jupyterlabCodeeditor.editorMod.CodeEditor.IEditor
import typings.jupyterlabRendermime.tokensMod.IRenderMimeRegistry
import typings.jupyterlabSettingeditor.AnonRegistry
import typings.jupyterlabSettingregistry.tokensMod.ISettingRegistry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The instantiation options for a plugin editor.
  */
trait IOptions extends js.Object {
  /**
    * The toolbar commands and registry for the setting editor toolbar.
    */
  var commands: AnonRegistry
  /**
    * The editor factory used by the plugin editor.
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
}

object IOptions {
  @scala.inline
  def apply(
    commands: AnonRegistry,
    editorFactory: /* options */ typings.jupyterlabCodeeditor.editorMod.CodeEditor.IOptions => IEditor,
    registry: ISettingRegistry,
    rendermime: IRenderMimeRegistry = null
  ): IOptions = {
    val __obj = js.Dynamic.literal(commands = commands.asInstanceOf[js.Any], editorFactory = js.Any.fromFunction1(editorFactory), registry = registry.asInstanceOf[js.Any])
    if (rendermime != null) __obj.updateDynamic("rendermime")(rendermime.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions]
  }
}

