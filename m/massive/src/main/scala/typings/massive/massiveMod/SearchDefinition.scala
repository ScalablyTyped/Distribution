package typings.massive.massiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchDefinition extends js.Object {
  var fields: js.Array[String]
  var term: String
  var where: AnyObject[_]
}

object SearchDefinition {
  @scala.inline
  def apply(fields: js.Array[String], term: String, where: AnyObject[_]): SearchDefinition = {
    val __obj = js.Dynamic.literal(fields = fields, term = term, where = where)
  
    __obj.asInstanceOf[SearchDefinition]
  }
}

