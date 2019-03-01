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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("body")(body)
    __obj.updateDynamic("head")(head)
    __obj.updateDynamic("outputName")(outputName)
    __obj.updateDynamic("plugin")(plugin)
    __obj.asInstanceOf[Anon_Body]
  }
}

