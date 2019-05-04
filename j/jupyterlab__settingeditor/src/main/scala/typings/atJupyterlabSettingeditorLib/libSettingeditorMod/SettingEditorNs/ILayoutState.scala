package typings
package atJupyterlabSettingeditorLib.libSettingeditorMod.SettingEditorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The layout state for the setting editor.
  */
trait ILayoutState
  extends atPhosphorCoreutilsLib.libJsonMod.JSONObject {
  /**
    * The layout state for a plugin editor container.
    */
  var container: IPluginLayout
  /**
    * The relative sizes of the plugin list and plugin editor.
    */
  var sizes: js.Array[scala.Double]
}

object ILayoutState {
  @scala.inline
  def apply(container: IPluginLayout, sizes: js.Array[scala.Double]): ILayoutState = {
    val __obj = js.Dynamic.literal(container = container, sizes = sizes)
  
    __obj.asInstanceOf[ILayoutState]
  }
}

