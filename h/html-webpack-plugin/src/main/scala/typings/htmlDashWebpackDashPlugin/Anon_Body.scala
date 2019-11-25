package typings.htmlDashWebpackDashPlugin

import typings.htmlDashWebpackDashPlugin.htmlDashWebpackDashPluginMod.HtmlTagObject
import typings.htmlDashWebpackDashPlugin.htmlDashWebpackDashPluginMod.HtmlWebpackPlugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Body extends js.Object {
  var body: js.Array[HtmlTagObject]
  var head: js.Array[HtmlTagObject]
  var outputName: String
  var plugin: HtmlWebpackPlugin
}

object Anon_Body {
  @scala.inline
  def apply(
    body: js.Array[HtmlTagObject],
    head: js.Array[HtmlTagObject],
    outputName: String,
    plugin: HtmlWebpackPlugin
  ): Anon_Body = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], head = head.asInstanceOf[js.Any], outputName = outputName.asInstanceOf[js.Any], plugin = plugin.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Body]
  }
}

