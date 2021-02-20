package typings.maximMazurokGapiClientCloudtasks.gapi.client.cloudtasks

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HttpRequest extends StObject {
  
  /** HTTP request body. A request body is allowed only if the HTTP method is POST, PUT, or PATCH. It is an error to set body on a task with an incompatible HttpMethod. */
  var body: js.UndefOr[String] = js.native
  
  /**
    * HTTP request headers. This map contains the header field names and values. Headers can be set when the task is created. These headers represent a subset of the headers that will
    * accompany the task's HTTP request. Some HTTP request headers will be ignored or replaced. A partial list of headers that will be ignored or replaced is: * Host: This will be
    * computed by Cloud Tasks and derived from HttpRequest.url. * Content-Length: This will be computed by Cloud Tasks. * User-Agent: This will be set to `"Google-Cloud-Tasks"`. *
    * X-Google-*: Google use only. * X-AppEngine-*: Google use only. `Content-Type` won't be set by Cloud Tasks. You can explicitly set `Content-Type` to a media type when the task is
    * created. For example, `Content-Type` can be set to `"application/octet-stream"` or `"application/json"`. Headers which can have multiple values (according to RFC2616) can be
    * specified using comma-separated values. The size of the headers must be less than 80KB.
    */
  var headers: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientCloudtasks.maximMazurokGapiClientCloudtasksStrings.HttpRequest with TopLevel[js.Any]
  ] = js.native
  
  /** The HTTP method to use for the request. The default is POST. */
  var httpMethod: js.UndefOr[String] = js.native
  
  /**
    * If specified, an [OAuth token](https://developers.google.com/identity/protocols/OAuth2) will be generated and attached as an `Authorization` header in the HTTP request. This type of
    * authorization should generally only be used when calling Google APIs hosted on *.googleapis.com.
    */
  var oauthToken: js.UndefOr[OAuthToken] = js.native
  
  /**
    * If specified, an [OIDC](https://developers.google.com/identity/protocols/OpenIDConnect) token will be generated and attached as an `Authorization` header in the HTTP request. This
    * type of authorization can be used for many scenarios, including calling Cloud Run, or endpoints where you intend to validate the token yourself.
    */
  var oidcToken: js.UndefOr[OidcToken] = js.native
  
  /**
    * Required. The full url path that the request will be sent to. This string must begin with either "http://" or "https://". Some examples are: `http://acme.com` and
    * `https://acme.com/sales:8080`. Cloud Tasks will encode some characters for safety and compatibility. The maximum allowed URL length is 2083 characters after encoding. The `Location`
    * header response from a redirect response [`300` - `399`] may be followed. The redirect is not counted as a separate attempt.
    */
  var url: js.UndefOr[String] = js.native
}
object HttpRequest {
  
  @scala.inline
  def apply(): HttpRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HttpRequest]
  }
  
  @scala.inline
  implicit class HttpRequestMutableBuilder[Self <: HttpRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    @scala.inline
    def setHeaders(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientCloudtasks.maximMazurokGapiClientCloudtasksStrings.HttpRequest with TopLevel[js.Any]
    ): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    @scala.inline
    def setHttpMethod(value: String): Self = StObject.set(x, "httpMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHttpMethodUndefined: Self = StObject.set(x, "httpMethod", js.undefined)
    
    @scala.inline
    def setOauthToken(value: OAuthToken): Self = StObject.set(x, "oauthToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOauthTokenUndefined: Self = StObject.set(x, "oauthToken", js.undefined)
    
    @scala.inline
    def setOidcToken(value: OidcToken): Self = StObject.set(x, "oidcToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOidcTokenUndefined: Self = StObject.set(x, "oidcToken", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
