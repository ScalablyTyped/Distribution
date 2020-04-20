package typings.hapiCatboxMemcached.mod

import typings.hapiCatbox.mod.CacheKey
import typings.hapiCatbox.mod.CachedObject
import typings.hapiCatbox.mod.ClientApi
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CatboxMemcached[T] extends ClientApi[T] {
  def generateKey(key: CacheKey): String
}

object CatboxMemcached {
  @scala.inline
  def apply[T](
    drop: CacheKey => js.Promise[Unit],
    generateKey: CacheKey => String,
    get: CacheKey => js.Promise[Null | CachedObject[T]],
    isReady: () => Boolean,
    set: (CacheKey, T, Double) => js.Promise[Unit],
    start: () => js.Promise[Unit],
    stop: () => Unit,
    validateSegmentName: String => Null | Error
  ): CatboxMemcached[T] = {
    val __obj = js.Dynamic.literal(drop = js.Any.fromFunction1(drop), generateKey = js.Any.fromFunction1(generateKey), get = js.Any.fromFunction1(get), isReady = js.Any.fromFunction0(isReady), set = js.Any.fromFunction3(set), start = js.Any.fromFunction0(start), stop = js.Any.fromFunction0(stop), validateSegmentName = js.Any.fromFunction1(validateSegmentName))
    __obj.asInstanceOf[CatboxMemcached[T]]
  }
}

