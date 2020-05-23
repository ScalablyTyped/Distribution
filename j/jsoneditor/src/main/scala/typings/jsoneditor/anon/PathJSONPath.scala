package typings.jsoneditor.anon

import typings.jsoneditor.mod.JSONPath
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PathJSONPath extends js.Object {
  var path: JSONPath
}

object PathJSONPath {
  @scala.inline
  def apply(path: JSONPath): PathJSONPath = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathJSONPath]
  }
}

