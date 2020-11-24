package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDialogflowV2FulfillmentGenericWebService extends js.Object {
  
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
  implicit class GoogleCloudDialogflowV2FulfillmentGenericWebServiceOps[Self <: GoogleCloudDialogflowV2FulfillmentGenericWebService] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setIsCloudFunction(value: Boolean): Self = this.set("isCloudFunction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsCloudFunction: Self = this.set("isCloudFunction", js.undefined)
    
    @scala.inline
    def setPassword(value: String): Self = this.set("password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePassword: Self = this.set("password", js.undefined)
    
    @scala.inline
    def setRequestHeaders(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientDialogflow.maximMazurokGapiClientDialogflowStrings.GoogleCloudDialogflowV2FulfillmentGenericWebService with TopLevel[js.Any]
    ): Self = this.set("requestHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestHeaders: Self = this.set("requestHeaders", js.undefined)
    
    @scala.inline
    def setUri(value: String): Self = this.set("uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUri: Self = this.set("uri", js.undefined)
    
    @scala.inline
    def setUsername(value: String): Self = this.set("username", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUsername: Self = this.set("username", js.undefined)
  }
}
