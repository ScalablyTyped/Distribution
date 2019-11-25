package typings.htmlDashWebpackDashPlugin

import typings.htmlDashWebpackDashPlugin.htmlDashWebpackDashPluginMod.HtmlWebpackPlugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Assets extends js.Object {
  var assets: Anon_Css
  var outputName: String
  var plugin: HtmlWebpackPlugin
}

object Anon_Assets {
  @scala.inline
  def apply(assets: Anon_Css, outputName: String, plugin: HtmlWebpackPlugin): Anon_Assets = {
    val __obj = js.Dynamic.literal(assets = assets.asInstanceOf[js.Any], outputName = outputName.asInstanceOf[js.Any], plugin = plugin.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Assets]
  }
}

