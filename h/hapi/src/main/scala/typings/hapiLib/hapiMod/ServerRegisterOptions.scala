package typings
package hapiLib.hapiMod

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
  var routes: js.UndefOr[hapiLib.Anon_PrefixVhost] = js.undefined
}

