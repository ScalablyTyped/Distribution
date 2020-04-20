package typings.jsonPointer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JSONPointerWrap extends js.Object {
  /**
    *  Creates a dictionary object (pointer -> value).
    */
  def dict(): js.Object
  /**
    *  Looks up a JSON pointer in an object.
    */
  def get(pointer: String): js.Any
  /**
    *  Tests if an object has a value for a JSON pointer.
    */
  def has(pointer: String): Boolean
  /**
    *  Removes an attribute of object referenced by pointer
    */
  def remove(pointer: String): Unit
  /**
    *  Set a value for a JSON pointer on object.
    */
  def set(pointer: String, value: js.Any): Unit
  /**
    *  Just like: each(pointer.dict(obj), iterator);
    */
  def walk(iterator: js.Function2[/* value */ js.Any, /* key */ String, Unit]): Unit
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
}

