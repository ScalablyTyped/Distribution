package typings.lruCache.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LimitedByTTL
  extends StObject
     with SafetyBounds[Any, Any] {
  
  /**
    * Return stale items from cache.get() before disposing of them.
    * Return stale values from cache.fetch() while performing a call
    * to the `fetchMethod` in the background.
    *
    * @default false
    */
  var allowStale: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Do not delete stale items when they are retrieved with cache.get()
    * Note that the get() return value will still be `undefined` unless
    * allowStale is true.
    *
    * @default false
    * @since 7.11.0
    */
  var noDeleteOnStaleGet: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Boolean flag to tell the cache to not update the TTL when
    * setting a new value for an existing key (ie, when updating a value
    * rather than inserting a new value).  Note that the TTL value is
    * _always_ set (if provided) when adding a new entry into the cache.
    *
    * @default false
    * @since 7.4.0
    */
  var noUpdateTTL: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Max time in milliseconds for items to live in cache before they are
    * considered stale.  Note that stale items are NOT preemptively removed
    * by default, and MAY live in the cache, contributing to its LRU max,
    * long after they have expired.
    *
    * Also, as this cache is optimized for LRU/MRU operations, some of
    * the staleness/TTL checks will reduce performance, as they will incur
    * overhead by deleting items.
    *
    * Must be an integer number of ms, defaults to 0, which means "no TTL"
    */
  var ttl: Double
  
  /**
    * Preemptively remove stale items from the cache.
    * Note that this may significantly degrade performance,
    * especially if the cache is storing a large number of items.
    * It is almost always best to just leave the stale items in
    * the cache, and let them fall out as new items are added.
    *
    * Note that this means that allowStale is a bit pointless,
    * as stale items will be deleted almost as soon as they expire.
    *
    * Use with caution!
    *
    * @default false
    * @since 7.1.0
    */
  var ttlAutopurge: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Minimum amount of time in ms in which to check for staleness.
    * Defaults to 1, which means that the current time is checked
    * at most once per millisecond.
    *
    * Set to 0 to check the current time every time staleness is tested.
    * (This reduces performance, and is theoretically unnecessary.)
    *
    * Setting this to a higher value will improve performance somewhat
    * while using ttl tracking, albeit at the expense of keeping stale
    * items around a bit longer than intended.
    *
    * @default 1
    * @since 7.1.0
    */
  var ttlResolution: js.UndefOr[Double] = js.undefined
  
  /**
    * Update the age of items on cache.get(), renewing their TTL
    *
    * @default false
    */
  var updateAgeOnGet: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Update the age of items on cache.has(), renewing their TTL
    *
    * @default false
    */
  var updateAgeOnHas: js.UndefOr[Boolean] = js.undefined
}
object LimitedByTTL {
  
  inline def apply(ttl: Double): LimitedByTTL = {
    val __obj = js.Dynamic.literal(ttl = ttl.asInstanceOf[js.Any])
    __obj.asInstanceOf[LimitedByTTL]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LimitedByTTL] (val x: Self) extends AnyVal {
    
    inline def setAllowStale(value: Boolean): Self = StObject.set(x, "allowStale", value.asInstanceOf[js.Any])
    
    inline def setAllowStaleUndefined: Self = StObject.set(x, "allowStale", js.undefined)
    
    inline def setNoDeleteOnStaleGet(value: Boolean): Self = StObject.set(x, "noDeleteOnStaleGet", value.asInstanceOf[js.Any])
    
    inline def setNoDeleteOnStaleGetUndefined: Self = StObject.set(x, "noDeleteOnStaleGet", js.undefined)
    
    inline def setNoUpdateTTL(value: Boolean): Self = StObject.set(x, "noUpdateTTL", value.asInstanceOf[js.Any])
    
    inline def setNoUpdateTTLUndefined: Self = StObject.set(x, "noUpdateTTL", js.undefined)
    
    inline def setTtl(value: Double): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
    
    inline def setTtlAutopurge(value: Boolean): Self = StObject.set(x, "ttlAutopurge", value.asInstanceOf[js.Any])
    
    inline def setTtlAutopurgeUndefined: Self = StObject.set(x, "ttlAutopurge", js.undefined)
    
    inline def setTtlResolution(value: Double): Self = StObject.set(x, "ttlResolution", value.asInstanceOf[js.Any])
    
    inline def setTtlResolutionUndefined: Self = StObject.set(x, "ttlResolution", js.undefined)
    
    inline def setUpdateAgeOnGet(value: Boolean): Self = StObject.set(x, "updateAgeOnGet", value.asInstanceOf[js.Any])
    
    inline def setUpdateAgeOnGetUndefined: Self = StObject.set(x, "updateAgeOnGet", js.undefined)
    
    inline def setUpdateAgeOnHas(value: Boolean): Self = StObject.set(x, "updateAgeOnHas", value.asInstanceOf[js.Any])
    
    inline def setUpdateAgeOnHasUndefined: Self = StObject.set(x, "updateAgeOnHas", js.undefined)
  }
}
