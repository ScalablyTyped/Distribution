package typings.jqueryMousewheel

import typings.jqueryMousewheel.JQueryMousewheel.JQueryMousewheelEventObject
import typings.jqueryMousewheel.jqueryMousewheelStrings.mousewheel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JQuery extends js.Object {
  def mousewheel(handler: js.Function2[/* eventObject */ JQueryMousewheelEventObject, /* repeated */ js.Any, _]): JQuery
  @JSName("on")
  def on_mousewheel(
    event: mousewheel,
    handler: js.Function2[/* eventObject */ JQueryMousewheelEventObject, /* repeated */ js.Any, _]
  ): JQuery
  def unmousewheel(): JQuery
}

object JQuery {
  @scala.inline
  def apply(
    mousewheel: js.Function2[/* eventObject */ JQueryMousewheelEventObject, /* repeated */ js.Any, _] => JQuery,
    on: (mousewheel, js.Function2[/* eventObject */ JQueryMousewheelEventObject, /* repeated */ js.Any, _]) => JQuery,
    unmousewheel: () => JQuery
  ): JQuery = {
    val __obj = js.Dynamic.literal(mousewheel = js.Any.fromFunction1(mousewheel), on = js.Any.fromFunction2(on), unmousewheel = js.Any.fromFunction0(unmousewheel))
    __obj.asInstanceOf[JQuery]
  }
}

