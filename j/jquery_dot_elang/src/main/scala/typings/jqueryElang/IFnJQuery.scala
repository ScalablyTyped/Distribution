package typings.jqueryElang

import typings.jquery.JQuery
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFnJQuery extends js.Object {
  def fnPlugin(
    context: JQuery[HTMLElement],
    options: js.Any,
    command: String,
    pluginName: String,
    pluginDataAttribute: String
  ): JQuery[HTMLElement]
}

object IFnJQuery {
  @scala.inline
  def apply(fnPlugin: (JQuery[HTMLElement], js.Any, String, String, String) => JQuery[HTMLElement]): IFnJQuery = {
    val __obj = js.Dynamic.literal(fnPlugin = js.Any.fromFunction5(fnPlugin))
    __obj.asInstanceOf[IFnJQuery]
  }
}

