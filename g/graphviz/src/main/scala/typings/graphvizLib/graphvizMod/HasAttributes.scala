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
  def apply(
    get: js.Function1[java.lang.String, js.Any],
    set: js.Function2[java.lang.String, js.Any, scala.Unit]
  ): HasAttributes = {
    val __obj = js.Dynamic.literal(get = get, set = set)
  
    __obj.asInstanceOf[HasAttributes]
  }
}

