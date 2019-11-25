package typings.hapi.hapiMod

import typings.hapi.Anon_PrefixVhost
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServerRegisterOptions extends js.Object {
  /**
    * if true, subsequent registrations of the same plugin are skipped without error. Cannot be used with plugin options. Defaults to false. If not set to true, an error will be thrown the second
    * time a plugin is registered on the server.
    */
  var once: js.UndefOr[Boolean] = js.undefined
  /**
    * modifiers applied to each route added by the plugin:
    */
  var routes: js.UndefOr[Anon_PrefixVhost] = js.undefined
}

object ServerRegisterOptions {
  @scala.inline
  def apply(once: js.UndefOr[Boolean] = js.undefined, routes: Anon_PrefixVhost = null): ServerRegisterOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(once)) __obj.updateDynamic("once")(once.asInstanceOf[js.Any])
    if (routes != null) __obj.updateDynamic("routes")(routes.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerRegisterOptions]
  }
}

