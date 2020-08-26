package typings.ionicUtilsFs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
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
  val pathFilter: js.UndefOr[js.Function1[/* p */ String, Boolean]] = js.native
}

object WalkerOptions {
  @scala.inline
  def apply(): WalkerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WalkerOptions]
  }
  @scala.inline
  implicit class WalkerOptionsOps[Self <: WalkerOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setPathFilter(value: /* p */ String => Boolean): Self = this.set("pathFilter", js.Any.fromFunction1(value))
    @scala.inline
    def deletePathFilter: Self = this.set("pathFilter", js.undefined)
  }
  
}

