package typings.jsoneditor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPath extends js.Object {
  var field: String
  var path: js.Array[String]
  var value: String
}

object AnonPath {
  @scala.inline
  def apply(field: String, path: js.Array[String], value: String): AnonPath = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonPath]
  }
}

