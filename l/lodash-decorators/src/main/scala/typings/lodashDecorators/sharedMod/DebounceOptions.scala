package typings.lodashDecorators.sharedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DebounceOptions extends js.Object {
  var leading: js.UndefOr[Boolean] = js.native
  var maxWait: js.UndefOr[Double] = js.native
  var trailing: js.UndefOr[Boolean] = js.native
  @JSName("wait")
  var wait_FDebounceOptions: js.UndefOr[Double] = js.native
}

object DebounceOptions {
  @scala.inline
  def apply(): DebounceOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DebounceOptions]
  }
  @scala.inline
  implicit class DebounceOptionsOps[Self <: DebounceOptions] (val x: Self) extends AnyVal {
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
    def setLeading(value: Boolean): Self = this.set("leading", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLeading: Self = this.set("leading", js.undefined)
    @scala.inline
    def setMaxWait(value: Double): Self = this.set("maxWait", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxWait: Self = this.set("maxWait", js.undefined)
    @scala.inline
    def setTrailing(value: Boolean): Self = this.set("trailing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrailing: Self = this.set("trailing", js.undefined)
    @scala.inline
    def setWait(value: Double): Self = this.set("wait", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWait: Self = this.set("wait", js.undefined)
  }
  
}

