package typings.leafletDashGeosearch

import typings.leafletDashGeosearch.leafletDashGeosearchMod.SearchResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Query extends js.Object {
  var query: String
  var result: SearchResult[js.Object]
}

object Anon_Query {
  @scala.inline
  def apply(query: String, result: SearchResult[js.Object]): Anon_Query = {
    val __obj = js.Dynamic.literal(query = query, result = result)
  
    __obj.asInstanceOf[Anon_Query]
  }
}

