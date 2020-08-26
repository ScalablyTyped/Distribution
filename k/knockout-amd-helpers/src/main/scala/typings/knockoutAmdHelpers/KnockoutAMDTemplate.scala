package typings.knockoutAmdHelpers

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KnockoutAMDTemplate extends js.Object {
  var defaultPath: String = js.native
  var defaultRequireTextPluginName: String = js.native
  var defaultSuffix: String = js.native
}

object KnockoutAMDTemplate {
  @scala.inline
  def apply(defaultPath: String, defaultRequireTextPluginName: String, defaultSuffix: String): KnockoutAMDTemplate = {
    val __obj = js.Dynamic.literal(defaultPath = defaultPath.asInstanceOf[js.Any], defaultRequireTextPluginName = defaultRequireTextPluginName.asInstanceOf[js.Any], defaultSuffix = defaultSuffix.asInstanceOf[js.Any])
    __obj.asInstanceOf[KnockoutAMDTemplate]
  }
  @scala.inline
  implicit class KnockoutAMDTemplateOps[Self <: KnockoutAMDTemplate] (val x: Self) extends AnyVal {
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
    def setDefaultPath(value: String): Self = this.set("defaultPath", value.asInstanceOf[js.Any])
    @scala.inline
    def setDefaultRequireTextPluginName(value: String): Self = this.set("defaultRequireTextPluginName", value.asInstanceOf[js.Any])
    @scala.inline
    def setDefaultSuffix(value: String): Self = this.set("defaultSuffix", value.asInstanceOf[js.Any])
  }
  
}

