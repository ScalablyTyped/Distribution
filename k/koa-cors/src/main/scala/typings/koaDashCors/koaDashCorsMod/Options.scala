package typings.koaDashCors.koaDashCorsMod

import typings.koa.koaMod.Request
import typings.koaDashCors.koaDashCorsNumbers.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var credentials: js.UndefOr[`true`] = js.undefined
  var expose: js.UndefOr[String | js.Array[String]] = js.undefined
  var headers: js.UndefOr[String | js.Array[String]] = js.undefined
  var maxAge: js.UndefOr[Double] = js.undefined
  var methods: js.UndefOr[String | js.Array[String]] = js.undefined
  var origin: js.UndefOr[Boolean | String | (js.Function1[/* request */ Request, String])] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    credentials: `true` = null,
    expose: String | js.Array[String] = null,
    headers: String | js.Array[String] = null,
    maxAge: Int | Double = null,
    methods: String | js.Array[String] = null,
    origin: Boolean | String | (js.Function1[/* request */ Request, String]) = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (credentials != null) __obj.updateDynamic("credentials")(credentials.asInstanceOf[js.Any])
    if (expose != null) __obj.updateDynamic("expose")(expose.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (maxAge != null) __obj.updateDynamic("maxAge")(maxAge.asInstanceOf[js.Any])
    if (methods != null) __obj.updateDynamic("methods")(methods.asInstanceOf[js.Any])
    if (origin != null) __obj.updateDynamic("origin")(origin.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

