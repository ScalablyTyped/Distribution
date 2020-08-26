package typings.kythe.anon

import typings.kythe.kytheStrings.ordinal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OrdinalBrand extends js.Object {
  var __ordinalBrand: ordinal = js.native
}

object OrdinalBrand {
  @scala.inline
  def apply(__ordinalBrand: ordinal): OrdinalBrand = {
    val __obj = js.Dynamic.literal(__ordinalBrand = __ordinalBrand.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrdinalBrand]
  }
  @scala.inline
  implicit class OrdinalBrandOps[Self <: OrdinalBrand] (val x: Self) extends AnyVal {
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
    def set__ordinalBrand(value: ordinal): Self = this.set("__ordinalBrand", value.asInstanceOf[js.Any])
  }
  
}

