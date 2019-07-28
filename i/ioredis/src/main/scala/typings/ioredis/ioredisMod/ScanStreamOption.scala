package typings.ioredis.ioredisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScanStreamOption extends js.Object {
  var count: js.UndefOr[Double] = js.undefined
  var `match`: js.UndefOr[String] = js.undefined
}

object ScanStreamOption {
  @scala.inline
  def apply(count: Int | Double = null, `match`: String = null): ScanStreamOption = {
    val __obj = js.Dynamic.literal()
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (`match` != null) __obj.updateDynamic("match")(`match`)
    __obj.asInstanceOf[ScanStreamOption]
  }
}

