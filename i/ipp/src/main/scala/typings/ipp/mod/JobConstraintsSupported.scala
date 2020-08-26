package typings.ipp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JobConstraintsSupported extends js.Object {
  var `resolver-name`: js.UndefOr[String] = js.native
}

object JobConstraintsSupported {
  @scala.inline
  def apply(): JobConstraintsSupported = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobConstraintsSupported]
  }
  @scala.inline
  implicit class JobConstraintsSupportedOps[Self <: JobConstraintsSupported] (val x: Self) extends AnyVal {
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
    def `setResolver-name`(value: String): Self = this.set("resolver-name", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteResolver-name`: Self = this.set("resolver-name", js.undefined)
  }
  
}

