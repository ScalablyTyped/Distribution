package typings.graphviz.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HasAttributes extends js.Object {
  def get(name: String): PossibleValue
  def set(name: String, value: PossibleValue): Unit
}

object HasAttributes {
  @scala.inline
  def apply(get: String => PossibleValue, set: (String, PossibleValue) => Unit): HasAttributes = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), set = js.Any.fromFunction2(set))
    __obj.asInstanceOf[HasAttributes]
  }
}

