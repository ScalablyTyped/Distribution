package typings
package graphvizLib.graphvizMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HasAttributes extends js.Object {
  def get(name: java.lang.String): js.Any
  def set(name: java.lang.String, value: js.Any): scala.Unit
}

object HasAttributes {
  @scala.inline
  def apply(get: java.lang.String => js.Any, set: (java.lang.String, js.Any) => scala.Unit): HasAttributes = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), set = js.Any.fromFunction2(set))
  
    __obj.asInstanceOf[HasAttributes]
  }
}

