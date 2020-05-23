package typings.jsonpath.anon

import typings.jsonpath.mod.PathComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Path extends js.Object {
  var path: js.Array[PathComponent]
  var value: js.Any
}

object Path {
  @scala.inline
  def apply(path: js.Array[PathComponent], value: js.Any): Path = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Path]
  }
}

