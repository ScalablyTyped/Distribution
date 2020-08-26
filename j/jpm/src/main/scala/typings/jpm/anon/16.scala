package typings.jpm.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `16` extends js.Object {
  var `16`: js.UndefOr[String] = js.native
  var `32`: js.UndefOr[String] = js.native
  var `64`: js.UndefOr[String] = js.native
}

object `16` {
  @scala.inline
  def apply(): `16` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`16`]
  }
  @scala.inline
  implicit class `16Ops`[Self <: `16`] (val x: Self) extends AnyVal {
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
    def set16(value: String): Self = this.set("16", value.asInstanceOf[js.Any])
    @scala.inline
    def delete16: Self = this.set("16", js.undefined)
    @scala.inline
    def set32(value: String): Self = this.set("32", value.asInstanceOf[js.Any])
    @scala.inline
    def delete32: Self = this.set("32", js.undefined)
    @scala.inline
    def set64(value: String): Self = this.set("64", value.asInstanceOf[js.Any])
    @scala.inline
    def delete64: Self = this.set("64", js.undefined)
  }
  
}

