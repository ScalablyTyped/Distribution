package typings.ipp.mod

import typings.ipp.anon.Attributesnaturallanguage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetPrinterAttributesResponse extends js.Object {
  var id: Double = js.native
  var `operation-attributes-tag`: Attributesnaturallanguage = js.native
  var `printer-attributes-tag`: js.Object = js.native
  var statusCode: StatusCode = js.native
  var `unsupported-attributes`: js.UndefOr[js.Array[String]] = js.native
  var version: IPPVersion = js.native
}

object GetPrinterAttributesResponse {
  @scala.inline
  def apply(
    id: Double,
    `operation-attributes-tag`: Attributesnaturallanguage,
    `printer-attributes-tag`: js.Object,
    statusCode: StatusCode,
    version: IPPVersion
  ): GetPrinterAttributesResponse = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.updateDynamic("operation-attributes-tag")(`operation-attributes-tag`.asInstanceOf[js.Any])
    __obj.updateDynamic("printer-attributes-tag")(`printer-attributes-tag`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPrinterAttributesResponse]
  }
  @scala.inline
  implicit class GetPrinterAttributesResponseOps[Self <: GetPrinterAttributesResponse] (val x: Self) extends AnyVal {
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
    def `setPrinter-attributes-tag`(value: js.Object): Self = this.set("printer-attributes-tag", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatusCode(value: StatusCode): Self = this.set("statusCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setVersion(value: IPPVersion): Self = this.set("version", value.asInstanceOf[js.Any])
    @scala.inline
    def `setUnsupported-attributesVarargs`(value: String*): Self = this.set("unsupported-attributes", js.Array(value :_*))
    @scala.inline
    def `setUnsupported-attributes`(value: js.Array[String]): Self = this.set("unsupported-attributes", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteUnsupported-attributes`: Self = this.set("unsupported-attributes", js.undefined)
  }
  
}

