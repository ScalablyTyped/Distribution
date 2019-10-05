package typings.koaDashRedisDashCache.koaDashRedisDashCacheMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CacheOptions extends js.Object {
  /**
    * the routes to exclude, default is [].
    * example: ['/api/(.*)', '/view/:id']
    */
  var exclude: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * redis expire time (second), default is 30 * 60 (30 min)
    */
  var expire: js.UndefOr[Double] = js.undefined
  /**
    * max length of body size (in bytes) to cache.
    * if the size of the body exceeds maxLength, the body will not be cached.
    * default is: Infinity
    */
  var maxLength: js.UndefOr[Double] = js.undefined
  /**
    * callback function for error, default is function() {}
    */
  var onerror: js.UndefOr[onErrorCallback] = js.undefined
  /**
    * if the passParam exists in the query string, skip the cache
    */
  var passParam: js.UndefOr[String] = js.undefined
  /**
    * redis key prefix, default is koa-redis-cache:
    * If a function is supplied, its signature should be function(ctx) {} and it should return a string to use as the redis key prefix
    */
  var prefix: js.UndefOr[String | getPrefixCallback] = js.undefined
  /**
    * redis options
    */
  var redis: js.UndefOr[RedisOptions] = js.undefined
  /**
    * the routes to cache, default is ['(.*)'].
    * can be set to an array of routes (string), or an array of RouteOptions
    */
  var routes: js.UndefOr[js.Array[RouteOptions | String]] = js.undefined
}

object CacheOptions {
  @scala.inline
  def apply(
    exclude: js.Array[String] = null,
    expire: Int | Double = null,
    maxLength: Int | Double = null,
    onerror: /* error */ Error => Unit = null,
    passParam: String = null,
    prefix: String | getPrefixCallback = null,
    redis: RedisOptions = null,
    routes: js.Array[RouteOptions | String] = null
  ): CacheOptions = {
    val __obj = js.Dynamic.literal()
    if (exclude != null) __obj.updateDynamic("exclude")(exclude)
    if (expire != null) __obj.updateDynamic("expire")(expire.asInstanceOf[js.Any])
    if (maxLength != null) __obj.updateDynamic("maxLength")(maxLength.asInstanceOf[js.Any])
    if (onerror != null) __obj.updateDynamic("onerror")(js.Any.fromFunction1(onerror))
    if (passParam != null) __obj.updateDynamic("passParam")(passParam)
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (redis != null) __obj.updateDynamic("redis")(redis)
    if (routes != null) __obj.updateDynamic("routes")(routes)
    __obj.asInstanceOf[CacheOptions]
  }
}

