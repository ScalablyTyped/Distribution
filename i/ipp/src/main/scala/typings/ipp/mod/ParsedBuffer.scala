package typings.ipp.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParsedBuffer extends StObject {
  
  var data: String = js.native
  
  var id: Double = js.native
  
  var operation: PrinterOpertaion = js.native
  
  var statusCode: StatusCode = js.native
  
  var version: String = js.native
}
object ParsedBuffer {
  
  @scala.inline
  def apply(data: String, id: Double, operation: PrinterOpertaion, statusCode: StatusCode, version: String): ParsedBuffer = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], operation = operation.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParsedBuffer]
  }
  
  @scala.inline
  implicit class ParsedBufferMutableBuilder[Self <: ParsedBuffer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperation(value: PrinterOpertaion): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusCode(value: StatusCode): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
