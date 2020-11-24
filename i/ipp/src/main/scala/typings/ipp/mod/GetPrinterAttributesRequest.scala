package typings.ipp.mod

import typings.ipp.anon.Printeruri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetPrinterAttributesRequest extends js.Object {
  
  var `operation-attributes-tag`: Printeruri = js.native
}
object GetPrinterAttributesRequest {
  
  @scala.inline
  def apply(`operation-attributes-tag`: Printeruri): GetPrinterAttributesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("operation-attributes-tag")(`operation-attributes-tag`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPrinterAttributesRequest]
  }
  
  @scala.inline
  implicit class GetPrinterAttributesRequestOps[Self <: GetPrinterAttributesRequest] (val x: Self) extends AnyVal {
    
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
    def `setOperation-attributes-tag`(value: Printeruri): Self = this.set("operation-attributes-tag", value.asInstanceOf[js.Any])
  }
}
