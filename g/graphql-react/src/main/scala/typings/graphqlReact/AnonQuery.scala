package typings.graphqlReact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonQuery extends js.Object {
  var query: String
}

object AnonQuery {
  @scala.inline
  def apply(query: String): AnonQuery = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonQuery]
  }
}

