package typings.ipp.mod

import typings.ipp.anon.Attributesnaturallanguage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetJobsResponse extends js.Object {
  var id: Double = js.native
  var `job-attributes-tag`: js.UndefOr[JobTemplateAttributes | js.Array[JobTemplateAttributes]] = js.native
  var `operation-attributes-tag`: Attributesnaturallanguage = js.native
  var statusCode: StatusCode = js.native
  var `unsupported-attributes`: js.UndefOr[js.Array[String]] = js.native
  var version: IPPVersion = js.native
}

object GetJobsResponse {
  @scala.inline
  def apply(
    id: Double,
    `operation-attributes-tag`: Attributesnaturallanguage,
    statusCode: StatusCode,
    version: IPPVersion
  ): GetJobsResponse = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.updateDynamic("operation-attributes-tag")(`operation-attributes-tag`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetJobsResponse]
  }
  @scala.inline
  implicit class GetJobsResponseOps[Self <: GetJobsResponse] (val x: Self) extends AnyVal {
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
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def `setOperation-attributes-tag`(value: Attributesnaturallanguage): Self = this.set("operation-attributes-tag", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatusCode(value: StatusCode): Self = this.set("statusCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setVersion(value: IPPVersion): Self = this.set("version", value.asInstanceOf[js.Any])
    @scala.inline
    def `setJob-attributes-tagVarargs`(value: JobTemplateAttributes*): Self = this.set("job-attributes-tag", js.Array(value :_*))
    @scala.inline
    def `setJob-attributes-tag`(value: JobTemplateAttributes | js.Array[JobTemplateAttributes]): Self = this.set("job-attributes-tag", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteJob-attributes-tag`: Self = this.set("job-attributes-tag", js.undefined)
    @scala.inline
    def `setUnsupported-attributesVarargs`(value: String*): Self = this.set("unsupported-attributes", js.Array(value :_*))
    @scala.inline
    def `setUnsupported-attributes`(value: js.Array[String]): Self = this.set("unsupported-attributes", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteUnsupported-attributes`: Self = this.set("unsupported-attributes", js.undefined)
  }
  
}

