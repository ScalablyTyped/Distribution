package typings.htmlDashWebpackDashPlugin

import typings.htmlDashWebpackDashPlugin.htmlDashWebpackDashPluginMod.HtmlWebpackPlugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AssetsHtml extends js.Object {
  var assets: Anon_Css
  var html: String
  var outputName: String
  var plugin: HtmlWebpackPlugin
}

object Anon_AssetsHtml {
  @scala.inline
  def apply(assets: Anon_Css, html: String, outputName: String, plugin: HtmlWebpackPlugin): Anon_AssetsHtml = {
    val __obj = js.Dynamic.literal(assets = assets.asInstanceOf[js.Any], html = html.asInstanceOf[js.Any], outputName = outputName.asInstanceOf[js.Any], plugin = plugin.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_AssetsHtml]
  }
}

