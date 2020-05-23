package typings.ioredis.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScanStreamOption extends js.Object {
  var count: js.UndefOr[Double] = js.undefined
  var `match`: js.UndefOr[String] = js.undefined
}

object ScanStreamOption {
  @scala.inline
  def apply(count: js.UndefOr[Double] = js.undefined, `match`: String = null): ScanStreamOption = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(count)) __obj.updateDynamic("count")(count.get.asInstanceOf[js.Any])
    if (`match` != null) __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScanStreamOption]
  }
}

