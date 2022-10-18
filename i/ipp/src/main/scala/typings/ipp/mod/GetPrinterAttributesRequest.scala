package typings.ipp.mod

import typings.ipp.anon.Documentformat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetPrinterAttributesRequest extends StObject {
  
  var `operation-attributes-tag`: Documentformat
}
object GetPrinterAttributesRequest {
  
  inline def apply(`operation-attributes-tag`: Documentformat): GetPrinterAttributesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("operation-attributes-tag")(`operation-attributes-tag`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPrinterAttributesRequest]
  }
  
  extension [Self <: GetPrinterAttributesRequest](x: Self) {
    
    inline def `setOperation-attributes-tag`(value: Documentformat): Self = StObject.set(x, "operation-attributes-tag", value.asInstanceOf[js.Any])
  }
}
