package typings.got.mod

import typings.node.httpMod.Agent
import typings.node.urlMod.URLSearchParams
import typings.std.Record
import typings.toughCookie.mod.CookieJar
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GotOptions[E /* <: String | Null */] extends InternalRequestOptions {
  
  @JSName("agent")
  var agent_GotOptions: js.UndefOr[Agent | Boolean | AgentOptions] = js.native
  
  var baseUrl: js.UndefOr[String] = js.native
  
  var cache: js.UndefOr[Cache] = js.native
  
  var cookieJar: js.UndefOr[CookieJar] = js.native
  
  var decompress: js.UndefOr[Boolean] = js.native
  
  var encoding: js.UndefOr[E] = js.native
  
  var followRedirect: js.UndefOr[Boolean] = js.native
  
  var query: js.UndefOr[(Record[String, _]) | URLSearchParams | String] = js.native
  
  var request: js.UndefOr[RequestFunction] = js.native
  
  var retry: js.UndefOr[Double | RetryOptions] = js.native
  
  var throwHttpErrors: js.UndefOr[Boolean] = js.native
  
  @JSName("timeout")
  var timeout_GotOptions: js.UndefOr[Double | TimeoutOptions] = js.native
  
  var useElectronNet: js.UndefOr[Boolean] = js.native
}
object GotOptions {
  
  @scala.inline
  def apply[E /* <: String | Null */](): GotOptions[E] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GotOptions[E]]
  }
  
  @scala.inline
  implicit class GotOptionsMutableBuilder[Self <: GotOptions[_], E /* <: String | Null */] (val x: Self with GotOptions[E]) extends AnyVal {
    
    @scala.inline
    def setAgent(value: Agent | Boolean | AgentOptions): Self = StObject.set(x, "agent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAgentUndefined: Self = StObject.set(x, "agent", js.undefined)
    
    @scala.inline
    def setBaseUrl(value: String): Self = StObject.set(x, "baseUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaseUrlUndefined: Self = StObject.set(x, "baseUrl", js.undefined)
    
    @scala.inline
    def setCache(value: Cache): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
    
    @scala.inline
    def setCookieJar(value: CookieJar): Self = StObject.set(x, "cookieJar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCookieJarUndefined: Self = StObject.set(x, "cookieJar", js.undefined)
    
    @scala.inline
    def setDecompress(value: Boolean): Self = StObject.set(x, "decompress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDecompressUndefined: Self = StObject.set(x, "decompress", js.undefined)
    
    @scala.inline
    def setEncoding(value: E): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
    
    @scala.inline
    def setFollowRedirect(value: Boolean): Self = StObject.set(x, "followRedirect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFollowRedirectUndefined: Self = StObject.set(x, "followRedirect", js.undefined)
    
    @scala.inline
    def setQuery(value: (Record[String, _]) | URLSearchParams | String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    
    @scala.inline
    def setRequest(value: RequestFunction): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
    
    @scala.inline
    def setRetry(value: Double | RetryOptions): Self = StObject.set(x, "retry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetryUndefined: Self = StObject.set(x, "retry", js.undefined)
    
    @scala.inline
    def setThrowHttpErrors(value: Boolean): Self = StObject.set(x, "throwHttpErrors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThrowHttpErrorsUndefined: Self = StObject.set(x, "throwHttpErrors", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double | TimeoutOptions): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    @scala.inline
    def setUseElectronNet(value: Boolean): Self = StObject.set(x, "useElectronNet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseElectronNetUndefined: Self = StObject.set(x, "useElectronNet", js.undefined)
  }
}
