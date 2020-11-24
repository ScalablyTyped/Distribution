package typings.got.mod

import typings.node.httpMod.Agent
import typings.node.urlMod.URLSearchParams
import typings.std.Record
import typings.toughCookie.mod.CookieJar
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
  implicit class GotOptionsOps[Self <: GotOptions[_], E /* <: String | Null */] (val x: Self with GotOptions[E]) extends AnyVal {
    
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
    def setAgent(value: Agent | Boolean | AgentOptions): Self = this.set("agent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAgent: Self = this.set("agent", js.undefined)
    
    @scala.inline
    def setBaseUrl(value: String): Self = this.set("baseUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBaseUrl: Self = this.set("baseUrl", js.undefined)
    
    @scala.inline
    def setCache(value: Cache): Self = this.set("cache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCache: Self = this.set("cache", js.undefined)
    
    @scala.inline
    def setCookieJar(value: CookieJar): Self = this.set("cookieJar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCookieJar: Self = this.set("cookieJar", js.undefined)
    
    @scala.inline
    def setDecompress(value: Boolean): Self = this.set("decompress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDecompress: Self = this.set("decompress", js.undefined)
    
    @scala.inline
    def setEncoding(value: E): Self = this.set("encoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncoding: Self = this.set("encoding", js.undefined)
    
    @scala.inline
    def setFollowRedirect(value: Boolean): Self = this.set("followRedirect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFollowRedirect: Self = this.set("followRedirect", js.undefined)
    
    @scala.inline
    def setQuery(value: (Record[String, _]) | URLSearchParams | String): Self = this.set("query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuery: Self = this.set("query", js.undefined)
    
    @scala.inline
    def setRequest(value: RequestFunction): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequest: Self = this.set("request", js.undefined)
    
    @scala.inline
    def setRetry(value: Double | RetryOptions): Self = this.set("retry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRetry: Self = this.set("retry", js.undefined)
    
    @scala.inline
    def setThrowHttpErrors(value: Boolean): Self = this.set("throwHttpErrors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThrowHttpErrors: Self = this.set("throwHttpErrors", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double | TimeoutOptions): Self = this.set("timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
    
    @scala.inline
    def setUseElectronNet(value: Boolean): Self = this.set("useElectronNet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseElectronNet: Self = this.set("useElectronNet", js.undefined)
  }
}
