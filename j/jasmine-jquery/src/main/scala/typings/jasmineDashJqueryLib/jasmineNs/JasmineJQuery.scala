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
    browserTagCaseIndependentHtml: js.Function1[java.lang.String, java.lang.String],
    elementToString: js.Function1[jqueryLib.JQuery[stdLib.HTMLElement], java.lang.String],
    events: JasmineJQueryEvents,
    matchersClass: js.Any
  ): JasmineJQuery = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("browserTagCaseIndependentHtml")(browserTagCaseIndependentHtml)
    __obj.updateDynamic("elementToString")(elementToString)
    __obj.updateDynamic("events")(events)
    __obj.updateDynamic("matchersClass")(matchersClass)
    __obj.asInstanceOf[JasmineJQuery]
  }
}

