package typings.ipp.mod

import typings.ipp.anon.Documentformat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PrintURIRequest extends js.Object {
  var `job-attributes-tag`: js.UndefOr[JobTemplateAttributes] = js.undefined
  var `operation-attributes-tag`: Documentformat
}

object PrintURIRequest {
  @scala.inline
  def apply(`operation-attributes-tag`: Documentformat, `job-attributes-tag`: JobTemplateAttributes = null): PrintURIRequest = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("operation-attributes-tag")(`operation-attributes-tag`.asInstanceOf[js.Any])
    if (`job-attributes-tag` != null) __obj.updateDynamic("job-attributes-tag")(`job-attributes-tag`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrintURIRequest]
  }
}

