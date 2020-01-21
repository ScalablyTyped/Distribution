package typings.luxon.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IntervalObject extends js.Object {
  var end: js.UndefOr[DateTime] = js.undefined
  var start: js.UndefOr[DateTime] = js.undefined
}

object IntervalObject {
  @scala.inline
  def apply(end: DateTime = null, start: DateTime = null): IntervalObject = {
    val __obj = js.Dynamic.literal()
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntervalObject]
  }
}

