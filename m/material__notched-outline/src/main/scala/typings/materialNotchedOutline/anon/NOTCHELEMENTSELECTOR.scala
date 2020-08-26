package typings.materialNotchedOutline.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NOTCHELEMENTSELECTOR extends js.Object {
  var NOTCH_ELEMENT_SELECTOR: String = js.native
}

object NOTCHELEMENTSELECTOR {
  @scala.inline
  def apply(NOTCH_ELEMENT_SELECTOR: String): NOTCHELEMENTSELECTOR = {
    val __obj = js.Dynamic.literal(NOTCH_ELEMENT_SELECTOR = NOTCH_ELEMENT_SELECTOR.asInstanceOf[js.Any])
    __obj.asInstanceOf[NOTCHELEMENTSELECTOR]
  }
  @scala.inline
  implicit class NOTCHELEMENTSELECTOROps[Self <: NOTCHELEMENTSELECTOR] (val x: Self) extends AnyVal {
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
    def setNOTCH_ELEMENT_SELECTOR(value: String): Self = this.set("NOTCH_ELEMENT_SELECTOR", value.asInstanceOf[js.Any])
  }
  
}

