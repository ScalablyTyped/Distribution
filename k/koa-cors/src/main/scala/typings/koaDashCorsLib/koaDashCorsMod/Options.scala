package typings
package koaDashCorsLib.koaDashCorsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var credentials: js.UndefOr[koaDashCorsLib.koaDashCorsLibNumbers.`true`] = js.undefined
  var expose: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var headers: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var maxAge: js.UndefOr[scala.Double] = js.undefined
  var methods: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var origin: js.UndefOr[
    scala.Boolean | java.lang.String | (js.Function1[/* request */ koaLib.koaMod.Request, java.lang.String])
  ] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    credentials: koaDashCorsLib.koaDashCorsLibNumbers.`true` = null,
    expose: java.lang.String | js.Array[java.lang.String] = null,
    headers: java.lang.String | js.Array[java.lang.String] = null,
    maxAge: scala.Int | scala.Double = null,
    methods: java.lang.String | js.Array[java.lang.String] = null,
    origin: scala.Boolean | java.lang.String | (js.Function1[/* request */ koaLib.koaMod.Request, java.lang.String]) = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (credentials != null) __obj.updateDynamic("credentials")(credentials)
    if (expose != null) __obj.updateDynamic("expose")(expose.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (maxAge != null) __obj.updateDynamic("maxAge")(maxAge.asInstanceOf[js.Any])
    if (methods != null) __obj.updateDynamic("methods")(methods.asInstanceOf[js.Any])
    if (origin != null) __obj.updateDynamic("origin")(origin.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

