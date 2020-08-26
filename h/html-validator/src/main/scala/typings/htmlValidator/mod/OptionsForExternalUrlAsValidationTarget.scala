package typings.htmlValidator.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OptionsForExternalUrlAsValidationTarget extends BasicOptions {
  var url: String = js.native
}

object OptionsForExternalUrlAsValidationTarget {
  @scala.inline
  def apply(url: String): OptionsForExternalUrlAsValidationTarget = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionsForExternalUrlAsValidationTarget]
  }
  @scala.inline
  implicit class OptionsForExternalUrlAsValidationTargetOps[Self <: OptionsForExternalUrlAsValidationTarget] (val x: Self) extends AnyVal {
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
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
  }
  
}

