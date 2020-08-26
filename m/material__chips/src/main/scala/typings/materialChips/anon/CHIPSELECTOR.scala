package typings.materialChips.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CHIPSELECTOR extends js.Object {
  var CHIP_SELECTOR: String = js.native
}

object CHIPSELECTOR {
  @scala.inline
  def apply(CHIP_SELECTOR: String): CHIPSELECTOR = {
    val __obj = js.Dynamic.literal(CHIP_SELECTOR = CHIP_SELECTOR.asInstanceOf[js.Any])
    __obj.asInstanceOf[CHIPSELECTOR]
  }
  @scala.inline
  implicit class CHIPSELECTOROps[Self <: CHIPSELECTOR] (val x: Self) extends AnyVal {
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
    def setCHIP_SELECTOR(value: String): Self = this.set("CHIP_SELECTOR", value.asInstanceOf[js.Any])
  }
  
}

