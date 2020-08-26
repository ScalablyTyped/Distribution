package typings.lasso.lassoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomPlugin extends js.Object {
  var config: js.Any = js.native
  var plugin: String = js.native
}

object CustomPlugin {
  @scala.inline
  def apply(config: js.Any, plugin: String): CustomPlugin = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], plugin = plugin.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomPlugin]
  }
  @scala.inline
  implicit class CustomPluginOps[Self <: CustomPlugin] (val x: Self) extends AnyVal {
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
    def setConfig(value: js.Any): Self = this.set("config", value.asInstanceOf[js.Any])
    @scala.inline
    def setPlugin(value: String): Self = this.set("plugin", value.asInstanceOf[js.Any])
  }
  
}

