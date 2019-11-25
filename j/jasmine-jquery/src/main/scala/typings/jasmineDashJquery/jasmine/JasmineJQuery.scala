package typings.jasmineDashJquery.jasmine

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JasmineJQuery extends js.Object {
  var events: JasmineJQueryEvents
  var matchersClass: js.Any
  def browserTagCaseIndependentHtml(html: String): String
  def elementToString(element: typings.jquery.JQuery[HTMLElement]): String
}

object JasmineJQuery {
  @scala.inline
  def apply(
    browserTagCaseIndependentHtml: String => String,
    elementToString: typings.jquery.JQuery[HTMLElement] => String,
    events: JasmineJQueryEvents,
    matchersClass: js.Any
  ): JasmineJQuery = {
    val __obj = js.Dynamic.literal(browserTagCaseIndependentHtml = js.Any.fromFunction1(browserTagCaseIndependentHtml), elementToString = js.Any.fromFunction1(elementToString), events = events.asInstanceOf[js.Any], matchersClass = matchersClass.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[JasmineJQuery]
  }
}

