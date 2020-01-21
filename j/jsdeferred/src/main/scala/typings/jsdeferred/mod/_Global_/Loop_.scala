package typings.jsdeferred.mod._Global_

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Loop_ extends js.Object {
  var begin: js.UndefOr[Double] = js.undefined
  var end: js.UndefOr[Double] = js.undefined
  var step: js.UndefOr[Double] = js.undefined
}

object Loop_ {
  @scala.inline
  def apply(begin: Int | Double = null, end: Int | Double = null, step: Int | Double = null): Loop_ = {
    val __obj = js.Dynamic.literal()
    if (begin != null) __obj.updateDynamic("begin")(begin.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    __obj.asInstanceOf[Loop_]
  }
}

