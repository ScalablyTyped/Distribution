package typings.jsonpointer.jsonpointerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JSONPointer extends js.Object {
  /**
    * Looks up a JSON pointer in an object
    */
  def get(`object`: js.Object): js.Any
  /**
    * Set a value for a JSON pointer on object
    */
  def set(`object`: js.Object, value: js.Any): Unit
}

object JSONPointer {
  @scala.inline
  def apply(get: js.Object => js.Any, set: (js.Object, js.Any) => Unit): JSONPointer = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), set = js.Any.fromFunction2(set))
  
    __obj.asInstanceOf[JSONPointer]
  }
}

