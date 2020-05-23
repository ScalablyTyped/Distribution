package typings.htmlWebpackPlugin.anon

import typings.htmlWebpackPlugin.mod.HtmlWebpackPlugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Html extends js.Object {
  var assets: Css
  var html: String
  var outputName: String
  var plugin: HtmlWebpackPlugin
}

object Html {
  @scala.inline
  def apply(assets: Css, html: String, outputName: String, plugin: HtmlWebpackPlugin): Html = {
    val __obj = js.Dynamic.literal(assets = assets.asInstanceOf[js.Any], html = html.asInstanceOf[js.Any], outputName = outputName.asInstanceOf[js.Any], plugin = plugin.asInstanceOf[js.Any])
    __obj.asInstanceOf[Html]
  }
}

