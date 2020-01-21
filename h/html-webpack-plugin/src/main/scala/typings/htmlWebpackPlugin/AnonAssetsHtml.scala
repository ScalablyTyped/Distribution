package typings.htmlWebpackPlugin

import typings.htmlWebpackPlugin.mod.HtmlWebpackPlugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAssetsHtml extends js.Object {
  var assets: AnonCss
  var html: String
  var outputName: String
  var plugin: HtmlWebpackPlugin
}

object AnonAssetsHtml {
  @scala.inline
  def apply(assets: AnonCss, html: String, outputName: String, plugin: HtmlWebpackPlugin): AnonAssetsHtml = {
    val __obj = js.Dynamic.literal(assets = assets.asInstanceOf[js.Any], html = html.asInstanceOf[js.Any], outputName = outputName.asInstanceOf[js.Any], plugin = plugin.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAssetsHtml]
  }
}

