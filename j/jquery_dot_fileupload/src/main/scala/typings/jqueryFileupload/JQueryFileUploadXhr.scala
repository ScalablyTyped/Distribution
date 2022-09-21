package typings.jqueryFileupload

import org.scalablytyped.runtime.StringDictionary
import typings.jquery.JQueryXHR
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JQueryFileUploadXhr extends StObject {
  
  var errorThrown: Any
  
  var headers: StringDictionary[Any]
  
  var jqXHR: JQueryXHR
  
  var result: Any
  
  var textStatus: String
}
object JQueryFileUploadXhr {
  
  inline def apply(
    errorThrown: Any,
    headers: StringDictionary[Any],
    jqXHR: JQueryXHR,
    result: Any,
    textStatus: String
  ): JQueryFileUploadXhr = {
    val __obj = js.Dynamic.literal(errorThrown = errorThrown.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], jqXHR = jqXHR.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any], textStatus = textStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQueryFileUploadXhr]
  }
  
  extension [Self <: JQueryFileUploadXhr](x: Self) {
    
    inline def setErrorThrown(value: Any): Self = StObject.set(x, "errorThrown", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: StringDictionary[Any]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setJqXHR(value: JQueryXHR): Self = StObject.set(x, "jqXHR", value.asInstanceOf[js.Any])
    
    inline def setResult(value: Any): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    inline def setTextStatus(value: String): Self = StObject.set(x, "textStatus", value.asInstanceOf[js.Any])
  }
}
