package typings.ipp.mod

import typings.ipp.anon.Documentname
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValidateJobRequest extends js.Object {
  var `job-attributes-tag`: js.UndefOr[JobTemplateAttributes] = js.undefined
  var `operation-attributes-tag`: Documentname
}

object ValidateJobRequest {
  @scala.inline
  def apply(`operation-attributes-tag`: Documentname, `job-attributes-tag`: JobTemplateAttributes = null): ValidateJobRequest = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("operation-attributes-tag")(`operation-attributes-tag`.asInstanceOf[js.Any])
    if (`job-attributes-tag` != null) __obj.updateDynamic("job-attributes-tag")(`job-attributes-tag`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidateJobRequest]
  }
}

