package typings.htmlWebpackPlugin.anon

import typings.htmlWebpackPlugin.mod.HtmlWebpackPlugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OutputName extends js.Object {
  var html: String
  var outputName: String
  var plugin: HtmlWebpackPlugin
}

object OutputName {
  @scala.inline
  def apply(html: String, outputName: String, plugin: HtmlWebpackPlugin): OutputName = {
    val __obj = js.Dynamic.literal(html = html.asInstanceOf[js.Any], outputName = outputName.asInstanceOf[js.Any], plugin = plugin.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutputName]
  }
}

