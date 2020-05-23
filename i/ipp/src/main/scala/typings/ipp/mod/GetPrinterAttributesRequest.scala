package typings.ipp.mod

import typings.ipp.anon.Printeruri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetPrinterAttributesRequest extends js.Object {
  var `operation-attributes-tag`: Printeruri
}

object GetPrinterAttributesRequest {
  @scala.inline
  def apply(`operation-attributes-tag`: Printeruri): GetPrinterAttributesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("operation-attributes-tag")(`operation-attributes-tag`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPrinterAttributesRequest]
  }
}

