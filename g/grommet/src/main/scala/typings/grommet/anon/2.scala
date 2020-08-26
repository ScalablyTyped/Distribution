package typings.grommet.anon

import typings.grommet.utilsMod.BorderType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `2` extends js.Object {
  var border: js.UndefOr[BorderType] = js.native
}

object `2` {
  @scala.inline
  def apply(): `2` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`2`]
  }
  @scala.inline
  implicit class `2Ops`[Self <: `2`] (val x: Self) extends AnyVal {
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
    def setBorderVarargs(value: SizeStyle*): Self = this.set("border", js.Array(value :_*))
    @scala.inline
    def setBorder(value: BorderType): Self = this.set("border", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorder: Self = this.set("border", js.undefined)
  }
  
}

