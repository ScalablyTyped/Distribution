package typings.googleapis.dialogflowV2Mod.dialogflowV2

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowV2FulfillmentGenericWebService extends StObject {
  
  /**
    * Optional. Indicates if generic web service is created through Cloud Functions integration. Defaults to false. is_cloud_function is deprecated. Cloud functions can be configured by its uri as a regular web service now.
    */
  var isCloudFunction: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Optional. The password for HTTP Basic authentication.
    */
  var password: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. The HTTP request headers to send together with fulfillment requests.
    */
  var requestHeaders: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /**
    * Required. The fulfillment URI for receiving POST requests. It must use https protocol.
    */
  var uri: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. The user name for HTTP Basic authentication.
    */
  var username: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDialogflowV2FulfillmentGenericWebService {
  
  inline def apply(): SchemaGoogleCloudDialogflowV2FulfillmentGenericWebService = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2FulfillmentGenericWebService]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowV2FulfillmentGenericWebService](x: Self) {
    
    inline def setIsCloudFunction(value: Boolean): Self = StObject.set(x, "isCloudFunction", value.asInstanceOf[js.Any])
    
    inline def setIsCloudFunctionNull: Self = StObject.set(x, "isCloudFunction", null)
    
    inline def setIsCloudFunctionUndefined: Self = StObject.set(x, "isCloudFunction", js.undefined)
    
    inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    inline def setPasswordNull: Self = StObject.set(x, "password", null)
    
    inline def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
    
    inline def setRequestHeaders(value: StringDictionary[String]): Self = StObject.set(x, "requestHeaders", value.asInstanceOf[js.Any])
    
    inline def setRequestHeadersNull: Self = StObject.set(x, "requestHeaders", null)
    
    inline def setRequestHeadersUndefined: Self = StObject.set(x, "requestHeaders", js.undefined)
    
    inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    inline def setUriNull: Self = StObject.set(x, "uri", null)
    
    inline def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
    
    inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    
    inline def setUsernameNull: Self = StObject.set(x, "username", null)
    
    inline def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
  }
}
