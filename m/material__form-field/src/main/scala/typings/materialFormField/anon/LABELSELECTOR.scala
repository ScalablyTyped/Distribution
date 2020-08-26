package typings.materialFormField.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LABELSELECTOR extends js.Object {
  var LABEL_SELECTOR: String = js.native
}

object LABELSELECTOR {
  @scala.inline
  def apply(LABEL_SELECTOR: String): LABELSELECTOR = {
    val __obj = js.Dynamic.literal(LABEL_SELECTOR = LABEL_SELECTOR.asInstanceOf[js.Any])
    __obj.asInstanceOf[LABELSELECTOR]
  }
  @scala.inline
  implicit class LABELSELECTOROps[Self <: LABELSELECTOR] (val x: Self) extends AnyVal {
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
    def setLABEL_SELECTOR(value: String): Self = this.set("LABEL_SELECTOR", value.asInstanceOf[js.Any])
  }
  
}

