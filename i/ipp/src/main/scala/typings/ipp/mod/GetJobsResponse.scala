package typings.ipp.mod

import typings.ipp.anon.Attributesnaturallanguage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetJobsResponse extends js.Object {
  var id: Double
  var `job-attributes-tag`: js.UndefOr[JobTemplateAttributes | js.Array[JobTemplateAttributes]] = js.undefined
  var `operation-attributes-tag`: Attributesnaturallanguage
  var statusCode: StatusCode
  var `unsupported-attributes`: js.UndefOr[js.Array[String]] = js.undefined
  var version: IPPVersion
}

object GetJobsResponse {
  @scala.inline
  def apply(
    id: Double,
    `operation-attributes-tag`: Attributesnaturallanguage,
    statusCode: StatusCode,
    version: IPPVersion,
    `job-attributes-tag`: JobTemplateAttributes | js.Array[JobTemplateAttributes] = null,
    `unsupported-attributes`: js.Array[String] = null
  ): GetJobsResponse = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.updateDynamic("operation-attributes-tag")(`operation-attributes-tag`.asInstanceOf[js.Any])
    if (`job-attributes-tag` != null) __obj.updateDynamic("job-attributes-tag")(`job-attributes-tag`.asInstanceOf[js.Any])
    if (`unsupported-attributes` != null) __obj.updateDynamic("unsupported-attributes")(`unsupported-attributes`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetJobsResponse]
  }
}

