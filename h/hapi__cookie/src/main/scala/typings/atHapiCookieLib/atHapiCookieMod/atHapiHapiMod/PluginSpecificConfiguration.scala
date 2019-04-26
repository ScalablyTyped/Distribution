package typings
package atHapiCookieLib.atHapiCookieMod.atHapiHapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PluginSpecificConfiguration extends js.Object {
  var `hapi-auth-cookie`: js.UndefOr[atHapiCookieLib.Anon_RedirectTo] = js.undefined
}

object PluginSpecificConfiguration {
  @scala.inline
  def apply(`hapi-auth-cookie`: atHapiCookieLib.Anon_RedirectTo = null): PluginSpecificConfiguration = {
    val __obj = js.Dynamic.literal()
    if (`hapi-auth-cookie` != null) __obj.updateDynamic("hapi-auth-cookie")(`hapi-auth-cookie`)
    __obj.asInstanceOf[PluginSpecificConfiguration]
  }
}

