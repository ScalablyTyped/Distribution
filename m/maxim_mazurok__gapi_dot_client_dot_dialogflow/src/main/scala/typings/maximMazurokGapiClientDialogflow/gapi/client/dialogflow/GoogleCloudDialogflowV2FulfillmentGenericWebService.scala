package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDialogflowV2FulfillmentGenericWebService extends StObject {
  
  /** Optional. Indicates if generic web service is created through Cloud Functions integration. Defaults to false. */
  var isCloudFunction: js.UndefOr[Boolean] = js.native
  
  /** Optional. The password for HTTP Basic authentication. */
  var password: js.UndefOr[String] = js.native
  
  /** Optional. The HTTP request headers to send together with fulfillment requests. */
  var requestHeaders: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientDialogflow.maximMazurokGapiClientDialogflowStrings.GoogleCloudDialogflowV2FulfillmentGenericWebService with TopLevel[js.Any]
  ] = js.native
  
  /** Required. The fulfillment URI for receiving POST requests. It must use https protocol. */
  var uri: js.UndefOr[String] = js.native
  
  /** Optional. The user name for HTTP Basic authentication. */
  var username: js.UndefOr[String] = js.native
}
object GoogleCloudDialogflowV2FulfillmentGenericWebService {
  
  @scala.inline
  def apply(): GoogleCloudDialogflowV2FulfillmentGenericWebService = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2FulfillmentGenericWebService]
  }
  
  @scala.inline
  implicit class GoogleCloudDialogflowV2FulfillmentGenericWebServiceMutableBuilder[Self <: GoogleCloudDialogflowV2FulfillmentGenericWebService] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsCloudFunction(value: Boolean): Self = StObject.set(x, "isCloudFunction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsCloudFunctionUndefined: Self = StObject.set(x, "isCloudFunction", js.undefined)
    
    @scala.inline
    def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
    
    @scala.inline
    def setRequestHeaders(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientDialogflow.maximMazurokGapiClientDialogflowStrings.GoogleCloudDialogflowV2FulfillmentGenericWebService with TopLevel[js.Any]
    ): Self = StObject.set(x, "requestHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestHeadersUndefined: Self = StObject.set(x, "requestHeaders", js.undefined)
    
    @scala.inline
    def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
    
    @scala.inline
    def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
  }
}
