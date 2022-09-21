package typings.iobroker.anon

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestEnum extends StObject {
  
  var requestEnum: String
  
  var result: Record[String, Any]
}
object RequestEnum {
  
  inline def apply(requestEnum: String, result: Record[String, Any]): RequestEnum = {
    val __obj = js.Dynamic.literal(requestEnum = requestEnum.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestEnum]
  }
  
  extension [Self <: RequestEnum](x: Self) {
    
    inline def setRequestEnum(value: String): Self = StObject.set(x, "requestEnum", value.asInstanceOf[js.Any])
    
    inline def setResult(value: Record[String, Any]): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
  }
}
