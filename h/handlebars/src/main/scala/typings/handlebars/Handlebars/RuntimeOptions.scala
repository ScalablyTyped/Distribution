package typings.handlebars.Handlebars

import org.scalablytyped.runtime.StringDictionary
import typings.handlebars.HandlebarsTemplateDelegate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RuntimeOptions extends js.Object {
  var allowCallsToHelperMissing: js.UndefOr[Boolean] = js.undefined
  var allowProtoMethodsByDefault: js.UndefOr[Boolean] = js.undefined
  var allowProtoPropertiesByDefault: js.UndefOr[Boolean] = js.undefined
  var allowedProtoMethods: js.UndefOr[StringDictionary[Boolean]] = js.undefined
  var allowedProtoProperties: js.UndefOr[StringDictionary[Boolean]] = js.undefined
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
    allowProtoMethodsByDefault: js.UndefOr[Boolean] = js.undefined,
    allowProtoPropertiesByDefault: js.UndefOr[Boolean] = js.undefined,
    allowedProtoMethods: StringDictionary[Boolean] = null,
    allowedProtoProperties: StringDictionary[Boolean] = null,
    blockParams: js.Array[_] = null,
    data: js.Any = null,
    decorators: StringDictionary[js.Function] = null,
    depths: js.Array[_] = null,
    helpers: StringDictionary[js.Function] = null,
    partial: js.UndefOr[Boolean] = js.undefined,
    partials: StringDictionary[HandlebarsTemplateDelegate[_]] = null
  ): RuntimeOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowCallsToHelperMissing)) __obj.updateDynamic("allowCallsToHelperMissing")(allowCallsToHelperMissing.asInstanceOf[js.Any])
    if (!js.isUndefined(allowProtoMethodsByDefault)) __obj.updateDynamic("allowProtoMethodsByDefault")(allowProtoMethodsByDefault.asInstanceOf[js.Any])
    if (!js.isUndefined(allowProtoPropertiesByDefault)) __obj.updateDynamic("allowProtoPropertiesByDefault")(allowProtoPropertiesByDefault.asInstanceOf[js.Any])
    if (allowedProtoMethods != null) __obj.updateDynamic("allowedProtoMethods")(allowedProtoMethods.asInstanceOf[js.Any])
    if (allowedProtoProperties != null) __obj.updateDynamic("allowedProtoProperties")(allowedProtoProperties.asInstanceOf[js.Any])
    if (blockParams != null) __obj.updateDynamic("blockParams")(blockParams.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (decorators != null) __obj.updateDynamic("decorators")(decorators.asInstanceOf[js.Any])
    if (depths != null) __obj.updateDynamic("depths")(depths.asInstanceOf[js.Any])
    if (helpers != null) __obj.updateDynamic("helpers")(helpers.asInstanceOf[js.Any])
    if (!js.isUndefined(partial)) __obj.updateDynamic("partial")(partial.asInstanceOf[js.Any])
    if (partials != null) __obj.updateDynamic("partials")(partials.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuntimeOptions]
  }
}

