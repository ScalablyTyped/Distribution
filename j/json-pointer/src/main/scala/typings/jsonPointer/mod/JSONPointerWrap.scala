package typings.jsonPointer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JSONPointerWrap extends js.Object {
  /**
    *  Creates a dictionary object (pointer -> value).
    */
  def dict(): js.Object = js.native
  /**
    *  Looks up a JSON pointer in an object.
    */
  def get(pointer: String): js.Any = js.native
  /**
    *  Tests if an object has a value for a JSON pointer.
    */
  def has(pointer: String): Boolean = js.native
  /**
    *  Removes an attribute of object referenced by pointer
    */
  def remove(pointer: String): Unit = js.native
  /**
    *  Set a value for a JSON pointer on object.
    */
  def set(pointer: String, value: js.Any): Unit = js.native
  /**
    *  Just like: each(pointer.dict(obj), iterator);
    */
  def walk(iterator: js.Function2[/* value */ js.Any, /* key */ String, Unit]): Unit = js.native
}

object JSONPointerWrap {
  @scala.inline
  def apply(
    dict: () => js.Object,
    get: String => js.Any,
    has: String => Boolean,
    remove: String => Unit,
    set: (String, js.Any) => Unit,
    walk: js.Function2[/* value */ js.Any, /* key */ String, Unit] => Unit
  ): JSONPointerWrap = {
    val __obj = js.Dynamic.literal(dict = js.Any.fromFunction0(dict), get = js.Any.fromFunction1(get), has = js.Any.fromFunction1(has), remove = js.Any.fromFunction1(remove), set = js.Any.fromFunction2(set), walk = js.Any.fromFunction1(walk))
    __obj.asInstanceOf[JSONPointerWrap]
  }
  @scala.inline
  implicit class JSONPointerWrapOps[Self <: JSONPointerWrap] (val x: Self) extends AnyVal {
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
    def setDict(value: () => js.Object): Self = this.set("dict", js.Any.fromFunction0(value))
    @scala.inline
    def setGet(value: String => js.Any): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setHas(value: String => Boolean): Self = this.set("has", js.Any.fromFunction1(value))
    @scala.inline
    def setRemove(value: String => Unit): Self = this.set("remove", js.Any.fromFunction1(value))
    @scala.inline
    def setSet(value: (String, js.Any) => Unit): Self = this.set("set", js.Any.fromFunction2(value))
    @scala.inline
    def setWalk(value: js.Function2[/* value */ js.Any, /* key */ String, Unit] => Unit): Self = this.set("walk", js.Any.fromFunction1(value))
  }
  
}

