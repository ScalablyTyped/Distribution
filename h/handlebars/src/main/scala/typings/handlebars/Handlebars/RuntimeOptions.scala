package typings.handlebars.Handlebars

import org.scalablytyped.runtime.StringDictionary
import typings.handlebars.HandlebarsTemplateDelegate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RuntimeOptions extends js.Object {
  var allowCallsToHelperMissing: js.UndefOr[Boolean] = js.undefined
  var blockParams: js.UndefOr[js.Array[_]] = js.undefined
  var data: js.UndefOr[js.Any] = js.undefined
  var decorators: js.UndefOr[StringDictionary[js.Function]] = js.undefined
  var depths: js.UndefOr[js.Array[_]] = js.undefined
  var helpers: js.UndefOr[StringDictionary[js.Function]] = js.undefined
  var partial: js.UndefOr[Boolean] = js.undefined
  var partials: js.UndefOr[StringDictionary[HandlebarsTemplateDelegate[_]]] = js.undefined
}

object RuntimeOptions {
  @scala.inline
  def apply(
    allowCallsToHelperMissing: js.UndefOr[Boolean] = js.undefined,
    blockParams: js.Array[_] = null,
    data: js.Any = null,
    decorators: StringDictionary[js.Function] = null,
    depths: js.Array[_] = null,
    helpers: StringDictionary[js.Function] = null,
    partial: js.UndefOr[Boolean] = js.undefined,
    partials: StringDictionary[HandlebarsTemplateDelegate[_]] = null
  ): RuntimeOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowCallsToHelperMissing)) __obj.updateDynamic("allowCallsToHelperMissing")(allowCallsToHelperMissing)
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

