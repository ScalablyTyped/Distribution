package typings.jqueryDashMousewheel

import typings.jqueryDashMousewheel.JQueryMousewheelNs.JQueryMousewheelEventObject
import typings.jqueryDashMousewheel.jqueryDashMousewheelStrings.mousewheel
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
    on_mousewheel: (mousewheel, js.Function2[/* eventObject */ JQueryMousewheelEventObject, /* repeated */ js.Any, _]) => JQuery,
    unmousewheel: () => JQuery
  ): JQuery = {
    val __obj = js.Dynamic.literal(mousewheel = js.Any.fromFunction1(mousewheel), unmousewheel = js.Any.fromFunction0(unmousewheel))
    __obj.updateDynamic("on")(js.Any.fromFunction2(on_mousewheel))
    __obj.asInstanceOf[JQuery]
  }
}

