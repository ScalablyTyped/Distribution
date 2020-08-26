package typings.gulpFilter.mod

import typings.minimatch.mod.IOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends IOptions {
  var passthrough: js.UndefOr[Boolean] = js.native
  var restore: js.UndefOr[Boolean] = js.native
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
    def setPassthrough(value: Boolean): Self = this.set("passthrough", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePassthrough: Self = this.set("passthrough", js.undefined)
    @scala.inline
    def setRestore(value: Boolean): Self = this.set("restore", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRestore: Self = this.set("restore", js.undefined)
  }
  
}

