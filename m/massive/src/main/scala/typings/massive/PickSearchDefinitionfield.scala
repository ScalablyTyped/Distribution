package typings.massive

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<massive.massive.SearchDefinition, 'fields' | 'term'> */
trait PickSearchDefinitionfield extends js.Object {
  var fields: js.Array[String]
  var term: String
}

object PickSearchDefinitionfield {
  @scala.inline
  def apply(fields: js.Array[String], term: String): PickSearchDefinitionfield = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], term = term.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PickSearchDefinitionfield]
  }
}

