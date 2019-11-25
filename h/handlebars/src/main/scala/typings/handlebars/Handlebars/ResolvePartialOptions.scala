package typings.handlebars.Handlebars

import org.scalablytyped.runtime.StringDictionary
import typings.handlebars.HandlebarsTemplateDelegate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResolvePartialOptions extends js.Object {
  var data: js.UndefOr[js.Any] = js.undefined
  var decorators: js.UndefOr[StringDictionary[js.Function]] = js.undefined
  var helpers: js.UndefOr[StringDictionary[js.Function]] = js.undefined
  var name: String
  var partials: js.UndefOr[StringDictionary[HandlebarsTemplateDelegate[_]]] = js.undefined
}

object ResolvePartialOptions {
  @scala.inline
  def apply(
    name: String,
    data: js.Any = null,
    decorators: StringDictionary[js.Function] = null,
    helpers: StringDictionary[js.Function] = null,
    partials: StringDictionary[HandlebarsTemplateDelegate[_]] = null
  ): ResolvePartialOptions = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (decorators != null) __obj.updateDynamic("decorators")(decorators.asInstanceOf[js.Any])
    if (helpers != null) __obj.updateDynamic("helpers")(helpers.asInstanceOf[js.Any])
    if (partials != null) __obj.updateDynamic("partials")(partials.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolvePartialOptions]
  }
}

