package typings.graphqlDashRequest.distSrcTypesMod

import typings.std.ReferrerPolicy
import typings.std.RequestCache
import typings.std.RequestCredentials
import typings.std.RequestMode
import typings.std.RequestRedirect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var cache: js.UndefOr[RequestCache] = js.undefined
  var credentials: js.UndefOr[RequestCredentials] = js.undefined
  var headers: js.UndefOr[Headers] = js.undefined
  var integrity: js.UndefOr[String] = js.undefined
  var method: js.UndefOr[String] = js.undefined
  var mode: js.UndefOr[RequestMode] = js.undefined
  var redirect: js.UndefOr[RequestRedirect] = js.undefined
  var referrer: js.UndefOr[String] = js.undefined
  var referrerPolicy: js.UndefOr[ReferrerPolicy] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    cache: RequestCache = null,
    credentials: RequestCredentials = null,
    headers: Headers = null,
    integrity: String = null,
    method: String = null,
    mode: RequestMode = null,
    redirect: RequestRedirect = null,
    referrer: String = null,
    referrerPolicy: ReferrerPolicy = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (cache != null) __obj.updateDynamic("cache")(cache)
    if (credentials != null) __obj.updateDynamic("credentials")(credentials)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (integrity != null) __obj.updateDynamic("integrity")(integrity)
    if (method != null) __obj.updateDynamic("method")(method)
    if (mode != null) __obj.updateDynamic("mode")(mode)
    if (redirect != null) __obj.updateDynamic("redirect")(redirect)
    if (referrer != null) __obj.updateDynamic("referrer")(referrer)
    if (referrerPolicy != null) __obj.updateDynamic("referrerPolicy")(referrerPolicy)
    __obj.asInstanceOf[Options]
  }
}

