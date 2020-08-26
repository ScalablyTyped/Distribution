package typings.hapiJoi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cache extends js.Object {
  /**
    * Retrieve an item from the cache.
    *
    * Note that key and value can be anything including objects, array, etc.
    */
  def get(key: js.Any): js.Any = js.native
  /**
    * Add an item to the cache.
    *
    * Note that key and value can be anything including objects, array, etc.
    */
  def set(key: js.Any, value: js.Any): Unit = js.native
}

object Cache {
  @scala.inline
  def apply(get: js.Any => js.Any, set: (js.Any, js.Any) => Unit): Cache = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), set = js.Any.fromFunction2(set))
    __obj.asInstanceOf[Cache]
  }
  @scala.inline
  implicit class CacheOps[Self <: Cache] (val x: Self) extends AnyVal {
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
    def setGet(value: js.Any => js.Any): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setSet(value: (js.Any, js.Any) => Unit): Self = this.set("set", js.Any.fromFunction2(value))
  }
  
}

