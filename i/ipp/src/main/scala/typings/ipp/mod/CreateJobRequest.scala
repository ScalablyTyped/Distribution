package typings.ipp.mod

import typings.ipp.anon.Ippattributefidelity
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateJobRequest extends js.Object {
  var `job-attributes-tag`: js.UndefOr[JobTemplateAttributes] = js.undefined
  var `operation-attributes-tag`: Ippattributefidelity
}

object CreateJobRequest {
  @scala.inline
  def apply(
    `operation-attributes-tag`: Ippattributefidelity,
    `job-attributes-tag`: JobTemplateAttributes = null
  ): CreateJobRequest = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("operation-attributes-tag")(`operation-attributes-tag`.asInstanceOf[js.Any])
    if (`job-attributes-tag` != null) __obj.updateDynamic("job-attributes-tag")(`job-attributes-tag`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateJobRequest]
  }
}

