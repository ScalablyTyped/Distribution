package typings.leafletGeosearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchQuery extends StObject {
  
  var query: String
}
object SearchQuery {
  
  @scala.inline
  def apply(query: String): SearchQuery = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchQuery]
  }
  
  @scala.inline
  implicit class SearchQueryMutableBuilder[Self <: SearchQuery] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
