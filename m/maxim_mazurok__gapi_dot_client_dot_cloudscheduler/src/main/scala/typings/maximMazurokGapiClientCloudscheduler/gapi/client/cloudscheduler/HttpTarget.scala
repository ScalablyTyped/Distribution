package typings.maximMazurokGapiClientCloudscheduler.gapi.client.cloudscheduler

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HttpTarget extends StObject {
  
  /** HTTP request body. A request body is allowed only if the HTTP method is POST, PUT, or PATCH. It is an error to set body on a job with an incompatible HttpMethod. */
  var body: js.UndefOr[String] = js.native
  
  /**
    * The user can specify HTTP request headers to send with the job's HTTP request. This map contains the header field names and values. Repeated headers are not supported, but a header
    * value can contain commas. These headers represent a subset of the headers that will accompany the job's HTTP request. Some HTTP request headers will be ignored or replaced. A
    * partial list of headers that will be ignored or replaced is below: - Host: This will be computed by Cloud Scheduler and derived from uri. * `Content-Length`: This will be computed
    * by Cloud Scheduler. * `User-Agent`: This will be set to `"Google-Cloud-Scheduler"`. * `X-Google-*`: Google internal use only. * `X-AppEngine-*`: Google internal use only. The total
    * size of headers must be less than 80KB.
    */
  var headers: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientCloudscheduler.maximMazurokGapiClientCloudschedulerStrings.HttpTarget with TopLevel[js.Any]
  ] = js.native
  
  /** Which HTTP method to use for the request. */
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
    * Required. The full URI path that the request will be sent to. This string must begin with either "http://" or "https://". Some examples of valid values for uri are:
    * `http://acme.com` and `https://acme.com/sales:8080`. Cloud Scheduler will encode some characters for safety and compatibility. The maximum allowed URL length is 2083 characters
    * after encoding.
    */
  var uri: js.UndefOr[String] = js.native
}
object HttpTarget {
  
  @scala.inline
  def apply(): HttpTarget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HttpTarget]
  }
  
  @scala.inline
  implicit class HttpTargetMutableBuilder[Self <: HttpTarget] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    @scala.inline
    def setHeaders(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientCloudscheduler.maximMazurokGapiClientCloudschedulerStrings.HttpTarget with TopLevel[js.Any]
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
    def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
  }
}
