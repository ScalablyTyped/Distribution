package typings.googleapis.vaultV1Mod.vaultV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Definition of the response for method ListSaveQuery.
  */
trait SchemaListSavedQueriesResponse extends StObject {
  
  /**
    * Page token to retrieve the next page of results in the list. If this is
    * empty, then there are no more saved queries to list.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /**
    * List of output saved queries.
    */
  var savedQueries: js.UndefOr[js.Array[SchemaSavedQuery]] = js.undefined
}
object SchemaListSavedQueriesResponse {
  
  @scala.inline
  def apply(): SchemaListSavedQueriesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListSavedQueriesResponse]
  }
  
  @scala.inline
  implicit class SchemaListSavedQueriesResponseMutableBuilder[Self <: SchemaListSavedQueriesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setSavedQueries(value: js.Array[SchemaSavedQuery]): Self = StObject.set(x, "savedQueries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSavedQueriesUndefined: Self = StObject.set(x, "savedQueries", js.undefined)
    
    @scala.inline
    def setSavedQueriesVarargs(value: SchemaSavedQuery*): Self = StObject.set(x, "savedQueries", js.Array(value :_*))
  }
}
