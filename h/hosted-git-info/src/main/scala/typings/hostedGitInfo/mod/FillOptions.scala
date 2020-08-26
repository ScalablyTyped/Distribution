package typings.hostedGitInfo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FillOptions extends Options {
  var auth: js.UndefOr[String] = js.native
  var committish: js.UndefOr[String] = js.native
  var fragment: js.UndefOr[String] = js.native
  var path: js.UndefOr[String] = js.native
  var treepath: js.UndefOr[String] = js.native
}

object FillOptions {
  @scala.inline
  def apply(): FillOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FillOptions]
  }
  @scala.inline
  implicit class FillOptionsOps[Self <: FillOptions] (val x: Self) extends AnyVal {
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
    def setAuth(value: String): Self = this.set("auth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuth: Self = this.set("auth", js.undefined)
    @scala.inline
    def setCommittish(value: String): Self = this.set("committish", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCommittish: Self = this.set("committish", js.undefined)
    @scala.inline
    def setFragment(value: String): Self = this.set("fragment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFragment: Self = this.set("fragment", js.undefined)
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    @scala.inline
    def setTreepath(value: String): Self = this.set("treepath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTreepath: Self = this.set("treepath", js.undefined)
  }
  
}

