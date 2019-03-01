package typings
package htmlDashWebpackDashPluginLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Html extends js.Object {
  var html: java.lang.String
  var outputName: java.lang.String
  var plugin: htmlDashWebpackDashPluginLib.htmlDashWebpackDashPluginMod.HtmlWebpackPlugin
}

object Anon_Html {
  @scala.inline
  def apply(
    html: java.lang.String,
    outputName: java.lang.String,
    plugin: htmlDashWebpackDashPluginLib.htmlDashWebpackDashPluginMod.HtmlWebpackPlugin
  ): Anon_Html = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("html")(html)
    __obj.updateDynamic("outputName")(outputName)
    __obj.updateDynamic("plugin")(plugin)
    __obj.asInstanceOf[Anon_Html]
  }
}

