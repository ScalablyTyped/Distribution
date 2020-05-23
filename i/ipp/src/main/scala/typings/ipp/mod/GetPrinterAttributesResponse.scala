package typings.ipp.mod

import typings.ipp.anon.Attributesnaturallanguage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetPrinterAttributesResponse extends js.Object {
  var id: Double
  var `operation-attributes-tag`: Attributesnaturallanguage
  var `printer-attributes-tag`: js.Object
  var statusCode: StatusCode
  var `unsupported-attributes`: js.UndefOr[js.Array[String]] = js.undefined
  var version: IPPVersion
}

object GetPrinterAttributesResponse {
  @scala.inline
  def apply(
    id: Double,
    `operation-attributes-tag`: Attributesnaturallanguage,
    `printer-attributes-tag`: js.Object,
    statusCode: StatusCode,
    version: IPPVersion,
    `unsupported-attributes`: js.Array[String] = null
  ): GetPrinterAttributesResponse = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.updateDynamic("operation-attributes-tag")(`operation-attributes-tag`.asInstanceOf[js.Any])
    __obj.updateDynamic("printer-attributes-tag")(`printer-attributes-tag`.asInstanceOf[js.Any])
    if (`unsupported-attributes` != null) __obj.updateDynamic("unsupported-attributes")(`unsupported-attributes`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPrinterAttributesResponse]
  }
}

