package typings.koaCash.mod

import typings.koa.mod.Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  /**
    * If a truthy value is passed, then compression will be enabled.
    * @default false
    */
  var compression: js.UndefOr[Boolean] = js.native
  
  /**
    * Get a value from a store. Must return a Promise, which returns the cache's value, if any.
    * @param key Cache key
    * @param maxAge Max age (in milliseconds) for the cache
    */
  def get(key: String, maxAge: Double): js.Promise[js.UndefOr[_]] = js.native
  
  /**
    * A hashing function. By default, it caches based on the URL.
    * @default
    * ```
    * function hash(ctx) {
    *   return ctx.response.url; // same as ctx.url
    * }
    * ```
    */
  var hash: js.UndefOr[js.Function1[/* ctx */ Context, String]] = js.native
  
  /**
    * Default max age (in milliseconds) for the cache if not set via `await ctx.cashed(maxAge)`.
    */
  var maxAge: js.UndefOr[Double] = js.native
  
  /**
    * Set a value to a store. Must return a Promise.\
    * Note: `maxAge` is set by `.cash = { maxAge }`. If it's not set, then `maxAge` will be `0`,
    * which you should then ignore.
    * @param key Cache key
    * @param value Cached value
    * @param maxAge Max age (in milliseconds) for the cache
    */
  def set(key: String, value: js.Any, maxAge: Double): js.Promise[Unit] = js.native
  
  /**
    * If a truthy value is passed, then X-Cached-Response header will be set as HIT when response
    * is served from the cache.
    * @default false
    */
  var setCachedHeader: js.UndefOr[Boolean] = js.native
  
  /**
    * Minimum byte size to compress response bodies. Default 1kb.
    * @default 1000
    */
  var threshold: js.UndefOr[Double] = js.native
}
object Options {
  
  @scala.inline
  def apply(
    get: (String, Double) => js.Promise[js.UndefOr[_]],
    set: (String, js.Any, Double) => js.Promise[Unit]
  ): Options = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction2(get), set = js.Any.fromFunction3(set))
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setGet(value: (String, Double) => js.Promise[js.UndefOr[_]]): Self = this.set("get", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSet(value: (String, js.Any, Double) => js.Promise[Unit]): Self = this.set("set", js.Any.fromFunction3(value))
    
    @scala.inline
    def setCompression(value: Boolean): Self = this.set("compression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompression: Self = this.set("compression", js.undefined)
    
    @scala.inline
    def setHash(value: /* ctx */ Context => String): Self = this.set("hash", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteHash: Self = this.set("hash", js.undefined)
    
    @scala.inline
    def setMaxAge(value: Double): Self = this.set("maxAge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxAge: Self = this.set("maxAge", js.undefined)
    
    @scala.inline
    def setSetCachedHeader(value: Boolean): Self = this.set("setCachedHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSetCachedHeader: Self = this.set("setCachedHeader", js.undefined)
    
    @scala.inline
    def setThreshold(value: Double): Self = this.set("threshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThreshold: Self = this.set("threshold", js.undefined)
  }
}
