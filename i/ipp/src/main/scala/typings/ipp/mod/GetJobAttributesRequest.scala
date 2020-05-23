package typings.ipp.mod

import typings.ipp.anon.Requestedattributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetJobAttributesRequest extends js.Object {
  var `operation-attributes-tag`: Requestedattributes
}

object GetJobAttributesRequest {
  @scala.inline
  def apply(`operation-attributes-tag`: Requestedattributes): GetJobAttributesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("operation-attributes-tag")(`operation-attributes-tag`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetJobAttributesRequest]
  }
}

