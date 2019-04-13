package typings
package koa2DashCorsLib.koa2DashCorsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var allowHeaders: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var allowMethods: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var credentials: js.UndefOr[scala.Boolean] = js.undefined
  var exposeHeaders: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var maxAge: js.UndefOr[scala.Double] = js.undefined
  var origin: js.UndefOr[
    java.lang.String | (js.Function1[/* ctx */ koaLib.koaMod.Context, scala.Boolean | java.lang.String])
  ] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    allowHeaders: js.Array[java.lang.String] = null,
    allowMethods: js.Array[java.lang.String] = null,
    credentials: js.UndefOr[scala.Boolean] = js.undefined,
    exposeHeaders: js.Array[java.lang.String] = null,
    maxAge: scala.Int | scala.Double = null,
    origin: java.lang.String | (js.Function1[/* ctx */ koaLib.koaMod.Context, scala.Boolean | java.lang.String]) = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (allowHeaders != null) __obj.updateDynamic("allowHeaders")(allowHeaders)
    if (allowMethods != null) __obj.updateDynamic("allowMethods")(allowMethods)
    if (!js.isUndefined(credentials)) __obj.updateDynamic("credentials")(credentials)
    if (exposeHeaders != null) __obj.updateDynamic("exposeHeaders")(exposeHeaders)
    if (maxAge != null) __obj.updateDynamic("maxAge")(maxAge.asInstanceOf[js.Any])
    if (origin != null) __obj.updateDynamic("origin")(origin.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

