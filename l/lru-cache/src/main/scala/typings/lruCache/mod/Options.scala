package typings.lruCache.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options[K, V] extends js.Object {
  /**
    * Function that is called on items when they are dropped from the cache.
    * This can be handy if you want to close file descriptors or do other
    * cleanup tasks when items are no longer accessible. Called with `key, value`.
    * It's called before actually removing the item from the internal cache,
    * so if you want to immediately put it back in, you'll have to do that in
    * a `nextTick` or `setTimeout` callback or it won't do anything.
    */
  var dispose: js.UndefOr[js.Function2[/* key */ K, /* value */ V, Unit]] = js.undefined
  /**
    * Function that is used to calculate the length of stored items.
    * If you're storing strings or buffers, then you probably want to do
    * something like `function(n, key){return n.length}`. The default
    * is `function(){return 1}`, which is fine if you want to store
    * `max` like-sized things. The item is passed as the first argument,
    * and the key is passed as the second argument.
    */
  var length: js.UndefOr[js.Function2[/* value */ V, /* key */ js.UndefOr[K], Double]] = js.undefined
  /**
    * The maximum size of the cache, checked by applying the length
    * function to all values in the cache. Not setting this is kind of silly,
    * since that's the whole purpose of this lib, but it defaults to `Infinity`.
    */
  var max: js.UndefOr[Double] = js.undefined
  /**
    * Maximum age in ms. Items are not pro-actively pruned out as they age,
    * but if you try to get an item that is too old, it'll drop it and return
    * undefined instead of giving it to you.
    */
  var maxAge: js.UndefOr[Double] = js.undefined
  /**
    * By default, if you set a `dispose()` method, then it'll be called whenever
    * a `set()` operation overwrites an existing key. If you set this option,
    * `dispose()` will only be called when a key falls out of the cache,
    * not when it is overwritten.
    */
  var noDisposeOnSet: js.UndefOr[Boolean] = js.undefined
  /**
    * By default, if you set a `maxAge`, it'll only actually pull stale items
    * out of the cache when you `get(key)`. (That is, it's not pre-emptively
    * doing a `setTimeout` or anything.) If you set `stale:true`, it'll return
    * the stale value before deleting it. If you don't set this, then it'll
    * return `undefined` when you try to get a stale entry,
    * as if it had already been deleted.
    */
  var stale: js.UndefOr[Boolean] = js.undefined
  /**
    * When using time-expiring entries with `maxAge`, setting this to `true` will make each
    * item's effective time update to the current time whenever it is retrieved from cache,
    * causing it to not expire. (It can still fall out of cache based on recency of use, of
    * course.)
    */
  var updateAgeOnGet: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply[K, V](
    dispose: (/* key */ K, /* value */ V) => Unit = null,
    length: (/* value */ V, /* key */ js.UndefOr[K]) => Double = null,
    max: js.UndefOr[Double] = js.undefined,
    maxAge: js.UndefOr[Double] = js.undefined,
    noDisposeOnSet: js.UndefOr[Boolean] = js.undefined,
    stale: js.UndefOr[Boolean] = js.undefined,
    updateAgeOnGet: js.UndefOr[Boolean] = js.undefined
  ): Options[K, V] = {
    val __obj = js.Dynamic.literal()
    if (dispose != null) __obj.updateDynamic("dispose")(js.Any.fromFunction2(dispose))
    if (length != null) __obj.updateDynamic("length")(js.Any.fromFunction2(length))
    if (!js.isUndefined(max)) __obj.updateDynamic("max")(max.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxAge)) __obj.updateDynamic("maxAge")(maxAge.get.asInstanceOf[js.Any])
    if (!js.isUndefined(noDisposeOnSet)) __obj.updateDynamic("noDisposeOnSet")(noDisposeOnSet.get.asInstanceOf[js.Any])
    if (!js.isUndefined(stale)) __obj.updateDynamic("stale")(stale.get.asInstanceOf[js.Any])
    if (!js.isUndefined(updateAgeOnGet)) __obj.updateDynamic("updateAgeOnGet")(updateAgeOnGet.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options[K, V]]
  }
}

