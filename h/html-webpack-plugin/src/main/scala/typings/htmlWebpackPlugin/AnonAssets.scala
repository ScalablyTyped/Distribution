package typings.htmlWebpackPlugin

import typings.htmlWebpackPlugin.mod.HtmlWebpackPlugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAssets extends js.Object {
  var assets: AnonCss
  var outputName: String
  var plugin: HtmlWebpackPlugin
}

object AnonAssets {
  @scala.inline
  def apply(assets: AnonCss, outputName: String, plugin: HtmlWebpackPlugin): AnonAssets = {
    val __obj = js.Dynamic.literal(assets = assets.asInstanceOf[js.Any], outputName = outputName.asInstanceOf[js.Any], plugin = plugin.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAssets]
  }
}

