package typings.jasmineJquery.jasmine

import typings.jquery.JQuery
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JasmineJQuery extends js.Object {
  var events: JasmineJQueryEvents = js.native
  var matchersClass: js.Any = js.native
  def browserTagCaseIndependentHtml(html: String): String = js.native
  def elementToString(element: JQuery[HTMLElement]): String = js.native
}

object JasmineJQuery {
  @scala.inline
  def apply(
    browserTagCaseIndependentHtml: String => String,
    elementToString: JQuery[HTMLElement] => String,
    events: JasmineJQueryEvents,
    matchersClass: js.Any
  ): JasmineJQuery = {
    val __obj = js.Dynamic.literal(browserTagCaseIndependentHtml = js.Any.fromFunction1(browserTagCaseIndependentHtml), elementToString = js.Any.fromFunction1(elementToString), events = events.asInstanceOf[js.Any], matchersClass = matchersClass.asInstanceOf[js.Any])
    __obj.asInstanceOf[JasmineJQuery]
  }
  @scala.inline
  implicit class JasmineJQueryOps[Self <: JasmineJQuery] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBrowserTagCaseIndependentHtml(value: String => String): Self = this.set("browserTagCaseIndependentHtml", js.Any.fromFunction1(value))
    @scala.inline
    def setElementToString(value: JQuery[HTMLElement] => String): Self = this.set("elementToString", js.Any.fromFunction1(value))
    @scala.inline
    def setEvents(value: JasmineJQueryEvents): Self = this.set("events", value.asInstanceOf[js.Any])
    @scala.inline
    def setMatchersClass(value: js.Any): Self = this.set("matchersClass", value.asInstanceOf[js.Any])
  }
  
}

