package typings.leafletGeosearch.anon

import typings.leafletGeosearch.mod.SearchResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Query extends js.Object {
  var query: String
  var result: SearchResult[js.Object]
}

object Query {
  @scala.inline
  def apply(query: String, result: SearchResult[js.Object]): Query = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[Query]
  }
}

