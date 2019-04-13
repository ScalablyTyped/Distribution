package typings
package highchartsLib.highstockMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RangeSelectorButtonEvent extends js.Object {
  var click: js.UndefOr[js.Function1[/* event */ stdLib.Event, scala.Unit]] = js.undefined
}

object RangeSelectorButtonEvent {
  @scala.inline
  def apply(click: /* event */ stdLib.Event => scala.Unit = null): RangeSelectorButtonEvent = {
    val __obj = js.Dynamic.literal()
    if (click != null) __obj.updateDynamic("click")(js.Any.fromFunction1(click))
    __obj.asInstanceOf[RangeSelectorButtonEvent]
  }
}

