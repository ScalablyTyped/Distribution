package typings.jsoneditor

import typings.jsoneditor.mod.JSONPath
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPathJSONPath extends js.Object {
  var path: JSONPath
}

object AnonPathJSONPath {
  @scala.inline
  def apply(path: JSONPath): AnonPathJSONPath = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonPathJSONPath]
  }
}

