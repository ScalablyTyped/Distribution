package typings.materialNotchedOutline.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NOLABEL extends js.Object {
  var NO_LABEL: String = js.native
  var OUTLINE_NOTCHED: String = js.native
  var OUTLINE_UPGRADED: String = js.native
}

object NOLABEL {
  @scala.inline
  def apply(NO_LABEL: String, OUTLINE_NOTCHED: String, OUTLINE_UPGRADED: String): NOLABEL = {
    val __obj = js.Dynamic.literal(NO_LABEL = NO_LABEL.asInstanceOf[js.Any], OUTLINE_NOTCHED = OUTLINE_NOTCHED.asInstanceOf[js.Any], OUTLINE_UPGRADED = OUTLINE_UPGRADED.asInstanceOf[js.Any])
    __obj.asInstanceOf[NOLABEL]
  }
  @scala.inline
  implicit class NOLABELOps[Self <: NOLABEL] (val x: Self) extends AnyVal {
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
    def setNO_LABEL(value: String): Self = this.set("NO_LABEL", value.asInstanceOf[js.Any])
    @scala.inline
    def setOUTLINE_NOTCHED(value: String): Self = this.set("OUTLINE_NOTCHED", value.asInstanceOf[js.Any])
    @scala.inline
    def setOUTLINE_UPGRADED(value: String): Self = this.set("OUTLINE_UPGRADED", value.asInstanceOf[js.Any])
  }
  
}

