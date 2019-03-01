package typings
package htmlDashWebpackDashPluginLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Css extends js.Object {
  var css: js.Array[htmlDashWebpackDashPluginLib.htmlDashWebpackDashPluginMod.EntryObject]
  @JSName("js")
  var `js_`: js.Array[htmlDashWebpackDashPluginLib.htmlDashWebpackDashPluginMod.EntryObject]
  var publicPath: java.lang.String
}

object Anon_Css {
  @scala.inline
  def apply(
    css: js.Array[htmlDashWebpackDashPluginLib.htmlDashWebpackDashPluginMod.EntryObject],
    `js_`: js.Array[htmlDashWebpackDashPluginLib.htmlDashWebpackDashPluginMod.EntryObject],
    publicPath: java.lang.String
  ): Anon_Css = {
    val __obj = js.Dynamic.literal(`js_` = `js_`)
    __obj.updateDynamic("css")(css)
    __obj.updateDynamic("publicPath")(publicPath)
    __obj.asInstanceOf[Anon_Css]
  }
}

