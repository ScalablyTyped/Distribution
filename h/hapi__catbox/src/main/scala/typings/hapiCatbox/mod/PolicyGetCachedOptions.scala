package typings.hapiCatbox.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PolicyGetCachedOptions[T] extends js.Object {
  
  /** isStale - true if the item is stale. */
  var isStale: Boolean = js.native
  
  /** item - the cached value. */
  var item: T = js.native
  
  /** stored - the timestamp when the item was stored in the cache. */
  var stored: Double = js.native
  
  /** ttl - the cache ttl value for the record. */
  var ttl: Double = js.native
}
object PolicyGetCachedOptions {
  
  @scala.inline
  def apply[T](isStale: Boolean, item: T, stored: Double, ttl: Double): PolicyGetCachedOptions[T] = {
    val __obj = js.Dynamic.literal(isStale = isStale.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], stored = stored.asInstanceOf[js.Any], ttl = ttl.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolicyGetCachedOptions[T]]
  }
  
  @scala.inline
  implicit class PolicyGetCachedOptionsOps[Self <: PolicyGetCachedOptions[_], T] (val x: Self with PolicyGetCachedOptions[T]) extends AnyVal {
    
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
    def setIsStale(value: Boolean): Self = this.set("isStale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem(value: T): Self = this.set("item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStored(value: Double): Self = this.set("stored", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTtl(value: Double): Self = this.set("ttl", value.asInstanceOf[js.Any])
  }
}
