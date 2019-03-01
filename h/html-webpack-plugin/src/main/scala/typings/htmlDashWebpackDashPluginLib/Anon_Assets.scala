package typings
package htmlDashWebpackDashPluginLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Assets extends js.Object {
  var assets: Anon_Css
  var outputName: java.lang.String
  var plugin: htmlDashWebpackDashPluginLib.htmlDashWebpackDashPluginMod.HtmlWebpackPlugin
}

object Anon_Assets {
  @scala.inline
  def apply(
    assets: Anon_Css,
    outputName: java.lang.String,
    plugin: htmlDashWebpackDashPluginLib.htmlDashWebpackDashPluginMod.HtmlWebpackPlugin
  ): Anon_Assets = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("assets")(assets)
    __obj.updateDynamic("outputName")(outputName)
    __obj.updateDynamic("plugin")(plugin)
    __obj.asInstanceOf[Anon_Assets]
  }
}

