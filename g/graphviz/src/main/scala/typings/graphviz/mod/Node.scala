package typings.graphviz.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Node extends HasAttributes {
  val id: String
}

object Node {
  @scala.inline
  def apply(get: String => PossibleValue, id: String, set: (String, PossibleValue) => Unit): Node = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), id = id.asInstanceOf[js.Any], set = js.Any.fromFunction2(set))
    __obj.asInstanceOf[Node]
  }
}

