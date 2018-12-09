package typings
package gulpDashCacheLib.gulpDashCacheMod.gcNs

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
      /* file */ vinylLib.vinylMod.File, 
      /* callback */ js.UndefOr[js.Function2[/* err */ js.Any, /* result */ java.lang.String, scala.Unit]], 
      java.lang.String | js.Promise[java.lang.String]
    ]
  ] = js.undefined
  /**
           * The name of the bucket which stores the cached objects.
           * Default value = 'default'
           */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Value representing the success of a task.
           */
  var success: js.UndefOr[scala.Boolean | Predicate[_]] = js.undefined
  /**
           * Content that is to be cached.
           */
  var value: js.UndefOr[
    js.Function1[/* result */ js.Any, js.Object | js.Promise[js.Object] | java.lang.String]
  ] = js.undefined
}

