package typings.ipp.mod

import typings.ipp.anon.Attributesnaturallanguage
import typings.ipp.anon.Jobstate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SendDocumentResponse extends js.Object {
  var id: Double
  var `job-attributes-tag`: Jobstate
  var `operation-attributes-tag`: Attributesnaturallanguage
  var statusCode: StatusCode
  var `unsupported-attributes`: js.UndefOr[js.Array[String]] = js.undefined
  var version: IPPVersion
}

object SendDocumentResponse {
  @scala.inline
  def apply(
    id: Double,
    `job-attributes-tag`: Jobstate,
    `operation-attributes-tag`: Attributesnaturallanguage,
    statusCode: StatusCode,
    version: IPPVersion,
    `unsupported-attributes`: js.Array[String] = null
  ): SendDocumentResponse = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.updateDynamic("job-attributes-tag")(`job-attributes-tag`.asInstanceOf[js.Any])
    __obj.updateDynamic("operation-attributes-tag")(`operation-attributes-tag`.asInstanceOf[js.Any])
    if (`unsupported-attributes` != null) __obj.updateDynamic("unsupported-attributes")(`unsupported-attributes`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendDocumentResponse]
  }
}

