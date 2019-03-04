package typings
package htmlDashWebpackDashPluginLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Body extends js.Object {
  var body: js.Array[htmlDashWebpackDashPluginLib.htmlDashWebpackDashPluginMod.HtmlTagObject]
  var head: js.Array[htmlDashWebpackDashPluginLib.htmlDashWebpackDashPluginMod.HtmlTagObject]
  var outputName: java.lang.String
  var plugin: htmlDashWebpackDashPluginLib.htmlDashWebpackDashPluginMod.HtmlWebpackPlugin
}

object Anon_Body {
  @scala.inline
  def apply(
    body: js.Array[htmlDashWebpackDashPluginLib.htmlDashWebpackDashPluginMod.HtmlTagObject],
    head: js.Array[htmlDashWebpackDashPluginLib.htmlDashWebpackDashPluginMod.HtmlTagObject],
    outputName: java.lang.String,
    plugin: htmlDashWebpackDashPluginLib.htmlDashWebpackDashPluginMod.HtmlWebpackPlugin
  ): Anon_Body = {
    val __obj = js.Dynamic.literal(body = body, head = head, outputName = outputName, plugin = plugin)
  
    __obj.asInstanceOf[Anon_Body]
  }
}

