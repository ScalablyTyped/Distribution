package typings
package jsonDashPointerLib.jsonDashPointerMod.JSONUnderscorePointerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JSON_PointerWrap extends js.Object {
  /**
    *  Creates a dictionary object (pointer -> value).
    */
  def dict(): js.Object
  /**
    *  Looks up a JSON pointer in an object.
    */
  def get(pointer: java.lang.String): js.Any
  /**
    *  Tests if an object has a value for a JSON pointer.
    */
  def has(pointer: java.lang.String): scala.Boolean
  /**
    *  Removes an attribute of object referenced by pointer
    */
  def remove(pointer: java.lang.String): scala.Unit
  /**
    *  Set a value for a JSON pointer on object.
    */
  def set(pointer: java.lang.String, value: js.Any): scala.Unit
  /**
    *  Just like: each(pointer.dict(obj), iterator);
    */
  def walk(iterator: js.Function2[/* value */ js.Any, /* key */ java.lang.String, scala.Unit]): scala.Unit
}

object JSON_PointerWrap {
  @scala.inline
  def apply(
    dict: () => js.Object,
    get: java.lang.String => js.Any,
    has: java.lang.String => scala.Boolean,
    remove: java.lang.String => scala.Unit,
    set: (java.lang.String, js.Any) => scala.Unit,
    walk: js.Function2[/* value */ js.Any, /* key */ java.lang.String, scala.Unit] => scala.Unit
  ): JSON_PointerWrap = {
    val __obj = js.Dynamic.literal(dict = js.Any.fromFunction0(dict), get = js.Any.fromFunction1(get), has = js.Any.fromFunction1(has), remove = js.Any.fromFunction1(remove), set = js.Any.fromFunction2(set), walk = js.Any.fromFunction1(walk))
  
    __obj.asInstanceOf[JSON_PointerWrap]
  }
}

