package typings.koaDashResponseDashTime.koaDashResponseDashTimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KoaResponseTimeOptions extends js.Object {
  var hrtime: js.UndefOr[Boolean] = js.undefined
}

object KoaResponseTimeOptions {
  @scala.inline
  def apply(hrtime: js.UndefOr[Boolean] = js.undefined): KoaResponseTimeOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(hrtime)) __obj.updateDynamic("hrtime")(hrtime.asInstanceOf[js.Any])
    __obj.asInstanceOf[KoaResponseTimeOptions]
  }
}

