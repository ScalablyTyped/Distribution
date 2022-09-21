package typings.ibmMobilefirst.WL

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Response
  extends StObject
     with ResponseBase {
  
  def getAllHeaders(): Headers
  
  def getHeader(name: Any): String
  
  def getHeaderNames(): js.Array[String]
}
object Response {
  
  inline def apply(
    errorCode: Double,
    errorMsg: String,
    getAllHeaders: () => Headers,
    getHeader: Any => String,
    getHeaderNames: () => js.Array[String],
    headerJSON: StringDictionary[Any],
    invocationContext: Any,
    readyState: Double,
    request: Any,
    responseJSON: StringDictionary[Any],
    responseText: String,
    responseXML: String,
    status: Double,
    statusText: String
  ): Response = {
    val __obj = js.Dynamic.literal(errorCode = errorCode.asInstanceOf[js.Any], errorMsg = errorMsg.asInstanceOf[js.Any], getAllHeaders = js.Any.fromFunction0(getAllHeaders), getHeader = js.Any.fromFunction1(getHeader), getHeaderNames = js.Any.fromFunction0(getHeaderNames), headerJSON = headerJSON.asInstanceOf[js.Any], invocationContext = invocationContext.asInstanceOf[js.Any], readyState = readyState.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], responseJSON = responseJSON.asInstanceOf[js.Any], responseText = responseText.asInstanceOf[js.Any], responseXML = responseXML.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], statusText = statusText.asInstanceOf[js.Any])
    __obj.asInstanceOf[Response]
  }
  
  extension [Self <: Response](x: Self) {
    
    inline def setGetAllHeaders(value: () => Headers): Self = StObject.set(x, "getAllHeaders", js.Any.fromFunction0(value))
    
    inline def setGetHeader(value: Any => String): Self = StObject.set(x, "getHeader", js.Any.fromFunction1(value))
    
    inline def setGetHeaderNames(value: () => js.Array[String]): Self = StObject.set(x, "getHeaderNames", js.Any.fromFunction0(value))
  }
}
