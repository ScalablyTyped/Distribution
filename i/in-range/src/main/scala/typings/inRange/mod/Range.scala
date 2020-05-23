package typings.inRange.mod

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
  def apply(end: Double, start: js.UndefOr[Double] = js.undefined): Range = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any])
    if (!js.isUndefined(start)) __obj.updateDynamic("start")(start.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Range]
  }
}

