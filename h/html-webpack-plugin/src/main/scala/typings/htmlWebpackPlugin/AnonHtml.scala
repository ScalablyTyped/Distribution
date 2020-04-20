package typings.htmlWebpackPlugin

import typings.htmlWebpackPlugin.mod.HtmlWebpackPlugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHtml extends js.Object {
  var assets: AnonCss
  var html: String
  var outputName: String
  var plugin: HtmlWebpackPlugin
}

object AnonHtml {
  @scala.inline
  def apply(assets: AnonCss, html: String, outputName: String, plugin: HtmlWebpackPlugin): AnonHtml = {
    val __obj = js.Dynamic.literal(assets = assets.asInstanceOf[js.Any], html = html.asInstanceOf[js.Any], outputName = outputName.asInstanceOf[js.Any], plugin = plugin.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHtml]
  }
}

