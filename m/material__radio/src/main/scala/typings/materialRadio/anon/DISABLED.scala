package typings.materialRadio.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DISABLED extends js.Object {
  var DISABLED: String = js.native
  var ROOT: String = js.native
}

object DISABLED {
  @scala.inline
  def apply(DISABLED: String, ROOT: String): DISABLED = {
    val __obj = js.Dynamic.literal(DISABLED = DISABLED.asInstanceOf[js.Any], ROOT = ROOT.asInstanceOf[js.Any])
    __obj.asInstanceOf[DISABLED]
  }
  @scala.inline
  implicit class DISABLEDOps[Self <: DISABLED] (val x: Self) extends AnyVal {
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
    def setDISABLED(value: String): Self = this.set("DISABLED", value.asInstanceOf[js.Any])
    @scala.inline
    def setROOT(value: String): Self = this.set("ROOT", value.asInstanceOf[js.Any])
  }
  
}

