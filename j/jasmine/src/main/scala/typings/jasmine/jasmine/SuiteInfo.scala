package typings.jasmine.jasmine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SuiteInfo extends js.Object {
  var totalSpecsDefined: Double = js.native
}

object SuiteInfo {
  @scala.inline
  def apply(totalSpecsDefined: Double): SuiteInfo = {
    val __obj = js.Dynamic.literal(totalSpecsDefined = totalSpecsDefined.asInstanceOf[js.Any])
    __obj.asInstanceOf[SuiteInfo]
  }
  @scala.inline
  implicit class SuiteInfoOps[Self <: SuiteInfo] (val x: Self) extends AnyVal {
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
    def setTotalSpecsDefined(value: Double): Self = this.set("totalSpecsDefined", value.asInstanceOf[js.Any])
  }
  
}

