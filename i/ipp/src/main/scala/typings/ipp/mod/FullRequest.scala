package typings.ipp.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FullRequest extends js.Object {
  var data: js.UndefOr[Buffer] = js.undefined
  var `job-attributes-tag`: js.UndefOr[JobTemplateAttributes] = js.undefined
  var `operation-attributes-tag`: js.UndefOr[OperationAttributes] = js.undefined
}

object FullRequest {
  @scala.inline
  def apply(
    data: Buffer = null,
    `job-attributes-tag`: JobTemplateAttributes = null,
    `operation-attributes-tag`: OperationAttributes = null
  ): FullRequest = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (`job-attributes-tag` != null) __obj.updateDynamic("job-attributes-tag")(`job-attributes-tag`.asInstanceOf[js.Any])
    if (`operation-attributes-tag` != null) __obj.updateDynamic("operation-attributes-tag")(`operation-attributes-tag`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FullRequest]
  }
}

