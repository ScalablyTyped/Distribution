package typings
package ldapjsLib.ldapjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ClientOptions extends js.Object {
  var bindCredentials: js.UndefOr[java.lang.String] = js.undefined
  var bindDN: js.UndefOr[java.lang.String] = js.undefined
  var connectTimeout: js.UndefOr[scala.Double] = js.undefined
  var idleTimeout: js.UndefOr[scala.Double] = js.undefined
  var log: js.UndefOr[js.Any] = js.undefined
  var queueDisable: js.UndefOr[scala.Boolean] = js.undefined
  var queueSize: js.UndefOr[scala.Double] = js.undefined
  var queueTimeout: js.UndefOr[scala.Double] = js.undefined
  var reconnect: js.UndefOr[scala.Boolean | ldapjsLib.Anon_MaxDelay] = js.undefined
  var socketPath: js.UndefOr[java.lang.String] = js.undefined
  var strictDN: js.UndefOr[scala.Boolean] = js.undefined
  var timeout: js.UndefOr[scala.Double] = js.undefined
  var tlsOptions: js.UndefOr[js.Object] = js.undefined
  var url: java.lang.String
}

