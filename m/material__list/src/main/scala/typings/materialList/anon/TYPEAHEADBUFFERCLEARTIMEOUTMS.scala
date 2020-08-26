package typings.materialList.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TYPEAHEADBUFFERCLEARTIMEOUTMS extends js.Object {
  var TYPEAHEAD_BUFFER_CLEAR_TIMEOUT_MS: Double = js.native
  var UNSET_INDEX: Double = js.native
}

object TYPEAHEADBUFFERCLEARTIMEOUTMS {
  @scala.inline
  def apply(TYPEAHEAD_BUFFER_CLEAR_TIMEOUT_MS: Double, UNSET_INDEX: Double): TYPEAHEADBUFFERCLEARTIMEOUTMS = {
    val __obj = js.Dynamic.literal(TYPEAHEAD_BUFFER_CLEAR_TIMEOUT_MS = TYPEAHEAD_BUFFER_CLEAR_TIMEOUT_MS.asInstanceOf[js.Any], UNSET_INDEX = UNSET_INDEX.asInstanceOf[js.Any])
    __obj.asInstanceOf[TYPEAHEADBUFFERCLEARTIMEOUTMS]
  }
  @scala.inline
  implicit class TYPEAHEADBUFFERCLEARTIMEOUTMSOps[Self <: TYPEAHEADBUFFERCLEARTIMEOUTMS] (val x: Self) extends AnyVal {
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
    def setTYPEAHEAD_BUFFER_CLEAR_TIMEOUT_MS(value: Double): Self = this.set("TYPEAHEAD_BUFFER_CLEAR_TIMEOUT_MS", value.asInstanceOf[js.Any])
    @scala.inline
    def setUNSET_INDEX(value: Double): Self = this.set("UNSET_INDEX", value.asInstanceOf[js.Any])
  }
  
}

