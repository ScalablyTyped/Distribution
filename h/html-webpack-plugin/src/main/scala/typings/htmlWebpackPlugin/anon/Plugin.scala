package typings.htmlWebpackPlugin.anon

import typings.htmlWebpackPlugin.mod.HtmlWebpackPlugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Plugin extends js.Object {
  var outputName: String = js.native
  var plugin: HtmlWebpackPlugin = js.native
}

object Plugin {
  @scala.inline
  def apply(outputName: String, plugin: HtmlWebpackPlugin): Plugin = {
    val __obj = js.Dynamic.literal(outputName = outputName.asInstanceOf[js.Any], plugin = plugin.asInstanceOf[js.Any])
    __obj.asInstanceOf[Plugin]
  }
  @scala.inline
  implicit class PluginOps[Self <: Plugin] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setOutputName(value: String): Self = this.set("outputName", value.asInstanceOf[js.Any])
    @scala.inline
    def setPlugin(value: HtmlWebpackPlugin): Self = this.set("plugin", value.asInstanceOf[js.Any])
  }
  
}

