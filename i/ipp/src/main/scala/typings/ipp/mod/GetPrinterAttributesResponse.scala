package typings.ipp.mod

import typings.ipp.anon.Attributesnaturallanguage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetPrinterAttributesResponse extends StObject {
  
  var id: Double
  
  var `operation-attributes-tag`: Attributesnaturallanguage
  
  var `printer-attributes-tag`: js.Object
  
  var statusCode: StatusCode
  
  var `unsupported-attributes`: js.UndefOr[js.Array[String]] = js.undefined
  
  var version: IPPVersion
}
object GetPrinterAttributesResponse {
  
  inline def apply(
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
  
  extension [Self <: GetPrinterAttributesResponse](x: Self) {
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def `setOperation-attributes-tag`(value: Attributesnaturallanguage): Self = StObject.set(x, "operation-attributes-tag", value.asInstanceOf[js.Any])
    
    inline def `setPrinter-attributes-tag`(value: js.Object): Self = StObject.set(x, "printer-attributes-tag", value.asInstanceOf[js.Any])
    
    inline def setStatusCode(value: StatusCode): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
    
    inline def `setUnsupported-attributes`(value: js.Array[String]): Self = StObject.set(x, "unsupported-attributes", value.asInstanceOf[js.Any])
    
    inline def `setUnsupported-attributesUndefined`: Self = StObject.set(x, "unsupported-attributes", js.undefined)
    
    inline def `setUnsupported-attributesVarargs`(value: String*): Self = StObject.set(x, "unsupported-attributes", js.Array(value*))
    
    inline def setVersion(value: IPPVersion): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
