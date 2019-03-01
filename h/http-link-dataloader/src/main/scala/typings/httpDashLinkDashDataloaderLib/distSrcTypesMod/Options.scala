package typings
package httpDashLinkDashDataloaderLib.distSrcTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var cache: js.UndefOr[stdLib.RequestCache] = js.undefined
  var credentials: js.UndefOr[stdLib.RequestCredentials] = js.undefined
  var headers: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  var integrity: js.UndefOr[java.lang.String] = js.undefined
  var keepalive: js.UndefOr[scala.Boolean] = js.undefined
  var method: js.UndefOr[java.lang.String] = js.undefined
  var mode: js.UndefOr[stdLib.RequestMode] = js.undefined
  var redirect: js.UndefOr[stdLib.RequestRedirect] = js.undefined
  var referrer: js.UndefOr[java.lang.String] = js.undefined
  var referrerPolicy: js.UndefOr[stdLib.ReferrerPolicy] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    cache: stdLib.RequestCache = null,
    credentials: stdLib.RequestCredentials = null,
    headers: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    integrity: java.lang.String = null,
    keepalive: js.UndefOr[scala.Boolean] = js.undefined,
    method: java.lang.String = null,
    mode: stdLib.RequestMode = null,
    redirect: stdLib.RequestRedirect = null,
    referrer: java.lang.String = null,
    referrerPolicy: stdLib.ReferrerPolicy = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (cache != null) __obj.updateDynamic("cache")(cache)
    if (credentials != null) __obj.updateDynamic("credentials")(credentials)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (integrity != null) __obj.updateDynamic("integrity")(integrity)
    if (!js.isUndefined(keepalive)) __obj.updateDynamic("keepalive")(keepalive)
    if (method != null) __obj.updateDynamic("method")(method)
    if (mode != null) __obj.updateDynamic("mode")(mode)
    if (redirect != null) __obj.updateDynamic("redirect")(redirect)
    if (referrer != null) __obj.updateDynamic("referrer")(referrer)
    if (referrerPolicy != null) __obj.updateDynamic("referrerPolicy")(referrerPolicy)
    __obj.asInstanceOf[Options]
  }
}

