package typings.ipfsCore.tlruMod

import typings.ipfsCore.anon.Has
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Time Aware Least Recent Used Cache
  *
  * @see https://arxiv.org/pdf/1801.00390
  * @todo move this to ipfs-utils or it's own package
  *
  * @template T
  * @class TLRU
  */
@js.native
trait TLRU[T] extends js.Object {
  
  /**
    * Clears the cache
    *
    * @memberof TLRU
    */
  def clear(): Unit = js.native
  
  /**
    * Get the value from the a key
    *
    * @param {string} key
    * @returns {T|undefined}
    * @memberof TLoRU
    */
  def get(key: String): js.UndefOr[T] = js.native
  
  /**
    * Find if the cache has the key
    *
    * @param {string} key
    * @returns {boolean}
    */
  def has(key: String): Boolean = js.native
  
  var lru: Has = js.native
  
  /**
    * Remove key
    *
    * @param {string} key
    */
  def remove(key: String): Unit = js.native
  
  /**
    * Set a key value pair
    *
    * @param {string} key
    * @param {T} value
    * @param {number} ttl - in miliseconds
    * @returns {void}
    */
  def set(key: String, value: T, ttl: Double): Unit = js.native
}
object TLRU {
  
  @scala.inline
  def apply[T](
    clear: () => Unit,
    get: String => js.UndefOr[T],
    has: String => Boolean,
    lru: Has,
    remove: String => Unit,
    set: (String, T, Double) => Unit
  ): TLRU[T] = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), get = js.Any.fromFunction1(get), has = js.Any.fromFunction1(has), lru = lru.asInstanceOf[js.Any], remove = js.Any.fromFunction1(remove), set = js.Any.fromFunction3(set))
    __obj.asInstanceOf[TLRU[T]]
  }
  
  @scala.inline
  implicit class TLRUOps[Self <: TLRU[_], T] (val x: Self with TLRU[T]) extends AnyVal {
    
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
    def setClear(value: () => Unit): Self = this.set("clear", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet(value: String => js.UndefOr[T]): Self = this.set("get", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHas(value: String => Boolean): Self = this.set("has", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLru(value: Has): Self = this.set("lru", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemove(value: String => Unit): Self = this.set("remove", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSet(value: (String, T, Double) => Unit): Self = this.set("set", js.Any.fromFunction3(value))
  }
}
