package typings.gulpDashIstanbul

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Dir extends js.Object {
  var dir: js.UndefOr[String] = js.undefined
}

object Anon_Dir {
  @scala.inline
  def apply(dir: String = null): Anon_Dir = {
    val __obj = js.Dynamic.literal()
    if (dir != null) __obj.updateDynamic("dir")(dir.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Dir]
  }
}

