package typings.materialTextfield.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ROOTSELECTOR extends js.Object {
  var ROOT_SELECTOR: String = js.native
}

object ROOTSELECTOR {
  @scala.inline
  def apply(ROOT_SELECTOR: String): ROOTSELECTOR = {
    val __obj = js.Dynamic.literal(ROOT_SELECTOR = ROOT_SELECTOR.asInstanceOf[js.Any])
    __obj.asInstanceOf[ROOTSELECTOR]
  }
  @scala.inline
  implicit class ROOTSELECTOROps[Self <: ROOTSELECTOR] (val x: Self) extends AnyVal {
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
    def setROOT_SELECTOR(value: String): Self = this.set("ROOT_SELECTOR", value.asInstanceOf[js.Any])
  }
  
}

