package typings.hapiAuthCookie.mod.hapiAugmentingMod

import typings.hapiAuthCookie.anon.RedirectTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PluginSpecificConfiguration extends js.Object {
  var `hapi-auth-cookie`: js.UndefOr[RedirectTo] = js.native
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
    def `setHapi-auth-cookie`(value: RedirectTo): Self = this.set("hapi-auth-cookie", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteHapi-auth-cookie`: Self = this.set("hapi-auth-cookie", js.undefined)
  }
  
}

