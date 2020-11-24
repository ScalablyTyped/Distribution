package typings.loggly.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.loggly.mod.SearchOptionsWithQ
  - typings.loggly.mod.SearchOptionsWithQuery
*/
trait SearchOptions extends js.Object
object SearchOptions {
  
  @scala.inline
  def SearchOptionsWithQ(q: String): SearchOptions = {
    val __obj = js.Dynamic.literal(q = q.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchOptions]
  }
  
  @scala.inline
  def SearchOptionsWithQuery(query: String): SearchOptions = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchOptions]
  }
}
