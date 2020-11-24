package typings.koa2Ratelimit.mod

import typings.koa.mod.Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RateLimitOptions extends js.Object {
  
  var delayAfter: Double = js.native
  
  def getUserId(ctx: Context): js.Promise[_] = js.native
  
  def handler(ctx: Context): js.Promise[Unit] = js.native
  
  var headers: Boolean = js.native
  
  var interval: TimeKeyObject | Double = js.native
  
  def keyGenerator(ctx: Context): js.Promise[String] = js.native
  
  var max: Double = js.native
  
  var message: String = js.native
  
  def onLimitReached(ctx: Context): js.Promise[Unit] = js.native
  
  var prefixKey: String = js.native
  
  def skip(ctx: Context): js.Promise[Boolean] = js.native
  
  var skipFailedRequests: Boolean = js.native
  
  var statusCode: Double = js.native
  
  var store: typings.koa2Ratelimit.storeMod.^ = js.native
  
  var timeWait: TimeKeyObject | Double = js.native
  
  def weight(ctx: Context): js.Promise[Double] = js.native
  
  var whitelist: js.Array[String] = js.native
}
object RateLimitOptions {
  
  @scala.inline
  def apply(
    delayAfter: Double,
    getUserId: Context => js.Promise[_],
    handler: Context => js.Promise[Unit],
    headers: Boolean,
    interval: TimeKeyObject | Double,
    keyGenerator: Context => js.Promise[String],
    max: Double,
    message: String,
    onLimitReached: Context => js.Promise[Unit],
    prefixKey: String,
    skip: Context => js.Promise[Boolean],
    skipFailedRequests: Boolean,
    statusCode: Double,
    store: typings.koa2Ratelimit.storeMod.^,
    timeWait: TimeKeyObject | Double,
    weight: Context => js.Promise[Double],
    whitelist: js.Array[String]
  ): RateLimitOptions = {
    val __obj = js.Dynamic.literal(delayAfter = delayAfter.asInstanceOf[js.Any], getUserId = js.Any.fromFunction1(getUserId), handler = js.Any.fromFunction1(handler), headers = headers.asInstanceOf[js.Any], interval = interval.asInstanceOf[js.Any], keyGenerator = js.Any.fromFunction1(keyGenerator), max = max.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], onLimitReached = js.Any.fromFunction1(onLimitReached), prefixKey = prefixKey.asInstanceOf[js.Any], skip = js.Any.fromFunction1(skip), skipFailedRequests = skipFailedRequests.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any], store = store.asInstanceOf[js.Any], timeWait = timeWait.asInstanceOf[js.Any], weight = js.Any.fromFunction1(weight), whitelist = whitelist.asInstanceOf[js.Any])
    __obj.asInstanceOf[RateLimitOptions]
  }
  
  @scala.inline
  implicit class RateLimitOptionsOps[Self <: RateLimitOptions] (val x: Self) extends AnyVal {
    
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
    def setGetUserId(value: Context => js.Promise[_]): Self = this.set("getUserId", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHandler(value: Context => js.Promise[Unit]): Self = this.set("handler", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHeaders(value: Boolean): Self = this.set("headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInterval(value: TimeKeyObject | Double): Self = this.set("interval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyGenerator(value: Context => js.Promise[String]): Self = this.set("keyGenerator", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMax(value: Double): Self = this.set("max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnLimitReached(value: Context => js.Promise[Unit]): Self = this.set("onLimitReached", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPrefixKey(value: String): Self = this.set("prefixKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkip(value: Context => js.Promise[Boolean]): Self = this.set("skip", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSkipFailedRequests(value: Boolean): Self = this.set("skipFailedRequests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusCode(value: Double): Self = this.set("statusCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStore(value: typings.koa2Ratelimit.storeMod.^): Self = this.set("store", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeWait(value: TimeKeyObject | Double): Self = this.set("timeWait", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeight(value: Context => js.Promise[Double]): Self = this.set("weight", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWhitelistVarargs(value: String*): Self = this.set("whitelist", js.Array(value :_*))
    
    @scala.inline
    def setWhitelist(value: js.Array[String]): Self = this.set("whitelist", value.asInstanceOf[js.Any])
  }
}
