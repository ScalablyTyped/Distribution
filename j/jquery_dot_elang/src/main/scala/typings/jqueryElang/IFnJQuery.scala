package typings.jqueryElang

import typings.jquery.JQuery_
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFnJQuery extends js.Object {
  def fnPlugin(
    context: JQuery_[HTMLElement],
    options: js.Any,
    command: String,
    pluginName: String,
    pluginDataAttribute: String
  ): JQuery_[HTMLElement]
}

object IFnJQuery {
  @scala.inline
  def apply(fnPlugin: (JQuery_[HTMLElement], js.Any, String, String, String) => JQuery_[HTMLElement]): IFnJQuery = {
    val __obj = js.Dynamic.literal(fnPlugin = js.Any.fromFunction5(fnPlugin))
  
    __obj.asInstanceOf[IFnJQuery]
  }
}

