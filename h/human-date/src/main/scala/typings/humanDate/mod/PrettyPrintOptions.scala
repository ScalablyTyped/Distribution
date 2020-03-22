package typings.humanDate.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PrettyPrintOptions extends js.Object {
  var showTime: js.UndefOr[Boolean] = js.undefined
}

object PrettyPrintOptions {
  @scala.inline
  def apply(showTime: js.UndefOr[Boolean] = js.undefined): PrettyPrintOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(showTime)) __obj.updateDynamic("showTime")(showTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrettyPrintOptions]
  }
}

