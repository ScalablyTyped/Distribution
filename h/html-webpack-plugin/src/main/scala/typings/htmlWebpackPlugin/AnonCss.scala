package typings.htmlWebpackPlugin

import typings.htmlWebpackPlugin.mod.EntryObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCss extends js.Object {
  var css: js.Array[EntryObject]
  @JSName("js")
  var js_ : js.Array[EntryObject]
  var publicPath: String
}

object AnonCss {
  @scala.inline
  def apply(css: js.Array[EntryObject], js_ : js.Array[EntryObject], publicPath: String): AnonCss = {
    val __obj = js.Dynamic.literal(css = css.asInstanceOf[js.Any], publicPath = publicPath.asInstanceOf[js.Any])
    __obj.updateDynamic("js")(js_.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCss]
  }
}

