package typings.javascriptAstar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDiagonal extends js.Object {
  var diagonal: js.UndefOr[Boolean] = js.undefined
}

object AnonDiagonal {
  @scala.inline
  def apply(diagonal: js.UndefOr[Boolean] = js.undefined): AnonDiagonal = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(diagonal)) __obj.updateDynamic("diagonal")(diagonal.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDiagonal]
  }
}

