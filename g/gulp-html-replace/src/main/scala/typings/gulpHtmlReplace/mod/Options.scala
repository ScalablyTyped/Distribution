package typings.gulpHtmlReplace.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var keepBlockTags: js.UndefOr[Boolean] = js.native
  var keepUnassigned: js.UndefOr[Boolean] = js.native
  var resolvePaths: js.UndefOr[Boolean] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
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
    def setKeepBlockTags(value: Boolean): Self = this.set("keepBlockTags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeepBlockTags: Self = this.set("keepBlockTags", js.undefined)
    @scala.inline
    def setKeepUnassigned(value: Boolean): Self = this.set("keepUnassigned", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeepUnassigned: Self = this.set("keepUnassigned", js.undefined)
    @scala.inline
    def setResolvePaths(value: Boolean): Self = this.set("resolvePaths", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResolvePaths: Self = this.set("resolvePaths", js.undefined)
  }
  
}

