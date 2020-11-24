package typings.lruCache.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options[K, V] extends js.Object {
  
  /**
    * Function that is called on items when they are dropped from the cache.
    * This can be handy if you want to close file descriptors or do other
    * cleanup tasks when items are no longer accessible. Called with `key, value`.
    * It's called before actually removing the item from the internal cache,
    * so if you want to immediately put it back in, you'll have to do that in
    * a `nextTick` or `setTimeout` callback or it won't do anything.
    */
  var dispose: js.UndefOr[js.Function2[/* key */ K, /* value */ V, Unit]] = js.native
  
  /**
    * Function that is used to calculate the length of stored items.
    * If you're storing strings or buffers, then you probably want to do
    * something like `function(n, key){return n.length}`. The default
    * is `function(){return 1}`, which is fine if you want to store
    * `max` like-sized things. The item is passed as the first argument,
    * and the key is passed as the second argument.
    */
  var length: js.UndefOr[js.Function2[/* value */ V, /* key */ js.UndefOr[K], Double]] = js.native
  
  /**
    * The maximum size of the cache, checked by applying the length
    * function to all values in the cache. Not setting this is kind of silly,
    * since that's the whole purpose of this lib, but it defaults to `Infinity`.
    */
  var max: js.UndefOr[Double] = js.native
  
  /**
    * Maximum age in ms. Items are not pro-actively pruned out as they age,
    * but if you try to get an item that is too old, it'll drop it and return
    * undefined instead of giving it to you.
    */
  var maxAge: js.UndefOr[Double] = js.native
  
  /**
    * By default, if you set a `dispose()` method, then it'll be called whenever
    * a `set()` operation overwrites an existing key. If you set this option,
    * `dispose()` will only be called when a key falls out of the cache,
    * not when it is overwritten.
    */
  var noDisposeOnSet: js.UndefOr[Boolean] = js.native
  
  /**
    * By default, if you set a `maxAge`, it'll only actually pull stale items
    * out of the cache when you `get(key)`. (That is, it's not pre-emptively
    * doing a `setTimeout` or anything.) If you set `stale:true`, it'll return
    * the stale value before deleting it. If you don't set this, then it'll
    * return `undefined` when you try to get a stale entry,
    * as if it had already been deleted.
    */
  var stale: js.UndefOr[Boolean] = js.native
  
  /**
    * When using time-expiring entries with `maxAge`, setting this to `true` will make each
    * item's effective time update to the current time whenever it is retrieved from cache,
    * causing it to not expire. (It can still fall out of cache based on recency of use, of
    * course.)
    */
  var updateAgeOnGet: js.UndefOr[Boolean] = js.native
}
object Options {
  
  @scala.inline
  def apply[K, V](): Options[K, V] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options[K, V]]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options[_, _], K, V] (val x: Self with (Options[K, V])) extends AnyVal {
    
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
    def setDispose(value: (/* key */ K, /* value */ V) => Unit): Self = this.set("dispose", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteDispose: Self = this.set("dispose", js.undefined)
    
    @scala.inline
    def setLength(value: (/* value */ V, /* key */ js.UndefOr[K]) => Double): Self = this.set("length", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteLength: Self = this.set("length", js.undefined)
    
    @scala.inline
    def setMax(value: Double): Self = this.set("max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    
    @scala.inline
    def setMaxAge(value: Double): Self = this.set("maxAge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxAge: Self = this.set("maxAge", js.undefined)
    
    @scala.inline
    def setNoDisposeOnSet(value: Boolean): Self = this.set("noDisposeOnSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoDisposeOnSet: Self = this.set("noDisposeOnSet", js.undefined)
    
    @scala.inline
    def setStale(value: Boolean): Self = this.set("stale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStale: Self = this.set("stale", js.undefined)
    
    @scala.inline
    def setUpdateAgeOnGet(value: Boolean): Self = this.set("updateAgeOnGet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateAgeOnGet: Self = this.set("updateAgeOnGet", js.undefined)
  }
}
