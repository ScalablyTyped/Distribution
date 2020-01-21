package typings.jsoneditor

import typings.jsoneditor.mod.JSONPath
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPath extends js.Object {
  var path: JSONPath
}

object AnonPath {
  @scala.inline
  def apply(path: JSONPath): AnonPath = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonPath]
  }
}

