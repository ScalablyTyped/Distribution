package typings.ipp.mod

import typings.ipp.anon.Jobholduntil
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HoldRestartJobRequest extends js.Object {
  var `operation-attributes-tag`: Jobholduntil
}

object HoldRestartJobRequest {
  @scala.inline
  def apply(`operation-attributes-tag`: Jobholduntil): HoldRestartJobRequest = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("operation-attributes-tag")(`operation-attributes-tag`.asInstanceOf[js.Any])
    __obj.asInstanceOf[HoldRestartJobRequest]
  }
}

