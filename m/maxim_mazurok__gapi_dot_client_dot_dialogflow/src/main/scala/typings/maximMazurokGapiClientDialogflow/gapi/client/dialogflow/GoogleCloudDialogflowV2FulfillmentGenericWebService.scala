package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowV2FulfillmentGenericWebService extends StObject {
  
  /** Optional. Indicates if generic web service is created through Cloud Functions integration. Defaults to false. */
  var isCloudFunction: js.UndefOr[Boolean] = js.undefined
  
  /** Optional. The password for HTTP Basic authentication. */
  var password: js.UndefOr[String] = js.undefined
  
  /** Optional. The HTTP request headers to send together with fulfillment requests. */
  var requestHeaders: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientDialogflow.maximMazurokGapiClientDialogflowStrings.GoogleCloudDialogflowV2FulfillmentGenericWebService & TopLevel[js.Any]
  ] = js.undefined
  
  /** Required. The fulfillment URI for receiving POST requests. It must use https protocol. */
  var uri: js.UndefOr[String] = js.undefined
  
  /** Optional. The user name for HTTP Basic authentication. */
  var username: js.UndefOr[String] = js.undefined
}
object GoogleCloudDialogflowV2FulfillmentGenericWebService {
  
  inline def apply(): GoogleCloudDialogflowV2FulfillmentGenericWebService = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2FulfillmentGenericWebService]
  }
  
  extension [Self <: GoogleCloudDialogflowV2FulfillmentGenericWebService](x: Self) {
    
    inline def setIsCloudFunction(value: Boolean): Self = StObject.set(x, "isCloudFunction", value.asInstanceOf[js.Any])
    
    inline def setIsCloudFunctionUndefined: Self = StObject.set(x, "isCloudFunction", js.undefined)
    
    inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    inline def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
    
    inline def setRequestHeaders(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientDialogflow.maximMazurokGapiClientDialogflowStrings.GoogleCloudDialogflowV2FulfillmentGenericWebService & TopLevel[js.Any]
    ): Self = StObject.set(x, "requestHeaders", value.asInstanceOf[js.Any])
    
    inline def setRequestHeadersUndefined: Self = StObject.set(x, "requestHeaders", js.undefined)
    
    inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    inline def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
    
    inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    
    inline def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
  }
}
