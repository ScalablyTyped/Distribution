package typings.materialRadio.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NATIVECONTROLSELECTOR extends js.Object {
  var NATIVE_CONTROL_SELECTOR: String = js.native
}

object NATIVECONTROLSELECTOR {
  @scala.inline
  def apply(NATIVE_CONTROL_SELECTOR: String): NATIVECONTROLSELECTOR = {
    val __obj = js.Dynamic.literal(NATIVE_CONTROL_SELECTOR = NATIVE_CONTROL_SELECTOR.asInstanceOf[js.Any])
    __obj.asInstanceOf[NATIVECONTROLSELECTOR]
  }
  @scala.inline
  implicit class NATIVECONTROLSELECTOROps[Self <: NATIVECONTROLSELECTOR] (val x: Self) extends AnyVal {
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
    def setNATIVE_CONTROL_SELECTOR(value: String): Self = this.set("NATIVE_CONTROL_SELECTOR", value.asInstanceOf[js.Any])
  }
  
}

