package typings.atHapiJoi.atHapiJoiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cache extends js.Object {
  /**
    * Retrieve an item from the cache.
    *
    * Note that key and value can be anything including objects, array, etc.
    */
  def get(key: js.Any): js.Any
  /**
    * Add an item to the cache.
    *
    * Note that key and value can be anything including objects, array, etc.
    */
  def set(key: js.Any, value: js.Any): Unit
}

object Cache {
  @scala.inline
  def apply(get: js.Any => js.Any, set: (js.Any, js.Any) => Unit): Cache = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), set = js.Any.fromFunction2(set))
  
    __obj.asInstanceOf[Cache]
  }
}

