package typings
package atKoaCorsLib.atKoaCorsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var allowHeaders: js.UndefOr[js.Array[java.lang.String] | java.lang.String] = js.undefined
  var allowMethods: js.UndefOr[js.Array[java.lang.String] | java.lang.String] = js.undefined
  var credentials: js.UndefOr[scala.Boolean] = js.undefined
  var exposeHeaders: js.UndefOr[js.Array[java.lang.String] | java.lang.String] = js.undefined
  var keepHeadersOnError: js.UndefOr[scala.Boolean] = js.undefined
  var maxAge: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var origin: js.UndefOr[
    (js.Function1[/* ctx */ koaLib.koaMod.Context, java.lang.String]) | java.lang.String
  ] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    allowHeaders: js.Array[java.lang.String] | java.lang.String = null,
    allowMethods: js.Array[java.lang.String] | java.lang.String = null,
    credentials: js.UndefOr[scala.Boolean] = js.undefined,
    exposeHeaders: js.Array[java.lang.String] | java.lang.String = null,
    keepHeadersOnError: js.UndefOr[scala.Boolean] = js.undefined,
    maxAge: scala.Double | java.lang.String = null,
    origin: (js.Function1[/* ctx */ koaLib.koaMod.Context, java.lang.String]) | java.lang.String = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (allowHeaders != null) __obj.updateDynamic("allowHeaders")(allowHeaders.asInstanceOf[js.Any])
    if (allowMethods != null) __obj.updateDynamic("allowMethods")(allowMethods.asInstanceOf[js.Any])
    if (!js.isUndefined(credentials)) __obj.updateDynamic("credentials")(credentials)
    if (exposeHeaders != null) __obj.updateDynamic("exposeHeaders")(exposeHeaders.asInstanceOf[js.Any])
    if (!js.isUndefined(keepHeadersOnError)) __obj.updateDynamic("keepHeadersOnError")(keepHeadersOnError)
    if (maxAge != null) __obj.updateDynamic("maxAge")(maxAge.asInstanceOf[js.Any])
    if (origin != null) __obj.updateDynamic("origin")(origin.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

