package typings.leafletGeosearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchQuery extends js.Object {
  var query: String
}

object SearchQuery {
  @scala.inline
  def apply(query: String): SearchQuery = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SearchQuery]
  }
}

