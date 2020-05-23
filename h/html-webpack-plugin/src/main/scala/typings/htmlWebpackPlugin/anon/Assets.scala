package typings.htmlWebpackPlugin.anon

import typings.htmlWebpackPlugin.mod.HtmlWebpackPlugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Assets extends js.Object {
  var assets: Css
  var outputName: String
  var plugin: HtmlWebpackPlugin
}

object Assets {
  @scala.inline
  def apply(assets: Css, outputName: String, plugin: HtmlWebpackPlugin): Assets = {
    val __obj = js.Dynamic.literal(assets = assets.asInstanceOf[js.Any], outputName = outputName.asInstanceOf[js.Any], plugin = plugin.asInstanceOf[js.Any])
    __obj.asInstanceOf[Assets]
  }
}

