package typings.libp2pGossipsub.interfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Book[K, V] extends js.Object {
  
  def add(k: K, v: V): this.type = js.native
  
  def get(k: K): js.Array[V] = js.native
  
  def set(k: K, v: js.Array[V]): this.type = js.native
}
object Book {
  
  @scala.inline
  def apply[K, V](add: (K, V) => Book[K, V], get: K => js.Array[V], set: (K, js.Array[V]) => Book[K, V]): Book[K, V] = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction2(add), get = js.Any.fromFunction1(get), set = js.Any.fromFunction2(set))
    __obj.asInstanceOf[Book[K, V]]
  }
  
  @scala.inline
  implicit class BookOps[Self <: Book[_, _], K, V] (val x: Self with (Book[K, V])) extends AnyVal {
    
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
    def setAdd(value: (K, V) => Book[K, V]): Self = this.set("add", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGet(value: K => js.Array[V]): Self = this.set("get", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSet(value: (K, js.Array[V]) => Book[K, V]): Self = this.set("set", js.Any.fromFunction2(value))
  }
}
