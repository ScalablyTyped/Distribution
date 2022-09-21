package typings.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowCxV3beta1WebhookGenericWebService extends StObject {
  
  /**
    * Optional. Specifies a list of allowed custom CA certificates (in DER format) for HTTPS verification. This overrides the default SSL trust store. If this is empty or unspecified, Dialogflow will use Google's default trust store to verify certificates. N.B. Make sure the HTTPS server certificates are signed with "subject alt name". For instance a certificate can be self-signed using the following command, ``` openssl x509 -req -days 200 -in example.com.csr \ -signkey example.com.key \ -out example.com.crt \ -extfile <(printf "\nsubjectAltName='DNS:www.example.com'") ```
    */
  var allowedCaCerts: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * The password for HTTP Basic authentication.
    */
  var password: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The HTTP request headers to send together with webhook requests.
    */
  var requestHeaders: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /**
    * Required. The webhook URI for receiving POST requests. It must use https protocol.
    */
  var uri: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The user name for HTTP Basic authentication.
    */
  var username: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDialogflowCxV3beta1WebhookGenericWebService {
  
  inline def apply(): SchemaGoogleCloudDialogflowCxV3beta1WebhookGenericWebService = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowCxV3beta1WebhookGenericWebService]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowCxV3beta1WebhookGenericWebService](x: Self) {
    
    inline def setAllowedCaCerts(value: js.Array[String]): Self = StObject.set(x, "allowedCaCerts", value.asInstanceOf[js.Any])
    
    inline def setAllowedCaCertsNull: Self = StObject.set(x, "allowedCaCerts", null)
    
    inline def setAllowedCaCertsUndefined: Self = StObject.set(x, "allowedCaCerts", js.undefined)
    
    inline def setAllowedCaCertsVarargs(value: String*): Self = StObject.set(x, "allowedCaCerts", js.Array(value*))
    
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
