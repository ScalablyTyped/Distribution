package typings.gulpDashCache.gulpDashCacheMod.gcNs

import typings.vinyl.vinylMod.File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGulpCacheOptions extends js.Object {
  /**
    * The cache instance to use for caching.
    */
  var fileCache: js.UndefOr[IGulpCache] = js.undefined
  /**
    * The hash generator to use.
    */
  var key: js.UndefOr[
    js.Function2[
      /* file */ File, 
      /* callback */ js.UndefOr[js.Function2[/* err */ js.Any, /* result */ String, Unit]], 
      String | js.Promise[String]
    ]
  ] = js.undefined
  /**
    * The name of the bucket which stores the cached objects.
    * Default value = 'default'
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * Value representing the success of a task.
    */
  var success: js.UndefOr[Boolean | Predicate[_]] = js.undefined
  /**
    * Content that is to be cached.
    */
  var value: js.UndefOr[js.Function1[/* result */ js.Any, js.Object | js.Promise[js.Object] | String]] = js.undefined
}

object IGulpCacheOptions {
  @scala.inline
  def apply(
    fileCache: IGulpCache = null,
    key: (/* file */ File, /* callback */ js.UndefOr[js.Function2[/* err */ js.Any, /* result */ String, Unit]]) => String | js.Promise[String] = null,
    name: String = null,
    success: Boolean | Predicate[_] = null,
    value: /* result */ js.Any => js.Object | js.Promise[js.Object] | String = null
  ): IGulpCacheOptions = {
    val __obj = js.Dynamic.literal()
    if (fileCache != null) __obj.updateDynamic("fileCache")(fileCache)
    if (key != null) __obj.updateDynamic("key")(js.Any.fromFunction2(key))
    if (name != null) __obj.updateDynamic("name")(name)
    if (success != null) __obj.updateDynamic("success")(success.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(js.Any.fromFunction1(value))
    __obj.asInstanceOf[IGulpCacheOptions]
  }
}

