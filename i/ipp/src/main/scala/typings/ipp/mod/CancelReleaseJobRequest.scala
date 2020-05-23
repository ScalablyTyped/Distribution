package typings.ipp.mod

import typings.ipp.anon.Joburi
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CancelReleaseJobRequest extends js.Object {
  var `operation-attributes-tag`: Joburi
}

object CancelReleaseJobRequest {
  @scala.inline
  def apply(`operation-attributes-tag`: Joburi): CancelReleaseJobRequest = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("operation-attributes-tag")(`operation-attributes-tag`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelReleaseJobRequest]
  }
}

