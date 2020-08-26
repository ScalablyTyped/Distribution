package typings.koaRedisCache.mod

import typings.koa.mod.Context
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CacheOptions extends js.Object {
  /**
    * the routes to exclude, default is [].
    * example: ['/api/(.*)', '/view/:id']
    */
  var exclude: js.UndefOr[js.Array[String]] = js.native
  /**
    * redis expire time (second), default is 30 * 60 (30 min)
    */
  var expire: js.UndefOr[Double] = js.native
  /**
    * max length of body size (in bytes) to cache.
    * if the size of the body exceeds maxLength, the body will not be cached.
    * default is: Infinity
    */
  var maxLength: js.UndefOr[Double] = js.native
  /**
    * callback function for error, default is function() {}
    */
  var onerror: js.UndefOr[onErrorCallback] = js.native
  /**
    * if the passParam exists in the query string, skip the cache
    */
  var passParam: js.UndefOr[String] = js.native
  /**
    * redis key prefix, default is koa-redis-cache:
    * If a function is supplied, its signature should be function(ctx) {} and it should return a string to use as the redis key prefix
    */
  var prefix: js.UndefOr[String | getPrefixCallback] = js.native
  /**
    * redis options
    */
  var redis: js.UndefOr[RedisOptions] = js.native
  /**
    * the routes to cache, default is ['(.*)'].
    * can be set to an array of routes (string), or an array of RouteOptions
    */
  var routes: js.UndefOr[js.Array[RouteOptions | String]] = js.native
}

object CacheOptions {
  @scala.inline
  def apply(): CacheOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CacheOptions]
  }
  @scala.inline
  implicit class CacheOptionsOps[Self <: CacheOptions] (val x: Self) extends AnyVal {
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
    def setExcludeVarargs(value: String*): Self = this.set("exclude", js.Array(value :_*))
    @scala.inline
    def setExclude(value: js.Array[String]): Self = this.set("exclude", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExclude: Self = this.set("exclude", js.undefined)
    @scala.inline
    def setExpire(value: Double): Self = this.set("expire", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpire: Self = this.set("expire", js.undefined)
    @scala.inline
    def setMaxLength(value: Double): Self = this.set("maxLength", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxLength: Self = this.set("maxLength", js.undefined)
    @scala.inline
    def setOnerror(value: /* error */ Error => Unit): Self = this.set("onerror", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnerror: Self = this.set("onerror", js.undefined)
    @scala.inline
    def setPassParam(value: String): Self = this.set("passParam", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePassParam: Self = this.set("passParam", js.undefined)
    @scala.inline
    def setPrefixFunction1(value: /* ctx */ Context => String): Self = this.set("prefix", js.Any.fromFunction1(value))
    @scala.inline
    def setPrefix(value: String | getPrefixCallback): Self = this.set("prefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrefix: Self = this.set("prefix", js.undefined)
    @scala.inline
    def setRedis(value: RedisOptions): Self = this.set("redis", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRedis: Self = this.set("redis", js.undefined)
    @scala.inline
    def setRoutesVarargs(value: (RouteOptions | String)*): Self = this.set("routes", js.Array(value :_*))
    @scala.inline
    def setRoutes(value: js.Array[RouteOptions | String]): Self = this.set("routes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoutes: Self = this.set("routes", js.undefined)
  }
  
}

