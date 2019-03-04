package typings
package jsonDashQueryLib.jsonDashQueryMod.JsonQueryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Result extends js.Object {
  var key: java.lang.String
  var parents: js.Array[java.lang.String]
  var references: js.Array[_]
  var value: js.Any
}

object Result {
  @scala.inline
  def apply(key: java.lang.String, parents: js.Array[java.lang.String], references: js.Array[_], value: js.Any): Result = {
    val __obj = js.Dynamic.literal(key = key, parents = parents, references = references, value = value)
  
    __obj.asInstanceOf[Result]
  }
}

