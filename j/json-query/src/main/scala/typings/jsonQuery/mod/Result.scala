package typings.jsonQuery.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Result extends js.Object {
  var key: String
  var parents: js.Array[String]
  var references: js.Array[_]
  var value: js.Any
}

object Result {
  @scala.inline
  def apply(key: String, parents: js.Array[String], references: js.Array[_], value: js.Any): Result = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], parents = parents.asInstanceOf[js.Any], references = references.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Result]
  }
}

