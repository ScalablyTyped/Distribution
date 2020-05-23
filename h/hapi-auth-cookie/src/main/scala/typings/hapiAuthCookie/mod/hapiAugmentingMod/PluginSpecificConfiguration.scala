package typings.hapiAuthCookie.mod.hapiAugmentingMod

import typings.hapiAuthCookie.anon.RedirectTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PluginSpecificConfiguration extends js.Object {
  var `hapi-auth-cookie`: js.UndefOr[RedirectTo] = js.undefined
}

object PluginSpecificConfiguration {
  @scala.inline
  def apply(`hapi-auth-cookie`: RedirectTo = null): PluginSpecificConfiguration = {
    val __obj = js.Dynamic.literal()
    if (`hapi-auth-cookie` != null) __obj.updateDynamic("hapi-auth-cookie")(`hapi-auth-cookie`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginSpecificConfiguration]
  }
}

