package typings.inDashRange.inDashRangeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Range extends js.Object {
  /**
  		End of the range.
  		*/
  val end: Double
  /**
  		Start of the range.
  		@default 0
  		*/
  val start: js.UndefOr[Double] = js.undefined
}

object Range {
  @scala.inline
  def apply(end: Double, start: Int | Double = null): Range = {
    val __obj = js.Dynamic.literal(end = end)
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    __obj.asInstanceOf[Range]
  }
}

