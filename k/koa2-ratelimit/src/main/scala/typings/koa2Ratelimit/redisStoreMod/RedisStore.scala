package typings.koa2Ratelimit.redisStoreMod

import typings.koa2Ratelimit.anon.Counter
import typings.koa2Ratelimit.anon.RateLimitOptionskeystring
import typings.koa2Ratelimit.mod.RateLimitOptions
import typings.koa2Ratelimit.storeMod.Store
import typings.redis.mod.RedisClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RedisStore extends Store {
  
  var client: RedisClient = js.native
}
object RedisStore {
  
  @scala.inline
  def apply(
    client: RedisClient,
    decrement: (String, RateLimitOptions, Double) => js.Promise[Unit],
    incr: (String, RateLimitOptions, Double) => js.Promise[Counter],
    saveAbuse: RateLimitOptionskeystring => js.Promise[Unit] | Unit
  ): RedisStore = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], decrement = js.Any.fromFunction3(decrement), incr = js.Any.fromFunction3(incr), saveAbuse = js.Any.fromFunction1(saveAbuse))
    __obj.asInstanceOf[RedisStore]
  }
  
  @scala.inline
  implicit class RedisStoreOps[Self <: RedisStore] (val x: Self) extends AnyVal {
    
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
    def setClient(value: RedisClient): Self = this.set("client", value.asInstanceOf[js.Any])
  }
}
