package typings.ipp.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FullResponse extends StObject {
  
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
    version: IPPVersion
  ): FullResponse = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.updateDynamic("operation-attributes-tag")(`operation-attributes-tag`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FullResponse]
  }
  
  @scala.inline
  implicit class FullResponseMutableBuilder[Self <: FullResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setJob-attributes-tag`(value: js.Object): Self = StObject.set(x, "job-attributes-tag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setJob-attributes-tagUndefined`: Self = StObject.set(x, "job-attributes-tag", js.undefined)
    
    @scala.inline
    def `setOperation-attributes-tag`(value: OperationAttributes): Self = StObject.set(x, "operation-attributes-tag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setPrinter-attributes-tag`(value: PrinterDescription): Self = StObject.set(x, "printer-attributes-tag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setPrinter-attributes-tagUndefined`: Self = StObject.set(x, "printer-attributes-tag", js.undefined)
    
    @scala.inline
    def setStatusCode(value: StatusCode): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setUnsupported-attributes`(value: js.Array[String]): Self = StObject.set(x, "unsupported-attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setUnsupported-attributesUndefined`: Self = StObject.set(x, "unsupported-attributes", js.undefined)
    
    @scala.inline
    def `setUnsupported-attributesVarargs`(value: String*): Self = StObject.set(x, "unsupported-attributes", js.Array(value :_*))
    
    @scala.inline
    def setVersion(value: IPPVersion): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
