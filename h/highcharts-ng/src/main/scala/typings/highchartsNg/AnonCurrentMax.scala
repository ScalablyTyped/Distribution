package typings.highchartsNg

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCurrentMax extends js.Object {
  var currentMax: js.UndefOr[Double] = js.undefined
  var currentMin: js.UndefOr[Double] = js.undefined
  var title: js.UndefOr[AnonText] = js.undefined
}

object AnonCurrentMax {
  @scala.inline
  def apply(currentMax: Int | Double = null, currentMin: Int | Double = null, title: AnonText = null): AnonCurrentMax = {
    val __obj = js.Dynamic.literal()
    if (currentMax != null) __obj.updateDynamic("currentMax")(currentMax.asInstanceOf[js.Any])
    if (currentMin != null) __obj.updateDynamic("currentMin")(currentMin.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCurrentMax]
  }
}

