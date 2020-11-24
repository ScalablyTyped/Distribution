package typings.koa2Ratelimit.anon

import typings.koa.mod.Context
import typings.koa2Ratelimit.mod.TimeKeyObject
import typings.koa2Ratelimit.storeMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<koa2-ratelimit.koa2-ratelimit.RateLimitOptions> */
@js.native
trait PartialRateLimitOptions extends js.Object {
  
  var delayAfter: js.UndefOr[Double] = js.native
  
  var getUserId: js.UndefOr[js.Function1[/* ctx */ Context, js.Promise[_]]] = js.native
  
  var handler: js.UndefOr[js.Function1[/* ctx */ Context, js.Promise[Unit]]] = js.native
  
  var headers: js.UndefOr[Boolean] = js.native
  
  var interval: js.UndefOr[TimeKeyObject | Double] = js.native
  
  var keyGenerator: js.UndefOr[js.Function1[/* ctx */ Context, js.Promise[String]]] = js.native
  
  var max: js.UndefOr[Double] = js.native
  
  var message: js.UndefOr[String] = js.native
  
  var onLimitReached: js.UndefOr[js.Function1[/* ctx */ Context, js.Promise[Unit]]] = js.native
  
  var prefixKey: js.UndefOr[String] = js.native
  
  var skip: js.UndefOr[js.Function1[/* ctx */ Context, js.Promise[Boolean]]] = js.native
  
  var skipFailedRequests: js.UndefOr[Boolean] = js.native
  
  var statusCode: js.UndefOr[Double] = js.native
  
  var store: js.UndefOr[^] = js.native
  
  var timeWait: js.UndefOr[TimeKeyObject | Double] = js.native
  
  var weight: js.UndefOr[js.Function1[/* ctx */ Context, js.Promise[Double]]] = js.native
  
  var whitelist: js.UndefOr[js.Array[String]] = js.native
}
object PartialRateLimitOptions {
  
  @scala.inline
  def apply(): PartialRateLimitOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialRateLimitOptions]
  }
  
  @scala.inline
  implicit class PartialRateLimitOptionsOps[Self <: PartialRateLimitOptions] (val x: Self) extends AnyVal {
    
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
    def setDelayAfter(value: Double): Self = this.set("delayAfter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDelayAfter: Self = this.set("delayAfter", js.undefined)
    
    @scala.inline
    def setGetUserId(value: /* ctx */ Context => js.Promise[_]): Self = this.set("getUserId", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteGetUserId: Self = this.set("getUserId", js.undefined)
    
    @scala.inline
    def setHandler(value: /* ctx */ Context => js.Promise[Unit]): Self = this.set("handler", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteHandler: Self = this.set("handler", js.undefined)
    
    @scala.inline
    def setHeaders(value: Boolean): Self = this.set("headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    
    @scala.inline
    def setInterval(value: TimeKeyObject | Double): Self = this.set("interval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInterval: Self = this.set("interval", js.undefined)
    
    @scala.inline
    def setKeyGenerator(value: /* ctx */ Context => js.Promise[String]): Self = this.set("keyGenerator", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteKeyGenerator: Self = this.set("keyGenerator", js.undefined)
    
    @scala.inline
    def setMax(value: Double): Self = this.set("max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
    
    @scala.inline
    def setOnLimitReached(value: /* ctx */ Context => js.Promise[Unit]): Self = this.set("onLimitReached", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnLimitReached: Self = this.set("onLimitReached", js.undefined)
    
    @scala.inline
    def setPrefixKey(value: String): Self = this.set("prefixKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrefixKey: Self = this.set("prefixKey", js.undefined)
    
    @scala.inline
    def setSkip(value: /* ctx */ Context => js.Promise[Boolean]): Self = this.set("skip", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSkip: Self = this.set("skip", js.undefined)
    
    @scala.inline
    def setSkipFailedRequests(value: Boolean): Self = this.set("skipFailedRequests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkipFailedRequests: Self = this.set("skipFailedRequests", js.undefined)
    
    @scala.inline
    def setStatusCode(value: Double): Self = this.set("statusCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatusCode: Self = this.set("statusCode", js.undefined)
    
    @scala.inline
    def setStore(value: ^): Self = this.set("store", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStore: Self = this.set("store", js.undefined)
    
    @scala.inline
    def setTimeWait(value: TimeKeyObject | Double): Self = this.set("timeWait", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeWait: Self = this.set("timeWait", js.undefined)
    
    @scala.inline
    def setWeight(value: /* ctx */ Context => js.Promise[Double]): Self = this.set("weight", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteWeight: Self = this.set("weight", js.undefined)
    
    @scala.inline
    def setWhitelistVarargs(value: String*): Self = this.set("whitelist", js.Array(value :_*))
    
    @scala.inline
    def setWhitelist(value: js.Array[String]): Self = this.set("whitelist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWhitelist: Self = this.set("whitelist", js.undefined)
  }
}
