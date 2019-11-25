package typings.atJupyterlabSettingeditor.libSettingeditorMod.SettingEditor

import typings.atPhosphorCoreutils.libJsonMod.JSONObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The layout information that is stored and restored from the state database.
  */
trait IPluginLayout extends JSONObject {
  /**
    * The current plugin being displayed.
    */
  var plugin: String
  var sizes: js.Array[Double]
}

object IPluginLayout {
  @scala.inline
  def apply(plugin: String, sizes: js.Array[Double]): IPluginLayout = {
    val __obj = js.Dynamic.literal(plugin = plugin.asInstanceOf[js.Any], sizes = sizes.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IPluginLayout]
  }
}

