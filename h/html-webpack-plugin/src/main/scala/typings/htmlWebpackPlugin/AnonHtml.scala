package typings.htmlWebpackPlugin

import typings.htmlWebpackPlugin.mod.HtmlWebpackPlugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHtml extends js.Object {
  var html: String
  var outputName: String
  var plugin: HtmlWebpackPlugin
}

object AnonHtml {
  @scala.inline
  def apply(html: String, outputName: String, plugin: HtmlWebpackPlugin): AnonHtml = {
    val __obj = js.Dynamic.literal(html = html.asInstanceOf[js.Any], outputName = outputName.asInstanceOf[js.Any], plugin = plugin.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonHtml]
  }
}

