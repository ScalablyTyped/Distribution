package typings.htmlDashWebpackDashPlugin

import typings.htmlDashWebpackDashPlugin.htmlDashWebpackDashPluginMod.EntryObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Css extends js.Object {
  var css: js.Array[EntryObject]
  @JSName("js")
  var js_ : js.Array[EntryObject]
  var publicPath: String
}

object Anon_Css {
  @scala.inline
  def apply(css: js.Array[EntryObject], js_ : js.Array[EntryObject], publicPath: String): Anon_Css = {
    val __obj = js.Dynamic.literal(css = css, publicPath = publicPath)
    __obj.updateDynamic("js")(js_)
    __obj.asInstanceOf[Anon_Css]
  }
}

