package typings.hapiCrumb.mod.hapiHapiAugmentingMod

import typings.hapiCrumb.anon.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PluginSpecificConfiguration extends js.Object {
  var crumb: js.UndefOr[Boolean | Key] = js.native
}

object PluginSpecificConfiguration {
  @scala.inline
  def apply(): PluginSpecificConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PluginSpecificConfiguration]
  }
  @scala.inline
  implicit class PluginSpecificConfigurationOps[Self <: PluginSpecificConfiguration] (val x: Self) extends AnyVal {
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
    def setCrumb(value: Boolean | Key): Self = this.set("crumb", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCrumb: Self = this.set("crumb", js.undefined)
  }
  
}

