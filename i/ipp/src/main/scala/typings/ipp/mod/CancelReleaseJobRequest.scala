package typings.ipp.mod

import typings.ipp.anon.Joburi
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CancelReleaseJobRequest extends js.Object {
  var `operation-attributes-tag`: Joburi = js.native
}

object CancelReleaseJobRequest {
  @scala.inline
  def apply(`operation-attributes-tag`: Joburi): CancelReleaseJobRequest = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("operation-attributes-tag")(`operation-attributes-tag`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelReleaseJobRequest]
  }
  @scala.inline
  implicit class CancelReleaseJobRequestOps[Self <: CancelReleaseJobRequest] (val x: Self) extends AnyVal {
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
    def `setOperation-attributes-tag`(value: Joburi): Self = this.set("operation-attributes-tag", value.asInstanceOf[js.Any])
  }
  
}

