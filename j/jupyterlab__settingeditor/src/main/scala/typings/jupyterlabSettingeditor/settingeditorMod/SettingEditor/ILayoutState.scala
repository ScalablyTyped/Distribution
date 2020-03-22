package typings.jupyterlabSettingeditor.settingeditorMod.SettingEditor

import typings.luminoCoreutils.jsonMod.JSONObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The layout state for the setting editor.
  */
trait ILayoutState extends JSONObject {
  /**
    * The layout state for a plugin editor container.
    */
  var container: IPluginLayout
  /**
    * The relative sizes of the plugin list and plugin editor.
    */
  var sizes: js.Array[Double]
}

object ILayoutState {
  @scala.inline
  def apply(container: IPluginLayout, sizes: js.Array[Double]): ILayoutState = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], sizes = sizes.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ILayoutState]
  }
}

