package typings.iobroker.anon

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestEnum extends StObject {
  
  var requestEnum: String
  
  var result: Record[String, js.Any]
}
object RequestEnum {
  
  @scala.inline
  def apply(requestEnum: String, result: Record[String, js.Any]): RequestEnum = {
    val __obj = js.Dynamic.literal(requestEnum = requestEnum.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestEnum]
  }
  
  @scala.inline
  implicit class RequestEnumMutableBuilder[Self <: RequestEnum] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRequestEnum(value: String): Self = StObject.set(x, "requestEnum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResult(value: Record[String, js.Any]): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
  }
}
