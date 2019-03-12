package typings
package jasmineDashJqueryLib.jasmineNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JasmineJQuery extends js.Object {
  var events: JasmineJQueryEvents
  var matchersClass: js.Any
  def browserTagCaseIndependentHtml(html: java.lang.String): java.lang.String
  def elementToString(element: jqueryLib.JQuery[stdLib.HTMLElement]): java.lang.String
}

object JasmineJQuery {
  @scala.inline
  def apply(
    browserTagCaseIndependentHtml: java.lang.String => java.lang.String,
    elementToString: jqueryLib.JQuery[stdLib.HTMLElement] => java.lang.String,
    events: JasmineJQueryEvents,
    matchersClass: js.Any
  ): JasmineJQuery = {
    val __obj = js.Dynamic.literal(browserTagCaseIndependentHtml = js.Any.fromFunction1(browserTagCaseIndependentHtml), elementToString = js.Any.fromFunction1(elementToString), events = events, matchersClass = matchersClass)
  
    __obj.asInstanceOf[JasmineJQuery]
  }
}

