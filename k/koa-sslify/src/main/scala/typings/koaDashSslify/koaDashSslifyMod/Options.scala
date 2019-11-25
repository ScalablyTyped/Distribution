package typings.koaDashSslify.koaDashSslifyMod

import typings.koa.koaMod.Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * Status returned for disallowed methods
    */
  var disallowStatus: js.UndefOr[Double] = js.undefined
  /**
    * Hostname for redirect (uses request host if not set)
    */
  var hostname: js.UndefOr[String] = js.undefined
  /**
    * Ignore url path (redirect to domain)
    */
  var ignoreUrl: js.UndefOr[Boolean] = js.undefined
  /**
    * Port of HTTPS server
    */
  var port: js.UndefOr[Double] = js.undefined
  /**
    * Whitelist methods that should be redirected
    */
  var redirectMethods: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Function used to test if request is secure
    */
  var resolver: js.UndefOr[js.Function1[/* ctx */ Context, Boolean]] = js.undefined
  /**
    * Avoid :443 port in redirect url
    */
  var skipDefaultPort: js.UndefOr[Boolean] = js.undefined
  /**
    * Temporary mode (use 307 Temporary Redirect)
    */
  var temporary: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    disallowStatus: Int | Double = null,
    hostname: String = null,
    ignoreUrl: js.UndefOr[Boolean] = js.undefined,
    port: Int | Double = null,
    redirectMethods: js.Array[String] = null,
    resolver: /* ctx */ Context => Boolean = null,
    skipDefaultPort: js.UndefOr[Boolean] = js.undefined,
    temporary: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (disallowStatus != null) __obj.updateDynamic("disallowStatus")(disallowStatus.asInstanceOf[js.Any])
    if (hostname != null) __obj.updateDynamic("hostname")(hostname.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreUrl)) __obj.updateDynamic("ignoreUrl")(ignoreUrl.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (redirectMethods != null) __obj.updateDynamic("redirectMethods")(redirectMethods.asInstanceOf[js.Any])
    if (resolver != null) __obj.updateDynamic("resolver")(js.Any.fromFunction1(resolver))
    if (!js.isUndefined(skipDefaultPort)) __obj.updateDynamic("skipDefaultPort")(skipDefaultPort.asInstanceOf[js.Any])
    if (!js.isUndefined(temporary)) __obj.updateDynamic("temporary")(temporary.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

