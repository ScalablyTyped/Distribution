package typings.googleapis.v2beta2Mod.cloudtasksV2beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaHttpTarget extends StObject {
  
  /**
    * HTTP target headers. This map contains the header field names and values. Headers will be set when running the task is created and/or task is created. These headers represent a subset of the headers that will accompany the task's HTTP request. Some HTTP request headers will be ignored or replaced. A partial list of headers that will be ignored or replaced is: * Any header that is prefixed with "X-Google-Cloud-Tasks-" will be treated as service header. Service headers define properties of the task and are predefined in CloudTask. * Host: This will be computed by Cloud Tasks and derived from HttpRequest.url. * Content-Length: This will be computed by Cloud Tasks. * User-Agent: This will be set to `"Google-Cloud-Tasks"`. * `X-Google-*`: Google use only. * `X-AppEngine-*`: Google use only. `Content-Type` won't be set by Cloud Tasks. You can explicitly set `Content-Type` to a media type when the task is created. For example, `Content-Type` can be set to `"application/octet-stream"` or `"application/json"`. Headers which can have multiple values (according to RFC2616) can be specified using comma-separated values. The size of the headers must be less than 80KB. Queue-level headers to override headers of all the tasks in the queue.
    */
  var headerOverrides: js.UndefOr[js.Array[SchemaHeaderOverride]] = js.undefined
  
  /**
    * The HTTP method to use for the request. When specified, it will override HttpRequest for the task. Note that if the value is set to HttpMethod the HttpRequest of the task will be ignored at execution time.
    */
  var httpMethod: js.UndefOr[String | Null] = js.undefined
  
  /**
    * If specified, an [OAuth token](https://developers.google.com/identity/protocols/OAuth2) will be generated and attached as an `Authorization` header in the HTTP request. This type of authorization should generally only be used when calling Google APIs hosted on *.googleapis.com.
    */
  var oauthToken: js.UndefOr[SchemaOAuthToken] = js.undefined
  
  /**
    * If specified, an [OIDC](https://developers.google.com/identity/protocols/OpenIDConnect) token will be generated and attached as an `Authorization` header in the HTTP request. This type of authorization can be used for many scenarios, including calling Cloud Run, or endpoints where you intend to validate the token yourself.
    */
  var oidcToken: js.UndefOr[SchemaOidcToken] = js.undefined
  
  /**
    * Uri override. When specified modifies the execution Uri for all the tasks in the queue.
    */
  var uriOverride: js.UndefOr[SchemaUriOverride] = js.undefined
}
object SchemaHttpTarget {
  
  inline def apply(): SchemaHttpTarget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHttpTarget]
  }
  
  extension [Self <: SchemaHttpTarget](x: Self) {
    
    inline def setHeaderOverrides(value: js.Array[SchemaHeaderOverride]): Self = StObject.set(x, "headerOverrides", value.asInstanceOf[js.Any])
    
    inline def setHeaderOverridesUndefined: Self = StObject.set(x, "headerOverrides", js.undefined)
    
    inline def setHeaderOverridesVarargs(value: SchemaHeaderOverride*): Self = StObject.set(x, "headerOverrides", js.Array(value*))
    
    inline def setHttpMethod(value: String): Self = StObject.set(x, "httpMethod", value.asInstanceOf[js.Any])
    
    inline def setHttpMethodNull: Self = StObject.set(x, "httpMethod", null)
    
    inline def setHttpMethodUndefined: Self = StObject.set(x, "httpMethod", js.undefined)
    
    inline def setOauthToken(value: SchemaOAuthToken): Self = StObject.set(x, "oauthToken", value.asInstanceOf[js.Any])
    
    inline def setOauthTokenUndefined: Self = StObject.set(x, "oauthToken", js.undefined)
    
    inline def setOidcToken(value: SchemaOidcToken): Self = StObject.set(x, "oidcToken", value.asInstanceOf[js.Any])
    
    inline def setOidcTokenUndefined: Self = StObject.set(x, "oidcToken", js.undefined)
    
    inline def setUriOverride(value: SchemaUriOverride): Self = StObject.set(x, "uriOverride", value.asInstanceOf[js.Any])
    
    inline def setUriOverrideUndefined: Self = StObject.set(x, "uriOverride", js.undefined)
  }
}
