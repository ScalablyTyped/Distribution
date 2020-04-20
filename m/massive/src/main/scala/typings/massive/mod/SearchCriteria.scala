package typings.massive.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchCriteria extends js.Object {
  var fields: js.Array[String]
  var term: String
}

object SearchCriteria {
  @scala.inline
  def apply(fields: js.Array[String], term: String): SearchCriteria = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], term = term.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchCriteria]
  }
}

