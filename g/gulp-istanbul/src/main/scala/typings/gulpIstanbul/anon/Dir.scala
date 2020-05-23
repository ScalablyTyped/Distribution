package typings.gulpIstanbul.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dir extends js.Object {
  var dir: js.UndefOr[String] = js.undefined
}

object Dir {
  @scala.inline
  def apply(dir: String = null): Dir = {
    val __obj = js.Dynamic.literal()
    if (dir != null) __obj.updateDynamic("dir")(dir.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dir]
  }
}

