package typings.got.mod

import typings.node.httpMod.Agent
import typings.node.urlMod.URLSearchParams
import typings.std.Record
import typings.toughCookie.mod.CookieJar
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GotOptions[E /* <: String | Null */]
  extends StObject
     with InternalRequestOptions {
  
  @JSName("agent")
  var agent_GotOptions: js.UndefOr[Agent | Boolean | AgentOptions] = js.undefined
  
  var baseUrl: js.UndefOr[String] = js.undefined
  
  var cache: js.UndefOr[Cache] = js.undefined
  
  var cookieJar: js.UndefOr[CookieJar] = js.undefined
  
  var decompress: js.UndefOr[Boolean] = js.undefined
  
  var encoding: js.UndefOr[E] = js.undefined
  
  var followRedirect: js.UndefOr[Boolean] = js.undefined
  
  var query: js.UndefOr[(Record[String, js.Any]) | URLSearchParams | String] = js.undefined
  
  var request: js.UndefOr[RequestFunction] = js.undefined
  
  var retry: js.UndefOr[Double | RetryOptions] = js.undefined
  
  var throwHttpErrors: js.UndefOr[Boolean] = js.undefined
  
  @JSName("timeout")
  var timeout_GotOptions: js.UndefOr[Double | TimeoutOptions] = js.undefined
  
  var useElectronNet: js.UndefOr[Boolean] = js.undefined
}
object GotOptions {
  
  inline def apply[E /* <: String | Null */](): GotOptions[E] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GotOptions[E]]
  }
  
  extension [Self <: GotOptions[?], E /* <: String | Null */](x: Self & GotOptions[E]) {
    
    inline def setAgent(value: Agent | Boolean | AgentOptions): Self = StObject.set(x, "agent", value.asInstanceOf[js.Any])
    
    inline def setAgentUndefined: Self = StObject.set(x, "agent", js.undefined)
    
    inline def setBaseUrl(value: String): Self = StObject.set(x, "baseUrl", value.asInstanceOf[js.Any])
    
    inline def setBaseUrlUndefined: Self = StObject.set(x, "baseUrl", js.undefined)
    
    inline def setCache(value: Cache): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
    
    inline def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
    
    inline def setCookieJar(value: CookieJar): Self = StObject.set(x, "cookieJar", value.asInstanceOf[js.Any])
    
    inline def setCookieJarUndefined: Self = StObject.set(x, "cookieJar", js.undefined)
    
    inline def setDecompress(value: Boolean): Self = StObject.set(x, "decompress", value.asInstanceOf[js.Any])
    
    inline def setDecompressUndefined: Self = StObject.set(x, "decompress", js.undefined)
    
    inline def setEncoding(value: E): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
    
    inline def setFollowRedirect(value: Boolean): Self = StObject.set(x, "followRedirect", value.asInstanceOf[js.Any])
    
    inline def setFollowRedirectUndefined: Self = StObject.set(x, "followRedirect", js.undefined)
    
    inline def setQuery(value: (Record[String, js.Any]) | URLSearchParams | String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    
    inline def setRequest(value: RequestFunction): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
    
    inline def setRetry(value: Double | RetryOptions): Self = StObject.set(x, "retry", value.asInstanceOf[js.Any])
    
    inline def setRetryUndefined: Self = StObject.set(x, "retry", js.undefined)
    
    inline def setThrowHttpErrors(value: Boolean): Self = StObject.set(x, "throwHttpErrors", value.asInstanceOf[js.Any])
    
    inline def setThrowHttpErrorsUndefined: Self = StObject.set(x, "throwHttpErrors", js.undefined)
    
    inline def setTimeout(value: Double | TimeoutOptions): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    inline def setUseElectronNet(value: Boolean): Self = StObject.set(x, "useElectronNet", value.asInstanceOf[js.Any])
    
    inline def setUseElectronNetUndefined: Self = StObject.set(x, "useElectronNet", js.undefined)
  }
}
