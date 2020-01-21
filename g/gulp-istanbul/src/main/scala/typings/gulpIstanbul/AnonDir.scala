package typings.gulpIstanbul

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDir extends js.Object {
  var dir: js.UndefOr[String] = js.undefined
}

object AnonDir {
  @scala.inline
  def apply(dir: String = null): AnonDir = {
    val __obj = js.Dynamic.literal()
    if (dir != null) __obj.updateDynamic("dir")(dir.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDir]
  }
}

