package typings
package atHapiHapiLib.atHapiHapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServerRegisterOptions extends js.Object {
  /**
    * if true, subsequent registrations of the same plugin are skipped without error. Cannot be used with plugin options. Defaults to false. If not set to true, an error will be thrown the second
    * time a plugin is registered on the server.
    */
  var once: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * modifiers applied to each route added by the plugin:
    */
  var routes: js.UndefOr[atHapiHapiLib.Anon_PrefixVhost] = js.undefined
}

object ServerRegisterOptions {
  @scala.inline
  def apply(once: js.UndefOr[scala.Boolean] = js.undefined, routes: atHapiHapiLib.Anon_PrefixVhost = null): ServerRegisterOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(once)) __obj.updateDynamic("once")(once)
    if (routes != null) __obj.updateDynamic("routes")(routes)
    __obj.asInstanceOf[ServerRegisterOptions]
  }
}

