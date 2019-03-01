package typings
package handlebarsLib.HandlebarsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RuntimeOptions extends js.Object {
  var blockParams: js.UndefOr[js.Array[_]] = js.undefined
  var data: js.UndefOr[js.Any] = js.undefined
  var decorators: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Function]] = js.undefined
  var depths: js.UndefOr[js.Array[_]] = js.undefined
  var helpers: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Function]] = js.undefined
  var partial: js.UndefOr[scala.Boolean] = js.undefined
  var partials: js.UndefOr[
    org.scalablytyped.runtime.StringDictionary[handlebarsLib.HandlebarsTemplateDelegate[_]]
  ] = js.undefined
}

object RuntimeOptions {
  @scala.inline
  def apply(
    blockParams: js.Array[_] = null,
    data: js.Any = null,
    decorators: org.scalablytyped.runtime.StringDictionary[js.Function] = null,
    depths: js.Array[_] = null,
    helpers: org.scalablytyped.runtime.StringDictionary[js.Function] = null,
    partial: js.UndefOr[scala.Boolean] = js.undefined,
    partials: org.scalablytyped.runtime.StringDictionary[handlebarsLib.HandlebarsTemplateDelegate[_]] = null
  ): RuntimeOptions = {
    val __obj = js.Dynamic.literal()
    if (blockParams != null) __obj.updateDynamic("blockParams")(blockParams)
    if (data != null) __obj.updateDynamic("data")(data)
    if (decorators != null) __obj.updateDynamic("decorators")(decorators)
    if (depths != null) __obj.updateDynamic("depths")(depths)
    if (helpers != null) __obj.updateDynamic("helpers")(helpers)
    if (!js.isUndefined(partial)) __obj.updateDynamic("partial")(partial)
    if (partials != null) __obj.updateDynamic("partials")(partials)
    __obj.asInstanceOf[RuntimeOptions]
  }
}

