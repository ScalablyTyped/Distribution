package typings
package atJupyterlabSettingeditorLib.libSettingeditorMod.SettingEditorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The instantiation options for a setting editor.
  */
trait IOptions extends js.Object {
  /**
    * The toolbar commands and registry for the setting editor toolbar.
    */
  var commands: atJupyterlabSettingeditorLib.Anon_Debug
  /**
    * The editor factory used by the setting editor.
    */
  var editorFactory: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify CodeEditor.Factory */ js.Any
  /**
    * The state database key for the editor's state management.
    */
  var key: java.lang.String
  /**
    * The setting registry the editor modifies.
    */
  var registry: atJupyterlabCoreutilsLib.libSettingregistryMod.ISettingRegistry
  /**
    * The optional MIME renderer to use for rendering debug messages.
    */
  var rendermime: js.UndefOr[atJupyterlabRendermimeLib.atJupyterlabRendermimeMod.RenderMimeRegistry] = js.undefined
  /**
    * The state database used to store layout.
    */
  var state: atJupyterlabCoreutilsLib.libStatedbMod.IStateDB
  /**
    * The point after which the editor should restore its state.
    */
  var when: js.UndefOr[js.Promise[_] | js.Array[js.Promise[_]]] = js.undefined
}

object IOptions {
  @scala.inline
  def apply(
    commands: atJupyterlabSettingeditorLib.Anon_Debug,
    editorFactory: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify CodeEditor.Factory */ js.Any,
    key: java.lang.String,
    registry: atJupyterlabCoreutilsLib.libSettingregistryMod.ISettingRegistry,
    state: atJupyterlabCoreutilsLib.libStatedbMod.IStateDB,
    rendermime: atJupyterlabRendermimeLib.atJupyterlabRendermimeMod.RenderMimeRegistry = null,
    when: js.Promise[_] | js.Array[js.Promise[_]] = null
  ): IOptions = {
    val __obj = js.Dynamic.literal(commands = commands, editorFactory = editorFactory, key = key, registry = registry, state = state)
    if (rendermime != null) __obj.updateDynamic("rendermime")(rendermime)
    if (when != null) __obj.updateDynamic("when")(when.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions]
  }
}

