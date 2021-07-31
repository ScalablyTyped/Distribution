package typings.ipp.mod

import typings.ipp.anon.Printeruri
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetPrinterAttributesRequest extends StObject {
  
  var `operation-attributes-tag`: Printeruri
}
object GetPrinterAttributesRequest {
  
  @scala.inline
  def apply(`operation-attributes-tag`: Printeruri): GetPrinterAttributesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("operation-attributes-tag")(`operation-attributes-tag`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPrinterAttributesRequest]
  }
  
  @scala.inline
  implicit class GetPrinterAttributesRequestMutableBuilder[Self <: GetPrinterAttributesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def `setOperation-attributes-tag`(value: Printeruri): Self = StObject.set(x, "operation-attributes-tag", value.asInstanceOf[js.Any])
  }
}
