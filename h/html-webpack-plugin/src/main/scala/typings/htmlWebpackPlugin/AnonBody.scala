package typings.htmlWebpackPlugin

import typings.htmlWebpackPlugin.mod.HtmlTagObject
import typings.htmlWebpackPlugin.mod.HtmlWebpackPlugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBody extends js.Object {
  var body: js.Array[HtmlTagObject]
  var head: js.Array[HtmlTagObject]
  var outputName: String
  var plugin: HtmlWebpackPlugin
}

object AnonBody {
  @scala.inline
  def apply(
    body: js.Array[HtmlTagObject],
    head: js.Array[HtmlTagObject],
    outputName: String,
    plugin: HtmlWebpackPlugin
  ): AnonBody = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], head = head.asInstanceOf[js.Any], outputName = outputName.asInstanceOf[js.Any], plugin = plugin.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonBody]
  }
}

