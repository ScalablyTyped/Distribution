package typings.koaRatelimit.mod

import typings.ioredis.mod.Redis
import typings.koa.mod.Context
import typings.koaRatelimit.koaRatelimitBooleans.`false`
import typings.koaRatelimit.koaRatelimitStrings.memory
import typings.koaRatelimit.koaRatelimitStrings.redis
import typings.redis.mod.RedisClient
import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MiddlewareOptions extends js.Object {
  
  /**
    * If function returns true, 403 error is thrown
    */
  var blacklist: js.UndefOr[js.Function1[/* context */ Context, Boolean | js.Promise[Boolean]]] = js.native
  
  /**
    * The database powering the backing rate-limiter package.
    */
  var db: Redis | RedisClient | (Map[_, _]) = js.native
  
  /**
    * Whether or not to disable the usage of rate limit headers. This defaults
    * to **false**.
    */
  var disableHeader: js.UndefOr[Boolean] = js.native
  
  /**
    * Driver to use ("redis" or "memory").
    */
  var driver: redis | memory = js.native
  
  /**
    * The length of a single limiting period. This value is expressed
    * in milliseconds, defaulting to one hour.
    */
  var duration: js.UndefOr[Double] = js.native
  
  /**
    * The message used on the response body if a client is rate-limited. There is
    * a default message; which includes when they should try again.
    */
  var errorMessage: js.UndefOr[String] = js.native
  
  /**
    * A relation of header to the header's display name.
    */
  var headers: js.UndefOr[HeaderNameOptions] = js.native
  
  /**
    * Get the unique-identifier for a request. This defaults to the
    * client's IP address. Returning "false" will skip rate-limiting.
    */
  var id: js.UndefOr[js.Function1[/* context */ Context, String | `false`]] = js.native
  
  /**
    * The maximum amount of requests a client (see the `id` field) may
    * make during a limiting period. (see `duration`)
    */
  var max: js.UndefOr[Double] = js.native
  
  /**
    * Whether or not to throw an error upon being rate-limited. This uses
    * the Koa context function "throw".
    */
  var `throw`: js.UndefOr[Boolean] = js.native
  
  /**
    * If function returns true, middleware exits before limiting
    */
  var whitelist: js.UndefOr[js.Function1[/* context */ Context, Boolean | js.Promise[Boolean]]] = js.native
}
object MiddlewareOptions {
  
  @scala.inline
  def apply(db: Redis | RedisClient | (Map[_, _]), driver: redis | memory): MiddlewareOptions = {
    val __obj = js.Dynamic.literal(db = db.asInstanceOf[js.Any], driver = driver.asInstanceOf[js.Any])
    __obj.asInstanceOf[MiddlewareOptions]
  }
  
  @scala.inline
  implicit class MiddlewareOptionsOps[Self <: MiddlewareOptions] (val x: Self) extends AnyVal {
    
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
    def setDb(value: Redis | RedisClient | (Map[_, _])): Self = this.set("db", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDriver(value: redis | memory): Self = this.set("driver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlacklist(value: /* context */ Context => Boolean | js.Promise[Boolean]): Self = this.set("blacklist", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteBlacklist: Self = this.set("blacklist", js.undefined)
    
    @scala.inline
    def setDisableHeader(value: Boolean): Self = this.set("disableHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableHeader: Self = this.set("disableHeader", js.undefined)
    
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    
    @scala.inline
    def setErrorMessage(value: String): Self = this.set("errorMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorMessage: Self = this.set("errorMessage", js.undefined)
    
    @scala.inline
    def setHeaders(value: HeaderNameOptions): Self = this.set("headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    
    @scala.inline
    def setId(value: /* context */ Context => String | `false`): Self = this.set("id", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setMax(value: Double): Self = this.set("max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    
    @scala.inline
    def setThrow(value: Boolean): Self = this.set("throw", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThrow: Self = this.set("throw", js.undefined)
    
    @scala.inline
    def setWhitelist(value: /* context */ Context => Boolean | js.Promise[Boolean]): Self = this.set("whitelist", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteWhitelist: Self = this.set("whitelist", js.undefined)
  }
}
