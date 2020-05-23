package typings.ismobilejs.isMobileMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Navigator extends js.Object {
  var maxTouchPoints: js.UndefOr[Double] = js.undefined
  var platform: String
  var userAgent: String
}

object Navigator {
  @scala.inline
  def apply(platform: String, userAgent: String, maxTouchPoints: js.UndefOr[Double] = js.undefined): Navigator = {
    val __obj = js.Dynamic.literal(platform = platform.asInstanceOf[js.Any], userAgent = userAgent.asInstanceOf[js.Any])
    if (!js.isUndefined(maxTouchPoints)) __obj.updateDynamic("maxTouchPoints")(maxTouchPoints.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Navigator]
  }
}

