package typings.googleapis.monitoringV3Mod.monitoringV3

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaHttpCheck extends StObject {
  
  /**
    * If present, the check will only pass if the HTTP response status code is in this set of status codes. If empty, the HTTP status code will only pass if the HTTP status code is 200-299.
    */
  var acceptedResponseStatusCodes: js.UndefOr[js.Array[SchemaResponseStatusCode]] = js.undefined
  
  /**
    * The authentication information. Optional when creating an HTTP check; defaults to empty.
    */
  var authInfo: js.UndefOr[SchemaBasicAuthentication] = js.undefined
  
  /**
    * The request body associated with the HTTP POST request. If content_type is URL_ENCODED, the body passed in must be URL-encoded. Users can provide a Content-Length header via the headers field or the API will do so. If the request_method is GET and body is not empty, the API will return an error. The maximum byte size is 1 megabyte.Note: If client libraries aren't used (which performs the conversion automatically) base64 encode your body data since the field is of bytes type.
    */
  var body: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The content type header to use for the check. The following configurations result in errors: 1. Content type is specified in both the headers field and the content_type field. 2. Request method is GET and content_type is not TYPE_UNSPECIFIED 3. Request method is POST and content_type is TYPE_UNSPECIFIED. 4. Request method is POST and a "Content-Type" header is provided via headers field. The content_type field should be used instead.
    */
  var contentType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The list of headers to send as part of the Uptime check request. If two headers have the same key and different values, they should be entered as a single header, with the value being a comma-separated list of all the desired values as described at https://www.w3.org/Protocols/rfc2616/rfc2616.txt (page 31). Entering two separate headers with the same key in a Create call will cause the first to be overwritten by the second. The maximum number of headers allowed is 100.
    */
  var headers: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /**
    * Boolean specifying whether to encrypt the header information. Encryption should be specified for any headers related to authentication that you do not wish to be seen when retrieving the configuration. The server will be responsible for encrypting the headers. On Get/List calls, if mask_headers is set to true then the headers will be obscured with ******.
    */
  var maskHeaders: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Optional (defaults to "/"). The path to the page against which to run the check. Will be combined with the host (specified within the monitored_resource) and port to construct the full URL. If the provided path does not begin with "/", a "/" will be prepended automatically.
    */
  var path: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional (defaults to 80 when use_ssl is false, and 443 when use_ssl is true). The TCP port on the HTTP server against which to run the check. Will be combined with host (specified within the monitored_resource) and path to construct the full URL.
    */
  var port: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The HTTP request method to use for the check. If set to METHOD_UNSPECIFIED then request_method defaults to GET.
    */
  var requestMethod: js.UndefOr[String | Null] = js.undefined
  
  /**
    * If true, use HTTPS instead of HTTP to run the check.
    */
  var useSsl: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Boolean specifying whether to include SSL certificate validation as a part of the Uptime check. Only applies to checks where monitored_resource is set to uptime_url. If use_ssl is false, setting validate_ssl to true has no effect.
    */
  var validateSsl: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaHttpCheck {
  
  inline def apply(): SchemaHttpCheck = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHttpCheck]
  }
  
  extension [Self <: SchemaHttpCheck](x: Self) {
    
    inline def setAcceptedResponseStatusCodes(value: js.Array[SchemaResponseStatusCode]): Self = StObject.set(x, "acceptedResponseStatusCodes", value.asInstanceOf[js.Any])
    
    inline def setAcceptedResponseStatusCodesUndefined: Self = StObject.set(x, "acceptedResponseStatusCodes", js.undefined)
    
    inline def setAcceptedResponseStatusCodesVarargs(value: SchemaResponseStatusCode*): Self = StObject.set(x, "acceptedResponseStatusCodes", js.Array(value*))
    
    inline def setAuthInfo(value: SchemaBasicAuthentication): Self = StObject.set(x, "authInfo", value.asInstanceOf[js.Any])
    
    inline def setAuthInfoUndefined: Self = StObject.set(x, "authInfo", js.undefined)
    
    inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyNull: Self = StObject.set(x, "body", null)
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    inline def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    inline def setContentTypeNull: Self = StObject.set(x, "contentType", null)
    
    inline def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
    
    inline def setHeaders(value: StringDictionary[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersNull: Self = StObject.set(x, "headers", null)
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setMaskHeaders(value: Boolean): Self = StObject.set(x, "maskHeaders", value.asInstanceOf[js.Any])
    
    inline def setMaskHeadersNull: Self = StObject.set(x, "maskHeaders", null)
    
    inline def setMaskHeadersUndefined: Self = StObject.set(x, "maskHeaders", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathNull: Self = StObject.set(x, "path", null)
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    inline def setPortNull: Self = StObject.set(x, "port", null)
    
    inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    
    inline def setRequestMethod(value: String): Self = StObject.set(x, "requestMethod", value.asInstanceOf[js.Any])
    
    inline def setRequestMethodNull: Self = StObject.set(x, "requestMethod", null)
    
    inline def setRequestMethodUndefined: Self = StObject.set(x, "requestMethod", js.undefined)
    
    inline def setUseSsl(value: Boolean): Self = StObject.set(x, "useSsl", value.asInstanceOf[js.Any])
    
    inline def setUseSslNull: Self = StObject.set(x, "useSsl", null)
    
    inline def setUseSslUndefined: Self = StObject.set(x, "useSsl", js.undefined)
    
    inline def setValidateSsl(value: Boolean): Self = StObject.set(x, "validateSsl", value.asInstanceOf[js.Any])
    
    inline def setValidateSslNull: Self = StObject.set(x, "validateSsl", null)
    
    inline def setValidateSslUndefined: Self = StObject.set(x, "validateSsl", js.undefined)
  }
}
