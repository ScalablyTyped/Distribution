package typings
package koaDashSslifyLib.koaDashSslifyMod.sslifyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * Status returned for disallowed methods
    */
  var disallowStatus: js.UndefOr[scala.Double] = js.undefined
  /**
    * Hostname for redirect (uses request host if not set)
    */
  var hostname: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Ignore url path (redirect to domain)
    */
  var ignoreUrl: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Port of HTTPS server
    */
  var port: js.UndefOr[scala.Double] = js.undefined
  /**
    * Whitelist methods that should be redirected
    */
  var redirectMethods: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * Function used to test if request is secure
    */
  var resolver: js.UndefOr[js.Function1[/* ctx */ koaLib.koaMod.ApplicationNs.Context, scala.Boolean]] = js.undefined
  /**
    * Avoid :443 port in redirect url
    */
  var skipDefaultPort: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Temporary mode (use 307 Temporary Redirect)
    */
  var temporary: js.UndefOr[scala.Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    disallowStatus: scala.Int | scala.Double = null,
    hostname: java.lang.String = null,
    ignoreUrl: js.UndefOr[scala.Boolean] = js.undefined,
    port: scala.Int | scala.Double = null,
    redirectMethods: js.Array[java.lang.String] = null,
    resolver: js.Function1[/* ctx */ koaLib.koaMod.ApplicationNs.Context, scala.Boolean] = null,
    skipDefaultPort: js.UndefOr[scala.Boolean] = js.undefined,
    temporary: js.UndefOr[scala.Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (disallowStatus != null) __obj.updateDynamic("disallowStatus")(disallowStatus.asInstanceOf[js.Any])
    if (hostname != null) __obj.updateDynamic("hostname")(hostname)
    if (!js.isUndefined(ignoreUrl)) __obj.updateDynamic("ignoreUrl")(ignoreUrl)
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (redirectMethods != null) __obj.updateDynamic("redirectMethods")(redirectMethods)
    if (resolver != null) __obj.updateDynamic("resolver")(resolver)
    if (!js.isUndefined(skipDefaultPort)) __obj.updateDynamic("skipDefaultPort")(skipDefaultPort)
    if (!js.isUndefined(temporary)) __obj.updateDynamic("temporary")(temporary)
    __obj.asInstanceOf[Options]
  }
}

