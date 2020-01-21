package typings.ionicUtilsFs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WalkerOptions extends js.Object {
  /**
    * Filter out file paths during walk.
    *
    * As the file tree is walked, this function can be used to exclude files and
    * directories from the final result.
    *
    * It can also be used to tune performance. If a subdirectory is excluded, it
    * is not walked.
    *
    * @param p The file path.
    * @return `true` to include file path, otherwise it is excluded
    */
  val pathFilter: js.UndefOr[js.Function1[/* p */ String, Boolean]] = js.undefined
}

object WalkerOptions {
  @scala.inline
  def apply(pathFilter: /* p */ String => Boolean = null): WalkerOptions = {
    val __obj = js.Dynamic.literal()
    if (pathFilter != null) __obj.updateDynamic("pathFilter")(js.Any.fromFunction1(pathFilter))
    __obj.asInstanceOf[WalkerOptions]
  }
}

