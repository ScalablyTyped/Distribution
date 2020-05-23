package typings.handlebarsHelpers.anon

import typings.handlebars.Handlebars.ResolvePartialOptions
import typings.handlebars.HandlebarsTemplateDelegate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofVM extends js.Object {
  def resolvePartial[T](
    partial: js.UndefOr[HandlebarsTemplateDelegate[T]],
    context: js.Any,
    options: ResolvePartialOptions
  ): HandlebarsTemplateDelegate[T]
}

object TypeofVM {
  @scala.inline
  def apply(
    resolvePartial: (js.UndefOr[HandlebarsTemplateDelegate[js.Any]], js.Any, ResolvePartialOptions) => HandlebarsTemplateDelegate[js.Any]
  ): TypeofVM = {
    val __obj = js.Dynamic.literal(resolvePartial = js.Any.fromFunction3(resolvePartial))
    __obj.asInstanceOf[TypeofVM]
  }
}

