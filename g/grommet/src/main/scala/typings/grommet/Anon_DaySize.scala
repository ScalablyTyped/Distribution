package typings.grommet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DaySize extends js.Object {
  var daySize: js.UndefOr[String] = js.undefined
  var fontSize: js.UndefOr[String] = js.undefined
  var lineHeight: js.UndefOr[Double] = js.undefined
  var slideDuration: js.UndefOr[String] = js.undefined
}

object Anon_DaySize {
  @scala.inline
  def apply(
    daySize: String = null,
    fontSize: String = null,
    lineHeight: Int | Double = null,
    slideDuration: String = null
  ): Anon_DaySize = {
    val __obj = js.Dynamic.literal()
    if (daySize != null) __obj.updateDynamic("daySize")(daySize)
    if (fontSize != null) __obj.updateDynamic("fontSize")(fontSize)
    if (lineHeight != null) __obj.updateDynamic("lineHeight")(lineHeight.asInstanceOf[js.Any])
    if (slideDuration != null) __obj.updateDynamic("slideDuration")(slideDuration)
    __obj.asInstanceOf[Anon_DaySize]
  }
}

