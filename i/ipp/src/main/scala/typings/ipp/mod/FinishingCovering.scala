package typings.ipp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FinishingCovering extends js.Object {
  var `covering-name`: js.UndefOr[String] = js.native
}

object FinishingCovering {
  @scala.inline
  def apply(): FinishingCovering = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FinishingCovering]
  }
  @scala.inline
  implicit class FinishingCoveringOps[Self <: FinishingCovering] (val x: Self) extends AnyVal {
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
    def `setCovering-name`(value: String): Self = this.set("covering-name", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteCovering-name`: Self = this.set("covering-name", js.undefined)
  }
  
}

