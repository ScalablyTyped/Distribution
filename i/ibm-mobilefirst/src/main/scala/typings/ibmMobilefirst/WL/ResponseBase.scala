package typings.ibmMobilefirst.WL

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResponseBase extends StObject {
  
  var errorCode: Double
  
  var errorMsg: String
  
  var headerJSON: StringDictionary[js.Any]
  
  var invocationContext: js.Any
  
  // JSON Object
  var readyState: Double
  
  var request: js.Any
  
  var responseJSON: StringDictionary[js.Any]
  
  // JSON Object
  var responseText: String
  
  var responseXML: String
  
  var status: Double
  
  var statusText: String
}
object ResponseBase {
  
  @scala.inline
  def apply(
    errorCode: Double,
    errorMsg: String,
    headerJSON: StringDictionary[js.Any],
    invocationContext: js.Any,
    readyState: Double,
    request: js.Any,
    responseJSON: StringDictionary[js.Any],
    responseText: String,
    responseXML: String,
    status: Double,
    statusText: String
  ): ResponseBase = {
    val __obj = js.Dynamic.literal(errorCode = errorCode.asInstanceOf[js.Any], errorMsg = errorMsg.asInstanceOf[js.Any], headerJSON = headerJSON.asInstanceOf[js.Any], invocationContext = invocationContext.asInstanceOf[js.Any], readyState = readyState.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], responseJSON = responseJSON.asInstanceOf[js.Any], responseText = responseText.asInstanceOf[js.Any], responseXML = responseXML.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], statusText = statusText.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseBase]
  }
  
  @scala.inline
  implicit class ResponseBaseMutableBuilder[Self <: ResponseBase] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrorCode(value: Double): Self = StObject.set(x, "errorCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorMsg(value: String): Self = StObject.set(x, "errorMsg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderJSON(value: StringDictionary[js.Any]): Self = StObject.set(x, "headerJSON", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvocationContext(value: js.Any): Self = StObject.set(x, "invocationContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadyState(value: Double): Self = StObject.set(x, "readyState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: js.Any): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseJSON(value: StringDictionary[js.Any]): Self = StObject.set(x, "responseJSON", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseText(value: String): Self = StObject.set(x, "responseText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseXML(value: String): Self = StObject.set(x, "responseXML", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusText(value: String): Self = StObject.set(x, "statusText", value.asInstanceOf[js.Any])
  }
}
