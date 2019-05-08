package typings
package jsrenderLib.JsViewsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TemplateOptions extends js.Object {
  var converters: js.UndefOr[Hash[Converter]] = js.undefined
  var helpers: js.UndefOr[Hash[_]] = js.undefined
  var markup: js.Any
  /* Template options hash */
  var tags: js.UndefOr[Hash[TagSetter]] = js.undefined
  var templates: js.UndefOr[Hash[TemplateSetter]] = js.undefined
  var useViews: js.UndefOr[scala.Boolean] = js.undefined
}

object TemplateOptions {
  @scala.inline
  def apply(
    markup: js.Any,
    converters: Hash[Converter] = null,
    helpers: Hash[_] = null,
    tags: Hash[TagSetter] = null,
    templates: Hash[TemplateSetter] = null,
    useViews: js.UndefOr[scala.Boolean] = js.undefined
  ): TemplateOptions = {
    val __obj = js.Dynamic.literal(markup = markup)
    if (converters != null) __obj.updateDynamic("converters")(converters)
    if (helpers != null) __obj.updateDynamic("helpers")(helpers)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    if (templates != null) __obj.updateDynamic("templates")(templates)
    if (!js.isUndefined(useViews)) __obj.updateDynamic("useViews")(useViews)
    __obj.asInstanceOf[TemplateOptions]
  }
}

