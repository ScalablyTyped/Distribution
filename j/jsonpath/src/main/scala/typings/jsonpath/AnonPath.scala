package typings.jsonpath

import typings.jsonpath.mod.PathComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPath extends js.Object {
  var path: js.Array[PathComponent]
  var value: js.Any
}

object AnonPath {
  @scala.inline
  def apply(path: js.Array[PathComponent], value: js.Any): AnonPath = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPath]
  }
}

