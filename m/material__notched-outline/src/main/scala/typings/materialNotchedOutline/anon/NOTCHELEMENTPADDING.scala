package typings.materialNotchedOutline.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NOTCHELEMENTPADDING extends js.Object {
  var NOTCH_ELEMENT_PADDING: Double = js.native
}

object NOTCHELEMENTPADDING {
  @scala.inline
  def apply(NOTCH_ELEMENT_PADDING: Double): NOTCHELEMENTPADDING = {
    val __obj = js.Dynamic.literal(NOTCH_ELEMENT_PADDING = NOTCH_ELEMENT_PADDING.asInstanceOf[js.Any])
    __obj.asInstanceOf[NOTCHELEMENTPADDING]
  }
  @scala.inline
  implicit class NOTCHELEMENTPADDINGOps[Self <: NOTCHELEMENTPADDING] (val x: Self) extends AnyVal {
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
    def setNOTCH_ELEMENT_PADDING(value: Double): Self = this.set("NOTCH_ELEMENT_PADDING", value.asInstanceOf[js.Any])
  }
  
}

