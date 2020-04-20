package typings.massive.mod

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
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], term = term.asInstanceOf[js.Any], where = where.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchDefinition]
  }
}

