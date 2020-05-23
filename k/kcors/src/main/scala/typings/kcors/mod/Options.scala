package typings.kcors.mod

import typings.koa.mod.Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var allowHeaders: js.UndefOr[js.Array[String] | String] = js.undefined
  var allowMethods: js.UndefOr[js.Array[String] | String] = js.undefined
  var credentials: js.UndefOr[Boolean] = js.undefined
  var exposeHeaders: js.UndefOr[js.Array[String] | String] = js.undefined
  var keepHeadersOnError: js.UndefOr[Boolean] = js.undefined
  var maxAge: js.UndefOr[Double | String] = js.undefined
  var origin: js.UndefOr[(js.Function1[/* ctx */ Context, String]) | String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    allowHeaders: js.Array[String] | String = null,
    allowMethods: js.Array[String] | String = null,
    credentials: js.UndefOr[Boolean] = js.undefined,
    exposeHeaders: js.Array[String] | String = null,
    keepHeadersOnError: js.UndefOr[Boolean] = js.undefined,
    maxAge: Double | String = null,
    origin: (js.Function1[/* ctx */ Context, String]) | String = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (allowHeaders != null) __obj.updateDynamic("allowHeaders")(allowHeaders.asInstanceOf[js.Any])
    if (allowMethods != null) __obj.updateDynamic("allowMethods")(allowMethods.asInstanceOf[js.Any])
    if (!js.isUndefined(credentials)) __obj.updateDynamic("credentials")(credentials.get.asInstanceOf[js.Any])
    if (exposeHeaders != null) __obj.updateDynamic("exposeHeaders")(exposeHeaders.asInstanceOf[js.Any])
    if (!js.isUndefined(keepHeadersOnError)) __obj.updateDynamic("keepHeadersOnError")(keepHeadersOnError.get.asInstanceOf[js.Any])
    if (maxAge != null) __obj.updateDynamic("maxAge")(maxAge.asInstanceOf[js.Any])
    if (origin != null) __obj.updateDynamic("origin")(origin.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

