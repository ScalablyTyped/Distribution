package typings.got.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Progress extends js.Object {
  var percent: Double
  var total: Double | Null
  var transferred: Double
}

object Progress {
  @scala.inline
  def apply(percent: Double, transferred: Double, total: Int | Double = null): Progress = {
    val __obj = js.Dynamic.literal(percent = percent.asInstanceOf[js.Any], transferred = transferred.asInstanceOf[js.Any])
    if (total != null) __obj.updateDynamic("total")(total.asInstanceOf[js.Any])
    __obj.asInstanceOf[Progress]
  }
}

