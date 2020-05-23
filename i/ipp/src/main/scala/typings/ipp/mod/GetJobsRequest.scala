package typings.ipp.mod

import typings.ipp.anon.Limit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetJobsRequest extends js.Object {
  var `operation-attributes-tag`: Limit
}

object GetJobsRequest {
  @scala.inline
  def apply(`operation-attributes-tag`: Limit): GetJobsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("operation-attributes-tag")(`operation-attributes-tag`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetJobsRequest]
  }
}

