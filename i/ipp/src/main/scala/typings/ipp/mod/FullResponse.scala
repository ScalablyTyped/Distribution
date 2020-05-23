package typings.ipp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FullResponse extends js.Object {
  var id: Double
  var `job-attributes-tag`: js.UndefOr[js.Object] = js.undefined
  var `operation-attributes-tag`: OperationAttributes
  var `printer-attributes-tag`: js.UndefOr[PrinterDescription] = js.undefined
  var statusCode: StatusCode
  var `unsupported-attributes`: js.UndefOr[js.Array[String]] = js.undefined
  var version: IPPVersion
}

object FullResponse {
  @scala.inline
  def apply(
    id: Double,
    `operation-attributes-tag`: OperationAttributes,
    statusCode: StatusCode,
    version: IPPVersion,
    `job-attributes-tag`: js.Object = null,
    `printer-attributes-tag`: PrinterDescription = null,
    `unsupported-attributes`: js.Array[String] = null
  ): FullResponse = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.updateDynamic("operation-attributes-tag")(`operation-attributes-tag`.asInstanceOf[js.Any])
    if (`job-attributes-tag` != null) __obj.updateDynamic("job-attributes-tag")(`job-attributes-tag`.asInstanceOf[js.Any])
    if (`printer-attributes-tag` != null) __obj.updateDynamic("printer-attributes-tag")(`printer-attributes-tag`.asInstanceOf[js.Any])
    if (`unsupported-attributes` != null) __obj.updateDynamic("unsupported-attributes")(`unsupported-attributes`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FullResponse]
  }
}

