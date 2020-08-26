package typings.jsData.mindexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IndexOpts extends js.Object {
  var fieldGetter: js.UndefOr[js.Any] = js.native
  @JSName("hashCode")
  var hashCode_FIndexOpts: js.UndefOr[js.Any] = js.native
}

object IndexOpts {
  @scala.inline
  def apply(): IndexOpts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IndexOpts]
  }
  @scala.inline
  implicit class IndexOptsOps[Self <: IndexOpts] (val x: Self) extends AnyVal {
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
    def setFieldGetter(value: js.Any): Self = this.set("fieldGetter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFieldGetter: Self = this.set("fieldGetter", js.undefined)
    @scala.inline
    def setHashCode(value: js.Any): Self = this.set("hashCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHashCode: Self = this.set("hashCode", js.undefined)
  }
  
}

