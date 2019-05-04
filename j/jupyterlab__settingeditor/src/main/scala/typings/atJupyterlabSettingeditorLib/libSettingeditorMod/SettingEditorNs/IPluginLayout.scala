package typings
package atJupyterlabSettingeditorLib.libSettingeditorMod.SettingEditorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The layout information that is stored and restored from the state database.
  */
trait IPluginLayout
  extends atPhosphorCoreutilsLib.libJsonMod.JSONObject {
  var editor: atJupyterlabSettingeditorLib.atJupyterlabSettingeditorLibStrings.raw | atJupyterlabSettingeditorLib.atJupyterlabSettingeditorLibStrings.table
  /**
    * The current plugin being displayed.
    */
  var plugin: java.lang.String
  var sizes: js.Array[scala.Double]
}

object IPluginLayout {
  @scala.inline
  def apply(
    editor: atJupyterlabSettingeditorLib.atJupyterlabSettingeditorLibStrings.raw | atJupyterlabSettingeditorLib.atJupyterlabSettingeditorLibStrings.table,
    plugin: java.lang.String,
    sizes: js.Array[scala.Double]
  ): IPluginLayout = {
    val __obj = js.Dynamic.literal(editor = editor.asInstanceOf[js.Any], plugin = plugin, sizes = sizes)
  
    __obj.asInstanceOf[IPluginLayout]
  }
}

