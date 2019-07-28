package typings.jsonDashQuery.jsonDashQueryMod

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
    val __obj = js.Dynamic.literal(key = key, parents = parents, references = references, value = value)
  
    __obj.asInstanceOf[Result]
  }
}

